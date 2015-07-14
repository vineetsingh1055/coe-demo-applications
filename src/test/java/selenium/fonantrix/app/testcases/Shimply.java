package selenium.fonantrix.app.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import selenium.fonantrix.app.constants.Constants;
import selenium.fonantrix.core.listener.CustomReporter;
import selenium.fonantrix.core.util.ConfigurationMap;
import selenium.fonantrix.core.util.TestInfo;
import selenium.fonantrix.core.web.WebUtils;

public class Shimply {
	
	private WebUtils webUtils;
	@Parameters({ "platform","browser","version","nodeURL","moduleName","module","priority" })
	@BeforeClass
	public void login(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception 
	{	    
		webUtils = new WebUtils(platform, browser, nodeURL);
		webUtils.openBrowser("http://www.shimply.com/",platform);			
		webUtils.wait(5);			
	}	
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName", "module","priority" })
	@Test(description="Shimply02",priority=02)
	public void Shimply_SignUpPage_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception
	{
		
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
		testInfo.setFlowName("Shimply");
		testInfo.setTCName("Shimply_SignUpPage_Validate_UIControls");
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        
		webUtils.navigateTo("http://www.shimply.com/");
		webUtils.waitElementVisible("Shimply", "lnk_SignUp", 40);
		webUtils.assertExist("Shimply", "lnk_SignUp", testInfo);
		webUtils.assertText("Shimply", "lnk_SignUp", "Sign up", testInfo);
		webUtils.waitElementVisible("Shimply", "lnk_SignUp", 40);
		webUtils.press("Shimply","lnk_SignUp");
		webUtils.waitElementVisible("Shimply", "lbl_SignUp", 40);
		webUtils.assertExist("Shimply", "lbl_SignUp", testInfo);
		webUtils.assertText("Shimply", "lbl_SignUp", "Signup", testInfo);
		webUtils.assertExist("Shimply", "lbl_SignUp_Name", testInfo);
		webUtils.assertText("Shimply", "lbl_SignUp_Name", "Name", testInfo);
		webUtils.assertExist("Shimply", "txt_SignUp_Name", testInfo);
		webUtils.assertExist("Shimply", "lbl_SignUp_Email", testInfo);
		webUtils.assertText("Shimply", "lbl_SignUp_Email", "Email", testInfo);
		webUtils.assertExist("Shimply", "txt_SignUp_Email", testInfo);
		webUtils.assertExist("Shimply", "lbl_SignUp_Password", testInfo);
		webUtils.assertText("Shimply", "lbl_SignUp_Password", "Password", testInfo);
		webUtils.assertExist("Shimply", "txt_SignUp_Password", testInfo);
		webUtils.assertExist("Shimply", "lbl_SignUp_PasswordConfirmation", testInfo);
		webUtils.assertText("Shimply", "lbl_SignUp_PasswordConfirmation", "Password confirmation", testInfo);
		webUtils.assertExist("Shimply", "txt_SignUp_PasswordConfirmation", testInfo);
		webUtils.assertExist("Shimply", "btn_Signup", testInfo);
		
			
		

	}
	@Parameters({ "platform","browser","version","nodeURL","moduleName", "module","priority" })
	@Test(description="Shimply03",priority=03)
	public void Shimply_SignUp_Fields_Validate_WithInvalidData(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception
	{
		
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
		testInfo.setFlowName("Shimply");
		testInfo.setTCName("Shimply_SignUp_Fields_Validate_WithInvalidData");
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        
		webUtils.navigateTo("http://www.shimply.com/");
		webUtils.waitElementVisible("Shimply", "lnk_SignUp", 40);
		webUtils.assertExist("Shimply", "lnk_SignUp", testInfo);
		webUtils.assertText("Shimply", "lnk_SignUp", "Sign up", testInfo);
		webUtils.waitElementVisible("Shimply", "lnk_SignUp", 40);
		webUtils.press("Shimply","lnk_SignUp");
		webUtils.waitElementVisible("Shimply", "txt_SignUp_Name", 40);
		webUtils.setValue("Shimply", "txt_SignUp_Name", Constants.SignUpName);
		webUtils.setValue("Shimply", "txt_SignUp_Email", Constants.SignUpEmailInvalid);
		webUtils.setValue("Shimply", "txt_SignUp_Password", Constants.SignUpInvalidPwd);
		webUtils.setValue("Shimply", "txt_SignUp_PasswordConfirmation", Constants.SignUpInvalidPwd);
		webUtils.waitElementVisible("Shimply", "btn_Signup", 40);
		webUtils.press("Shimply", "btn_Signup");
		webUtils.waitElementVisible("Shimply", "lbl_SignUpErrorMsg", 40);
		webUtils.assertExist("Shimply", "lbl_SignUpErrorMsg", testInfo);
		webUtils.assertText("Shimply", "lbl_SignUpErrorMsg",Constants.ErrormsgForSignUp,testInfo);
		webUtils.assertExist("Shimply", "lbl_SignUpPwdError", testInfo);
		webUtils.assertText("Shimply", "lbl_SignUpPwdError",Constants.PwdErrormsgForSignUp,testInfo);		
	
	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName", "module","priority" })
	@Test(description="Shimply04",priority=04)
	public void Shimply_Validate_SignupFunctionality(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception
	{
		WebDriver driver= webUtils.getDriver();
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
		testInfo.setFlowName("Shimply");
		testInfo.setTCName("Shimply_Validate_SignupFunctionality");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        
		webUtils.navigateTo("http://www.shimply.com/");
		webUtils.wait(20);
		
		webUtils.assertExist("Shimply", "lnk_SignUp", testInfo);
		webUtils.assertText("Shimply", "lnk_SignUp", "Sign up", testInfo);
		webUtils.press("Shimply","lnk_SignUp");
		webUtils.wait(10);
        webUtils.setValue("Shimply", "txt_SignUp_Name", Constants.SignUpName);
		webUtils.setValue("Shimply", "txt_SignUp_Email", Constants.SignUpEmail);
		webUtils.setValue("Shimply", "txt_SignUp_Password", Constants.SignUpValidPwd);
		webUtils.setValue("Shimply", "txt_SignUp_PasswordConfirmation", Constants.SignUpValidPwd);
		webUtils.wait(10);
		webUtils.press("Shimply", "btn_Signup");
		webUtils.wait(10);
		
		if(webUtils.isAlertPresent()==true)
			webUtils.acceptAlert();
	
		// webUtils.AcceptAlert();
		webUtils.assertExist("Shimply", "lnk_UserName", testInfo);
		webUtils.assertText("Shimply", "lnk_UserName", "▼ "+Constants.SignUpName, testInfo);
		webUtils.assertExist("Shimply", "lnk_TrackOrder", testInfo);
		webUtils.assertText("Shimply", "lnk_TrackOrder", "Track Order", testInfo);
		webUtils.assertExist("Shimply", "lnk_SellOnShimply", testInfo);
		webUtils.assertText("Shimply", "lnk_SellOnShimply", "Sell on Shimply", testInfo);
		webUtils.assertExist("Shimply", "Img_Shimply", testInfo);
		webUtils.assertAttributeValue("Shimply", "Img_Shimply", "alt","Online Shopping India", testInfo);	
		webUtils.navigateTo("http://www.shimply.com/");
		webUtils.press(Constants.SHIMPLYPAGE, "btn_SignedName"); 
		webUtils.wait(5);
		webUtils.press(Constants.SHIMPLYPAGE, "lnk_logout");
		 
 		if(webUtils.isAlertPresent()==true)
 			webUtils.acceptAlert();
		
	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName", "module","priority" })
	@Test(description="Shimply05",priority=05)
	public void Shimply_LoginPage_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception {
		
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
		testInfo.setFlowName("Shimply");
		testInfo.setTCName("Shimply_LoginPage_Validate_UIControls");
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
		
        webUtils.navigateTo("http://www.shimply.com/");
		webUtils.waitElementVisible("Shimply", "lnk_Login", 40);
		webUtils.assertExist("Shimply", "lnk_Login", testInfo);
		webUtils.assertText("Shimply", "lnk_Login", "Login", testInfo);
		webUtils.press("Shimply","lnk_Login");
		webUtils.waitElementVisible("Shimply", "lbl_Login", 40);
		webUtils.assertExist("Shimply", "lbl_Login", testInfo);
		webUtils.assertText("Shimply", "lbl_Login", "Login", testInfo);	
		webUtils.assertExist("Shimply", "lbl_Email", testInfo);
		webUtils.assertText("Shimply", "lbl_Email", "Email", testInfo);
		webUtils.assertExist("Shimply", "txt_Email", testInfo);
		webUtils.assertExist("Shimply", "lbl_Password", testInfo);
		webUtils.assertText("Shimply", "lbl_Password", "Password", testInfo);
		webUtils.assertExist("Shimply", "txt_Password", testInfo);
		webUtils.assertExist("Shimply", "btn_SignIn", testInfo);
		webUtils.assertAttributeValue("Shimply", "btn_SignIn","Value","Sign in", testInfo);
		webUtils.assertExist("Shimply", "lbl_OR", testInfo);
		webUtils.assertText("Shimply", "lbl_OR", "OR", testInfo);
		webUtils.assertExist("Shimply", "lnk_ForgotPassword", testInfo);
		webUtils.assertText("Shimply", "lnk_ForgotPassword", "Forgot your password?", testInfo);
		webUtils.assertExist("Shimply", "lnk_SignInWithGoogle", testInfo);
	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName", "module","priority" })
	@Test(description="Shimply06",priority=06)
	public void Shimply_Login_Fields_Validate_WithInvalidData(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception
	{
		
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
		testInfo.setFlowName("Shimply");
		
		testInfo.setTCName("Shimply_Login_Fields_Validate_WithInvalidData");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        
		webUtils.navigateTo("http://www.shimply.com/");
		webUtils.waitElementVisible("Shimply", "lnk_Login", 40);
		webUtils.press("Shimply","lnk_Login");
		webUtils.waitElementVisible("Shimply", "txt_Email", 40);
		webUtils.setValue("Shimply", "txt_Email", Constants.SignUpEmail);
		webUtils.setValue("Shimply", "txt_Password", Constants.SignUpInvalidPwd);
		
		webUtils.press("Shimply", "btn_SignIn");
		
		webUtils.assertExist("Shimply", "lbl_Login", testInfo);
		webUtils.assertText("Shimply", "lbl_Login", "Login", testInfo);	
		
		webUtils.assertExist("Shimply", "lbl_Email", testInfo);
		webUtils.assertText("Shimply", "lbl_Email", "Email", testInfo);
		webUtils.assertExist("Shimply", "txt_Email", testInfo);
		webUtils.wait(10);

	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName", "module","priority" })
	@Test(description="Shimply07",priority=07)
	public void Shimply_Validate_LoginFunctionality(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception
	{
		WebDriver driver= webUtils.getDriver();
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
		testInfo.setFlowName("Shimply");
		
		testInfo.setTCName("Shimply_Validate_LoginFunctionality");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        
		webUtils.navigateTo("http://www.shimply.com/");
		webUtils.waitElementVisible("Shimply", "lnk_Login", 40);

		webUtils.press("Shimply","lnk_Login");
		webUtils.waitElementVisible("Shimply", "txt_Email", 40);
		webUtils.setValue("Shimply", "txt_Email", Constants.LoginEmail);
		webUtils.setValue("Shimply", "txt_Password", "12345678");
		
		webUtils.press("Shimply", "btn_SignIn");
		webUtils.waitElementVisible("Shimply", "lnk_TrackOrder", 40);
		
		if(webUtils.isAlertPresent()==true)
		webUtils.acceptAlert();	

		webUtils.assertExist("Shimply", "lnk_TrackOrder", testInfo);
		webUtils.assertText("Shimply", "lnk_TrackOrder", "Track Order", testInfo);
			
		webUtils.assertExist("Shimply", "lnk_SellOnShimply", testInfo);
		webUtils.assertText("Shimply", "lnk_SellOnShimply", "Sell on Shimply", testInfo);
		webUtils.assertExist("Shimply", "Img_Shimply", testInfo);
		webUtils.assertAttributeValue("Shimply", "Img_Shimply", "alt","Online Shopping India", testInfo);			
		
		webUtils.navigateTo("http://www.shimply.com/");
		
 		webUtils.press(Constants.SHIMPLYPAGE, "btn_SignedName"); 
		 
 		webUtils.press(Constants.SHIMPLYPAGE, "lnk_logout");
		 
 		if(webUtils.isAlertPresent()==true)
			webUtils.acceptAlert();
	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName", "module","priority" })
	@Test(description="Shimply08",priority=8)
	public void Shimply_SignIn_WithValidCredentials_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception
	{
		WebDriver driver= webUtils.getDriver();
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
		testInfo.setFlowName("Shimply");
		
		testInfo.setTCName("Shimply_SignIn_WithValidCredentials_Validate_UIControls");
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        
		webUtils.navigateTo("http://www.shimply.com/");
		webUtils.waitElementVisible("Shimply", "lnk_Login", 40);
		
		webUtils.press("Shimply","lnk_Login");
		webUtils.waitElementVisible("Shimply", "txt_Email", 40);
		webUtils.setValue("Shimply", "txt_Email", "fntxautomation@gmail.com");
		webUtils.setValue("Shimply", "txt_Password", "12345678");
		
		webUtils.press("Shimply", "btn_SignIn");
		webUtils.waitElementVisible("Shimply", "btn_ByStates", 40);
		
		if(webUtils.isAlertPresent()==true)
		webUtils.acceptAlert();
		
		webUtils.assertExist("Shimply", "btn_ByStates", testInfo);
		webUtils.assertText("Shimply", "btn_ByStates", "BY STATES", testInfo);
		
		webUtils.assertExist("Shimply", "btn_WomenApparels", testInfo);
		webUtils.assertText("Shimply", "btn_WomenApparels", "WOMEN APPARELS", testInfo);
		
		webUtils.assertExist("Shimply", "btn_JewelleryAccessories", testInfo);
		webUtils.assertText("Shimply", "btn_JewelleryAccessories", "JEWELLERY & ACCESSORIES", testInfo);
		
		webUtils.assertExist("Shimply", "btn_HomeDecor", testInfo);
		webUtils.assertText("Shimply", "btn_HomeDecor", "HOME DECOR", testInfo);
		
		webUtils.assertExist("Shimply", "btn_Man", testInfo);
		webUtils.assertText("Shimply", "btn_Man", "MEN", testInfo);
		
		webUtils.assertExist("Shimply", "btn_FoodfromStates", testInfo);
		webUtils.assertText("Shimply", "btn_FoodfromStates", "FOOD FROM STATES", testInfo);
		
		webUtils.assertExist("Shimply", "btn_Books", testInfo);
		webUtils.assertText("Shimply", "btn_Books", "BOOKS", testInfo);
		
		webUtils.assertExist("Shimply", "btn_OtherStores", testInfo);
		webUtils.assertText("Shimply", "btn_OtherStores", "OTHER STORES", testInfo);	
		
		
		webUtils.assertExist("Shimply", "btn_Search", testInfo);
		webUtils.assertText("Shimply", "btn_Search", "Search", testInfo);
		
		webUtils.waitElementVisible("Shimply", "lnk_TrackOrder", 40);

		
		
		webUtils.assertExist("Shimply", "lnk_TrackOrder", testInfo);
		webUtils.assertText("Shimply", "lnk_TrackOrder", "Track Order", testInfo);
		
		webUtils.assertExist("Shimply", "lnk_SellOnShimply", testInfo);
		webUtils.assertText("Shimply", "lnk_SellOnShimply", "Sell on Shimply", testInfo);
		
		webUtils.assertExist("Shimply", "Img_Shimply", testInfo);
		webUtils.assertAttributeValue("Shimply", "Img_Shimply", "alt","Online Shopping India", testInfo);
		
		webUtils.navigateTo("http://www.shimply.com/");
		
 		webUtils.press(Constants.SHIMPLYPAGE, "btn_SignedName"); 
		 
 		webUtils.press(Constants.SHIMPLYPAGE, "lnk_logout");
		 
 		if(webUtils.isAlertPresent()==true)
			webUtils.acceptAlert();
	}
	
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName", "module","priority" })
	@Test(description="Shimply12",priority=12)
	public void Shimply_Cart_ClickOn_ContinueShopping_Validate_NavigationTo_homePage(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception
	{
		WebDriver driver= webUtils.getDriver();
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
		testInfo.setFlowName("Shimply");
		
		testInfo.setTCName("Shimply_Cart_ClickOn_ContinueShopping_Validate_NavigationTo_homePage");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
		webUtils.navigateTo("http://www.shimply.com/");
		webUtils.waitElementVisible("Shimply", "lnk_Cart", 40);
		webUtils.assertExist("Shimply", "lnk_Cart", testInfo);
		webUtils.assertText("Shimply", "lnk_Cart", "CART", testInfo);
		
		webUtils.press("Shimply", "lnk_Cart");
		
		webUtils.waitElementVisible("Shimply", "lnk_ContinueShopping", 40);
		
		webUtils.assertExist("Shimply", "lnk_ContinueShopping", testInfo);
		webUtils.assertText("Shimply", "lnk_ContinueShopping", "Continue shopping", testInfo);
		
		webUtils.press("Shimply", "lnk_ContinueShopping");
		
		webUtils.waitElementVisible("Shimply", "btn_WomenApparels", 40);		
	
		webUtils.assertExist("Shimply", "btn_WomenApparels", testInfo);
		webUtils.assertText("Shimply", "btn_WomenApparels", "WOMEN APPARELS", testInfo);
		
		webUtils.assertExist("Shimply", "btn_JewelleryAccessories", testInfo);
		webUtils.assertText("Shimply", "btn_JewelleryAccessories", "JEWELLERY & ACCESSORIES", testInfo);
		
		webUtils.assertExist("Shimply", "btn_HomeDecor", testInfo);
		webUtils.assertText("Shimply", "btn_HomeDecor", "HOME DECOR", testInfo);
		
		webUtils.assertExist("Shimply", "btn_Man", testInfo);
		webUtils.assertText("Shimply", "btn_Man", "MEN", testInfo);
		
		webUtils.assertExist("Shimply", "btn_FoodfromStates", testInfo);
		webUtils.assertText("Shimply", "btn_FoodfromStates", "FOOD FROM STATES", testInfo);
		
		webUtils.assertExist("Shimply", "btn_Books", testInfo);
		webUtils.assertText("Shimply", "btn_Books", "BOOKS", testInfo);
		
		webUtils.assertExist("Shimply", "btn_OtherStores", testInfo);
		webUtils.assertText("Shimply", "btn_OtherStores", "OTHER STORES", testInfo);	
		
		
		webUtils.assertExist("Shimply", "btn_Search", testInfo);
		webUtils.assertText("Shimply", "btn_Search", "Search", testInfo);
		
		webUtils.waitElementVisible("Shimply", "lnk_TrackOrder", 40);		
		
		webUtils.assertExist("Shimply", "lnk_TrackOrder", testInfo);
		webUtils.assertText("Shimply", "lnk_TrackOrder", "Track Order", testInfo);
		
		webUtils.assertExist("Shimply", "lnk_SellOnShimply", testInfo);
		webUtils.assertText("Shimply", "lnk_SellOnShimply", "Sell on Shimply", testInfo);
		
		webUtils.assertExist("Shimply", "Img_Shimply", testInfo);
		webUtils.assertAttributeValue("Shimply", "Img_Shimply", "alt","Online Shopping India", testInfo);

	}
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName", "module","priority" })
	@Test(description="Shimply13",priority=13)

	public void Shimply_ClickOn_WomenApparelsButton_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception
	{
		WebDriver driver= webUtils.getDriver();
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
		testInfo.setFlowName("Shimply");
		
		testInfo.setTCName("Shimply_ClickOn_WomenApparelsButton_Validate_UIControls");
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
		webUtils.navigateTo("http://www.shimply.com/");
		webUtils.waitElementVisible("Shimply", "btn_WomenApparels", 40);
		webUtils.press("Shimply", "btn_WomenApparels");
		webUtils.waitElementVisible("Shimply", "lbl_FilterBy", 40);
		  
		  
		  webUtils.assertExist("Shimply", "lbl_FilterBy", testInfo);
		  webUtils.assertText("Shimply", "lbl_FilterBy", "FILTER BY", testInfo);
		  
		  webUtils.assertExist("Shimply", "lbl_ShowResultFor", testInfo);
		  webUtils.assertText("Shimply", "lbl_ShowResultFor", "Show results for", testInfo);
		  webUtils.waitElementVisible("Shimply", "lbl_Price", 40);
		  		  
		  webUtils.assertExist("Shimply", "lbl_Price", testInfo);
		  webUtils.assertText("Shimply", "lbl_Price", "Price", testInfo);
		  List<Object> ExpectedPrice = new ArrayList<Object>();
		  
		  ExpectedPrice.add("Under Rs.200");
		  ExpectedPrice.add("Rs.200 to Rs.900");
		  ExpectedPrice.add("Rs.900 to Rs.1,600");
		  ExpectedPrice.add("Rs.1,600 to Rs.2,300");
		  ExpectedPrice.add("Rs.1,600 to Rs.2,300");
		 		  
		  webUtils.assertOptionsbyLIbyList("Shimply", "lst_WA_Price", ExpectedPrice, testInfo);
		  webUtils.waitElementVisible("Shimply", "lbl_Discount", 40);

		  
		  webUtils.assertExist("Shimply", "lbl_Discount", testInfo);
		  webUtils.assertText("Shimply", "lbl_Discount", "Discount", testInfo);
		  List<Object> ExpectedDiscount = new ArrayList<Object>();
		  
		  ExpectedDiscount.add("10% Off or More");
		  ExpectedDiscount.add("25% Off or More");
		  ExpectedDiscount.add("50% Off or More");
		  ExpectedDiscount.add("50% Off or More");
		 		  
		  webUtils.assertOptionsbyLIbyList("Shimply", "lst_WA_Discount", ExpectedDiscount, testInfo);
		  webUtils.waitElementVisible("Shimply", "lbl_Supplier", 40);
		  
		  
		  webUtils.assertExist("Shimply", "lbl_Supplier", testInfo);
		  webUtils.assertText("Shimply", "lbl_Supplier", "Supplier", testInfo);
	
		  
		  webUtils.assertExist("Shimply", "lbl_WA_Brand", testInfo);
		  webUtils.assertText("Shimply", "lbl_WA_Brand", "Brand", testInfo);
		  List<Object> ExpectedBrands = new ArrayList<Object>();
		  
		  ExpectedBrands.add("A G Lifestyle");
		  ExpectedBrands.add("Anvi Creations");
		  ExpectedBrands.add("Charu Boutique");
	  
		 		  
		  webUtils.assertOptionsbyLIbyList("Shimply", "lst_WA_Brand", ExpectedBrands, testInfo);
		  webUtils.waitElementVisible("Shimply", "lbl_WA_Populattag", 40);
		  
		  webUtils.assertExist("Shimply", "lbl_WA_Populattag", testInfo);
		  webUtils.assertText("Shimply", "lbl_WA_Populattag", "POPULAR TAGS", testInfo);
	}	
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName", "module","priority" })
	@Test(description="Shimply14",priority=14)

	public void Shimply_ClickOn_JEWELLERY_AND_ACCESSORIES_Button_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception
	{
		WebDriver driver= webUtils.getDriver();
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
		testInfo.setFlowName("Shimply");
		
		testInfo.setTCName("Shimply_ClickOn_JEWELLERY_AND_ACCESSORIES_Button_Validate_UIControls");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        
		webUtils.navigateTo("http://www.shimply.com/");
		webUtils.waitElementVisible("Shimply", "btn_JewelleryAccessories", 40);
		webUtils.press("Shimply", "btn_JewelleryAccessories");
		webUtils.waitElementVisible("Shimply", "lbl_JWA_PopularTags", 40);
		  
		  
		  webUtils.assertExist("Shimply", "lbl_JWA_PopularTags", testInfo);
		  webUtils.assertText("Shimply", "lbl_JWA_PopularTags", "POPULAR TAGS", testInfo);
		  
	  /*
		  webUtils.assertExist("Shimply", "lbl_JWA_BrandType", testInfo);
		  webUtils.assertText("Shimply", "lbl_JWA_BrandType", "Bangle type", testInfo);*/
		  
		  webUtils.assertExist("Shimply", "lbl_JWA_Earring_Type", testInfo);
		  webUtils.assertText("Shimply", "lbl_JWA_Earring_Type", "Earring type", testInfo);
		  webUtils.waitElementVisible("Shimply", "lbl_JWA_Brand", 40);
		  
		  webUtils.assertExist("Shimply", "lbl_JWA_Brand", testInfo);
		  webUtils.assertText("Shimply", "lbl_JWA_Brand", "Brand", testInfo);
		  webUtils.waitElementVisible("Shimply", "lst_JWA_PopularTags", 40);
		  
		  
		  List<Object> ExpectedJWAPopularTags = new ArrayList<Object>();
		  
		  ExpectedJWAPopularTags.add("Gold Chains");
		  ExpectedJWAPopularTags.add("Gold Ring");
		  ExpectedJWAPopularTags.add("Silver Rings");
		  ExpectedJWAPopularTags.add("Diamond Rings");
		  ExpectedJWAPopularTags.add("artificial rings");
		  ExpectedJWAPopularTags.add("designer rings");
		  ExpectedJWAPopularTags.add("Latest Jewellery Designs");
		  ExpectedJWAPopularTags.add("Gold Plated Jewellery");
		  ExpectedJWAPopularTags.add("American Diamond Jewellery");
		 		  
		  webUtils.assertOptionsbyLIbyList("Shimply", "lst_JWA_PopularTags", ExpectedJWAPopularTags, testInfo);
		  webUtils.wait(10);
		  
		  
		  List<Object> Expectedlst_JWA_Availabilitys = new ArrayList<Object>();
		  
		  Expectedlst_JWA_Availabilitys.add("Include Out of Stock");
	
		  webUtils.assertOptionsbyLIbyList("Shimply", "lst_JWA_Availability", Expectedlst_JWA_Availabilitys, testInfo);
		  webUtils.wait(10);
		  
		  
		  List<Object> Expectedlst_JWA_BrandType = new ArrayList<Object>();
		  
		  Expectedlst_JWA_BrandType.add("Bangles");
		  Expectedlst_JWA_BrandType.add("Kada");
	
		  webUtils.assertOptionsbyLIbyList("Shimply", "lst_JWA_BrandType", Expectedlst_JWA_BrandType, testInfo);
		  webUtils.wait(10);
		  
		  
		  List<Object> Expectedlst_JWA_Earring_Type = new ArrayList<Object>();
		  
		  Expectedlst_JWA_Earring_Type.add("Chandbalis");
		  Expectedlst_JWA_Earring_Type.add("Clip-on Earrings");
		  Expectedlst_JWA_Earring_Type.add("Danglers");
		  Expectedlst_JWA_Earring_Type.add("Drop Earrings");
		  Expectedlst_JWA_Earring_Type.add("Ear Cuffs");
		  Expectedlst_JWA_Earring_Type.add("Hoops");
	
		  webUtils.assertOptionsbyLIbyList("Shimply", "lst_JWA_Earring_Type", Expectedlst_JWA_Earring_Type, testInfo);
		  webUtils.wait(10);
		  
		  List<Object> Expected_lst_JWA_Brande = new ArrayList<Object>();
		  
		  Expected_lst_JWA_Brande.add("Aaina");
		  Expected_lst_JWA_Brande.add("Anmol Jewelspearls");
		  Expected_lst_JWA_Brande.add("Avs Jewellers");
		  Expected_lst_JWA_Brande.add("Akruti Jewel");
		  Expected_lst_JWA_Brande.add("Alpha Man");
		  Expected_lst_JWA_Brande.add("Anjalika");
		  Expected_lst_JWA_Brande.add("Antiformal");
	
		  webUtils.assertOptionsbyLIbyList("Shimply", "lst_JWA_Brand", Expected_lst_JWA_Brande, testInfo);
		  webUtils.wait(10);
	}
	
	
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName", "module","priority" })
	@Test(description="Shimply16",priority=16)
	public void Shimply_ClickOn_MENButton_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception
	{
		WebDriver driver= webUtils.getDriver();
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
		testInfo.setFlowName("Shimply");
		
		testInfo.setTCName("Shimply_ClickOn_MENButton_Validate_UIControls");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        
		webUtils.navigateTo("http://www.shimply.com/");
		webUtils.waitElementVisible("Shimply", "btn_Man", 40);
		webUtils.press("Shimply", "btn_Man");
		webUtils.waitElementVisible("Shimply", "lbl_Cat_Men", 40);
		  
		webUtils.assertExist("Shimply", "lbl_Cat_Men", testInfo);
		webUtils.assertText("Shimply", "lbl_Cat_Men", "Men", testInfo);
		  
		webUtils.assertExist("Shimply", "lbl_Cat_Clothing", testInfo);
		webUtils.assertText("Shimply", "lbl_Cat_Clothing", "Clothing", testInfo);
		  
		webUtils.assertExist("Shimply", "lbl_Cat_Footwear", testInfo);
		webUtils.assertText("Shimply", "lbl_Cat_Footwear", "Clothing", testInfo);
		  
		webUtils.assertExist("Shimply", "lbl_Cat_Eyewear", testInfo);
		webUtils.assertText("Shimply", "lbl_Cat_Eyewear", "Eyewear", testInfo);
		  
		webUtils.assertExist("Shimply", "lbl_Cat_GroomingWellness", testInfo);
		webUtils.assertText("Shimply", "lbl_Cat_GroomingWellness", "Grooming & Wellness", testInfo);
		  
	}	
	@Parameters({ "platform","browser","version","nodeURL","moduleName", "module","priority" })
	@Test(description="Shimply17",priority=17)
	public void Shimply_Validate_ForgotPassword_Functionality(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception
	{
		WebDriver driver= webUtils.getDriver();
		TestInfo testInfo = new TestInfo();
		testInfo.setModuleName(moduleName);
		testInfo.setFlowName("Shimply");
		
		testInfo.setTCName("Shimply_Validate_ForgotPassword_Functionality");
		
		testInfo.setPlatform(platform);
        testInfo.setBrowser(browser);
        testInfo.setPriority(priority);
        testInfo.setModule(module);
        
        CustomReporter reporter = new CustomReporter();
        reporter.setTestInfo(testInfo);
        
		webUtils.navigateTo("http://www.shimply.com/");
		webUtils.waitElementVisible("Shimply", "lnk_Login", 40);
		webUtils.press("Shimply","lnk_Login");
		webUtils.waitElementVisible("Shimply", "lnk_Login", 40);
		webUtils.assertExist("Shimply", "btn_ForgotPWD", testInfo);
		  
		webUtils.press("Shimply","btn_ForgotPWD");
		webUtils.waitElementVisible("Shimply", "txt_Email_Forgot", 40);
		
		webUtils.assertExist("Shimply", "txt_Email_Forgot", testInfo);
		webUtils.assertExist("Shimply", "lbl_Email_Forgot", testInfo);
		webUtils.assertText("Shimply", "lbl_Email_Forgot", "Email", testInfo);
		  
		webUtils.assertExist("Shimply", "lbl_Forgot_Your_PWD", testInfo);
		webUtils.assertText("Shimply", "lbl_Forgot_Your_PWD", "Forgot your password?", testInfo);
		  
		webUtils.assertExist("Shimply", "btn_ResetPwd_Ins", testInfo);
		  
		webUtils.assertAttributeValue("Shimply", "btn_ResetPwd_Ins", "Value", "Send me reset password instructions", testInfo);
		  
		  
		webUtils.setValue("Shimply", "txt_Email", Constants.LoginEmail);
	
		
		
		webUtils.press("Shimply","btn_ResetPwd_Ins");
		webUtils.waitElementVisible("Shimply", "lbl_Login", 40);
		
		if(webUtils.isAlertPresent()==true)
		webUtils.acceptAlert();
		  	
		webUtils.assertExist("Shimply", "lbl_Login", testInfo);
		webUtils.assertText("Shimply", "lbl_Login", "Login", testInfo);	
			
		webUtils.assertExist("Shimply", "lbl_Email", testInfo);
		webUtils.assertText("Shimply", "lbl_Email", "Email", testInfo);
		webUtils.assertExist("Shimply", "txt_Email", testInfo);
		
		webUtils.assertExist("Shimply", "lbl_Password", testInfo);
		webUtils.assertText("Shimply", "lbl_Password", "Password", testInfo);
		webUtils.assertExist("Shimply", "txt_Password", testInfo);
			
		webUtils.assertExist("Shimply", "btn_SignIn", testInfo);
		webUtils.assertAttributeValue("Shimply", "btn_SignIn","Value","Sign in", testInfo);
			
			
		webUtils.assertExist("Shimply", "lbl_OR", testInfo);
		webUtils.assertText("Shimply", "lbl_OR", "OR", testInfo);
		
		webUtils.assertExist("Shimply", "lnk_ForgotPassword", testInfo);
		webUtils.assertText("Shimply", "lnk_ForgotPassword", "Forgot your password?", testInfo);
		
		webUtils.assertExist("Shimply", "lnk_SignInWithGoogle", testInfo);	
	}
	
	@AfterClass
   	public void Close() throws IOException {
		webUtils.wait(5);
   		webUtils.closeBrowser();
   	}
	


}
