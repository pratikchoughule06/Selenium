package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Browser;
import pom.ApplicationHeader;
import pom.LoginPage;
import utils.Utility;

public class VerifyHeadersOfApplication extends Browser {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private ApplicationHeader applicationHeader;
	private SoftAssert softAssert;
	int testID;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) {
		
		System.out.println(browser);
		
		if (browser.equalsIgnoreCase("Chrome")) {
			driver= launchChromeBrowser();
		}
		
		if (browser.equalsIgnoreCase("Firefox")) {
			driver= launchFirefoxBrowser();
		}
		
		if (browser.equalsIgnoreCase("Edge")) {
			driver= launchEdgeDriver();
		}
		
		if (browser.equalsIgnoreCase("IE")) {
			driver= launchIEBrowser();
		}
		
		if (browser.equalsIgnoreCase("Safari")) {
			driver= launchSafariBrowser();
		}
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@BeforeClass
	public void createPOMObjects() {
		loginPage= new LoginPage(driver);
		applicationHeader= new ApplicationHeader(driver); 

	}
	
	@BeforeMethod
	public void loginToApplication() {
		
		System.out.println("Login To Application");
		driver.get("http://localhost/login.do");
		loginPage.sendUserName("admin");
		loginPage.sendPassword("manager");
		loginPage.selctKeepMeLogin();
		loginPage.clickOnLogin();
		
	}
	
	@Test (priority= 1)
	public void toVerifyTimeTrackTab() {
		testID= 100;
		System.out.println("To Verify TimeTrack Tab");
		applicationHeader.clickTimeTrack();
		
		String currentUrl= driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "http://localhost/user/submit_tt.do", "Time-Track Page URL does not match" );

		String pageTitle= driver.getTitle();
		Assert.assertEquals(pageTitle, "actiTIME - Enter Time-Trac", "Time-Track Page Title does not match");

	}
	
	@Test (priority= 2)
	public void toVerifyTaskTab() {
		testID= 101;
		softAssert= new SoftAssert();
		
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
		testID= 103;
		softAssert= new SoftAssert();
		
		System.out.println("To Verify Reports Tab");
		applicationHeader.clickReportPage();
		
		String currentUrl= driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "http://localhost/reports/reports.do", "Reports Tab Page URL did not matched");
		
		String pageTitle= driver.getTitle();
		softAssert.assertEquals(pageTitle, "actiTIME - Saved Reports", "Reports Tab Page Title did not matched");
		
	}
	
	@Test (priority= 4)
	public void toVerifyUsersTab() {
		testID= 104;
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
		testID=105;
		softAssert= new SoftAssert();
		
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
	public void logoutFromApplication(ITestResult result) throws IOException {
		
		if (ITestResult.FAILURE== result.getStatus())
		{
			Utility.getScreenShot(driver, testID);
		}
		
		System.out.println("Logout");
		applicationHeader.clickLogout();
	}
	
	@AfterClass
	public void clearPOMObjects() {
		loginPage= null;
		applicationHeader= null;
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Close Browser");
		driver.quit();
		driver= null;
		System.gc();
	}
	
}
