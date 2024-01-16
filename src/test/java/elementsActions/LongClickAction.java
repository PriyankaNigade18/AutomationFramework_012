package elementsActions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import session.CreateSession;

public class LongClickAction {
  @Test
  public void longClickTest() 
  {
	  //create a driver session
	  AppiumDriver driver=CreateSession.initializeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //drag n drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  
	  
	  //element
	  WebElement ele1=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	  
	  
	  //action
	  
	  ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId",((RemoteWebElement) ele1).getId(),
			    "duration",1000
			    
			));
	  
	  System.out.println("Long click on first dot completed!");
	  
  }
}
