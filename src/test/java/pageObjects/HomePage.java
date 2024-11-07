package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage 
{

	//constructor
	
	public HomePage(WebDriver driver)
	{
		
		super(driver);
		
	}
	
	
	//locators
	
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement clkMyAccount  ;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement clkRegister  ;
	
	@FindBy(xpath = "//a[text() = 'Login']" )
	WebElement login ;
	
	
	
	
	public void loginbtn ()
	{
		login.click();
		
	}
	
	
	//action methods
	
	public void clickMyAccount()
	{
		
		clkMyAccount.click();
		
	}
	
	public void clickRegister()
	{
		
		clkRegister.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
