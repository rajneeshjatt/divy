package NewPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "H:\\DivyAutomation\\ToolsNlibrary\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String URL = "http://output.jsbin.com/usidix/1";

		driver.navigate().to(URL); // navigate().to() is exactly working same as get() method does
		Thread.sleep(2);

		driver.navigate().refresh(); // Page Reftresh
		Thread.sleep(2);

		driver.findElement(By.xpath("//input[@value='Go!']")).click();
		Thread.sleep(1);
		
		String alertText = driver.switchTo().alert().getText(); // get text of alert window
		System.out.println("Alert message: " + alertText);
		
	    driver.switchTo().alert().dismiss();
	    System.out.println("Dismiss Alert");
	    Thread.sleep(1);
	    
	    driver.findElement(By.xpath("//input[@value='Go!']")).click();
		Thread.sleep(1);
		
		driver.switchTo().alert().accept();
		System.out.println("Accept Alert");
		
		driver.quit();
	    
		
	}

}
