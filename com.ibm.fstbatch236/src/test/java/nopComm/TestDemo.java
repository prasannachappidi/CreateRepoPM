package nopComm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDemo extends BaseTest
{
	@Test
	public void launchApp(){
	driver= new ChromeDriver();
	 driver.manage().window().maximize();
	
	driver.get("https://demoqa.com/automation-practice-form");
	driver.findElement(By.cssSelector("button#submit")).click();
}	
	
}