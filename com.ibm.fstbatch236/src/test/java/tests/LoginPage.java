package tests;



	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.testng.Assert;



	public class LoginPage {



	    WebDriver driver;



	    public LoginPage(WebDriver remotedriver) {



//	      this.driver = driver;



	        driver = remotedriver;



	    }



	    // identification



	    By txt_user = By.name("username");

	    By txt_pass = By.name("password");

	    By btnLogin = By.tagName("button");

	    

	    By user_dropdown = By.cssSelector(".oxd-userdropdown-name");

	    By btnLogout = By.partialLinkText("Logo");



	    // Actions/methods



	    public void enterUserName(String user) {



	        driver.findElement(txt_user).sendKeys(user);

	    }



	    public void enterPassword(String pwd) {



	        driver.findElement(txt_pass).sendKeys(pwd);

	    }



	    

	    public void clickOnLoginButton() {



	        driver.findElement(btnLogin).click();

	    }



	    

	    public void clickOnUserDropDownButton() {



	        driver.findElement(user_dropdown).click();

	    }

	    

	    public void clickOnLogoutButton() {



	        driver.findElement(btnLogout).click();

	    }
	    public void verifyUserNamepresent() {
	    	driver.findElement(txt_user).isDisplayed();

	    }
	    public void verifyAppLicationTitle(String actual, String Expected) throws Exception {

	        Thread.sleep(3000);

	        Assert.assertEquals(actual, Expected);

	        

	    }
}
