package com.saucedemo.TestPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePOMClass;

public class TC03_VerifyBagProductAddToCartFunctionality extends TestBaseClass
{
	@Test
	public void verifyBagProductAddToCartFunctionality() 
	{
		
		HomePOMClass hp = new HomePOMClass(driver);
		
		hp.clickAddToCartBtn();
		log.info("Clicked on AddToCart Button of Bag Product");
		
		//validation for basket prod count
		String actualProdSelected = hp.getTextFromBasket();
		String expectedProdSelected = "1";
		
		Assert.assertEquals(actualProdSelected, expectedProdSelected);
				
	}
}
