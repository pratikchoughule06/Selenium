package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {
	WebDriver driver;
	@FindBy (xpath= "(//img[@src='/img/default/pixel.gif?hash=274618146'])[3]")
	private WebElement TimeTrack;
	
	@FindBy (xpath= "(//img[@src='/img/default/pixel.gif?hash=274618146'])[7]")
	private WebElement Tasks;
	
	@FindBy (xpath= "(//img[@src='/img/default/pixel.gif?hash=274618146'])[9]")
	private WebElement Reports;
	
	@FindBy (xpath= "(//img[@src='/img/default/pixel.gif?hash=274618146'])[11]")
	private WebElement User;
	
	@FindBy (xpath= "(//img[@src='/img/default/pixel.gif?hash=274618146'])[13]")
	private WebElement WorkSchedule;

	@FindBy (xpath= "(//div[@class='popup_menu_arrow'])[1]")
	private WebElement SettingIcon;
	
	  //Setting Icon Sub Tabs
	
	    @FindBy (xpath= "//li[@id='popup_menu_item_1']")
	    private WebElement CustomizableFeature;
	    
	    @FindBy (xpath= "//li[@id='popup_menu_item_2']")
	    private WebElement GeneralSetting;
	    
	    @FindBy (xpath= "//li[@id='popup_menu_item_3']")
	    private WebElement TypesOfWork;
	    
	    @FindBy (xpath= "//li[@id='popup_menu_item_5']")
	    private WebElement LogoColorScheme;
	    
	    @FindBy (xpath= "//li[@id='popup_menu_item_6']")
	    private WebElement Licenses;
	    
	
	@FindBy (xpath= "(//div[@class='popup_menu_arrow'])[2]")
	private WebElement AddOnsIcon;
	
	  //Add-Ons Icon Sub Tabs
	    @FindBy (xpath= "(//li[@class='popup_menu_item'])[6]")
        private WebElement ActiTIMEMobileApp;
    
        @FindBy (xpath= "(//li[@class='popup_menu_item'])[7]")
        private WebElement IntegrationWithQuickBooks;
    
        @FindBy (xpath= "(//li[@class='popup_menu_item'])[8]")
        private WebElement ActiPlans;
        
    
	@FindBy (xpath= "(//div[@class='popup_menu_arrow'])[3]")
	private WebElement HelpSupportIcon;
	
	  //Help & Support Icon Sub Tabs
	
	    @FindBy (xpath= "(//li[@class='popup_menu_item'])[9]")
        private WebElement UserGuide;
    
        @FindBy (xpath= "(//li[@class='popup_menu_item'])[10]")
        private WebElement FrequentlyAskedQuestions;
    
        @FindBy (xpath= "(//li[@class='popup_menu_item'])[11]")
        private WebElement SendaQuestionToVendor;
    
        @FindBy (xpath= "(//li[@class='popup_menu_item'])[12]")
        private WebElement RequestAnAdditionalFeature;
    
        @FindBy (xpath= "(//li[@class='popup_menu_item'])[13]")
        private WebElement ReportaBugToVendor;
        
        @FindBy (xpath= "(//li[@class='popup_menu_item'])[14]")
        private WebElement AboutActiTIME;
        
        
    @FindBy (xpath= "(//a[@href='javascript:void(0)'])[2]")
    private WebElement AdministratorSystem;
    
    @FindBy (xpath= "//a[@id='logoutLink']")
    private WebElement Logout;
    
    public ApplicationHeader (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
//    public void clickApplicationHeader() {
//    	TimeTrack.click();
//    	Tasks.click();
    	public void clickReportPage() { 
    	Reports.click();
    	}
//    	User.click();
//    	WorkSchedule.click();
//    	
//    	SettingIcon.click();
//    	   CustomizableFeature.click();
//    	   GeneralSetting.click();
//    	   TypesOfWork.click();
//    	   LogoColorScheme.click();
//    	   Licenses.click();
//    	   
//    	AddOnsIcon.click();
//    	   ActiTIMEMobileApp.click();
//    	   IntegrationWithQuickBooks.click();
//    	   ActiPlans.click();
//    	   
//    	HelpSupportIcon.click();
//    	   UserGuide.click();
//    	   FrequentlyAskedQuestions.click();
//    	   SendaQuestionToVendor.click();
//    	   RequestAnAdditionalFeature.click();
//    	   ReportaBugToVendor.click();
//    	   AboutActiTIME.click();
//    	   
//    	AdministratorSystem.click();
//    	Logout.click();
//    }
    
}
