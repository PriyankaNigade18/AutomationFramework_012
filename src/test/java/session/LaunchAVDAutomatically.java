package session;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class LaunchAVDAutomatically {
  @Test
  public void f() throws MalformedURLException 
  {
	//capabilities we need pass to the server
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("platformName","Android");
	  cap.setCapability("appium:automationName", "uiautomator2");
	  cap.setCapability("appium:deviceName","pixel_6");
	  cap.setCapability("appium:udid","emulator-5554");
	  cap.setCapability("avd","ixel_6");
	  cap.setCapability("avdLaunchTimeout",180000);//180 sec 3 mins
	  
	  //application
	  
	  String appPath=System.getProperty("user.dir")+"/src/test/resources/ApiDemos-debug.apk";
	  
	  cap.setCapability("appium:app",appPath);
	  
	  //Server connectivity
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //To create a session
	  AppiumDriver driver=new AndroidDriver(url,cap);
	  System.out.println("session id is:"+driver.getSessionId());
	  
	  
	  
  }
}
