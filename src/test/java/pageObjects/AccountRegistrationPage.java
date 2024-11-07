package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage  extends BasePage
{
	//constructor
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    //locators
	@FindBy(xpath = " //input[@id='input-firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLasttname ;
	
	@FindBy(xpath = "//input[@id='input-email'] ")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='input-telephone'] ")
	WebElement txtTelephone;
	
	@FindBy(xpath = " //input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='input-confirm'] ")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath = "//input[@name='agree'] ")
	WebElement chkPolicy ;
	
	@FindBy(xpath = "//input[@value='Continue'] ")
	WebElement btnContinue ;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement cnfMessage;
	
	//actionsMethodsd
	
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
		
	}
	public void setLastName(String lname)
	{
		txtLasttname.sendKeys(lname);
		
	}
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
		
	}
	public void setTelephoneNumber(String tlpno)
	{
		txtTelephone.sendKeys(tlpno);
		
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
		
	}
	public void setConfirmPassword(String Cnfpwd)
	{
		txtConfirmPassword.sendKeys(Cnfpwd);
		
	}
	public void setPolicy()
	{
		chkPolicy.click();
		
	}
	public void ClkContinue()
	{
		
		btnContinue.click();
	}
	
	public String getConfirmMessage()
	{
		try {
		return cnfMessage.getText();
		}
		
		catch(Exception e)
		{
			
			return(e.getMessage());
		}
	}
	
	
}
