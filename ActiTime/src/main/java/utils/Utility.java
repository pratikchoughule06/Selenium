package utils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void getScreenShot(WebDriver driver, int testID) throws IOException {
		
		DateFormat dateFormat = new SimpleDateFormat(" dd-MM-yyyy HH-mm-ss");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        System.out.println(date1);
		
        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		File location = new File("test-output" + File.separator + "FailedTestsScreenShots" + File.separator + "testID_"+ testID +date1+ " IST" + ".jpg");	
		FileHandler.copy(sourceFile, location);
	}

}
