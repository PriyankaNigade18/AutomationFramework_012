package com.SwagLabs.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLabs.Pages.*;

public class BaseClass 
{
	public WebDriver driver;
	public LoginPage lp;
	public InventoryPage ip;
	public CartPage cp;
	public CheckOutPage ch;
	public OverviewPage op;
	
	@BeforeTest//For all Pages Browser setup
	public void setUpBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		cp=new CartPage(driver);
		ch=new CheckOutPage(driver);
		op=new OverviewPage(driver);
		
		
	}
	
	
	@BeforeClass//Page preconditions
	public void pageSetUp()
	{   System.out.println("**********Login Page***********");
		System.out.println("Url is: "+lp.getUrl());
		System.out.println("Title is: "+lp.getAppTitle());
		
		lp.doLogin("standard_user","secret_sauce");
		addWait();
		
		System.out.println("**********Inventory Page***********");
		System.out.println("Total Product Count is: "+ip.getProductCount());
		ip.getProductName();
		addWait();
		ip.addToCart("Sauce Labs Bolt T-Shirt");
		addWait();
		cp.getCartPage();
		addWait();
		System.out.println("**********Cart Page***********");
		cp.doRemove();
		addWait();
		cp.doContinueShopping();
		ip.addToCart("Sauce Labs Bolt T-Shirt");
		cp.getCartPage();
		addWait();
		cp.doCheckOut();
		System.out.println("**********Checkout page***********");
		ch.doContinue("Priyanka","Nigade","411047");
		System.out.println("**********Overview page***********");

		
		

		
	}

	
	public void addWait()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
