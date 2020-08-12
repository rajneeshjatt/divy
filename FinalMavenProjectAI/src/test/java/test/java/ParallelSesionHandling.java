package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelSesionHandling {

	String path = "H:\\DivyAutomation\\ToolsNlibrary\\chromedriver.exe";
	String URL = "http://demo.guru99.com/V4/";
	String key = "webdriver.chrome.driver";

	@Test
	public void first_Instance() {

		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.name("uid")).sendKeys("Driver 1");

	}

	@Test
	public void Second_Instance() {

		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.name("uid")).sendKeys("Driver 2");

	}

	@Test
	public void third_Instance() {

		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.name("uid")).sendKeys("Driver 3");

	}

}
