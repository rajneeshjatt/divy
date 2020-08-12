package NewPackage;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.events.DocumentEvent;

public class LocatingElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "H:\\DivyAutomation\\ToolsNlibrary\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String URL = "https://www.facebook.com/";

		driver.get(URL);
		Thread.sleep(5);

		String emailTag = driver.findElement(By.id("email")).getTagName();
		Thread.sleep(2);
		System.out.println(emailTag);
		Thread.sleep(2);

		String clsName = driver.findElement(By.name("pass")).getTagName();
		System.out.println(clsName);

	String Login= driver.findElement(By.cssSelector("input#u_0_b")).getTagName();
		/*
		 * By ID tag#id = input#u_0_b By Class tag.className = -- By
		 * Tag[attribute="value"] = input[value="Log In"] By TagName.class[att="value"] = --
		 */
       System.out.println("Login");
       
       // Locating Elements by XPATH
       
       String pas = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).getTagName(); // Absolute XPath
       System.out.println(pas);
       Thread.sleep(1);
       
       String em = driver.findElement(By.xpath("//input[@id=\"email\"]")).getTagName(); // Relative Xpath = Basic
       System.out.println(em);
       Thread.sleep(1);

       String em1 = driver.findElement(By.xpath("//input[contains(@id,'email')]")).getTagName(); // Contains Xpath
       System.out.println(em1);
       
       String em2 = driver.findElement(By.xpath("//input[starts-with(@name, 'em')]")).getTagName(); // starts-with Xpath
       System.out.println(em2);
       
       // //*[@class="clearfix loggedout_menubar"]//form//preceding::input (--- //child:: ---- //following:: ----- // ancestor:: --) Xpath axes Method
       
       
       
       
       driver.quit();
       
	}

}
