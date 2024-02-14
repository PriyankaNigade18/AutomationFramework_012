package session;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CreateSession
{
	public static AppiumDriver initializeDriver()
	{
		//capabilities we need pass to the server
		  DesiredCapabilities cap=new DesiredCapabilities();
		  cap.setCapability("platformName","Android");
		  cap.setCapability("appium:automationName", "uiautomator2");
		  cap.setCapability("appium:deviceName","pixel_5");
		  cap.setCapability("appium:udid","emulator-5554");
		  
		    //application
		  
		  String appPath=System.getProperty("user.dir")+"/src/test/resources/ApiDemos-debug.apk";
		  
		  cap.setCapability("appium:app",appPath);
		  
		  AppiumDriver driver=null;
		  //Server connectivity
		  URL url;
		try {
			url = new URL("http://0.0.0.0:4723");
			 //To create a session
			 driver=new AndroidDriver(url,cap);
			  System.out.println("session id is:"+driver.getSessionId());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		 
		  return driver;
		  
	}

}
