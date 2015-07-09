package selenium.fonantrix.app.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import selenium.fonantrix.app.constants.Constants;
import selenium.fonantrix.core.util.TestInfo;
import selenium.fonantrix.core.web.WebUtils;

public class LinkedIn_LoginPage {
	private WebUtils webUtils;

	@Parameters({ "platform","browser","version","nodeURL","moduleName"})
	@BeforeClass
	public void SetUp(String platform, String browser, String version,String nodeURL,String moduleName) throws Exception {

		webUtils = new WebUtils(platform, browser, nodeURL);
		webUtils.openBrowser("https://www.linkedin.com/", platform);

}

	@Parameters({ "platform","browser","version","nodeURL","moduleName","module","priority" })
	@Test(description="Lnk_01",priority=1)
	public void LinkedIn_LoginPage_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) {
		
		TestInfo testInfo = new TestInfo();
    	testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedIn_LoginPage");
    	testInfo.setTCName("LinkedIn_LoginPage_Validate_UIControls");
    	    	
		webUtils.assertExist(Constants.LINKEDINLOGIN, "Logo_LinkedIn", testInfo);
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "txtbox_Email", testInfo);
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "txtbox_Pwd", testInfo);    	
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "btn_Signin", testInfo);		
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "lnk_ForgotPwd", testInfo);		
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "frm_BeGreatWithYou", testInfo);		
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "lbl_BeGreatWithYou", testInfo);	
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "lbl_Getstarted", testInfo);	
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "lbl_Fname", testInfo);
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "txtbx_Fname", testInfo);
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "lbl_Lname", testInfo);
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "txtbx_Lname", testInfo);
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "lbl_Email", testInfo);
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "txtbx_Email", testInfo);
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "lbl_Password", testInfo);
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "txtbx_Password", testInfo);
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "txt_Disclosure", testInfo);
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "lnk_UserAgreement", testInfo);
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "lnk_UserAgreement", testInfo);
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "lnk_PrivacyPolicy", testInfo);
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "lnk_CookiePolicy", testInfo);
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "btn_JoinNow", testInfo);
	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName" })
	@Test(description="Lnk_02",priority=2)
	public void LinkedIn_Login_Click_Forgotpassword_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName) {
		
		TestInfo testInfo = new TestInfo();
    	testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedIn_LoginPage");
    	testInfo.setTCName("LinkedIn_Login_Click_Forgotpassword_Validate_UIControls");
		
     	webUtils.assertExist(Constants.LINKEDINLOGIN, "lnk_ForgotPwd", testInfo);
     	webUtils.press(Constants.LINKEDINLOGIN, "lnk_ForgotPwd");
       	webUtils.assertExist(Constants.LINKEDINLOGIN, "frm_PswdReset", testInfo);
     	webUtils.assertExist(Constants.LINKEDINLOGIN, "lbl_ChangePassword", testInfo);
     	webUtils.assertExist(Constants.LINKEDINLOGIN, "lbl_findAccount", testInfo);
     	webUtils.assertExist(Constants.LINKEDINLOGIN, "txtbx_Emailaddress", testInfo);
     	webUtils.assertExist(Constants.LINKEDINLOGIN, "btn_Continue", testInfo);
       	webUtils.setValue(Constants.LINKEDINLOGIN, "txtbx_Emailaddress", "fntxautomation@gmail.com");
     	webUtils.press(Constants.LINKEDINLOGIN, "btn_Continue");
      	webUtils.assertExist(Constants.LINKEDINLOGIN, "header_emailSend", testInfo);
     	webUtils.assertExist(Constants.LINKEDINLOGIN, "lnk_DidntGetit", testInfo);
     	webUtils.assertExist(Constants.LINKEDINLOGIN, "lbl_ChnagePwd", testInfo);
     	webUtils.assertExist(Constants.LINKEDINLOGIN, "lbl_emailsend", testInfo);
     	webUtils.assertExist(Constants.LINKEDINLOGIN, "btn_CheckEmail", testInfo);  	
	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName" })
	@Test(description="Lnk_03",priority=3)
	public void LinkedIn_Validate_Login_functionality(String platform, String browser, String version,String nodeURL,String moduleName) {
		
		TestInfo testInfo = new TestInfo();
    	testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedIn_LoginPage");
    	testInfo.setTCName("LinkedIn_Validate_Login_functionality");
    	
    	webUtils.navigateTo("https://www.linkedin.com/");	
    	webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Email", "fntxautomation@gmail.com");
    	webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Pwd", "Pass@321");
    	webUtils.press(Constants.LINKEDINLOGIN, "btn_Signin");
    	webUtils.wait(5);
    	webUtils.assertExist(Constants.LINKEDINHOME, "logo_in", testInfo);
       	webUtils.navigateTo("https://www.linkedin.com/");
     	webUtils.wait(5);
     	webUtils.onMouseOver(Constants.LINKEDINHOME, "btn_AccntnSttng");
        webUtils.assertExist(Constants.LINKEDINHOME, "btn_SignOut", testInfo);
        webUtils.press(Constants.LINKEDINHOME, "btn_SignOut"); 
	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName" })
	@Test(description="Lnk_19",priority=4)
	public void LinkedIn_Validate_Login_InvalidUserName(String platform, String browser, String version,String nodeURL,String moduleName) {
		
		TestInfo testInfo = new TestInfo();
    	testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedIn_LoginPage");
    	testInfo.setTCName("LinkedIn_Validate_Login_functionality");
    	
    	webUtils.navigateTo("https://www.linkedin.com/");	
    	webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Email", "invaliduser@gmail.com");
    	webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Pwd", "Pass@321");
    	webUtils.press(Constants.LINKEDINLOGIN, "btn_Signin");
    	webUtils.wait(5);
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "lbl_InvalidUserNameError", testInfo);
	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName" })
	@Test(description="Lnk_20",priority=5)
	public void LinkedIn_Validate_Login_InvalidPassword(String platform, String browser, String version,String nodeURL,String moduleName) {
		
		TestInfo testInfo = new TestInfo();
    	testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedIn_LoginPage");
    	testInfo.setTCName("LinkedIn_Validate_Login_functionality");
    	
    	webUtils.navigateTo("https://www.linkedin.com/");	
    	webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Email", "fntxautomation@gmail.com");
    	webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Pwd", "Password");
    	webUtils.press(Constants.LINKEDINLOGIN, "btn_Signin");
    	webUtils.wait(5);
    	webUtils.assertExist(Constants.LINKEDINLOGIN, "lbl_InvalidPasswordError", testInfo);
	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName" })
	@Test(description="Lnk_04",priority=6)
	public void LinkedIn_HomePage_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName) {
		
		TestInfo testInfo = new TestInfo();
    	testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedIn_LoginPage");
    	testInfo.setTCName("LinkedIn_HomePage_Validate_UIControls");
		
    	webUtils.navigateTo("https://www.linkedin.com/");	
    	webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Email", "fntxautomation@gmail.com");
    	webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Pwd", "Pass@321");
    	webUtils.press(Constants.LINKEDINLOGIN, "btn_Signin");
    	webUtils.wait(5);
       	webUtils.assertExist(Constants.LINKEDINHOME, "logo_in", testInfo);
     	webUtils.assertExist(Constants.LINKEDINHOME, "txtbx_Search", testInfo);
     	webUtils.assertExist(Constants.LINKEDINHOME, "btn_Search", testInfo);
     	webUtils.assertExist(Constants.LINKEDINHOME, "lnk_UserName", testInfo);
     	webUtils.assertExist(Constants.LINKEDINHOME, "lnk_UserProfile", testInfo);
       	webUtils.assertExist(Constants.LINKEDINHOME, "lnk_Home", testInfo);
     	webUtils.assertExist(Constants.LINKEDINHOME, "lnk_Profile", testInfo);
     	webUtils.assertExist(Constants.LINKEDINHOME, "lnk_Connections", testInfo);
    	webUtils.assertExist(Constants.LINKEDINHOME, "lnk_Jobs", testInfo);
     	webUtils.assertExist(Constants.LINKEDINHOME, "lnk_Interest", testInfo);
     	webUtils.assertExist(Constants.LINKEDINHOME, "btn_ShareUpdate", testInfo);
     	webUtils.assertExist(Constants.LINKEDINHOME, "btn_UploadPhoto", testInfo);
       	webUtils.navigateTo("https://www.linkedin.com/");
     	webUtils.wait(5);
     	webUtils.onMouseOver(Constants.LINKEDINHOME, "btn_AccntnSttng");
        webUtils.assertExist(Constants.LINKEDINHOME, "btn_SignOut", testInfo);
        webUtils.press(Constants.LINKEDINHOME, "btn_SignOut"); 
	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName" })
	@Test(description="Lnk_05",priority=7)
	public void LinkedIn_HomePage_Click_ShareanUpdate_Click_ShareButton(String platform, String browser, String version,String nodeURL,String moduleName) {
		
		TestInfo testInfo = new TestInfo();
    	testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedIn_LoginPage");
    	testInfo.setTCName("LinkedIn_HomePage_Click_ShareanUpdate_Click_ShareButton");
		
    	webUtils.navigateTo("https://www.linkedin.com/");	
    	webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Email", "fntxautomation@gmail.com");
    	webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Pwd", "Pass@321");
    	webUtils.press(Constants.LINKEDINLOGIN, "btn_Signin");
    	webUtils.wait(5);	
        webUtils.press(Constants.LINKEDINHOME, "btn_ShareUpdate");
	    webUtils.wait(5);
	    webUtils.assertExist(Constants.LINKEDINHOME, "txtbx_WhatinMind", testInfo);
	 	webUtils.assertExist(Constants.LINKEDINHOME, "combo_ShareWth", testInfo);
	 	webUtils.assertExist(Constants.LINKEDINHOME, "btn_Share", testInfo);
	 	webUtils.setValue(Constants.LINKEDINHOME, "txtbx_WhatinMind", "ABCEFgfighfhkfh");
	 	webUtils.wait(2);
	    webUtils.press(Constants.LINKEDINHOME, "btn_Share");
	    webUtils.wait(5);
	    webUtils.assertExist(Constants.LINKEDINHOME, "lbl_Status", testInfo);
	    webUtils.onMouseOver(Constants.LINKEDINHOME, "lbl_ShareOptions");
	    webUtils.onMouseOver(Constants.LINKEDINHOME, "btn_DeleteUpdate");
	    webUtils.wait(5);
	    webUtils.assertExist(Constants.LINKEDINHOME, "btn_DeleteUpdate_Delete", testInfo);
	    webUtils.press(Constants.LINKEDINHOME, "btn_DeleteUpdate_Delete");
	    webUtils.wait(3);
	    webUtils.press(Constants.LINKEDINHOME, "btn_YesDelete");
	    webUtils.wait(3);
	    webUtils.navigateTo("https://www.linkedin.com/");
	    webUtils.wait(5);
	    webUtils.onMouseOver(Constants.LINKEDINHOME, "btn_AccntnSttng");
        webUtils.assertExist(Constants.LINKEDINHOME, "btn_SignOut", testInfo);
        webUtils.press(Constants.LINKEDINHOME, "btn_SignOut"); 
	}

	@Parameters({ "platform","browser","version","nodeURL","moduleName" })
	@Test(description="Lnk_014",priority=8)
	public void LinkedIn_Click_LinkedInLogoImage_Validate_NavigationToHomePage(String platform, String browser, String version,String nodeURL,String moduleName) {
		
		TestInfo testInfo = new TestInfo();
    	testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedIn_LoginPage");
    	testInfo.setTCName("LinkedIn_Click_LinkedInLogoImage_Validate_NavigationToHomePage");
    	
    	webUtils.navigateTo("https://www.linkedin.com/");	
    	webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Email", "fntxautomation@gmail.com");
    	webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Pwd", "Pass@321");
    	webUtils.press(Constants.LINKEDINLOGIN, "btn_Signin");
    	webUtils.wait(5);
		webUtils.navigateTo("https://www.linkedin.com/");	
		webUtils.assertExist(Constants.LINKEDINHOME, "lnk_Profile", testInfo);
		webUtils.press(Constants.LINKEDINHOME, "lnk_Profile");
		webUtils.wait(5);
		webUtils.assertExist(Constants.LINKEDINHOME, "BTN_ViewYourProfile", testInfo);
		webUtils.press(Constants.LINKEDINHOME, "logo_in");
		webUtils.wait(5);
		webUtils.assertExist(Constants.LINKEDINHOME, "btn_ShareUpdate", testInfo);
		webUtils.assertExist(Constants.LINKEDINHOME, "btn_UploadPhoto", testInfo);
		webUtils.navigateTo("https://www.linkedin.com/");
	    webUtils.wait(5);
	    webUtils.onMouseOver(Constants.LINKEDINHOME, "btn_AccntnSttng");
        webUtils.assertExist(Constants.LINKEDINHOME, "btn_SignOut", testInfo);
        webUtils.press(Constants.LINKEDINHOME, "btn_SignOut"); 

	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName" })
	@Test(description="Lnk_015",priority=9)
	public void Linkedln_Interests_Groups_Validate_CreateGroup(String platform, String browser, String version,String nodeURL,String moduleName) {
		
		TestInfo testInfo = new TestInfo();
    	testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedIn_LoginPage");
    	testInfo.setTCName("Linkedln_Interests_Groups_Validate_CreateGroup");

    	webUtils.navigateTo("https://www.linkedin.com/");
	    webUtils.wait(5);
	    webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Email", "fntxautomation@gmail.com");
    	webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Pwd", "Pass@321");
    	webUtils.press(Constants.LINKEDINLOGIN, "btn_Signin");
    	webUtils.wait(5);
    	webUtils.navigateTo("https://www.linkedin.com/");
        webUtils.assertExist(Constants.LINKEDINHOME, "lnk_Interest", testInfo);
        webUtils.onMouseOver(Constants.LINKEDINHOME, "lnk_Interest");
	    webUtils.wait(3);
        webUtils.assertExist(Constants.LINKEDINHOME, "lnk_Interest_Groups", testInfo);
        webUtils.press(Constants.LINKEDINHOME, "lnk_Interest_Groups");
	    webUtils.wait(3);
	    webUtils.assertExist(Constants.LINKEDINHOME, "btn_TakeaTour", testInfo);
	    webUtils.assertHiddenExist(Constants.LINKEDINHOME, "btn_FindGroup", testInfo);
	    webUtils.assertHiddenExist(Constants.LINKEDINHOME, "btn_CreateGroup", testInfo);
	    webUtils.hiddenPress(Constants.LINKEDINHOME, "btn_CreateGroup");
	    webUtils.wait(3);
	    webUtils.assertExist(Constants.LINKEDINHOME, "btn_Browse", testInfo);
	    webUtils.setValue(Constants.LINKEDINHOME, "txtbx_GroupName", "Test Group 012345");
	    webUtils.press(Constants.LINKEDINHOME, "lstbx_GroupType");
	    webUtils.selectDropDownListText(Constants.LINKEDINHOME, "lstbx_GroupType", "Conference Group");
	    webUtils.wait(3);
        webUtils.setValue(Constants.LINKEDINHOME, "txtbx_Summary", "This is a test Group");
	    webUtils.setValue(Constants.LINKEDINHOME, "txtbx_Description", "This is a test Group");
	    webUtils.SelectCheckBox(Constants.LINKEDINHOME, "chkbx_Agreement");
	    webUtils.press(Constants.LINKEDINHOME, "btn_CreateOpenGrp");
	    webUtils.wait(3);
	    webUtils.press(Constants.LINKEDINHOME, "lnk_Interest");
	    webUtils.wait(3);
	    webUtils.press(Constants.LINKEDINHOME, "lnk_Interest_Groups");
	    webUtils.wait(3);
/*
	    webUtils.assertText(Constants.LINKEDINHOME, "txt_Groupname", "Test Group 012345", testInfo);
	    
	    webUtils.assertExist(Constants.LINKEDINHOME, "icon_GroupSettings", testInfo);
        webUtils.press(Constants.LINKEDINHOME, "icon_GroupSettings");
        
        webUtils.assertExist(Constants.LINKEDINHOME, "lnk_GroupManageSettings", testInfo);
        webUtils.press(Constants.LINKEDINHOME, "lnk_GroupManageSettings");
        
        webUtils.assertExist(Constants.LINKEDINHOME, "lnk_deletegrp", testInfo);
        webUtils.press(Constants.LINKEDINHOME, "lnk_deletegrp");
        
        webUtils.assertExist(Constants.LINKEDINHOME, "btn_confirmtodelete", testInfo);
        webUtils.press(Constants.LINKEDINHOME, "btn_confirmtodelete");
        webUtils.wait(5);*/
	    
	    webUtils.navigateTo("https://www.linkedin.com/");
	    webUtils.wait(5);
	    webUtils.onMouseOver(Constants.LINKEDINHOME, "btn_AccntnSttng");
        webUtils.assertExist(Constants.LINKEDINHOME, "btn_SignOut", testInfo);
        webUtils.press(Constants.LINKEDINHOME, "btn_SignOut");
	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName" })
	@Test(description="Lnk_016",priority=10)
	public void Linkedln_Validate_SignOut_Functionality(String platform, String browser, String version,String nodeURL,String moduleName) {
		
		TestInfo testInfo = new TestInfo();
    	testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedIn_LoginPage");
    	testInfo.setTCName("Linkedln_Validate_SignOut_Functionality");
    	
    	webUtils.navigateTo("https://www.linkedin.com/");
	    webUtils.wait(5);
	    webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Email", "fntxautomation@gmail.com");
    	webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Pwd", "Pass@321");
    	webUtils.press(Constants.LINKEDINLOGIN, "btn_Signin");
    	webUtils.wait(5);
    	webUtils.navigateTo("https://www.linkedin.com/");
    	webUtils.wait(5);
        webUtils.onMouseOver(Constants.LINKEDINHOME, "btn_AccntnSttng");
        webUtils.assertExist(Constants.LINKEDINHOME, "btn_SignOut", testInfo);
        webUtils.press(Constants.LINKEDINHOME, "btn_SignOut");
        webUtils.wait(5);
        webUtils.assertExist(Constants.LINKEDINHOME, "lbl_Signout", testInfo);        
	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName" })
	@Test(description="Lnk_017",priority=11)
	public void LinkedIn_AccountnSettings_PrivacynSettings_Click_Manage_Validate_UI(String platform, String browser, String version,String nodeURL,String moduleName) {
	
		TestInfo testInfo = new TestInfo();
    	testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedIn_LoginPage");
    	testInfo.setTCName("LinkedIn_AccountnSettings_PrivacynSettings_Click_Manage_Validate_UI");
    	
    	webUtils.navigateTo("https://www.linkedin.com/");
	    webUtils.wait(5);
	    webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Email", "fntxautomation@gmail.com");
    	webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Pwd", "Pass@321");
    	webUtils.press(Constants.LINKEDINLOGIN, "btn_Signin");
    	webUtils.wait(10);
       	webUtils.assertExist(Constants.LINKEDINHOME, "logo_in", testInfo);
        webUtils.onMouseOver(Constants.LINKEDINHOME, "btn_AccntnSttng");
        webUtils.assertExist(Constants.LINKEDINHOME, "lnk_PrivacyPolicy", testInfo);
        webUtils.assertExist(Constants.LINKEDINHOME, "lnk_Manage", testInfo);
        webUtils.press(Constants.LINKEDINHOME, "lnk_Manage"); 
        webUtils.assertExist(Constants.LINKEDINHOME, "lnk_PwdChange", testInfo);
        webUtils.assertExist(Constants.LINKEDINHOME, "lnk_ViewPurchaseHistory", testInfo);
        webUtils.assertExist(Constants.LINKEDINHOME, "btn_Upgrade", testInfo);
        webUtils.navigateTo("https://www.linkedin.com/");
    	webUtils.wait(5);
        webUtils.onMouseOver(Constants.LINKEDINHOME, "btn_AccntnSttng");
        webUtils.assertExist(Constants.LINKEDINHOME, "btn_SignOut", testInfo);
        webUtils.press(Constants.LINKEDINHOME, "btn_SignOut");
        webUtils.wait(5);
        webUtils.assertExist(Constants.LINKEDINHOME, "lbl_Signout", testInfo);
	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName" })
	@Test(description="Lnk_018",priority=12)
	public void LinkedIn_Interests_Companies_Click_Create_Validate_WithExisting_EmailAdrress(String platform, String browser, String version,String nodeURL,String moduleName) {
	
		TestInfo testInfo = new TestInfo();
    	testInfo.setModuleName(moduleName);
    	testInfo.setFlowName("LinkedIn_LoginPage");
    	testInfo.setTCName("LinkedIn_Interests_Companies_Click_Create_Validate_WithExisting_EmailAdrress");
    	
    	webUtils.navigateTo("https://www.linkedin.com/");
	    webUtils.wait(5);
	    webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Email", "fntxautomation@gmail.com");
    	webUtils.setValue(Constants.LINKEDINLOGIN, "txtbox_Pwd", "Pass@321");
    	webUtils.press(Constants.LINKEDINLOGIN, "btn_Signin");
    	webUtils.wait(10);
    	webUtils.assertExist(Constants.LINKEDINHOME, "logo_in", testInfo);
    	webUtils.onMouseOver(Constants.LINKEDINHOME, "lnk_Interest"); 
		webUtils.press(Constants.LINKEDINHOME, "lnk_interest_Companies");        
		webUtils.assertExist(Constants.LINKEDINHOME, "lbl_interest_Companies", testInfo);
		webUtils.press(Constants.LINKEDINHOME, "btn_Create");
		webUtils.setValue(Constants.LINKEDINHOME, "txtbx_CmpnyName", "Fonantrix Solutions");
		webUtils.setValue(Constants.LINKEDINHOME, "txtbx_CmpnyEmail", "fntxautomation@gmail.com");
		webUtils.SelectCheckBox(Constants.LINKEDINHOME, "chkbox_cmpnyVerify");
		webUtils.press(Constants.LINKEDINHOME, "btn_Continue");
		webUtils.wait(3);
		webUtils.assertExist(Constants.LINKEDINHOME, "lbl_interest_Companies", testInfo);
		webUtils.navigateTo("https://www.linkedin.com/");
		webUtils.wait(5);
		webUtils.onMouseOver(Constants.LINKEDINHOME, "btn_AccntnSttng");
		webUtils.assertExist(Constants.LINKEDINHOME, "btn_SignOut", testInfo);
		webUtils.press(Constants.LINKEDINHOME, "btn_SignOut");
		webUtils.wait(5);
		webUtils.assertExist(Constants.LINKEDINHOME, "lbl_Signout", testInfo);
	}
	
	@AfterClass
   	public void Close() throws IOException {
		webUtils.wait(5);
   		webUtils.closeBrowser();
   	}
	
}
	