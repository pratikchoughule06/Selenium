package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.ApplicationHeader;
import pom.LoginPage;
import pom.ReportsPage;

public class TestClass1 {
	
	public static void main(String[] args) {
		
  //Traditional WebDriver Method:
		//System.setProperty("webdriver.chrome.driver", "A:\\software\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "A:\\software\\geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", "A:\\software\\msedgedriver.exe");
		//System.setProperty("webdriver.ie.driver", "A:\\software\\IEDriverServer.exe");

		
  //WebDriverManager API Method:
		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver= new FirefoxDriver();
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver= new EdgeDriver();
		
//		WebDriverManager.iedriver().setup();
//		WebDriver driver= new InternetExplorerDriver();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.sendUserName("admin");
		loginPage.sendPassword("manager");
		loginPage.selctKeepMeLogin();
		loginPage.clickOnLogin();
		
		ApplicationHeader applicationHeader = new ApplicationHeader(driver);
		applicationHeader.clickReportPage();
		
		ReportsPage reportspage = new ReportsPage (driver);
		reportspage.clickonCreateReport();
		reportspage.clickonBillingSummary();
		reportspage.clickonReportParameters();
		
		applicationHeader.clickLogout();
		
	}

}
