import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataProviders {

	WebDriver driver;

	@Test(priority = 1, dataProvider = "data1")
	public void dataProviderScript(String uname, String pass) {

		System.setProperty("webdriver.chrome.driver", "H:\\DivyAutomation\\ToolsNlibrary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("btnLogin")).click();

	}

	@Test(priority = 0, dataProvider = "data1")
	public void dataProviderScript1(String uname) {

		System.setProperty("webdriver.chrome.driver", "H:\\DivyAutomation\\ToolsNlibrary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys(uname);

	}

	@DataProvider(name = "data1")
	public static Object[][] data(Method m) {

		if (m.getName().equalsIgnoreCase("dataProviderScript")) {
			return new Object[][] {

					{ "div", "pass1" }, { "div2", "pass2" }, { "div3", "pass1" }

			};
		}

		else {
			return new Object[][] {

					{ "div" }, { "div2" }, { "div3" }

			};
		}
	}
}
