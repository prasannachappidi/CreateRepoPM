package nopComm;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;



public class NOPCommLoginTest extends BaseTest{

    @Test

    public void verifyNopCommLoginFeature() throws InterruptedException {
    	driver.findElement(By.cssSelector("input#Email")).sendKeys("values to send");
     
        System.out.println("verifyNopCommLoginFeature executing test case");

        System.out.println("App URL: " + driver.getCurrentUrl());

        System.out.println("App Title: " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Your store. Login");
        
        driver.findElement(By.xpath("//input[@type='email']")).clear();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@yourstore.com");
        
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
        
        driver.findElement(By.xpath("//input[@name='RememberMe']")).click();
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        
        Assert.assertEquals("Dashboard / nopCommerce administration",driver.getTitle());
        
        Thread.sleep(5000);
        
        driver.findElement(By.linkText("Logout")).click();
        
        Assert.assertEquals("VerifyLoginPage","Your store. Login",driver.getTitle());
        
System.out.println("Current page title" + driver.getTitle());
driver.close();

        

    }



}



