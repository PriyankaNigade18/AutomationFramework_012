package htmlMethods;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

/*
 * Post--->request payload
 * 1.HashMap
 * 2.POJO- plain old java object class
 * 
 */
public class PostRequest
{
	//https://reqres.in/api/users
  @Test(priority=1)
  public void post_HashMap()
  {
	  //create a data-Request payload
	  HashMap<String,Object> data=new HashMap<String,Object>();
	  data.put("name","Priyanka");
	  data.put("job","QA");
	  
	  
	   given()
	   .contentType("application/json")//header
	   .body(data)
	  
	  .when()
	  .post("https://reqres.in/api/users")
	  
	  .then()
	  .statusCode(201)
	  .log().all();
	  
	 	  
  }
  
  
  @Test(priority=2)
  public void post_POJO()
  {
	  //create  a data
	  PojoDemo pojo=new PojoDemo();
	  pojo.setName("Sarang");
	  pojo.setJob("Tester");
	  
	  given()
	   .contentType("application/json")//header
	   .body(pojo)
	  
	  .when()
	  .post("https://reqres.in/api/users")
	  
	  .then()
	  .statusCode(201)
	  .log().all();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
