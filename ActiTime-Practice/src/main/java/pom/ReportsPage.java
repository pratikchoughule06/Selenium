package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage {

	@FindBy (xpath = "//div[@id='ext-gen9']")
	private WebElement CreateReport;
	
	  //New Tab After Clicking Create Report Button
	
	     @FindBy (xpath = "//div[@id='reportName_3']")
	     private WebElement BillingSummary;
	     
	     @FindBy (xpath = "//input[@class='reportButton']")
	     private WebElement ConfigureReportParameters;
	     
	     
	public ReportsPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonCreateReport() {
		CreateReport.click();
	}
	
	public void clickonBillingSummary() {
		BillingSummary.click();
	}
	
	public void clickonReportParameters() {
		ConfigureReportParameters.click();
	}
}
