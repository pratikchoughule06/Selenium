package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.ApplicationHeader;
import pom.LoginPage;

public class VerifyHeadersOfApplication {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private ApplicationHeader applicationHeader;
	
	@BeforeClass
	public void launchBrowser() {
		
		System.out.println("Launch Browser");
//		System.setProperty("webdriver.chrome.driver", "A:\\software\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void loginToApplication() {
		
		System.out.println("Login To Application");
		driver.get("http://localhost/login.do");
		loginPage= new LoginPage(driver);
		loginPage.sendUserName("admin");
		loginPage.sendPassword("manager");
		loginPage.selctKeepMeLogin();
		loginPage.clickOnLogin();
		
		applicationHeader= new ApplicationHeader(driver); 
	}
	
	@Test (priority= 1)
	public void toVerifyTimeTrackTab() {
		
		System.out.println("To Verify TimeTrack Tab");
		applicationHeader.clickTimeTrack();
		
		String currentUrl= driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "http://localhost/user/submit_tt.do", "Time-Track Page URL does not match" );

		String pageTitle= driver.getTitle();
		Assert.assertEquals(pageTitle, "actiTIME - Enter Time-Track", "Time-Track Page Title does not match");

	}
	
	@Test (priority= 2)
	public void toVerifyTaskTab() {
		
		SoftAssert softAssert= new SoftAssert();
		
		System.out.println("To Verify Task Tab");
		applicationHeader.clickTasks();
		
		String currentUrl= driver.getCurrentUrl();
		softAssert.assertEquals(currentUrl, "http://localhost/tasks/otasklist.do", "Task Tab Page URL did not matched");
		
		String pageTitle= driver.getTitle();
		softAssert.assertEquals(pageTitle, "actiTIME - Open Tasks", "Task Tab Page Title did not matched");
		
		softAssert.assertAll();
	
	}
	
	@Test (priority= 3)
	public void toVerifyReportsTab() {
		
		SoftAssert softAssert= new SoftAssert();
		
		System.out.println("To Verify Reports Tab");
		applicationHeader.clickReportPage();
		
		String currentUrl= driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "http://localhost/reports/reports.do", "Reports Tab Page URL did not matched");
		
		String pageTitle= driver.getTitle();
		softAssert.assertEquals(pageTitle, "actiTIME - Saved Reports", "Reports Tab Page Title did not matched");
		
	}
	
	@Test (priority= 4)
	public void toVerifyUsersTab() {
		
		System.out.println("To Verify User Tab");
		applicationHeader.clickUser();
		
		String currentUrl= driver.getCurrentUrl();
		String expectedUrl= "http://localhost/administration/userlist.do";
        Assert.assertEquals(currentUrl, expectedUrl, "User Tab Page URL did not matched");
		
		String pageTitle= driver.getTitle();
		String expectedTitle= "actiTIME - User List";
		Assert.assertEquals(pageTitle, expectedTitle, "User Tab Page Title did not matched");
		
	}
	
	@Test (priority= 5)
	public void toVerifyWorkSchedule() {
		
		SoftAssert softAssert= new SoftAssert();
		
		System.out.println("To Verify Work Schedule");
		applicationHeader.clickWorkSchedule();
		
		String currentUrl= driver.getCurrentUrl();
		String expectedUrl= "http://localhost/administration/workingdays.do";
		softAssert.assertEquals(currentUrl, expectedUrl, "Work Schedule Page URL did not matched");
		
		String pageTitle= driver.getTitle();
		String expectedTitle= "actiTIME - Corporate Schedule";
		softAssert.assertEquals(pageTitle, expectedTitle, "Work Schedule Page Title did not matched");
		
		softAssert.assertAll();
		
	}
	
	@AfterMethod
	public void logoutFromApplication() {
		System.out.println("Logout");
		applicationHeader.clickLogout();
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
		driver.quit();
	}
	
}
