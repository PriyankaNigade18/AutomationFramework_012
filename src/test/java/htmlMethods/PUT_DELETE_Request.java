package htmlMethods;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PUT_DELETE_Request
{
  @Test(priority=1)
  public void putRequest_Update() 
  {
	  System.out.println("Put Request is executing!");
	  //https://reqres.in/api/users/2
	  
	  PojoDemo p1=new PojoDemo();
	  p1.setName("Jay");
	  p1.setJob("Engg");
			  
	  given()
	  	.contentType("application/json")
	  	.body(p1)
	  .when()
	  	.put("https://reqres.in/api/users/2")
	  	
	  .then()
	  .statusCode(200)
	  .log().body();
	  
	  
  }
  
  
  
  @Test(priority=2)
  public void patchRequest_Update() 
  {
	  //https://reqres.in/api/users/2
	  
	  System.out.println("Patch Request is executing!");
	  PojoDemo p1=new PojoDemo();
	  p1.setName("Kumar");
	  
			  
	  given()
	  	.contentType("application/json")
	  	.body(p1)
	  .when()
	  	.patch("https://reqres.in/api/users/2")
	  	
	  .then()
	  .statusCode(200)
	  .log().body();
	  
	  
  }
  
  @Test(priority=3)
  public void deleteRequest()
  {
	  
	  given()
	  .when().delete("https://reqres.in/api/users/2")
	  .then().statusCode(204)
	  .log().body();
	  
  }
  
  
}
