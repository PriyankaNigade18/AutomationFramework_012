package htmlMethods;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization_Deserialization 
{
	//Object---->JSON=Serialization
	//JSON ----->JavaObject=De-serialization
	
  @Test(priority=1)
  public void testSerialization() throws JsonProcessingException
  {
	  //Object
	  PojoDemo p1=new PojoDemo();
	  p1.setName("Jay");
	  p1.setJob("QA");
	  
	  //import from jackson api
	  ObjectMapper map=new ObjectMapper();
	  String json=map.writerWithDefaultPrettyPrinter().writeValueAsString(p1);
	  
	  System.out.println(json);
	  
	  
	  
  }
  
  @Test(priority=2)
  public void testdeserialization() throws JsonMappingException, JsonProcessingException
  {
	  
	  //json--->object
	  String json="{\n"
	  		+ "  \"name\" : \"Jay\",\n"
	  		+ "  \"job\" : \"QA\"\n"
	  		+ "}";
	  
	  
	  ObjectMapper map=new ObjectMapper();
	  PojoDemo p1=map.readValue(json,PojoDemo.class);
	  System.out.println(p1.getName()+" : "+p1.getJob());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
