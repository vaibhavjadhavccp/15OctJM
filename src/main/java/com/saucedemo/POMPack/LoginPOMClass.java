package com.saucedemo.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 
{
	
	//No execution
	//no main method
	//ele find and ele action maintain
		
	//1.WebDriver globally declared
	private WebDriver driver;
	Actions act;
		
	//username
	//password
	//loginBtn
		
	//here, we are not going to use findElement method	
	//WebElement username =driver.findElement(By.xpath("username xpath"));
		
	//here we use annotation -> starts with @
	//annotations works like method only
	//@FindBy
	
	
	//2.Element find with @FindBy
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	//3.Element action perform in a method
    public void sendUsername()
    {
    	username.sendKeys("standard_user");
    }

    
    //@FindBy(id="password")     //we can use id also instead xpath
	//or
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;

	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginBtn;
	
//	public void clickLoginBtn()
//	{
//		loginBtn.click();
//	}
	
	//click using mouse action
	public void clickLoginBtn()
	{
		act.click(loginBtn).perform();
	}
	
	
	//4.constructor create
	public LoginPOMClass(WebDriver driver)
	{
		//global      local
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		act = new Actions(driver);
	}

	
}
