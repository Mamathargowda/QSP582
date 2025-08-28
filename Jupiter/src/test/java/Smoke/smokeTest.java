package Smoke;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseClass_Utility.baseclass;
import java_Utility.java;
import object_Repository.cartPage;
import object_Repository.home;
import object_Repository.shop_page;
import webdriver_utility.webdriver;

@Listeners(listeners_utility.listener_utility.class)
public class smokeTest extends baseclass{
	webdriver web = new webdriver();
	@Test
	public void start() {

		web.maximizeWindow(driver);
		web.implicitWait(driver);
		
		home hm = new home(driver);
		hm.getStartShopping().click();
	}
	
	@Test
	public void buyProduct() {

		shop_page shop = new shop_page(driver);
		cartPage cart =new cartPage(driver);
		home hm = new home(driver);
		java ran = new java();
		
		String name = "Mamatha"+ran.randomNum();
		web.maximizeWindow(driver);
		web.implicitWait(driver);
		
		hm.getStartShopping().click();
		
		shop.getBuyProduct().click();
		shop.getCart().click();
		
		cart.getcheckout().click();
		cart.submitDetails(name, "mamathagowda"+ran.randomNum()+"@gmail.com", "Bangalore", "Visa", "8465121544487");
		
		//validation
		String actual = cart.getvalidName().getText();
		String sub = actual.substring(7, 7+name.length());
		
		System.out.println(sub);
		Assert.assertEquals(name, sub);
		
	}
	

}
