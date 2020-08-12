package NewPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FindAllBrokenLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H:\\DivyAutomation\\ToolsNlibrary\\chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome", true);

		WebDriver driver = new ChromeDriver(capabilities);

		String URL = "http://www.facebook.com";

		driver.navigate().to(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> l = driver.findElements(By.tagName("a"));
		Iterator<WebElement> i = l.iterator();

		while (i.hasNext()) {

			URL = i.next().getAttribute("href");

			if (URL != null && !URL.isEmpty()) {

				System.out.println("Link is: " + URL);
			}

		

		try {
			HttpURLConnection con = (HttpURLConnection) (new URL(URL).openConnection());
			//con.setRequestMethod("HEAD");
			con.connect();

			int ResponseCode = con.getResponseCode();
			

			if (ResponseCode == 200) {
				System.out.println(URL + " is working fine");
			} else {

				System.out.println(URL + " is a broken link");

			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		driver.quit();

	}

}
