package selenium.fonantrix.app.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import selenium.fonantrix.core.listener.CustomReporter;
import selenium.fonantrix.core.util.TestInfo;
import selenium.fonantrix.core.web.WebUtils;
//import com.github.yev.FailTestScreenshotListener;
import selenium.fonantrix.app.constants.Constants;


//@Listeners(FailTestScreenshotListener.class)
public class BabbelLogin {

    private WebUtils webUtils;
    
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module"})
	@BeforeClass
	public void SetUp(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {
		
		/*ConfigurationMap.loadConfigurations(System.getProperty("user.dir")+"\\config\\configuration.properties");
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\config\\log4j.properties");*/
		webUtils = new WebUtils(platform, browser, nodeURL);
		//String AppUserName = ConfigurationMap.getProperty("appLoginUserName");
		//String AppPassword = ConfigurationMap.getProperty("appLoginPassword");
		webUtils.openBrowser("http://www.babbel.com/", platform);	
	}

    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module"})
    @Test(description = "Bab_01", priority = 1)
    public void Babbel_Validate_Login_Functionality(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {


        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("BabbelLogin");
        testInfo.setTCName("Babbel_Validate_Login_Functionality");        
        
        testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);

        webUtils.navigateTo("http://www.babbel.com/");
        
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        webUtils.assertExist(Constants.BABBEL, "btn_LoginPage", testInfo);
        webUtils.press(Constants.BABBEL, "btn_LoginPage");
        
        webUtils.waitElementVisible(Constants.BABBEL, "txt_LoginEmail", 20);
        webUtils.assertExist(Constants.BABBEL, "txt_LoginEmail", testInfo);
        webUtils.assertExist(Constants.BABBEL, "txt_LoginPassword", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_LogintoAccount", testInfo);
        
        webUtils.waitElementVisible(Constants.BABBEL, "txt_LoginEmail", 20);
        webUtils.setValue(Constants.BABBEL, "txt_LoginEmail", "fntxautomation@gmail.com");
        webUtils.setValue(Constants.BABBEL, "txt_LoginPassword", "Pass@321");
        
        webUtils.press(Constants.BABBEL, "btn_LogintoAccount");
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_BabbelLogo", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_BabbelLogo", testInfo);
        
        webUtils.navigateTo("http://www.babbel.com/");
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_UserInfo", 20);
        webUtils.press(Constants.BABBEL, "lbl_UserInfo");
        webUtils.press(Constants.BABBEL, "lnk_Logout");
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        
    }
    
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module"})
    @Test(description = "Bab_02", priority = 2)
    public void Babbel_Login_ForgotPassword_Validate_UIControls(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {


        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("BabbelLogin");
        testInfo.setTCName("Babbel_Login_ForgotPassword_Validate_UIControls");        
        
        testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);

        webUtils.navigateTo("http://www.babbel.com/");
        
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        webUtils.assertExist(Constants.BABBEL, "btn_LoginPage", testInfo);
        webUtils.press(Constants.BABBEL, "btn_LoginPage");
        
        webUtils.assertExist(Constants.BABBEL, "lnk_ForgotPassword", testInfo);
        webUtils.press(Constants.BABBEL, "lnk_ForgotPassword");
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_ForgotPassword", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_ForgotPassword", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_ForgotPasswordText", testInfo);
        webUtils.assertExist(Constants.BABBEL, "txt_ForgotPasswordEmail", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_ForgotPasswordEmail", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_ResetPassword", testInfo);
        
        webUtils.navigateTo("http://www.babbel.com/");
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        
    }
    
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module"})
    @Test(description = "Bab_03", priority = 3)
    public void Babbel_HomePage_ValidateUI(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {


        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("BabbelLogin");
        testInfo.setTCName("Babbel_HomePage_ValidateUI");        
        
        testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);

        webUtils.navigateTo("http://www.babbel.com/");
        
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        webUtils.assertExist(Constants.BABBEL, "btn_LoginPage", testInfo);
        webUtils.press(Constants.BABBEL, "btn_LoginPage");
        
        webUtils.waitElementVisible(Constants.BABBEL, "txt_LoginEmail", 20);
        webUtils.setValue(Constants.BABBEL, "txt_LoginEmail", "fntxautomation@gmail.com");
        webUtils.setValue(Constants.BABBEL, "txt_LoginPassword", "Pass@321");
        
        webUtils.press(Constants.BABBEL, "btn_LogintoAccount");
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_BabbelLogo", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_BabbelLogo", testInfo);
        
        webUtils.assertExist(Constants.BABBEL, "lnk_Home", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lnk_Courses", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lnk_Vocabulary", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lnk_People", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lnk_Prices", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lnk_Help", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lnk_ProfileInformation", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lnk_SwitchLanguage", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_WelcomeBackText", testInfo);
        webUtils.assertExist(Constants.BABBEL, "tab_ActiveCourse", testInfo);
        webUtils.assertExist(Constants.BABBEL, "tab_DailyChallenge", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_LearningTogetherText", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_AnotherLanguageText", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_Recommend", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_YouAreLearningText", testInfo);
        
        webUtils.navigateTo("http://www.babbel.com/");
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_UserInfo", 20);
        webUtils.press(Constants.BABBEL, "lbl_UserInfo");
        webUtils.press(Constants.BABBEL, "lnk_Logout");
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        
    }
    
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module"})
    @Test(description = "Bab_04", priority = 4)
    public void Babbel_ProfileSettings_Profile_Validate_UIControls(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {


        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("BabbelLogin");
        testInfo.setTCName("Babbel_ProfileSettings_Profile_Validate_UIControls");        
        
        testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);

        webUtils.navigateTo("http://www.babbel.com/");
        
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 40);
        webUtils.assertExist(Constants.BABBEL, "btn_LoginPage", testInfo);
        webUtils.press(Constants.BABBEL, "btn_LoginPage");
        
