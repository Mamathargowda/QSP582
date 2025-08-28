package object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webdriver_utility.webdriver;

public class cartPage {
	webdriver web = new webdriver();
	
	public cartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Check Out")
	private WebElement checkout;
	
	@FindBy(id="forename")
	private WebElement firstName;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cardType")
	private WebElement cardType;
	
	@FindBy(id="card")
	private WebElement card;
	
	@FindBy(id="checkout-submit-btn")
	private WebElement submit;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement validName;
	
	//getters
	public WebElement getfirstName() {
		return firstName;
	}
	
	public WebElement getcheckout() {
		return checkout;
	}
	
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getaddress() {
		return address;
	}
	
	public WebElement getcard() {
		return card;
	}
	
	public WebElement getcardType() {
		return cardType;
	}
	
	public WebElement getsubmit() {
		return submit;
	}
	
	public WebElement getvalidName() {
		return validName;
	}
	
	public void submitDetails(String name, String emailId, String add,String cardtype, String cardNum) {
		firstName.sendKeys(name);
		email.sendKeys(emailId);
		address.sendKeys(add);
		web.selectClass(cardType, cardtype);
		card.sendKeys(cardNum);
		submit.click();
	}

}
