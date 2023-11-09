package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Idenitification

	@FindBy(how = How.CSS, using = "input#Email")
	private WebElement email;

	@FindBy(how = How.CSS, using = "input#Password")
	private WebElement password;

	@FindBy(how = How.CSS, using = "input#RememberMe")
	private WebElement rememberMe;

	@FindBy(how = How.TAG_NAME, using = "button")
	private WebElement logIn;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Logo")
	private WebElement logout;

	// Methods
	public void enterOnEmail(String emailvalue) {
		email.clear();
		email.sendKeys(emailvalue);
	}

	public void enterOnPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}

	public void clickOnRememberMe() {
		rememberMe.click();
	}

	public void clickOnLogIn() {
		logIn.click();
	}

	public void clickOnLogOut() {
		logout.click();
	}
}
