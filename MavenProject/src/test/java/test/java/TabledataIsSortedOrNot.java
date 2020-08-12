package test.java;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabledataIsSortedOrNot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H:\\DivyAutomation\\ToolsNlibrary\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize the browser screen
		// driver.manage().deleteAllCookies(); // delete all cookies which is previously
		// stored
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		List<WebElement> elements = driver.findElements(By.xpath("//tr/td[2]")); // all elements with this path will be
																					// stored in elements variable

		ArrayList<String> OriginalList = new ArrayList<String>();

		for (int i = 0; i < elements.size(); i++) {

			OriginalList.add(elements.get(i).getText());
		}

		ArrayList<String> copiedList = new ArrayList<String>();

		for (int i = 0; i < OriginalList.size(); i++) {

			copiedList.add(OriginalList.get(i));
		}

		System.out.println("****************Original List********************");

		for (String k : OriginalList) {

			System.out.println(k);
		}

		Collections.sort(copiedList);  // for descending use collections.reverse(copiedList); after sorting in ascending 

		System.out.println("****************Sorted List********************");

		for (String k : copiedList) {

			System.out.println(k);
		}

		try {
			assertTrue(copiedList.equals(OriginalList), "Column is not sorted and not in Ascending order");
		} catch (Exception e) {

			System.out.println("Error");
		} finally {

			driver.close();

		}

		/*
		 * if(t.equals(true)) {
		 * System.out.println("Column is sorted and in Ascending order"); } else {
		 * 
		 * System.out.println("Column is not sorted and not in Ascending order "); }
		 */

	}

}
