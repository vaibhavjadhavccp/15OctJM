package com.saucedemo.TestPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePOMClass;

public class TC04_VerfiyAllProductsAddToCartFunctionality extends TestBaseClass
{
	@Test
	public void verfiyAllProductsAddToCartFunctionality() 
	{
		
		HomePOMClass hp = new HomePOMClass(driver);
		
		hp.clickAddAllProducts();
		log.info("Clicked on All products");
		
		//validation for basket prod count
		String actualProdSelected = hp.getTextFromBasket();
		String expectedProdSelected = "6";
				
		Assert.assertEquals(actualProdSelected, expectedProdSelected);
	
	}
}
