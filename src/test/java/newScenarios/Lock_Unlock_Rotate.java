package newScenarios;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import session.CreateSession;

public class Lock_Unlock_Rotate {
  @Test
  public void testDevice_lock_unclock_rotate()
  {
	  AppiumDriver driver=CreateSession.initializeDriver();
	  
	  //lock the device
	  ((AndroidDriver)driver).lockDevice();
	  System.out.println("Device get locked!");
	  
	  //status check
	  System.out.println("Is my device is locked?: "+((AndroidDriver)driver).isDeviceLocked());//true
	  
	  //unlocked
	  ((AndroidDriver)driver).unlockDevice();
	  System.out.println("Device get unlocked!");
	  
	  System.out.println("Is my device is locked?: "+((AndroidDriver)driver).isDeviceLocked());//false

	  //rotate
	  ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
	  System.out.println("Rotating screen in landscape mode");
	  
	  ((AndroidDriver)driver).rotate(ScreenOrientation.PORTRAIT);
	  
	  
	  
	  
	  
	  
  }
}
