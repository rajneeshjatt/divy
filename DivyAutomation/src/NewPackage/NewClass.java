package NewPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "H:\\DivyAutomation\\ToolsNlibrary\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		DesiredCapabilities.chrome();
		
		String baseURL = "http://demo.guru99.com/test/newtours/";
		
		driver.get(baseURL);
		
		String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        
        String actualTitle1 = driver.getTitle();
        
        if(actualTitle1.equals(expectedTitle)) {
        	
        	System.out.println("Test Pass");
        } else {
        	
        	System.out.println("test Failed");
        }
        
        driver.close();
        
        
	}

}
