package htmlMethods;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class SameUserGETPOSTPUTDELETE 
{
	String id;
	
  @Test(priority=1)
  public void createUser()
  {
	//create  a data
	  PojoDemo pojo=new PojoDemo();
	  pojo.setName("Sarang");
	  pojo.setJob("Tester");
	  
	  //save resonse in variable
	  id=given()
	   .contentType("application/json")//header
	   .body(pojo)
	  
	  .when()
	  .post("https://reqres.in/api/users")
	  .jsonPath().get("id");
	  
	  
	  System.out.println("User is created with id: "+id);
  }
  
  @Test(priority=2)
  public void getUser()
  {
	  
	  given()
	  .when().get("https://reqres.in/api/users/"+id)
	  .then().log().body();
	  
	  System.out.println("User display with same id: "+id);
  }
  
  @Test(priority=3)
  public void updateUser() 
  {
	  PojoDemo p1=new PojoDemo();
	  p1.setName("Jay");
	  p1.setJob("Engg");
			  
	  given()
	  	.contentType("application/json")
	  	.body(p1)
	  .when()
	  	.put("https://reqres.in/api/users/"+id)
	  	
	  .then()
	  .statusCode(200)
	  .log().body();
	  
	  System.out.println("Data is updated with same id: "+id);
  }
  
  
  @Test(priority=4)
  public void deleteUser()
  {
	  
	  given()
	  .when().delete("https://reqres.in/api/users/"+id)
	  .then().statusCode(204);
	  
	  System.out.println("User is deleted with same id: "+id);
  }
  
  
}


