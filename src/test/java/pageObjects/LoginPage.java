package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class LoginPage  extends BasePage
{
     public LoginPage (WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement email_Address ;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement email_password ;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement login_btn ;
	
	
	 //h2[text() = 'My Account']
	
	@FindBy(xpath = " //h2[text() = 'My Account']")
	WebElement My_Account ;
	
	public void email_txtbox (String email)
	{
		
		email_Address.sendKeys(email);
	}
	
	public void password_txtbox (String password)
	{
		
		email_password.sendKeys(password);
	}
	
	public void login_btn ()
	{
		
		login_btn.click();
	}
	
	
	public boolean my_Account()
	{
		
		boolean status = My_Account.isDisplayed();
		
		
		return status;
	}

	
	
	
	
	
	
}
