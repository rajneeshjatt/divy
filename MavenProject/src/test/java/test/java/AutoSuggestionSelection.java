package test.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoSuggestionSelection {

	WebDriver driver;

	@BeforeMethod
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "H:\\DivyAutomation\\ToolsNlibrary\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("https://www.makemytrip.com/flights/");
		driver.navigate().refresh();
		Thread.sleep(3000);
	}

	/*
	 * @Test public void autosugg() throws Exception {
	 * 
	 * 
	 * WebElement from = driver.findElement(By.xpath("//label[@for='fromCity']"));
	 * from.click(); Thread.sleep(3000);
	 * 
	 * WebElement from1 =
	 * driver.findElement(By.xpath("//input[@placeholder='From']"));
	 * from1.sendKeys("a"); Thread.sleep(5000);
	 * 
	 * driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.
	 * ARROW_DOWN); Thread.sleep(3000);
	 * 
	 * JavascriptExecutor js = (JavascriptExecutor) driver; String Script =
	 * "return (document.getElementsByTagName('input')[1]).value;";
	 * 
	 * String cityname = ""; int i=0;
	 * 
	 * while(!cityname.equalsIgnoreCase("ahmedabad")) {
	 * 
	 * i++;
	 * driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.
	 * ARROW_DOWN); cityname = (String) js.executeScript(Script);
	 * System.out.println(cityname);
	 * 
	 * if(i==10) { break; } }
	 * 
	 * from1.sendKeys(Keys.ENTER);
	 * 
	 * //driver.quit();
	 * 
	 * }
	 */

	@Test(priority = 0)
	public void calendar() throws Exception {

		driver.findElement(By.xpath("//label[@for=\"departure\"]")).click();

		String Month = "";
		String aval="";
		
		
		while(!aval.equalsIgnoreCase("November")) {
		
		Month = driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]//div//div")).getText();
		String[] Formattedmonth = Month.split(" ");
		aval = Formattedmonth[0].trim();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(
				"//div[@class='DayPicker-wrapper']//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"))
				.click();
		Thread.sleep(3000);

		}
			

		}

		// next-prev
		// butto//div[@class="DayPicker-wrapper"]//span[@class="DayPicker-NavButton
		// DayPicker-NavButton--next"]

	}


