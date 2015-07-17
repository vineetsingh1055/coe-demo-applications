package selenium.fonantrix.app.testcases;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import selenium.fonantrix.core.listener.CustomReporter;
import selenium.fonantrix.core.util.TestInfo;
import selenium.fonantrix.core.web.WebUtils;

public class OLX_Submit_Add {

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
    @Test(description = "OLX_03", priority = 1)
    public void submitAdd(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Submit_Add");
        testInfo.setTCName("submitAdd");
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        webUtils.navigateTo("http://www.olx.in");
        webUtils.wait(1);
        webUtils.press("Selenium", "btn_SubmitAdd");
        webUtils.wait(5);
        webUtils.setValue("Selenium", "txt_AdTitle", "Selling Blackberry mobile in low price");
        webUtils.press("Selenium", "lstbx_Category");
        webUtils.press("Selenium", "lnk_CategoryType");
        webUtils.press("Selenium", "lnk_Mobile");
        webUtils.press("Selenium", "lnk_SubMobile");
        webUtils.press("Selenium", "lnk_Blackberry");
        webUtils.wait(2);
        //webUtils.press("Selenium", "lnl_Cat_Close");
        webUtils.wait(2);
        webUtils.setValue("Selenium", "txtbx_Price", "10000");
        webUtils.setValue("Selenium", "txtbx_Description", "This mobile is very good in feature and have very good look. I am selling it in very low price as i have to buy Iphone6");
        webUtils.setValue("Selenium", "txtbx_Name", "Bahubali");
        webUtils.setValue("Selenium", "txtbx_Phone", "9837121212");
        webUtils.setValue("Selenium", "txtbx_Ademail", "nim904523@gmail.com");
        webUtils.setValue("Selenium", "txtbx_City", "Noida");
        webUtils.wait(1);
        webUtils.press("Selenium", "lstbx_CitySuggest");
        
        webUtils.setValue("Selenium", "txtbx_Locality", "Sector 120");
        webUtils.wait(2);
        webUtils.press("Selenium", "lstbx_Locality");
        webUtils.press("Selenium", "btn_Save");
        webUtils.wait(2);
        webUtils.press("Selenium", "lnk_Submitwithoutphoto");
        webUtils.assertExist("Selenium", "btn_ViewAd", testInfo);
  
        
        
    }

   
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description = "OLX_05", priority = 2)
    public void SubmitaFreeAdPageUIControles(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Submit_Add");
        testInfo.setTCName("SubmitaFreeAdPageUIControles");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        webUtils.navigateTo("http://www.olx.in");
        webUtils.wait(1);
        
        webUtils.press("Selenium", "lnk_MyAccount");
        webUtils.press("Selenium", "btn_SubmitAdd");
        webUtils.assertExist("Selenium", "txt_AdTitle", testInfo);
        webUtils.assertExist("Selenium", "txtbx_Description", testInfo);
        webUtils.assertExist("Selenium", "txtbx_Name", testInfo);
        webUtils.assertExist("Selenium", "txtbx_Phone", testInfo);
        webUtils.assertExist("Selenium", "txtbx_City", testInfo);
        webUtils.assertExist("Selenium", "btn_Save", testInfo);  
            
        
    }
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description = "OLX_06", priority = 3)
    public void ValidateAdTitlefield(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Submit_Add");
        testInfo.setTCName("ValidateAdTitlefield");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        webUtils.navigateTo("http://www.olx.in");
        webUtils.wait(1);
        webUtils.press("Selenium", "lnk_MyAccount");
        webUtils.wait(2);
        //webUtils.openBrowser("http://www.olx.in", platform);
        webUtils.press("Selenium", "btn_SubmitAdd");
        webUtils.wait(2);
        webUtils.press("Selenium", "lstbx_Category");
        webUtils.press("Selenium", "lnk_CategoryType");
        webUtils.press("Selenium", "lnk_Mobile");
        webUtils.press("Selenium", "lnk_SubMobile");
        webUtils.press("Selenium", "lnk_Blackberry");
        webUtils.wait(2);
       // webUtils.press("Selenium", "lnl_Cat_Close");        
        webUtils.wait(1);
        webUtils.setValue("Selenium", "txtbx_Price", "10000");
        webUtils.setValue("Selenium", "txtbx_Description", "This mobile is very good in feature and have very good look. I am selling it in very low price as i have to buy Iphone6");
        webUtils.setValue("Selenium", "txtbx_Name", "Bahubali");
        webUtils.setValue("Selenium", "txtbx_Ademail", "nim904523@gmail.com");
        webUtils.setValue("Selenium", "txtbx_Phone", "9837121212");
        webUtils.setValue("Selenium", "txtbx_City", "Noida");
        webUtils.wait(1);
        webUtils.press("Selenium", "lstbx_CitySuggest");
        webUtils.setValue("Selenium", "txtbx_Locality", "Sector 120");
        webUtils.wait(1);
        webUtils.press("Selenium", "lstbx_Locality");
        webUtils.press("Selenium", "btn_Save");
        webUtils.assertText("Selenium", "lbl_Adtitleerror", "Please enter a title", testInfo);
    }
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description = "OLX_07", priority = 4)
    public void ValidateAdDescriptionfield(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Submit_Add");
        testInfo.setTCName("ValidateAdDescriptionfield");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        webUtils.navigateTo("http://www.olx.in");
        webUtils.wait(1);
        webUtils.press("Selenium", "lnk_MyAccount");
        webUtils.wait(2);
       // webUtils.openBrowser("http://www.olx.in", platform);
        webUtils.press("Selenium", "btn_SubmitAdd");
        webUtils.wait(2);
        webUtils.setValue("Selenium", "txt_AdTitle", "Selling Blackberry mobile in low price");
        webUtils.press("Selenium", "lstbx_Category");
        webUtils.press("Selenium", "lnk_CategoryType");
        webUtils.press("Selenium", "lnk_Mobile");
        webUtils.press("Selenium", "lnk_SubMobile");
        webUtils.press("Selenium", "lnk_Blackberry");
        webUtils.wait(2);
       // webUtils.press("Selenium", "lnl_Cat_Close");
        webUtils.wait(2);
        webUtils.setValue("Selenium", "txtbx_Price", "10000");
        webUtils.setValue("Selenium", "txtbx_Name", "Bahubali");
        webUtils.setValue("Selenium", "txtbx_Ademail", "nim904523@gmail.com");
        webUtils.setValue("Selenium", "txtbx_Phone", "9837121212");
        webUtils.setValue("Selenium", "txtbx_City", "Noida");
        webUtils.wait(1);
        webUtils.press("Selenium", "lstbx_CitySuggest");
        webUtils.setValue("Selenium", "txtbx_Locality", "Sector 120");
        webUtils.wait(1);
        webUtils.press("Selenium", "lstbx_Locality");
        webUtils.press("Selenium", "btn_Save");
        webUtils.assertText("Selenium", "lbl_AdDescriptionerror", "Enter Ad Description", testInfo);
    }
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description = "OLX_08", priority = 5)
    public void ValidateNamefield(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {
    	  
        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Submit_Add");
        testInfo.setTCName("ValidateNamefield");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        webUtils.navigateTo("http://www.olx.in");
        webUtils.press("Selenium", "lnk_MyAccount");
        webUtils.wait(2);
       // webUtils.openBrowser("http://www.olx.in", platform);
        webUtils.press("Selenium", "btn_SubmitAdd");
        webUtils.wait(2);
        webUtils.setValue("Selenium", "txt_AdTitle", "Selling Blackberry mobile in low price");
        webUtils.press("Selenium", "lstbx_Category");
        webUtils.press("Selenium", "lnk_CategoryType");
        webUtils.press("Selenium", "lnk_Mobile");
        webUtils.press("Selenium", "lnk_SubMobile");
        webUtils.press("Selenium", "lnk_Blackberry");
        webUtils.wait(2);
       // webUtils.press("Selenium", "lnl_Cat_Close");        
        webUtils.wait(1);
        webUtils.setValue("Selenium", "txtbx_Price", "10000");
        webUtils.setValue("Selenium", "txtbx_Description", "This mobile is very good in feature and have very good look. I am selling it in very low price as i have to buy Iphone6");
        webUtils.setValue("Selenium", "txtbx_Phone", "9837121212");
        webUtils.setValue("Selenium", "txtbx_Ademail", "nim904523@gmail.com");
        webUtils.setValue("Selenium", "txtbx_City", "Noida");
        webUtils.wait(1);
        webUtils.press("Selenium", "lstbx_CitySuggest");
        webUtils.setValue("Selenium", "txtbx_Locality", "Sector 120");
        webUtils.wait(1);
        webUtils.press("Selenium", "lstbx_Locality");
        webUtils.press("Selenium", "btn_Save");
        webUtils.assertText("Selenium", "lbl_EnterNameerror", "Enter your Name", testInfo);
    }
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description = "OLX_09", priority = 6)
    public void Validateemailfield(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Submit_Add");
        testInfo.setTCName("Validateemailfield");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        webUtils.navigateTo("http://www.olx.in");
        webUtils.wait(1);
      //  webUtils.openBrowser("http://www.olx.in", platform);
        webUtils.press("Selenium", "lnk_MyAccount");
        webUtils.wait(2);
        webUtils.press("Selenium", "btn_SubmitAdd");
        webUtils.wait(2);
        webUtils.setValue("Selenium", "txt_AdTitle", "Selling Blackberry mobile in low price");
        webUtils.press("Selenium", "lstbx_Category");
        webUtils.press("Selenium", "lnk_CategoryType");
        webUtils.press("Selenium", "lnk_Mobile");
        webUtils.press("Selenium", "lnk_SubMobile");
        webUtils.press("Selenium", "lnk_Blackberry");
        webUtils.wait(2);
        //webUtils.press("Selenium", "lnl_Cat_Close");        
        webUtils.wait(2);
        webUtils.setValue("Selenium", "txtbx_Price", "10000");
        webUtils.setValue("Selenium", "txtbx_Description", "This mobile is very good in feature and have very good look. I am selling it in very low price as i have to buy Iphone6");
        webUtils.setValue("Selenium", "txtbx_Name", "Bahubali");
        webUtils.setValue("Selenium", "txtbx_Phone", "9837121212");
        webUtils.setValue("Selenium", "txtbx_City", "Noida");
        webUtils.wait(1);
        webUtils.press("Selenium", "lstbx_CitySuggest");
        webUtils.setValue("Selenium", "txtbx_Locality", "Sector 120");
        webUtils.wait(1);
        webUtils.press("Selenium", "lstbx_Locality");
        webUtils.press("Selenium", "btn_Save");
        webUtils.assertText("Selenium", "lbl_Enteremailerror", "Enter your Email address", testInfo);
    }
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description = "OLX_10", priority = 7)
    public void Validatephonefield(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Submit_Add");
        testInfo.setTCName("Validatephonefield");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        webUtils.navigateTo("http://www.olx.in");
        webUtils.wait(2);
        webUtils.press("Selenium", "lnk_MyAccount");
        webUtils.wait(2);
        
       // webUtils.openBrowser("http://www.olx.in", platform);
        webUtils.press("Selenium", "btn_SubmitAdd");
        webUtils.wait(2);
        webUtils.setValue("Selenium", "txt_AdTitle", "Selling Blackberry mobile in low price");
        webUtils.press("Selenium", "lstbx_Category");
        webUtils.press("Selenium", "lnk_CategoryType");
        webUtils.press("Selenium", "lnk_Mobile");
        webUtils.press("Selenium", "lnk_SubMobile");
        webUtils.press("Selenium", "lnk_Blackberry");
        webUtils.wait(1);
        // webUtils.press("Selenium", "lnl_Cat_Close");        
        webUtils.wait(1);
        webUtils.setValue("Selenium", "txtbx_Price", "10000");
        webUtils.setValue("Selenium", "txtbx_Description", "This mobile is very good in feature and have very good look. I am selling it in very low price as i have to buy Iphone6");
        webUtils.setValue("Selenium", "txtbx_Name", "Bahubali");
        webUtils.setValue("Selenium", "txtbx_Ademail", "nim904523@gmail.com");
        webUtils.setValue("Selenium", "txtbx_City", "Noida");
        webUtils.wait(1);
        webUtils.press("Selenium", "lstbx_CitySuggest");
        webUtils.setValue("Selenium", "txtbx_Locality", "Sector 120");
        webUtils.wait(1);
        webUtils.press("Selenium", "lstbx_Locality");
        webUtils.press("Selenium", "btn_Save");
        webUtils.assertText("Selenium", "lbl_EnterPhoneerror", "This field is required.", testInfo);
    }
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description = "OLX_11", priority = 8)
    public void ValidateCityfield(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Submit_Add");
        testInfo.setTCName("ValidateCityfield");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        webUtils.navigateTo("http://www.olx.in");
        webUtils.wait(2);
        webUtils.press("Selenium", "lnk_MyAccount");
        webUtils.wait(2);
       // webUtils.openBrowser("http://www.olx.in", platform);
        webUtils.press("Selenium", "btn_SubmitAdd");
        webUtils.wait(2);
        webUtils.setValue("Selenium", "txt_AdTitle", "Selling Blackberry mobile in low price");
        webUtils.press("Selenium", "lstbx_Category");
        webUtils.press("Selenium", "lnk_CategoryType");
        webUtils.press("Selenium", "lnk_Mobile");
        webUtils.press("Selenium", "lnk_SubMobile");
        webUtils.press("Selenium", "lnk_Blackberry");
        webUtils.wait(2);
       // webUtils.press("Selenium", "lnl_Cat_Close");        
        webUtils.wait(1);
        webUtils.setValue("Selenium", "txtbx_Price", "10000");
        webUtils.setValue("Selenium", "txtbx_Description", "This mobile is very good in feature and have very good look. I am selling it in very low price as i have to buy Iphone6");
        webUtils.setValue("Selenium", "txtbx_Name", "Bahubali");
        webUtils.setValue("Selenium", "txtbx_Ademail", "nim904523@gmail.com");
        webUtils.setValue("Selenium", "txtbx_Phone", "9837121212");
        webUtils.wait(1);
        webUtils.press("Selenium", "btn_Save");
        webUtils.assertText("Selenium", "lbl_EnterCityerror", "Type your city name and select the matching city from the list.", testInfo);
    }
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description = "OLX_12", priority = 9)
    public void ValidateCategoryfield(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Submit_Add");
        testInfo.setTCName("ValidateCategoryfield");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        webUtils.navigateTo("http://www.olx.in");
        webUtils.wait(2);
        webUtils.press("Selenium", "lnk_MyAccount");
        webUtils.wait(2);
        
       // webUtils.openBrowser("http://www.olx.in", platform);
        webUtils.press("Selenium", "btn_SubmitAdd");
        webUtils.setValue("Selenium", "txt_AdTitle", "Selling Blackberry mobile in low price");
        webUtils.setValue("Selenium", "txtbx_Description", "This mobile is very good in feature and have very good look. I am selling it in very low price as i have to buy Iphone6");
        webUtils.setValue("Selenium", "txtbx_Name", "Bahubali");
        webUtils.setValue("Selenium", "txtbx_Ademail", "nim904523@gmail.com");
        webUtils.setValue("Selenium", "txtbx_Phone", "9837121212");
        webUtils.setValue("Selenium", "txtbx_City", "Noida");
        webUtils.wait(1);
        webUtils.press("Selenium", "lstbx_CitySuggest");
        webUtils.setValue("Selenium", "txtbx_Locality", "Sector 120");
        webUtils.wait(1);
        webUtils.press("Selenium", "lstbx_Locality");
        webUtils.press("Selenium", "btn_Save");
        webUtils.assertText("Selenium", "lbl_Categoryerror", "Please select a category", testInfo);
    }
        
    
    @Parameters({ "platform", "browser", "version", "nodeURL", "moduleName","priority","module" })
    @Test(description = "OLX_16", priority =10)
    public void submitAdd_ValidateUI(String platform, String browser, String version, String nodeURL, String moduleName,String priority,String module) throws Exception {

        TestInfo testInfo = new TestInfo();
        testInfo.setModuleName(moduleName);
        testInfo.setFlowName("OLX_Submit_Add");
        testInfo.setTCName("submitAdd_ValidateUI");
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        webUtils.navigateTo("http://www.olx.in");
        webUtils.wait(2);
        webUtils.press("Selenium", "btn_SubmitAdd_New");
        
        webUtils.assertExist("Selenium", "lbl_AdTitle",testInfo);
        webUtils.assertText("Selenium", "lbl_AdTitle", "Ad Title*", testInfo);
        
        webUtils.assertExist("Selenium", "txtAdTitle",testInfo );
        
        webUtils.assertExist("Selenium", "lbl_Category",testInfo);
        webUtils.assertText("Selenium", "lbl_Category", "Category*", testInfo);
        
        webUtils.assertExist("Selenium", "txt_Category",testInfo);
        
        webUtils.assertExist("Selenium", "lbl_AdDescription",testInfo);
        webUtils.assertText("Selenium", "lbl_AdDescription", "Ad Description*", testInfo);
        
        webUtils.assertExist("Selenium", "txt_Description",testInfo);
        
        webUtils.assertExist("Selenium", "lbl_UploadPhoto",testInfo);
        webUtils.assertText("Selenium", "lbl_UploadPhoto", "Upload Photos", testInfo);
        
        webUtils.assertExist("Selenium", "lbl_AdsWithPhotos",testInfo);
        
        webUtils.assertExist("Selenium", "lbl_Name",testInfo);      
        webUtils.assertText("Selenium", "lbl_Name", "Name*", testInfo);
                
        webUtils.assertExist("Selenium", "txt_Name",testInfo);
        
        webUtils.assertExist("Selenium", "lbl_Email_Adpost",testInfo);      
        webUtils.assertText("Selenium", "lbl_Email_Adpost", "Email*", testInfo);               
        webUtils.assertExist("Selenium", "txt_Email_Adpost",testInfo);
        
        webUtils.assertExist("Selenium", "lbl_Phone",testInfo);                   
        webUtils.assertExist("Selenium", "txt_Phone",testInfo);
        
        webUtils.assertExist("Selenium", "lbl_Enter_City",testInfo);      
        webUtils.assertText("Selenium", "lbl_Enter_City", "Enter a city*", testInfo);               
        webUtils.assertExist("Selenium", "btn_Save",testInfo);             
        
        
    
        
    }
    
    @AfterClass
    public void quitBrowser() {
       webUtils.quitBrowser();
    }
}
