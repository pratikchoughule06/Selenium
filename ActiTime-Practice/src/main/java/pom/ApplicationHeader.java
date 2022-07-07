package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {
	
	private WebDriver driver;
	
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
		this.driver= driver;
	}
    
    
 
    public void clickTimeTrack() {
    	TimeTrack.click();
    }
    
    public void clickTasks() {
    	Tasks.click();
    }
    
    public void clickReportPage() { 
    	Reports.click();
    }
    
    public void clickUser() {
    	User.click();
    }

    public void clickWorkSchedule() { 
        WorkSchedule.click();
    }
     	
    public void clickSettingIcon() {	
        SettingIcon.click();
    }
    
 //Setting Icon Sub Tabs
    
        public void clickCustomizableFeature() {
    	    CustomizableFeature.click();
        }
        
        public void clickGeneralSetting() {
     	    GeneralSetting.click();
        }
        
        public void clickTypesOfWork() {
     	    TypesOfWork.click();
        }
        
        public void clickLogoColorScheme() {
    	    LogoColorScheme.click();
        }
    	   
        public void clickLicenses() {
            Licenses.click();
        }
    	   
    public void clickAddOnsIcon() {
        AddOnsIcon.click();
    }
    
  //Add-Ons Icon Sub Tabs
    
        public void clickActiTIMEMobileApp() {
    	    ActiTIMEMobileApp.click();
        }
        
        public void clickIntegrationWithQuickBooks() {
    	    IntegrationWithQuickBooks.click();
        }
        
        public void clickActiPlans() {
    	    ActiPlans.click();
        }

    public void clickHelpSupportIcon() {
    	HelpSupportIcon.click();
    }
    
  //Help & Support Icon Sub Tabs
    
        public void clickUserGuide() {
    	    UserGuide.click();
        }
        
        public void clickFrequentlyAskedQuestions() {
    	    FrequentlyAskedQuestions.click();
        }
        
        public void clickSendaQuestionToVendor() {
        	SendaQuestionToVendor.click();
        }
        
        public void clickRequestAnAdditionalFeature() {
    	    RequestAnAdditionalFeature.click();
        }
        
        public void clickReportaBugToVendor() {
    	    ReportaBugToVendor.click();
        }
        
        public void clickAboutActiTIME() {
    	    AboutActiTIME.click();
        }
    	   
    public void clickAdministratorSystem() {	
        AdministratorSystem.click();
    }
    
    public void clickLogout() {
    	Logout.click();
    }
}



