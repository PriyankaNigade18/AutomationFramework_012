package newScenarios;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import session.CreateSession;

public class Lock_Unlock_Rotate
{
	public static AppiumDriver driver;
  @Test
  public void testDevice_lock_unclock_rotate() throws InterruptedException
  {
	   driver=CreateSession.initializeDriver();
	  
	  //lock the device
	  ((AndroidDriver)driver).lockDevice();
	  System.out.println("Device get locked!");
	  
	  //status check
	  System.out.println("Is my device is locked?: "+((AndroidDriver)driver).isDeviceLocked());//true
	  
	  //unlocked
	  ((AndroidDriver)driver).unlockDevice();
	  System.out.println("Device get unlocked!");
	  
	  System.out.println("Is my device is locked?: "+((AndroidDriver)driver).isDeviceLocked());//false

	  Thread.sleep(2000);
	  //rotate
	  ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
	  System.out.println("Rotating screen in landscape mode");
	  
	  ((AndroidDriver)driver).rotate(ScreenOrientation.PORTRAIT);
	  
	  
	  
	  
	  
	  
  }
  
  public static void capture()
  {
	  TakesScreenshot ts=(TakesScreenshot)driver;
	 File temp= ts.getScreenshotAs(OutputType.FILE);
	 File dest=new File(System.getProperty("user.dir")+"//Screenshots//Test1.png");
	 try {
		FileHandler.copy(temp, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
  }
}
