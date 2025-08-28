package Integration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseClass_Utility.baseclass;
import java_Utility.java;
import object_Repository.cartPage;
import object_Repository.home;
import object_Repository.shop_page;
import webdriver_utility.webdriver;

@Listeners(listeners_utility.listener_utility.class)
public class addToCartTest extends baseclass {
	webdriver web = new webdriver();
	
	@Test
	public void addToCart() {
		
		shop_page shop = new shop_page(driver);
		home hm = new home(driver);
		
		web.maximizeWindow(driver);
		web.implicitWait(driver);
		
		hm.getStartShopping().click();
		
		shop.getBuyProduct().click();
		shop.getCart().click();
		
	}

}
