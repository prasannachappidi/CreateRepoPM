package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utility.Constants;

public class VerifyListUserApiTest_02 {

	@Test
    public void verifyListUserAPITest() {
        
        System.out.println("execution started ---- List user api");
        
        
        //RestAssured
        
        RestAssured.baseURI = Constants.api_reqres;
        Response resp = RestAssured.get("/api/users?page=2");                    //sent a request to server
        
        
        String actualContentType = resp.getContentType();
        int actualStatusCode = resp.getStatusCode();
        
        System.out.println("Status Code: " + actualStatusCode);
        System.out.println("getContentType: " + actualContentType);                                //application/json; charset=utf-8
        
        
        
        //Validation 
        Assert.assertEquals(actualStatusCode, 200);
        Assert.assertTrue(actualContentType.contains("json"));
        
        
        
    }
}
