package test.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLcertAccept {

	
	public static void main(String []args) {
		
		DesiredCapabilities dc = new DesiredCapabilities().chrome();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, false);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, false);
		
		ChromeOptions co = new ChromeOptions();
		co.merge(dc);
		
		System.setProperty("webdriver.chrome.driver", "H:\\DivyAutomation\\ToolsNlibrary\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize(); // maximize the browser screen
		driver.manage().deleteAllCookies(); // delete all cookies which is previously stored 
		driver.manage().deleteCookieNamed("test"); // delete the specific cookies 
		
		driver.get("https://www.facebook.com");
	}
	
	
	
}
