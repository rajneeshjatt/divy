package Parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Go to Google.com
// Search with the parameter India, UK, USA
// Get the value of entered SearchKey

public class ParameterAnnotationWithTestNGxml {

	WebDriver driver;
	@FindBy(name = "q")
	WebElement Searchkey;

	@Test
	@Parameters("SearchValue")
	public void VerifySearchKey(@Optional("UK") String SearchValue) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "H:\\DivyAutomation\\ToolsNlibrary\\chromedriver.exe");

		driver.get("https://www.google.com/");
		PageFactory.initElements(driver, this);

		Searchkey.sendKeys(SearchValue);

		Thread.sleep(30);

		System.out.println("You have entered: " + SearchValue);

		Thread.sleep(30);

		String value1 = Searchkey.getAttribute("value");
		
		Assert.assertTrue(value1.toLowerCase().contains("india"));

	}
}
