package testBrowserSetup;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	public static WebDriver launchChromeBrowser() {
//		System.setProperty("webdriver.chrome.driver", "src" + File.separator + "test" + File.separator + "resources" + File.separator + "browsers" + File.separator + "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		return driver;
	}
	
	public static WebDriver launchFirefoxBrowser() {
//		System.setProperty("webdriver.gecko.driver", "src" + File.separator + "test" + File.separator + "resources" + File.separator + "browsers" + File.separator + "geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		return driver;
	}
	
	public static WebDriver launchEdgeDriver() {
//  	System.setProperty("webdriver.edge.driver", "src" + File.separator + "test" + File.separator + "resources" + File.separator + "browsers" + File.separator + "msedgedriver.exe");
    	WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		return driver;
	}
	
	public static WebDriver launchIEBrowser() {
//		System.setProperty("webdriver.ie.driver", "src" + File.separator + "test" + File.separator + "resources" + File.separator + "browsers" + File.separator + "IEDriverServer.exe");
		WebDriverManager.iedriver().setup();
		WebDriver driver= new InternetExplorerDriver();
		return driver;
	}
	
	public static WebDriver launchOperaBrowser() {
//		System.setProperty("webdriver.opera.driver", "src" + File.separator + "test" + File.separator + "resources" + File.separator + "browsers" + File.separator + "operadriver.exe");
		WebDriverManager.operadriver().setup();
		WebDriver driver= new OperaDriver();
		return driver;
	}
	
	public static WebDriver launchSafariBrowser() {
		WebDriverManager.safaridriver().setup();
		WebDriver driver= new SafariDriver();
		return driver;
	}

}
