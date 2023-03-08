package com.saucedemo.POMPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass 
{

	private WebDriver driver;
	private Select s;
	
	//hm menu btn
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement hmBurgerMenuBtn;
	
	public void clickhmBurgerMenuBtn()
	{
		hmBurgerMenuBtn.click();
	}
	
	
	//click on close to close the menu
	@FindBy(xpath="//button[@id='react-burger-cross-btn']")
	private WebElement closeMenuBtn;
	
	public void clickCloseMenuBtn()
	{
		closeMenuBtn.click();
	}
	
	
	//logout btn
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logoutBtn;
	
	public void clicklogoutBtn()
	{
		logoutBtn.click();
	}
	
	//bag element add to cart
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bagAddToCart;
	
	public void clickAddToCartBtn()
	{
		bagAddToCart.click();
	}
	
	
	//find basket btn for validation -> getText
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement basketBtn;
	
	//method -> select basket
	public void clickBasketButton()
	{
		basketBtn.click();
	}
	
	//validate basket
	public String getTextFromBasket()
	{
		String actualProdSelected = basketBtn.getText();
		return actualProdSelected;
	}
	
	
	//all products add to cart
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> addAllProducts;
	
	//method -> click on all products
	public void clickAddAllProducts()
	{
		for(int i=0; i<addAllProducts.size(); i++)
		//for(WebElement x : addAllProducts)
		{
			//x.click();
			addAllProducts.get(i).click();
		}
	}
	
	
	//for about page
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	private WebElement aboutPageBtn;
	
	public void clickAboutPageBtn()
	{
		aboutPageBtn.click();
	}
	
	
	//filter drop down
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filterDropDown;
	
	public void clickFilterBtn()
	{
		filterDropDown.click();
		
		s.selectByIndex(3);
//		s.selectByValue("lohi");
//		s.selectByVisibleText("Name (Z to A)");
	}
	
	
	
	//const
	public HomePOMClass(WebDriver driver) 
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		s = new Select(filterDropDown);
	}
	
}
