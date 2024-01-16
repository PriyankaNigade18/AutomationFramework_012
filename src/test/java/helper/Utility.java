package helper;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class Utility 
{
	public static void appiumScrollDown(AppiumDriver driver,WebElement ele1)
	{
		((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "elementId",((RemoteWebElement)ele1).getId(),
			    "direction", "down",
			    "percent", 0.75
			));
	}

	
	public static void capture(AppiumDriver driver)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//Screenshots//screen"+System.currentTimeMillis()+".png");
		
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
