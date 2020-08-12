package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValueFromDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "H:\\DivyAutomation\\ToolsNlibrary\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String URL = " http://jsbin.com/osebed/2";
		driver.get(URL);
		Thread.sleep(5);

		Select S = new Select(driver.findElement(By.xpath("//select[@id='fruits']")));
		
		System.out.println("Dropwdown is Multiple selection or not: " + S.isMultiple());
		
		try {
		S.selectByVisibleText("Banana");
		
		S.selectByValue("apple");
		
		S.selectByIndex(2);
		
		S.deselectAll();
		
		} catch(NoSuchElementException nsee) {
			
			System.out.println(nsee.toString());
			
		}
		driver.close();
	}
	}

