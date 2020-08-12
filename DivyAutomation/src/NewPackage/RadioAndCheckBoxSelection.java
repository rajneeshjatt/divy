package NewPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckBoxSelection {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "H:\\DivyAutomation\\ToolsNlibrary\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String URL = "http://demo.guru99.com/test/radio.html";
		driver.get(URL);
		Thread.sleep(5);

		WebElement Option1 = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		Option1.click();
		System.out.println(Option1.isSelected());
		System.out.println(Option1.isEnabled());
		
		if(Option1.isSelected() && Option1.isEnabled()) {
			System.out.println("Option 1 is selected and Enabled");
		} else {
			System.out.println("Option 1 is not sleected and Enabled");
		}

		driver.close();
	}
}
