package newScenarios;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import helper.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import session.CreateSession;

public class AlertHandling {
  @Test
  public void alertTest() throws InterruptedException
  {
	  AppiumDriver driver=CreateSession.initializeDriver();
	  
	  //app
	  driver.findElement(AppiumBy.accessibilityId("App")).click();
	  Utility.capture(driver);
	  
	  
	  //alert options
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	  
	  Utility.capture(driver);
	  //alert1
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	  
	  Thread.sleep(2000);
	  
	  Utility.capture(driver);
	  //alert will open
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert1 text is: "+alt1.getText());
	  //ok
	  alt1.accept();
	  
	  
	  
	  
  }
}
