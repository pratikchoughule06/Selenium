package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void getScreenShot(WebDriver driver, int testID) throws IOException {
		
		DateFormat dateFormat = new SimpleDateFormat(" dd-MM-yyyy HH-mm-ss");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        System.out.println("Failed ScreenShot Taken at" + date1);
		
        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		File destination = new File("test-output" + File.separator + "FailedTestsScreenShots" + File.separator + "testID_"+ testID +date1+ " IST" + ".jpg");	
		FileHandler.copy(sourceFile, destination);
	}
	
	public static void getDataFromExcel() throws IOException {
		
        String excelfilepath= "src" + File.separator + "test" + File.separator + "resources"+ File.separator + "ExcelFiles" + File.separator + "LoginDetails.xlsx";       
		FileInputStream fileInputStream= new FileInputStream (excelfilepath); 
		
		XSSFWorkbook workbook= new XSSFWorkbook(fileInputStream);  
		
		XSSFSheet sheet= workbook.getSheet("Sheet1");   
			
		int cellcount= sheet.getRow(1).getLastCellNum();  
		
			XSSFRow currentrow=sheet.getRow(1);      
			
			for (int cell=0; cell<cellcount; cell++)
			{
				currentrow.getCell(cell).getStringCellValue();   				
		    }
	}
}
