package newScenarios;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import session.CreateSession;

public class ToggleNetworkSettings {
  @Test
  public void toggleTest()
  {
	  AppiumDriver driver=CreateSession.initializeDriver();
	  /*
	  //toggle setup for airplanemode off--->on
	  System.out.println("Initially AirplaneMode setup is off");
	  ((AndroidDriver)driver).toggleAirplaneMode();
	 System.out.println("AirplanMode setup is on");
	 
	 //on--->off
	 
	 ((AndroidDriver)driver).toggleAirplaneMode();
	 System.out.println("AirplaneMode setup is off");
	 
	 */
	  
	 //wifi on--->off
	  System.out.println("Initially Wifi setup is on");

	 ((AndroidDriver)driver).toggleWifi();
	 
	 System.out.println("wifi setup is off");
	 
	 //off to on
	 ((AndroidDriver)driver).toggleWifi();
	 
	 
	 //mobileData
	 ((AndroidDriver)driver).toggleData();

	 
	 
	 
  }
  
  
}
