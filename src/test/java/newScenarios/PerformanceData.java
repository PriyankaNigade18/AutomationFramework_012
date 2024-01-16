package newScenarios;

import java.util.List;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import session.CreateSession;

public class PerformanceData {
  @Test
  public void getPerformanceData()
  {
	  AppiumDriver driver=CreateSession.initializeDriver();
	  
	  List<String> performanceTypes=((AndroidDriver)driver).getSupportedPerformanceDataTypes();
	  
	  System.out.println(performanceTypes);
	  //[cpuinfo, memoryinfo, batteryinfo, networkinfo]
	  
	  //To get Batteryinfo
	 // List<List<Object>> data=((AndroidDriver)driver).getPerformanceData("app package name","info");
	  
	  List<List<Object>> batteryData=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","batteryinfo",5);
	  System.out.println("PerfromanceREsult for battery: "+ batteryData);
	  
	  System.out.println("******************************************");
	  
	  List<List<Object>> memoryData=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","memoryinfo",5);
	  System.out.println("PerfromanceREsult for memory: "+ memoryData);
	  System.out.println("******************************************");
	  List<List<Object>> networkData=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","networkinfo",5);
	  System.out.println("PerfromanceREsult for network: "+ networkData);
  }
}
