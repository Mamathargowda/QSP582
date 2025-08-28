package baseClass_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseclass {
	public WebDriver driver;
	public static WebDriver sdriver;
	
	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.get("https://jupiter.cloud.planittesting.com/#");
		sdriver=driver;
	}
	
	@AfterClass
	public void afterClass() {
		//driver.quit();
	}
	

}
