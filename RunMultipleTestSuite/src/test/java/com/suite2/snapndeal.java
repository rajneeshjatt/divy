package com.suite2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class snapndeal {
	WebDriver driver;

	@Test
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "H:\\DivyAutomation\\ToolsNlibrary\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void SearchProduct() {

		driver.findElement(By.name("keyword")).sendKeys("moto g3");
		driver.findElement(By.xpath("//button[@class=\"searchformButton col-xs-4 rippleGrey\"]")).click();

	}

	@Test
	public void close() {
		driver.close();

	}
}
