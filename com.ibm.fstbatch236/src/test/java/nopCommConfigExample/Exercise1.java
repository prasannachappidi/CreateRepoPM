package nopCommConfigExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exercise1 extends BaseTest{

	WebDriver driver;
	@BeforeTest
	public void lauch_appURL()
	{
	driver = new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	//driver.manage().timeouts().implicitlyWait(2000, null);
	}
	
	@Test
	
	public void searchCustomerExercise1() throws Exception {
		// TODO Auto-generated constructor stub
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='email']")).clear();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@yourstore.com");
        
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[text()[normalize-space()='Customers']]")).click();
        
        driver.findElement(By.xpath("//a[@href='/Admin/Customer/List']//p[1]")).click();
        
        driver.findElement(By.id("SearchEmail")).sendKeys("victoria_victoria@nopCommerce.com");
        
        driver.findElement(By.xpath("//button[@id='search-customers']")).click();
        
     
	}

}
