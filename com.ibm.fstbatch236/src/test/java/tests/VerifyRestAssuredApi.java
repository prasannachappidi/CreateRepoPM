package tests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class VerifyRestAssuredApi {
	
	
	@Test
	public void verifyListUserApiTest() {
	
	baseURI = "https://reqres.in";
    
    
    
    given().
        
    
        //header
        //parameter
        //auth
        //body
    
    
    
    when().
        //action ----- send a request to server ------get/post/put/patch/delete etc.....
    
        get("/api/users?page=2").
    
    
    then().
    
        //validation step
    
        //statusCode
        //value
        //header value
        //value using JSON path
        //responseTime
        
        statusCode(200).
        body("data[0].email", equalTo("michael.lawson@reqres.in")).
        body("data[1].email", equalTo("lindsay.ferguson@reqres.in")).
        body("data[2].email", equalTo("tobias.funke@reqres.in")).
        log().all();
	}
}
