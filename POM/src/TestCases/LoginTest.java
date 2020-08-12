package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class LoginTest {

	WebDriver driver;

	String URL = "http://demo.guru99.com/V4/";
	String driverPath = "H:\\DivyAutomation\\ToolsNlibrary\\chromedriver.exe";
	HomePage objHome;
	LoginPage objLogin;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", this.driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to(URL);

	}

	@Test(priority = 0)
	public void test_Home_Page_Appear_Correct() {

		objLogin = new LoginPage(driver);
		
		String Title = objLogin.LoginTitle();
		
		Assert.assertTrue(Title.toLowerCase().contains("guru99 bank"));
		
		objLogin.Login("mgr123", "mgr!23");
		
		objHome = new HomePage(driver);
		
		String Dashboard = objHome.getHomePageDashboardUserName();
		
		Assert.assertTrue(Dashboard.toLowerCase().contains("manger id : mgr123"));
		
	}
}
