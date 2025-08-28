package object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shop_page {
	
	public shop_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h4[text()='Stuffed Frog']/following-sibling::p//a[text()='Buy']")
	private WebElement buyProduct;
	
	public WebElement getBuyProduct() {
		return buyProduct;
	}
	
	@FindBy(partialLinkText="Cart (")
	private WebElement cart;
	
	public WebElement getCart() {
		return cart;
	}

}
