package newScenarios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;

public class LogGenerateUSingFile 
{
	 static Logger log=(Logger) LogManager.getLogger(LogGenerateUSingFile.class.getName());
  @Test
  public void testcase1()
  {
	  log.info("This is info log");
	  System.out.println("Application started:");
  }
}
