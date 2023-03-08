package com.saucedemo.TestPack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemo.POMPack.LoginPOMClass;

public class TestBaseClass
{
	WebDriver driver;
	
	Logger log = Logger.getLogger("SauceDemo-15Oct-Project");
	
	@Parameters("browserName")
	
	@BeforeMethod
	public void setUp(String browserName)
	{
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
			"D:\\Software Testing\\Softwares\\Driver\\chromedriver.exe");
							
			driver = new ChromeDriver();
		}
		
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", 
			"D:\\Software Testing\\Softwares\\Driver\\geckodriver.exe");
					
			driver = new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Error in opening the browser");
		}		
		
		PropertyConfigurator.configure("log4j.properties");
		log.info("Browser is opened");
		
		driver.manage().window().maximize();
		log.info("Window is maximized");
		driver.get("https://www.saucedemo.com/");
		log.info("URL is opened");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
		LoginPOMClass lp = new LoginPOMClass(driver);
				
		lp.sendUsername();
		log.info("Username is entered");
		lp.sendPassword();
		log.info("Password is entered");
		lp.clickLoginBtn();
		log.info("Clicked on login button");
				
		log.info("Went on Home page");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		log.info("Browser is closed");
		log.info("End of Program");
	}
	
}
