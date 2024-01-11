package htmlMethods;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class QueryandPathParameter
{
	
	/*
	 * https://reqres.in/api/users?page=2
	 * resource:  https://reqres.in/api
	 * path param: /users
	 * query param: page=2
	 * 
	 */
  @Test
  public void testParam()
    {
	  
	  given()
	  .pathParam("path","users")
	  .queryParam("page", 2)
	  
	  
	  //.when().get("https://reqres.in/api/users?page=2")
	  .when().get("https://reqres.in/api/{path}")
	  .then().log().body();
	  
	  
	  
	  
	  
  }
}
