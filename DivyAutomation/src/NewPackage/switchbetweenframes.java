package NewPackage;


import java.awt.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchbetweenframes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "H:\\DivyAutomation\\ToolsNlibrary\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String URL = "http://demo.guru99.com/selenium/deprecated.html";
		driver.get(URL);
		Thread.sleep(5);
		
	    driver.switchTo().frame("classFrame");
	    Thread.sleep(2);
	    WebElement Link = driver.findElement(By.linkText("Deprecated"));
		Link.click();
		
		driver.close();

	}

}
