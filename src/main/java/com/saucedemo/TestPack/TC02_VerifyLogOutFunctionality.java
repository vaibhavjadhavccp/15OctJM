package com.saucedemo.TestPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePOMClass;

public class TC02_VerifyLogOutFunctionality extends TestBaseClass
{
	@Test
	public void verifyLogOutFunctionality()
	{
		
		HomePOMClass hp = new HomePOMClass(driver);
		
		hp.clickhmBurgerMenuBtn();
		log.info("Clicked on Menu Button");
		hp.clicklogoutBtn();
		log.info("Clicked on Logout Button");
		
		
		//validation
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.saucedemo.com/";
		
		Assert.assertEquals(actualUrl, expectedUrl);
	
	}	
}
