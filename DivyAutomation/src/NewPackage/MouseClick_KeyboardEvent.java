package NewPackage;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class MouseClick_KeyboardEvent {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "H:\\DivyAutomation\\ToolsNlibrary\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String URL = "http://demo.guru99.com/test/newtours/";
		driver.get(URL);
		Thread.sleep(5);		
		
		WebElement Target = driver.findElement(By.xpath("//input[@type='text']"));
		
		Actions a = new Actions(driver);
		
		Action Mouseover = a.moveToElement(Target).build();
		Mouseover.perform();
		
		
		
		
		
	}

}
