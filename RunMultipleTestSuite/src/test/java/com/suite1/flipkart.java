package com.suite1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flipkart {

	WebDriver driver;

	@Test
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "H:\\DivyAutomation\\ToolsNlibrary\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void SearchProduct() {

		driver.findElement(By.name("q")).sendKeys("moto g3");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

	@Test
	public void close() {
		driver.close();

	}

}
