package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC002_Login_Test extends BaseClass
{

	
	@Test
	public void loginTest()
	{
		
		try
		{
		logger.info("*** Starting TC0002_login_Test case ***");
		HomePage hp = new HomePage(driver);
		
		
		hp.clickMyAccount();
		hp.loginbtn();
		
		logger.info("Filling the email id Information ....");
		LoginPage lp = new LoginPage(driver);
		
		lp.email_txtbox(p.getProperty("email2"));
		lp.password_txtbox(p.getProperty("password2"));
		lp.login_btn();
		
		
		boolean Account_Status = lp.my_Account();
		if(Account_Status== true)
		{
			
			System.out.println("Login is successfull");
			Assert.assertTrue(true);
		}
		else
		{
			
			Assert.assertTrue(false);
			
		}
		}
		
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		
		logger.info("Test Closed ....");
	}
	
	
	
}
