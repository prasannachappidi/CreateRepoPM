package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CustomerPage {
	
	

@FindBy(how = How.XPATH, using="//p[text()[normalize-space()='Customers']]") private WebElement customers;
}
