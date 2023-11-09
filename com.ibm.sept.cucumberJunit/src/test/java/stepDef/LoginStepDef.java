package stepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDef {

	
	WebDriver driver;
	LoginPage lp;
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		driver = new ChromeDriver();
		
		
		
		lp = new LoginPage(driver);

	}

	@When("User opens URL {string}")
	public void user_opens_URL(String appURL) {
	    
		driver.get(appURL);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String username, String pwd) {
		
//	    driver.findElement(By.id("Email")).clear();
//	    driver.findElement(By.id("Email")).sendKeys(username);
//	    
//	    driver.findElement(By.id("Password")).clear();
//	    driver.findElement(By.id("Password")).sendKeys(pwd);
		
		lp.enterOnEmail(username);
		lp.enterOnPassword(pwd);
	    
	    
	}

	@When("Click on Login")
	public void click_on_Login() {
//		driver.findElement(By.tagName("button")).click();
	lp.clickOnLogIn();
	
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String expectedTitle) throws Exception {
		Thread.sleep(3000);

        Assert.assertEquals(driver.getTitle(), expectedTitle);
	}

	@When("User click on Log out link")
	public void user_click_on_Log_out_link() {
//		driver.findElement(By.partialLinkText("Logo")).click();
		lp.clickOnLogOut();
	}

	@Then("close browser")
	public void close_browser() throws InterruptedException {
Thread.sleep(5000);

        

        driver.close();

        driver.quit();
	}



	
}
