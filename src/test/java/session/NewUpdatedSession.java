package session;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class NewUpdatedSession {
  @Test
  public void newSession() throws MalformedURLException 
  {
	  UiAutomator2Options option=new UiAutomator2Options();
	  option.setPlatformName("Android");
	  
	  //application
	  
	  String path=System.getProperty("user.dir")+"/src/test/resources/ApiDemos-debug.apk";
	  option.setCapability("appium:app",path);
	  
	  //server setup
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //AppiumDriver
	  AppiumDriver driver=new AndroidDriver(url,option);
	  System.out.println(driver.getSessionId());
	  
	  
	  
	  
	  
	  
	  
  }
}
