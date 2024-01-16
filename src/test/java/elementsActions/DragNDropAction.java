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

public class DragNDropAction {
  @Test
  public void dragndropTest()
  {
	  //create a driver session
	  AppiumDriver driver=CreateSession.initializeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  //views
	  WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Views"));
	  
	  //click Action
	  driver.executeScript("mobile: clickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele1).getId()
			));
	  
	  
	  System.out.println("Clicked using Mobile Guesture!");
	  //drag n drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  
	  
	  //element
	  WebElement ele2=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
	  
	  //Drag gesture
	  ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele2).getId(),
			    "endX", 633,
			    "endY", 988
			));
	  
	  System.out.println("Drag Action complete!");
	  
	  String text=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	  System.out.println("Result text is: "+text);
	  
	  
	  
	  
	  
  }
}
