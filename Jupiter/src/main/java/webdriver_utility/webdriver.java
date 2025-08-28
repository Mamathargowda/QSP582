package webdriver_utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class webdriver {
	
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void implicitWait(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void selectClass(WebElement ele, String value) {
		Select sel = new Select(ele);
		sel.selectByValue(value);
	}
}
