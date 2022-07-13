package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy (xpath= "//input[@name='username']")
	private WebElement userName;
	
	@FindBy (xpath= "//input[@name='pwd']")
	private WebElement password;
	
	@FindBy (xpath= "//div[@id='keepLoggedInCheckBoxContainer']")
	private WebElement keepMeLoginCheckbox;
	
	@FindBy (xpath= "//a[@id='loginButton']")
	private WebElement login;
	
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	
	//1st Method:
	
	public void sendUserName(String UserID) {
		userName.sendKeys(UserID);	
	}
	
	public void sendPassword(String Password) {
		password.sendKeys(Password);	
	}
	
	public void selctKeepMeLogin() {
		keepMeLoginCheckbox.click();
	}
	
	public void clickOnLogin() {
		login.click();	
	}
	
	//2nd Method:
	
//	public void loginToApplication() {
//		userName.sendKeys("admin");
//		password.sendKeys("manager");
//		keepMeLoginCheckbox.click();
//		login.click();
	//}
}