        webUtils.waitElementVisible(Constants.BABBEL, "txt_LoginEmail", 20);
        webUtils.setValue(Constants.BABBEL, "txt_LoginEmail", "fntxautomation@gmail.com");
        webUtils.setValue(Constants.BABBEL, "txt_LoginPassword", "Pass@321");
        
        webUtils.press(Constants.BABBEL, "btn_LogintoAccount");
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_BabbelLogo", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_BabbelLogo", testInfo);
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_UserInfo", 20);
        webUtils.press(Constants.BABBEL, "lbl_UserInfo");
        webUtils.press(Constants.BABBEL, "lnk_ProfileSettings");
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_ProfileSettingsHeader", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_ProfileSettingsHeader", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_Profile", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_MyProfileHeader", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_ViewProfile", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_AboutMe", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_Settings", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_LanguageSkills", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_AccountInformation", testInfo);
        webUtils.assertExist(Constants.BABBEL, "txt_ScreenName", testInfo);
        webUtils.assertExist(Constants.BABBEL, "txt_FirstName", testInfo);
        webUtils.assertExist(Constants.BABBEL, "txt_LastName", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lnk_ChangeEmail", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lnk_ChangePassword", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lst_BirthDayDate", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lst_BirthDayMonth", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lst_BirthDayYear", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lst_Country", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lst_RelationShip", testInfo);
        webUtils.assertExist(Constants.BABBEL, "txt_City", testInfo);
        webUtils.assertExist(Constants.BABBEL, "rbtn_SexFemale", testInfo);
        webUtils.assertExist(Constants.BABBEL, "rbtn_SexMale", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_SaveProfile", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lnk_UploadImage", testInfo);
        
        webUtils.navigateTo("http://www.babbel.com/");
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_UserInfo", 20);
        webUtils.press(Constants.BABBEL, "lbl_UserInfo");
        webUtils.press(Constants.BABBEL, "lnk_Logout");
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        
    }
    
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module"})
    @Test(description = "Bab_05", priority = 5)
    public void Babble_ProfileSettings_Profile_Validate_UpdateProfile(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {


        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("BabbelLogin");
        testInfo.setTCName("Babble_ProfileSettings_Profile_Validate_UpdateProfile");        
        
        testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);

        webUtils.navigateTo("http://www.babbel.com/");
        
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        webUtils.assertExist(Constants.BABBEL, "btn_LoginPage", testInfo);
        webUtils.press(Constants.BABBEL, "btn_LoginPage");
        
        webUtils.waitElementVisible(Constants.BABBEL, "txt_LoginEmail", 20);
        webUtils.setValue(Constants.BABBEL, "txt_LoginEmail", "fntxautomation@gmail.com");
        webUtils.setValue(Constants.BABBEL, "txt_LoginPassword", "Pass@321");
        
        webUtils.press(Constants.BABBEL, "btn_LogintoAccount");
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_BabbelLogo", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_BabbelLogo", testInfo);
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_UserInfo", 20);
        webUtils.press(Constants.BABBEL, "lbl_UserInfo");
        webUtils.press(Constants.BABBEL, "lnk_ProfileSettings");
        
        webUtils.waitElementVisible(Constants.BABBEL, "lst_Country", 20);
        webUtils.assertExist(Constants.BABBEL, "lst_Country", testInfo);
        
        webUtils.selectHiddenDropDownListText(Constants.BABBEL, "lst_Country_Original", "United States");
        webUtils.press(Constants.BABBEL, "btn_SaveProfile");
        
        webUtils.waitElementVisible(Constants.BABBEL, "lst_Country", 20);
        webUtils.assertHiddenListText(Constants.BABBEL, "lst_Country_Original", "United States", testInfo);
        
        webUtils.selectHiddenDropDownListText(Constants.BABBEL, "lst_Country_Original", "India");
        webUtils.press(Constants.BABBEL, "btn_SaveProfile");
        webUtils.waitElementVisible(Constants.BABBEL, "lst_Country", 20);
        webUtils.assertHiddenListText(Constants.BABBEL, "lst_Country_Original", "India", testInfo);
        
        webUtils.navigateTo("http://www.babbel.com/");
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_UserInfo", 20);
        webUtils.press(Constants.BABBEL, "lbl_UserInfo");
        webUtils.press(Constants.BABBEL, "lnk_Logout");
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        
    }
    
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module"})
    @Test(description = "Bab_06", priority = 6)
    public void Babbel_Courses_Validate_UIControls(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {


        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("BabbelLogin");
        testInfo.setTCName("Babbel_Courses_Validate_UIControls");        
        
        testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);

        webUtils.navigateTo("http://www.babbel.com/");
        
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        webUtils.assertExist(Constants.BABBEL, "btn_LoginPage", testInfo);
        webUtils.press(Constants.BABBEL, "btn_LoginPage");
        
        webUtils.waitElementVisible(Constants.BABBEL, "txt_LoginEmail", 20);
        webUtils.setValue(Constants.BABBEL, "txt_LoginEmail", "fntxautomation@gmail.com");
        webUtils.setValue(Constants.BABBEL, "txt_LoginPassword", "Pass@321");
        
        webUtils.press(Constants.BABBEL, "btn_LogintoAccount");
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_BabbelLogo", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_BabbelLogo", testInfo);
        
        webUtils.press(Constants.BABBEL, "lnk_Courses");
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_TurkishHeader", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_TurkishHeader", testInfo);
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_ChooseCourseText", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_ChooseCourseText", testInfo);
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_New", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_New", testInfo);
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_BeginnerCourses", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_BeginnerCourses", testInfo);
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_Grammar", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_Grammar", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_Specials", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_WordsSentences", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_New", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_BeginnerCourses", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_Grammar", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_Specials", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_WordsSentences", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lst_SelectLanguage", testInfo);
        
        webUtils.navigateTo("http://www.babbel.com/");
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_UserInfo", 20);
        webUtils.press(Constants.BABBEL, "lbl_UserInfo");
        webUtils.press(Constants.BABBEL, "lnk_Logout");
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        
    }
    
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module"})
    @Test(description = "Bab_07", priority = 7)
    public void Babbel_Prices_Validate_UIControls(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {


        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("BabbelLogin");
        testInfo.setTCName("Babbel_Prices_Validate_UIControls");        
        
        testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);

        webUtils.navigateTo("http://www.babbel.com/");
        
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        webUtils.assertExist(Constants.BABBEL, "btn_LoginPage", testInfo);
        webUtils.press(Constants.BABBEL, "btn_LoginPage");
        
        webUtils.waitElementVisible(Constants.BABBEL, "txt_LoginEmail", 20);
        webUtils.setValue(Constants.BABBEL, "txt_LoginEmail", "fntxautomation@gmail.com");
        webUtils.setValue(Constants.BABBEL, "txt_LoginPassword", "Pass@321");
        
        webUtils.press(Constants.BABBEL, "btn_LogintoAccount");
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_BabbelLogo", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_BabbelLogo", testInfo);
        
        webUtils.press(Constants.BABBEL, "lnk_Prices");
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_TurkishPricesHeader", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_TurkishPricesHeader", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lst_ChangeLanguage", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lst_PricesCountry", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_1MonthPrice", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_3MonthPrice", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_6MonthPrice", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_12MonthPrice", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_MoneyBackText", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lnk_RedeemVoucher", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_AwardsPrizes", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_ContactSupport", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_SecurePayment", testInfo);
        
        webUtils.navigateTo("http://www.babbel.com/");
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_UserInfo", 20);
        webUtils.press(Constants.BABBEL, "lbl_UserInfo");
        webUtils.press(Constants.BABBEL, "lnk_Logout");
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        
    }
    
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module"})
    @Test(description = "Bab_08", priority = 8)
    public void Babbel_ClickBabbleLogo_Validate_NavigationtoHomePage(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {


        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("BabbelLogin");
        testInfo.setTCName("Babbel_ClickBabbleLogo_Validate_NavigationtoHomePage");        
        
        testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);

        webUtils.navigateTo("http://www.babbel.com/");
        
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        webUtils.assertExist(Constants.BABBEL, "btn_LoginPage", testInfo);
        webUtils.press(Constants.BABBEL, "btn_LoginPage");
        
        webUtils.waitElementVisible(Constants.BABBEL, "txt_LoginEmail", 20);
        webUtils.setValue(Constants.BABBEL, "txt_LoginEmail", "fntxautomation@gmail.com");
        webUtils.setValue(Constants.BABBEL, "txt_LoginPassword", "Pass@321");
        
        webUtils.press(Constants.BABBEL, "btn_LogintoAccount");
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_BabbelLogo", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_BabbelLogo", testInfo);
        
        webUtils.press(Constants.BABBEL, "lnk_Prices");
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_TurkishPricesHeader", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_TurkishPricesHeader", testInfo);
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_BabbelLogo", 20);
        webUtils.press(Constants.BABBEL, "lbl_BabbelLogo");
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_WelcomeBackText", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_WelcomeBackText", testInfo);
        webUtils.assertExist(Constants.BABBEL, "tab_ActiveCourse", testInfo);
        webUtils.assertExist(Constants.BABBEL, "tab_DailyChallenge", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_LearningTogetherText", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_AnotherLanguageText", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_Recommend", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_YouAreLearningText", testInfo);
        
        webUtils.navigateTo("http://www.babbel.com/");
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_UserInfo", 20);
        webUtils.press(Constants.BABBEL, "lbl_UserInfo");
        webUtils.press(Constants.BABBEL, "lnk_Logout");
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        
    }
    
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module"})
    @Test(description = "Bab_09", priority = 9)
    public void Babble_Vocabulary_Validate_UIControls(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {


        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("BabbelLogin");
        testInfo.setTCName("Babble_Vocabulary_Validate_UIControls");        
        
        testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);

        webUtils.navigateTo("http://www.babbel.com/");
        
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        webUtils.assertExist(Constants.BABBEL, "btn_LoginPage", testInfo);
        webUtils.press(Constants.BABBEL, "btn_LoginPage");
        
        webUtils.waitElementVisible(Constants.BABBEL, "txt_LoginEmail", 20);
        webUtils.setValue(Constants.BABBEL, "txt_LoginEmail", "fntxautomation@gmail.com");
        webUtils.setValue(Constants.BABBEL, "txt_LoginPassword", "Pass@321");
        
        webUtils.press(Constants.BABBEL, "btn_LogintoAccount");
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_BabbelLogo", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_BabbelLogo", testInfo);
        
        webUtils.press(Constants.BABBEL, "lnk_Vocabulary");
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_VocabularyHeader", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_VocabularyHeader", testInfo);
        webUtils.waitElementVisible(Constants.BABBEL, "lnk_HowReviewManager", 20);
        webUtils.assertExist(Constants.BABBEL, "lnk_HowReviewManager", testInfo);
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_ReviewToday", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_ReviewToday", testInfo);
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_DistributionofWords", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_DistributionofWords", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_ReviewNow", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_Level1", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_Level2", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_Level3", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_Level4", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_Level5", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_Level6", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_WhatDoyouThink", testInfo);
        webUtils.waitElementVisible(Constants.BABBEL, "lst_FilterName", 20);
        webUtils.assertExist(Constants.BABBEL, "lst_FilterName", testInfo);
        webUtils.waitElementVisible(Constants.BABBEL, "txt_Search", 20);
        webUtils.assertExist(Constants.BABBEL, "txt_Search", testInfo);
        webUtils.waitElementVisible(Constants.BABBEL, "btn_CreatePersonalizedList", 20);
        webUtils.assertExist(Constants.BABBEL, "btn_CreatePersonalizedList", testInfo);
        webUtils.waitElementVisible(Constants.BABBEL, "btn_More", 20);
        webUtils.assertExist(Constants.BABBEL, "btn_More", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_AmericanEnglish", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_Turkish", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_TimesReviewed", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_LastReview", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lbl_KnowledgeLevel", testInfo);
        webUtils.assertExist(Constants.BABBEL, "lst_ItemsPerPage", testInfo);
        webUtils.assertExist(Constants.BABBEL, "btn_Pagination", testInfo);
        
        webUtils.navigateTo("http://www.babbel.com/");
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_UserInfo", 20);
        webUtils.press(Constants.BABBEL, "lbl_UserInfo");
        webUtils.press(Constants.BABBEL, "lnk_Logout");
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        
    }
    
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module"})
    @Test(description = "Bab_10", priority = 10)
    public void Babbel_Validate_SignOut_Functionality(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {


        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("BabbelLogin");
        testInfo.setTCName("Babbel_Validate_SignOut_Functionality");        
        
        testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);

        webUtils.navigateTo("http://www.babbel.com/");
        
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        webUtils.assertExist(Constants.BABBEL, "btn_LoginPage", testInfo);
        webUtils.press(Constants.BABBEL, "btn_LoginPage");
        
        webUtils.waitElementVisible(Constants.BABBEL, "txt_LoginEmail", 20);
        webUtils.setValue(Constants.BABBEL, "txt_LoginEmail", "fntxautomation@gmail.com");
        webUtils.setValue(Constants.BABBEL, "txt_LoginPassword", "Pass@321");
        
        webUtils.press(Constants.BABBEL, "btn_LogintoAccount");
        
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_BabbelLogo", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_BabbelLogo", testInfo);
        
        webUtils.navigateTo("http://www.babbel.com/");
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_UserInfo", 20);
        webUtils.press(Constants.BABBEL, "lbl_UserInfo");
        webUtils.press(Constants.BABBEL, "lnk_Logout");
        webUtils.waitElementVisible(Constants.BABBEL, "btn_LoginPage", 20);
        webUtils.assertExist(Constants.BABBEL, "btn_LoginPage", testInfo);
        webUtils.waitElementVisible(Constants.BABBEL, "btn_RegisterPage", 20);
        webUtils.assertExist(Constants.BABBEL, "btn_RegisterPage", testInfo);
        webUtils.waitElementVisible(Constants.BABBEL, "lbl_DiscoverNewLanguage", 20);
        webUtils.assertExist(Constants.BABBEL, "lbl_DiscoverNewLanguage", testInfo);
        
    }

    @AfterClass
    public void quitBrowser() {
        webUtils.quitBrowser();
    }
}
