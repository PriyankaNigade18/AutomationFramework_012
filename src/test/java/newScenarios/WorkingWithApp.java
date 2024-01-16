package newScenarios;

import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import session.CreateSession;

public class WorkingWithApp {
  @Test
  public void appTest() throws InterruptedException 
  {
	  AppiumDriver driver=CreateSession.initializeDriver();
	  
	  //check current status
	  
	  System.out.println("Application Current state is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	  
	  //background
	  ((AndroidDriver)driver).runAppInBackground(Duration.ofMillis(5000));
	  System.out.println("Application will run in backgroud for 5sec!");
	  
	  //Activates any new app
	  //com.google.android.deskclock
	  ((AndroidDriver)driver).activateApp("com.google.android.deskclock");
	  System.out.println("Application Current state is: "+((AndroidDriver)driver).queryAppState("com.google.android.deskclock"));

	  Thread.sleep(2000);
	  
	  //terminate clock 
	  
	  ((AndroidDriver)driver).terminateApp("com.google.android.deskclock");
	  System.out.println("Application Current state is: "+((AndroidDriver)driver).queryAppState("com.google.android.deskclock"));

	  
	  
	  
	  /*
	  //terminate app
	  
	  ((AndroidDriver)driver).terminateApp("io.appium.android.apis");
	  System.out.println("Application Current state is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  
	  
	  
	  
	  //uninstall the app
	  ((AndroidDriver)driver).removeApp("io.appium.android.apis");
	  System.out.println("Uninstall app from the device");
	  System.out.println("Application Current state is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  Thread.sleep(2000);
	  
	  //path
	  String path=System.getProperty("user.dir")+"/src/test/resources/ApiDemos-debug.apk";
	  
	  //install app
	  ((AndroidDriver)driver).installApp(path);
	  
	  System.out.println("Application is installed!");
	  System.out.println("Application Current state is: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

*/
	  
	  
	  
  }
}
