package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ApplicationHeader;
import pom.LoginPage;
import pom.ReportsPage;

public class TestClass1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "A:\\Testing recording\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.sendUserName();
		loginPage.sendPassword();
		loginPage.selctKeepMeLogin();
		loginPage.clickOnLogin();
		
		ApplicationHeader applicationHeader = new ApplicationHeader(driver);
		applicationHeader.clickReportPage();
		
		ReportsPage reportspage = new ReportsPage (driver);
		reportspage.clickonCreateReport();
		reportspage.clickonBillingSummary();
		reportspage.clickonReportParameters();
		
	}

}
