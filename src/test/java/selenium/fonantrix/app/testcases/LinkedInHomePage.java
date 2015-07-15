package selenium.fonantrix.app.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import selenium.fonantrix.app.constants.Constants;
import selenium.fonantrix.core.listener.CustomReporter;
import selenium.fonantrix.core.util.TestInfo;
import selenium.fonantrix.core.web.WebUtils;

public class LinkedInHomePage {
	
	private WebUtils webUtils;	
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName","module","priority" })
	@BeforeClass
	public void loginSetup(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception {
    	
		webUtils = new WebUtils(platform, browser, nodeURL);
		
		webUtils.openBrowser("https://www.linkedin.com/",platform);
		webUtils.setValue(Constants.LinkedInOR,"txtbox_Email","fntxautomation@gmail.com");
		webUtils.setValue(Constants.LinkedInOR,"txtbox_Pwd","Pass@321");
		webUtils.wait(1);
		webUtils.press(Constants.LinkedInOR,"btn_Signin");
	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName","module","priority" })
	@Test(description="Lnk_06",priority = 1)
	public void LinkedIn_HomePage_Click_Profile_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception {
		
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedInHomePage");
    	testInfo.setTCName("LinkedIn_HomePage_Click_Profile_Validate_UIControls");
        testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
    	
		webUtils.press(Constants.LinkedInOR, "btn_Profile");
		webUtils.assertExist(Constants.LinkedInOR, "btn_Profile", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "img_Addphoto", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txt_UserTitle", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "btn_viewprofile", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txt_jobtitile", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txt_jobInfopanel", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txt_searchbox", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "img_accountsetting", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "lnk_msgbox", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "lnk_addconnection", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "btn_businessService", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txt_trypremium", testInfo);
	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName","module","priority" })
	@Test(description="Lnk_07",priority = 2)
	public void LinkedIn_HomePage_Profile_Validate_Dropdown_ListValues(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception {
		
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedInHomePage");
    	testInfo.setTCName("LinkedIn_HomePage_Profile_Validate_Dropdown_ListValues");
        testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
    	
		webUtils.press(Constants.LinkedInOR, "btn_Profile");
		webUtils.wait(3);
		webUtils.assertListOptionsbyLI(Constants.LinkedInOR, "lst_profile", "Edit Profile",testInfo );
		webUtils.assertListOptionsbyLI(Constants.LinkedInOR, "lst_profile", "Who's Viewed Your Profile", testInfo);
		webUtils.assertListOptionsbyLI(Constants.LinkedInOR, "lst_profile", "Your Updates", testInfo);
		webUtils.wait(3);
	}	
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName","module","priority" })
	@Test(description="Lnk_08",priority = 3)
	public void LinkedIn_HomePage_Connections_Validate_Dropdown_ListValues(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception {
		
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedInHomePage");
    	testInfo.setTCName("LinkedIn_HomePage_Connections_Validate_Dropdown_ListValues");
        testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
    	
		webUtils.assertListOptionsbyLI(Constants.LinkedInOR, "lst_connection", "Keep in Touch", testInfo);
		webUtils.assertListOptionsbyLI(Constants.LinkedInOR, "lst_connection", "Add Connections", testInfo);
		webUtils.assertListOptionsbyLI(Constants.LinkedInOR, "lst_connection", "Find Alumni", testInfo);
		webUtils.wait(3);
	}	
	
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName","module","priority" })
	@Test(description="Lnk_09",priority = 4)
	public void LinkedIn_HomePage_Click_Jobs_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception {
		
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedInHomePage");
    	testInfo.setTCName("LinkedIn_HomePage_Click_Jobs_Validate_UIControls");
    	webUtils.navigateTo("https://www.linkedin.com/home?trk=nav_responsive_tab_home");
        testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
    	
		webUtils.press(Constants.LinkedInOR, "lst_jobs");
		webUtils.wait(5);
		webUtils.assertExist(Constants.LinkedInOR, "lst_jobs", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txtbox_jobsearch", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "btn_jobsearch", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txt_interestjobpanel", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "pnl_advancesearch", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txt_searchbox", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "img_accountsetting", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "lnk_msgbox", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "lnk_addconnection", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "btn_businessService", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txt_trypremium", testInfo);
	}	
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName","module","priority" })
	@Test(description="Lnk_10",priority = 5)
	public void LinkedIn_HomePage_Click_Advanced_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception {
		
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedInHomePage");
    	testInfo.setTCName("LinkedIn_HomePage_Click_Advanced_Validate_UIControls");
    	webUtils.navigateTo("https://www.linkedin.com/home?trk=nav_responsive_tab_home");
        testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
    	
		webUtils.press(Constants.LinkedInOR, "link_home_advance");
		webUtils.wait(5);
		webUtils.assertExist(Constants.LinkedInOR, "txt_advancepeoplesearch", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txtbox_keyword", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txtbox_firstname", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txtbox_lastname", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txtbox_title", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "lnk_reset", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "lnk_close", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "img_accountsetting", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "lnk_msgbox", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "lnk_addconnection", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "btn_businessService", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txt_trypremium", testInfo);
	}	
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName","module","priority" })
	@Test(description="Lnk_11",priority = 6)
	public void LinkedIn_HomePage_Click_Connections_Add_Conections_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception {
		
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedInHomePage");
    	testInfo.setTCName("LinkedIn_HomePage_Click_Connections_Add_Conections_Validate_UIControls");
        testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
    	
    	webUtils.navigateTo("https://www.linkedin.com/home?trk=nav_responsive_tab_home");
    	webUtils.press(Constants.LinkedInOR, "btn_connection");
		webUtils.wait(3);
		webUtils.press(Constants.LinkedInOR, "lnk_addconnection");
		webUtils.wait(3);
		webUtils.assertExist(Constants.LinkedInOR, "txt_seeWho", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "btn_manageconnection", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txt_getStartedbyAdding", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "btn_addconContinue", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txtbox_youremail", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "img_accountsetting", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "lnk_msgbox", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "lnk_addconnection", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "btn_businessService", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txt_trypremium", testInfo);
	}	
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName","module","priority" })
	@Test(description="Lnk_12",priority = 7)
	public void LinkedIn_HomePage_Click_Connections_Add_Conections_Click_OutlookSymbol_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception {
		
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedInHomePage");
    	testInfo.setTCName("LinkedIn_HomePage_Click_Connections_Add_Conections_Click_OutlookSymbol_Validate_UIControls");
        testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
    	
    	webUtils.navigateTo("https://www.linkedin.com/home?trk=nav_responsive_tab_home");
       	webUtils.press(Constants.LinkedInOR, "btn_connection");
    	webUtils.wait(3);
    	webUtils.press(Constants.LinkedInOR, "lnk_addconnection");
    	webUtils.wait(3);
    	webUtils.press(Constants.LinkedInOR, "adconnection_image_outlook");
		webUtils.wait(3);
		webUtils.assertExist(Constants.LinkedInOR, "btn_outlookcontinue", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "btn_manageconnection", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txt_seeWho", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "img_accountsetting", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "lnk_msgbox", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "lnk_addconnection", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "btn_businessService", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txt_trypremium", testInfo);
	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName","module","priority"  })
	@Test(description="Lnk_13",priority = 8)
	public void LinkedIn_HomePage_Click_Connections_Add_Conections_Click_YahooMail_Symbol_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception {
		
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedInHomePage");
    	testInfo.setTCName("LinkedIn_HomePage_Click_Connections_Add_Conections_Click_YahooMail_Symbol_Validate_UIControls");
        testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
    	
    	webUtils.navigateTo("https://www.linkedin.com/home?trk=nav_responsive_tab_home");
     	webUtils.press(Constants.LinkedInOR, "btn_connection");
    	webUtils.wait(3);
    	webUtils.press(Constants.LinkedInOR, "lnk_addconnection");
    	webUtils.wait(3);
    	webUtils.press(Constants.LinkedInOR, "image_yahoo");
		webUtils.wait(3);
		webUtils.assertExist(Constants.LinkedInOR, "btn_manageconnection", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txt_seeWho", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "img_accountsetting", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "lnk_msgbox", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "lnk_addconnection", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "btn_businessService", testInfo);
		webUtils.assertExist(Constants.LinkedInOR, "txt_trypremium", testInfo);
		webUtils.wait(5);
	}	
	
	@AfterClass
   	public void Close() throws IOException {
		webUtils.wait(5);
   		webUtils.closeBrowser();
   	}
	
}
