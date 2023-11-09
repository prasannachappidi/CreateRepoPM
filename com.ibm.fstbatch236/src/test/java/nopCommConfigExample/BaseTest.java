package nopCommConfigExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ReadConfig;

public class BaseTest {
	
	//ReadConfig conf;
	WebDriver driver;
	@SuppressWarnings("deprecation")
	public void lauch_appURL()
	{
	driver = new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	//driver.manage().timeouts().implicitlyWait(2000, null);
	}
	
}
