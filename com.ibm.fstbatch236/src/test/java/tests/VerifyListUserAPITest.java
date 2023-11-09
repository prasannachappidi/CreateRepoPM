package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class VerifyListUserAPITest {
	
	@Test
	
	public void verifyUserListApiTest(){
		
		
Response resp = RestAssured.get("https://reqres.in/api/users?page=2");                    //sent a request to server

        
System.out.print("Verify List USer APi");
        

        String actualContentType = resp.getContentType();

        int actualStatusCode = resp.getStatusCode();

        

        

        

        

        

        System.out.println("Status Code: " + actualStatusCode);

        System.out.println("getContentType: " + actualContentType);                                //application/json; charset=utf-8

        

        

        

        //Validation 

        Assert.assertEquals(actualStatusCode, 200);

        Assert.assertTrue(actualContentType.contains("json"));
	}
	

}
