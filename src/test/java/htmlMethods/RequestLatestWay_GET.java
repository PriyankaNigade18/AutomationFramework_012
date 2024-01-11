package htmlMethods;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


/*
 * given()-pre-requisite
 header,request payload,cookies,Authentication

 when(): request
  GET,POST,PUT,DELETE

 then()-Validate(reponse)
 status code,payload,body

 */

public class RequestLatestWay_GET 
{
  @Test(enabled=false)
  public void getRequest01()
  {
	  //endpoint=https://reqres.in/api/users/2
	  System.out.println("Single user response");
	  given()
	  
	  .when()
	  	.get("https://reqres.in/api/users/2")
	  
	  .then()
	  	.assertThat()
	  	.statusCode(200)
	  	.body("data.id",equalTo(2))
	  	.body("data.first_name",equalTo("Janet"))
	  	.log().body();
		  
	  
  }
  
  
  @Test(enabled=false)
  public void getListOfUsers()
  {
	  
	  
	  given()
	  
	  .when()
	  .get("https://reqres.in/api/users?page=2")
	  
	  .then()
	  	.statusCode(200)
	  	.body("page",equalTo(2))
	  	.body("data.id[2]",equalTo(9))
	  	.body("data.first_name[5]",equalTo("Rachel"))
	  	.log().body();
	  
	    
  }
  
  //hasItems() contains()
//  hasItems() -> Check all elements are in a collection
//  contains() -> Check all elements are in a collection and in a strict order
  
  
  @Test
  public void getTestMethiods()
  {
	  given()
	  
	  .when()
	  .get("https://reqres.in/api/users?page=2")
	  
	  .then()
	  	.statusCode(200)
	  	.body("data.id",hasItems(7,11,12))
	  	//.body("data.id",contains(7,8,9))//fail
	  	.body("data.id",contains(7, 8, 9, 10, 11, 12))//pass
	  	.log().body();
  }
  
  
  
  
  
  
  
  
  
  
}
