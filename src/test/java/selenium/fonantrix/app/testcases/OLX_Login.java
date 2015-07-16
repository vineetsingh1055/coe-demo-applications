package selenium.fonantrix.app.testcases;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import selenium.fonantrix.core.listener.CustomReporter;
import selenium.fonantrix.core.util.TestInfo;
import selenium.fonantrix.core.web.WebUtils;

public class OLX_Login {

    private WebUtils webUtils;
    
	public String platform, browser, version, nodeURL, moduleName,priority,module;
	
	@Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
	@BeforeTest	
	public void SetUp(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {
		
		//ConfigurationMap.loadConfigurations(System.getProperty("user.dir")+"\\config\\configuration.properties");
		//PropertyConfigurator.configure(System.getProperty("user.dir")+"\\config\\log4j.properties");
   
		webUtils = new WebUtils(platform, browser, nodeURL);
		
		webUtils.openBrowser("http://www.olx.in",platform);
		
		
		webUtils.wait(5);
		
	
		
	}
    

	@Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description = "OLX_01", priority = 1)
    public void createUser(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Login");
        testInfo.setTCName("createUser");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);

       // webUtils = new WebUtils(platform, browser, nodeURL);

       // webUtils.openBrowser("http://www.olx.in", platform);
        webUtils.press("Selenium", "lnk_MyAccount");
        webUtils.press("Selenium", "lnk_Register");
        webUtils.setValue("Selenium", "txtbx_Email", "abc.22115@gmail.com");
        webUtils.setValue("Selenium", "txtbx_Password", "welcome00#");
        webUtils.setValue("Selenium", "txtbx_RepeatPwd", "welcome00#");
        webUtils.press("Selenium", "chkbx_Terms");
        webUtils.press("Selenium", "btn_CreateUser");
        webUtils.assertExist("Selenium", "lnk_Back_To_Previous", testInfo);
        webUtils.wait(2);
        

        
    }

    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description = "OLX_02", priority = 2)
    public void newPassword(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Login");
        testInfo.setTCName("newPassword");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);

        webUtils.press("Selenium", "lnk_MyAccount");
        webUtils.press("Selenium", "lnk_ForgotPassword");
        webUtils.setValue("Selenium", "txtbx_Email", "abc.22115@gmail.com");
        webUtils.setValue("Selenium", "txtbx_Password", "qwerty@12345");
        webUtils.setValue("Selenium", "txtbx_RepeatPwd", "qwerty@12345");
        webUtils.press("Selenium", "btn_CreateUser");
        webUtils.assertExist("Selenium", "lnk_Back_To_Previous", testInfo);
        webUtils.wait(2);
    }



   
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description = "OLX_04", priority = 3)
    public void HomePageUIControles(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Login");
        testInfo.setTCName("HomePageUIControles");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        
        webUtils.navigateTo("http://www.olx.in");
        webUtils.wait(1);
        webUtils.assertExist("Selenium", "lnk_MyAccount", testInfo);
        webUtils.assertText("Selenium", "btn_SubmitAdd", "Submit a Free Ad", testInfo);
        webUtils.assertText("Selenium", "txt_Selectlanguage", "Select language", testInfo);
        webUtils.assertText("Selenium", "txt_English", "English", testInfo);
                
        
    }
   
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description = "OLX_13", priority = 4)
    public void createUser_ValidateUI(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Login");
        testInfo.setTCName("createUser_ValidateUI");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        webUtils.navigateTo("http://www.olx.in");
        webUtils.wait(2);
        webUtils.press("Selenium", "lnk_MyAccount");
        webUtils.press("Selenium", "lnk_Register");
        
        webUtils.assertExist("Selenium", "txtbx_Email", testInfo);
        
        webUtils.assertExist("Selenium", "lbl_Email", testInfo);
        
		webUtils.assertText("Selenium", "lbl_Email", "Email*", testInfo);
		
		
        webUtils.assertExist("Selenium", "txtbx_Password", testInfo);
        
        webUtils.assertExist("Selenium", "lbl_PWD", testInfo);
        
		webUtils.assertText("Selenium", "lbl_PWD", "Password*", testInfo);
		
        webUtils.assertExist("Selenium", "txtbx_Password", testInfo);
        
        webUtils.assertExist("Selenium", "lbl_RepeatPwd", testInfo);
        
		webUtils.assertText("Selenium", "lbl_RepeatPwd", "Repeat password*", testInfo);    
		
		 webUtils.assertExist("Selenium", "btn_CreateUser", testInfo);
		 
		 webUtils.assertAttributeValue("Selenium", "btn_CreateUser" ,"Value", "Create", testInfo);

    }
    
    
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description="OLX_14", priority=5)
    public void login_ValidateUI(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Login");
        testInfo.setTCName("login_ValidateUI");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
/*        webUtils = new WebUtils(platform, browser, nodeURL);

        webUtils.openBrowser("http://www.olx.in", platform,browser);*/
        webUtils.press("Selenium", "lnk_MyAccount");
        
        
        webUtils.assertExist("Selenium", "txtbx_Email", testInfo);
        
        webUtils.assertExist("Selenium", "lbl_YourEmail", testInfo);
        
		webUtils.assertText("Selenium", "lbl_YourEmail", "Your Email", testInfo);
		
		
        webUtils.assertExist("Selenium", "txtbx_Password", testInfo);
        
        webUtils.assertExist("Selenium", "lbl_Password", testInfo);
        
		webUtils.assertText("Selenium", "lbl_Password", "Password", testInfo);
		
        webUtils.assertExist("Selenium", "lbl_RememberMe", testInfo);
        
		webUtils.assertText("Selenium", "lbl_RememberMe", "Remember me", testInfo);
		
        webUtils.assertExist("Selenium", "lnl_Forgot_Password", testInfo);
        
		webUtils.assertText("Selenium", "lnl_Forgot_Password", "Forgot Password?", testInfo);
		webUtils.wait(2);
		
			
    }
    
    
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description="OLX_15", priority=6)
    public void Forgot_Password_ValidateUI(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Login");
        testInfo.setTCName("Forgot_Password_ValidateUI");
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        webUtils.navigateTo("http://www.olx.in");
        webUtils.wait(2);
        webUtils.press("Selenium", "lnk_MyAccount");
        
        webUtils.press("Selenium", "lnk_ForgotPassword");
        
        webUtils.assertExist("Selenium", "txtbx_Email",testInfo);
        webUtils.assertExist("Selenium", "txtbx_Password", testInfo);
        webUtils.assertExist("Selenium", "txtbx_RepeatPwd", testInfo);
        webUtils.assertExist("Selenium", "btn_CreateUser",testInfo);
        
        webUtils.assertAttributeValue("Selenium", "btn_CreateUser" ,"Value", "Change", testInfo);
        
        
        webUtils.assertExist("Selenium", "lbl_New_Email", testInfo);
        
		webUtils.assertText("Selenium", "lbl_New_Email", "Email *", testInfo);
		
        
        webUtils.assertExist("Selenium", "lbl_New_PWD", testInfo);
        
		webUtils.assertText("Selenium", "lbl_New_PWD", "New password*", testInfo);
		
        
        webUtils.assertExist("Selenium", "lbl__NewRepeatPwd", testInfo);
        
		webUtils.assertText("Selenium", "lbl__NewRepeatPwd", "Repeat password*", testInfo); 
		

			
    }
    
    
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description="OLX_17", priority=7)
    public void SelectLanguage_login_ValidateUI(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Login");
        testInfo.setTCName("SelectLanguage_login_ValidateUI");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        webUtils.navigateTo("http://www.olx.in");
        webUtils.wait(2);
        
        webUtils.press("Selenium", "lnl_lng_Hindi");  
        
        webUtils.press("Selenium", "lnk_MyAccount");
        
        
        webUtils.assertExist("Selenium", "txtbx_Email", testInfo);
        
        webUtils.assertExist("Selenium", "lbl_YourEmail", testInfo);
        
	//	webUtils.assertText("Selenium", "lbl_YourEmail", "आपका ईमेल", testInfo);
		
		
        webUtils.assertExist("Selenium", "txtbx_Password", testInfo);
        
        webUtils.assertExist("Selenium", "lbl_Password", testInfo);
        
	//	webUtils.assertText("Selenium", "lbl_Password", "à¤ªà¤¾à¤¸à¤µà¤°à¥�à¤¡", testInfo);
		
        webUtils.assertExist("Selenium", "lbl_RememberMe", testInfo);
        
	//	webUtils.assertText("Selenium", "lbl_RememberMe", "à¤®à¥�à¤�à¥‡ à¤¯à¤¾à¤¦ à¤°à¤–à¥‡à¤‚!", testInfo);
		
        webUtils.assertExist("Selenium", "lnl_Forgot_Password", testInfo);
        
	//	webUtils.assertText("Selenium", "lnl_Forgot_Password", "à¤®à¥ˆ à¤²à¥‰à¤— à¤‡à¤¨ à¤¨à¤¹à¥€ à¤•à¤° à¤¸à¤•à¤¤à¤¾?", testInfo);
		
			
    }
    
    
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description="OLX_18", priority=8)
    public void SelectLanguage_Forgot_Password_ValidateUI(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Login");
        testInfo.setTCName("SelectLanguage_Forgot_Password_ValidateUI");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
      
        webUtils.press("Selenium", "lnk_MyAccount");
        
        webUtils.press("Selenium", "lnk_ForgotPassword");
        
        webUtils.assertExist("Selenium", "txtbx_Email",testInfo);
        webUtils.assertExist("Selenium", "txtbx_Password", testInfo);
        webUtils.assertExist("Selenium", "txtbx_RepeatPwd", testInfo);
        webUtils.assertExist("Selenium", "btn_CreateUser",testInfo);
        
     //   webUtils.assertAttributeValue("Selenium", "btn_CreateUser" ,"Value", "à¤¬à¤¦à¤²à¥‡à¤‚", testInfo);
        
        
        webUtils.assertExist("Selenium", "lbl_New_Email", testInfo);
        
	//	webUtils.assertText("Selenium", "lbl_New_Email", "à¤ˆà¤®à¥‡à¤² *", testInfo);
		
        
        webUtils.assertExist("Selenium", "lbl_New_PWD", testInfo);
        
	//	webUtils.assertText("Selenium", "lbl_New_PWD", "à¤¨à¤¯à¤¾ à¤ªà¤¾à¤¸à¤µà¤°à¥�à¤¡*", testInfo);
		
        
        webUtils.assertExist("Selenium", "lbl__NewRepeatPwd", testInfo);
        
	//	webUtils.assertText("Selenium", "lbl__NewRepeatPwd", "à¤ªà¤¾à¤¸à¤µà¤°à¥�à¤¡ à¤¦à¥‹à¤¹à¤°à¤¾à¤�à¤�*", testInfo);
        webUtils.wait(2);
		

			
    }
    
    
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description = "OLX_19", priority =9)
    public void SelectLanguage_submitAdd_ValidateUI(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Login");
        testInfo.setTCName("SelectLanguage_submitAdd_ValidateUI");
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);

        webUtils.press("Selenium", "btn_SubmitAdd_New");
        
        webUtils.assertExist("Selenium", "lbl_AdTitle",testInfo);
      //  webUtils.assertText("Selenium", "lbl_AdTitle", "à¤µà¤¿à¤œà¥�à¤žà¤¾à¤ªà¤¨ à¤•à¤¾ à¤¶à¥€à¤°à¥�à¤·à¤•*", testInfo);
        
        webUtils.assertExist("Selenium", "txtAdTitle",testInfo );
        
        webUtils.assertExist("Selenium", "lbl_Category",testInfo);
     //   webUtils.assertText("Selenium", "lbl_Category", "à¤¶à¥�à¤°à¥‡à¤£à¥€*", testInfo);
        
        webUtils.assertExist("Selenium", "txt_Category",testInfo);
        
        webUtils.assertExist("Selenium", "lbl_AdDescription",testInfo);
       // webUtils.assertText("Selenium", "lbl_AdDescription", "à¤µà¤¿à¤œà¥�à¤žà¤¾à¤ªà¤¨ à¤µà¤¿à¤µà¤°à¤£*", testInfo);
        
        webUtils.assertExist("Selenium", "txt_Description",testInfo);
        
        webUtils.assertExist("Selenium", "lbl_UploadPhoto",testInfo);
     //   webUtils.assertText("Selenium", "lbl_UploadPhoto", "à¤«à¥‹à¤Ÿà¥‹ à¤…à¤ªà¤²à¥‹à¤¡ à¤•à¤°à¥‡à¤‚", testInfo);
        
        webUtils.assertExist("Selenium", "lbl_AdsWithPhotos",testInfo);
        
        webUtils.assertExist("Selenium", "lbl_Name",testInfo);      
     //   webUtils.assertText("Selenium", "lbl_Name", "à¤¸à¤‚à¤ªà¤°à¥�à¤• à¤µà¥�à¤¯à¤•à¥�à¤¤à¤¿*", testInfo);
                
        webUtils.assertExist("Selenium", "txt_Name",testInfo);
        
        webUtils.assertExist("Selenium", "lbl_Email_Adpost",testInfo);      
     //   webUtils.assertText("Selenium", "lbl_Email_Adpost", "à¤ˆà¤®à¥‡à¤² ID*", testInfo);               
        webUtils.assertExist("Selenium", "txt_Email_Adpost",testInfo);
        
        webUtils.assertExist("Selenium", "lbl_Phone",testInfo);                   
        webUtils.assertExist("Selenium", "txt_Phone",testInfo);
        
        webUtils.assertExist("Selenium", "lbl_Enter_City",testInfo);      
        webUtils.assertText("Selenium", "lbl_Enter_City", "City_locality_adding*", testInfo);               
        webUtils.assertExist("Selenium", "btn_Save",testInfo);             
        
        
    }
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description = "OLX_20", priority = 10)
    public void login(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Login");
        testInfo.setTCName("login");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);

        //webUtils.openBrowser("http://www.olx.in", platform);
        webUtils.press("Selenium", "lnk_MyAccount");
        webUtils.setValue("Selenium", "txtbx_Email", "abdc.9295@gmail.com");
        webUtils.setValue("Selenium", "txtbx_Password", "welcome00#");
        webUtils.press("Selenium", "btn_Login");
        webUtils.assertText("Selenium", "lnk_MyAccount", "abdc.9295", testInfo);  
        webUtils.wait(2);
       
    }
    
    
    
    @AfterClass
    public void quitBrowser() {
      //  webUtils.quitBrowser();
    }
}
