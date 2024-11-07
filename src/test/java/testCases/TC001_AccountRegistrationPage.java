package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationPage extends BaseClass
{
	//WebDriver driver ;

	
	
	@Test
	public void AccountRegistration() throws InterruptedException
	{
		
		
		logger.info("*** Starting TC0001_Account Registration Test case ***");
		
		try
		{
		HomePage hp = new HomePage(driver);
		
		logger.info("clicking on my account....");
		hp.clickMyAccount();
		logger.info("clicking on Register.... ");
		hp.clickRegister();
		
		Thread.sleep(3000);
		
		AccountRegistrationPage regPage = new AccountRegistrationPage(driver);
		
		logger.info("Filling the Customer Information ....");
		
		regPage.setFirstName(randomeString());
		regPage.setLastName(randomeString());
		regPage.setEmail(randomeString()+ "@gmail.com");
		regPage.setTelephoneNumber(randomeNumber());
		
		String password  = randomeString();
		
		regPage.setPassword(password);
		regPage.setConfirmPassword(password);
		regPage.setPolicy();
		regPage.ClkContinue();
		
		Thread.sleep(3000);
		String msg = regPage.getConfirmMessage();
		
		logger.info("Validating confirmation message");
		if(msg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
			
		}
		//Assert.assertEquals(msg,"Your Account Has Been Created!!!!" );
	
		else
		{
			logger.error("Test Failed");
			logger.debug("Debug Logs");
			Assert.assertTrue(false);
		}
		
	}
		catch(Exception e)
		{
			
			Assert.fail();
		}
		
		logger.info("*** Finished TC0001 Registration....***");
	}
}
	
	
	

