package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	public Properties p;
	
	public Logger logger;
	
	
public WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	public void setup(String br) throws IOException
	{
		
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		logger = LogManager.getLogger(this.getClass());
		
		switch(br.toLowerCase())
		{
		case "chrome"  :driver = new ChromeDriver();break;
		case "edge"  :driver = new EdgeDriver();break;
		case "firefox"  :driver = new FirefoxDriver();break;
		default: System.out.println( "Invalid Browser"  );
		return;
		}
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://tutorialsninja.com/demo/");
		driver.get(p.getProperty("appURL2")); //reading URL from properties file
		
		driver.manage().window().maximize();	
	}
	
	
	
	
	public String randomeString()
	{
		
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	public String randomeNumber()
	{
		
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}
	
	public String randomeAlphaNumeric()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		String generatedNumber = RandomStringUtils.randomNumeric(3);
		
		return (generatedNumber+"@"+ generatedString);
	}
	
	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		
		Thread.sleep(4000);
		driver.quit();
	}
	
}
	
	
	
	

