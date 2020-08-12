package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(name = "uid")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement loginbtn;
	
	@FindBy(className="barone")
	WebElement h2title;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void setUserName(String enterName) {
		username.sendKeys(enterName);
	}

	public void setPassword(String enterPass) {
		password.sendKeys(enterPass);
	}

	public void clickLogin() {
		loginbtn.click();
	}

	public String LoginTitle() {

		return h2title.getText();
	}

	public void Login(String enterName, String enterPass) {

		this.setUserName(enterName);

		this.setPassword(enterPass);

		this.clickLogin();

	}

}
