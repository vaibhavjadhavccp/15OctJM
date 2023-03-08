package com.saucedemo.TestPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01_VerfiyLoginFunctionality extends TestBaseClass
{
	@Test
	public void verfiyLoginFunctionality()
	{
		
		String actualTitle   = driver.getTitle();
		String expectedTitle = "Swag Labs";   
		
		Assert.assertEquals(actualTitle, expectedTitle, "**Error Found**");
		
		log.info("Login TC is pass");
	}
	
}
