package selenium.fonantrix.app.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import selenium.fonantrix.app.constants.Constants;
import selenium.fonantrix.core.listener.CustomReporter;
import selenium.fonantrix.core.util.TestInfo;
import selenium.fonantrix.core.web.WebUtils;

public class ShimplyByState {
	
	private WebUtils webUtils;
	
	@Parameters({ "platform","browser","version","nodeURL","moduleName","module","priority" })
	@BeforeClass
	public void SetUp(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority) throws Exception
	{				
		webUtils = new WebUtils(platform, browser, nodeURL);
		webUtils.openBrowser("http://www.shimply.com/",platform);

	}

		@Parameters({ "platform","browser","version","nodeURL","moduleName","module","priority" })
		@Test(description="Smply_01",priority=1)
		public void Shimply_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority)
		{
			TestInfo testInfo = new TestInfo();
			testInfo.setModuleName(moduleName);
	    	testInfo.setFlowName("ShimplyByState");
	    	testInfo.setTCName("Shimply_Validate_UIControls");  	
	    	
	    	testInfo.setPlatform(platform);
	        testInfo.setBrowser(browser);
	        testInfo.setPriority(priority);
	        testInfo.setModule(module);
	        
	        CustomReporter reporter = new CustomReporter();
	        reporter.setTestInfo(testInfo);
			// Navigation to a particular page
			webUtils.navigateTo("http://www.shimply.com/");
			webUtils.wait(5);
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_Signup", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_Signup", "Sign up", testInfo);
						
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_login", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_login", "Login", testInfo);
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_TrackOrder", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_TrackOrder", "Track Order", testInfo);
							
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_SellonShimply", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_SellonShimply", "Sell on Shimply", testInfo);
							
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lnk_CART", testInfo);			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "txt_Search", testInfo);							
			webUtils.assertExist(Constants.SHIMPLYPAGE, "btn_Search", testInfo);			
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_bystates", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_bystates", "BY STATES", testInfo);					
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_womenapparels", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_womenapparels", "WOMEN APPARELS", testInfo);		
							
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_JwlryAcces", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_JwlryAcces", "JEWELLERY & ACCESSORIES", testInfo);					
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_Homedecor", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_Homedecor", "HOME DECOR", testInfo);		
							
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_Men", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_Men", "MEN", testInfo);
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_FoodFromStates", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_FoodFromStates", "FOOD FROM STATES", testInfo);
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_books", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_books", "BOOKS", testInfo);
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_OthrStr", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_OthrStr", "OTHER STORES", testInfo);
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_Policies", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_Policies", "Policies", testInfo);
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_BsnsPrtnr", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_BsnsPrtnr", "Business Partnerships", testInfo);
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_CstmrSprt", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_CstmrSprt", "Customer Support", testInfo);
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_CnctUs", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_CnctUs", "Connect With Us", testInfo);
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_PoplrSrch", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_PoplrSrch", "Popular Search", testInfo);
			
		}
	
			//Test case to validate the UI Controls of page displayed after click on By State 
			@Parameters({ "platform","browser","version","nodeURL","moduleName", "module","priority" })
			@Test(description="Smply_10",priority=2)
			public void Shimply_ClickOn_ByStateButton_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority)
			{ 
				
				TestInfo testInfo = new TestInfo();
				testInfo.setModuleName(moduleName);
		    	testInfo.setFlowName("ShimplyByState");
		    	testInfo.setTCName("Shimply_ClickOn_ByStateButton_Validate_UIControls");	    	
		    	
		    	testInfo.setPlatform(platform);
		        testInfo.setBrowser(browser);
		        testInfo.setPriority(priority);
		        testInfo.setModule(module);
		        
		        CustomReporter reporter = new CustomReporter();
		        reporter.setTestInfo(testInfo);
				// after login to navigate to a particular page
				webUtils.navigateTo("http://www.shimply.com/");
				webUtils.wait(10);
				//webUtils.waitElementVisible(Constants.SHIMPLYPAGE, "lbl_login", 40);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_login", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_login", "Login", testInfo);
				
				webUtils.press(Constants.SHIMPLYPAGE, "lbl_login");
				webUtils.wait(10);
				//webUtils.waitElementVisible(Constants.SHIMPLYPAGE, "txt_EmailName", 40);
				
				webUtils.setValue(Constants.SHIMPLYPAGE, "txt_EmailName", "fntxautomation@gmail.com");
				webUtils.setValue(Constants.SHIMPLYPAGE, "txt_Password", "12345678");
				
				
				//webUtils.waitElementVisible(Constants.SHIMPLYPAGE, "btn_SignIn", 40);
				
				webUtils.press(Constants.SHIMPLYPAGE, "btn_SignIn");
				webUtils.wait(10);
				//webUtils.waitElementVisible(Constants.SHIMPLYPAGE, "lnk_ByStates", 40);
				
				if(webUtils.isAlertPresent()==true)
				webUtils.acceptAlert();
				webUtils.press(Constants.SHIMPLYPAGE, "lnk_ByStates"); 
				//webUtils.waitElementVisible(Constants.SHIMPLYPAGE, "lbl_RgnlStores", 40);
				 
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_RgnlStores", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_RgnlStores", "Regional Stores", testInfo);
				
				//Assertion under South Indian Stores region
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_South", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_South", "SOUTH INDIAN STORES", testInfo);
						
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_SouthKrntk", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_SouthKrntk", "Karnataka", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_SouthTamil", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_SouthTamil", "Tamilnadu", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_SouthTelang", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_SouthTelang", "Telangana", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_SouthKeral", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_SouthKeral", "Kerala", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_SouthPoplrprdcts", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_SouthPoplrprdcts", "POPULAR PRODUCTS FROM SOUTH INDIAN STORES", testInfo);
				
				//Assertion under North Indian Stores region
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_North", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_North", "NORTH INDIAN STORES", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_NorthJ&K", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_NorthJ&K", "Jammu Kashmir", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_NorthUP", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_NorthUP", "Uttar Pradesh", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_NorthPNJB", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_NorthPNJB", "PUNJAB", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_NorthUK", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_NorthUK", "UTTARAKHAND", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_NorthHMCHAL", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_NorthHMCHAL", "HIMACHAL PRADESH", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_NorthPoplrprdcts", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_NorthPoplrprdcts", "POPULAR PRODUCTS FROM NORTH INDIAN STORES", testInfo);
				
				//Assertion under East Indian Stores region
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_East", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_East", "EAST INDIAN STORES", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_EastWB", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_EastWB", "West Bengal", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_EastBH", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_EastBH", "Bihar", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_EastOD", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_EastOD", "Odisha", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_EastJKH", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_EastJKH", "Jharkhand", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_EastPoplrprdcts", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_EastPoplrprdcts", "POPULAR PRODUCTS FROM EAST INDIAN STORES", testInfo);
				
				//Assertion under West Indian Stores region
												
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_WestRaj", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_WestRaj", "Rajasthan", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_WestMah", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_WestMah", "Maharashtra", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_WestGJ", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_WestGJ", "Gujarat", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_WestGoa", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_WestGoa", "Goa", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_WestPoplrprdcts", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_WestPoplrprdcts", "POPULAR PRODUCTS FROM WEST INDIA STORES", testInfo);
				
				//Assertion under Central India Stores region
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_Central", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_Central", "CENTRAL INDIA STORES", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_CentralMP", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_CentralMP", "Madhya Pradesh", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_CentralCH", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_CentralCH", "Chhattisgarh", testInfo);
				
				//Assertion under Northeast India Stores region
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_Northeast", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_Northeast", "NORTHEAST INDIA STORES", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_NortheastAP", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_NortheastAP", "Arunachal Pradesh", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_NortheastAS", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_NortheastAS", "Assam", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_NortheastMAN", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_NortheastMAN", "Manipur", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_NortheastMegha", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_NortheastMegha", "Meghalaya", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_NortheastPoplrprdcts", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_NortheastPoplrprdcts", "POPULAR PRODUCTS FROM NORTHEAST INDIA STORES", testInfo);
				
				webUtils.navigateTo("http://www.shimply.com/");
				
				 webUtils.press(Constants.SHIMPLYPAGE, "btn_SignedName"); 
				 webUtils.wait(10);
				// webUtils.waitElementVisible(Constants.SHIMPLYPAGE, "lnk_logout", 40);
				 
				 webUtils.press(Constants.SHIMPLYPAGE, "lnk_logout");
				 
				 if(webUtils.isAlertPresent()==true)
						webUtils.acceptAlert();
		
				 webUtils.wait(10);
	}


			//Test case to validate the UI Controls of page displayed after click on By State
			@Parameters({ "platform","browser","version","nodeURL","moduleName", "module","priority" })
			@Test(description="Smply_11",priority=3)
			public void Shimply_ClickOn_CartButton_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority)
			{ 
				TestInfo testInfo = new TestInfo();
				testInfo.setModuleName(moduleName);
				testInfo.setFlowName("ShimplyByState");
				testInfo.setTCName("Shimply_ClickOn_CartButton_Validate_UIControls");
		  	
				testInfo.setPlatform(platform);
		        testInfo.setBrowser(browser);
		        testInfo.setPriority(priority);
		        testInfo.setModule(module);
		        
		        CustomReporter reporter = new CustomReporter();
		        reporter.setTestInfo(testInfo);
				// Navigation to a particular page
		
				webUtils.navigateTo("http://www.shimply.com/");
				webUtils.wait(10);
				//webUtils.waitElementVisible(Constants.SHIMPLYPAGE, "lbl_login", 40);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_login", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_login", "Login", testInfo);
				
				webUtils.press(Constants.SHIMPLYPAGE, "lbl_login");
				webUtils.wait(10);
				
				webUtils.setValue(Constants.SHIMPLYPAGE, "txt_EmailName", "fntxautomation@gmail.com");
				webUtils.setValue(Constants.SHIMPLYPAGE, "txt_Password", "12345678");
				webUtils.wait(5);
				//webUtils.waitElementVisible(Constants.SHIMPLYPAGE, "btn_SignIn", 40);
				
				webUtils.press(Constants.SHIMPLYPAGE, "btn_SignIn");
				//webUtils.waitElementVisible(Constants.SHIMPLYPAGE, "lnk_CART", 40);
				webUtils.wait(10);
				if(webUtils.isAlertPresent()==true)
					webUtils.acceptAlert();;
				webUtils.press(Constants.SHIMPLYPAGE, "lnk_CART"); 
				webUtils.wait(10);
				 
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_ItemAddedToCart", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_ItemAddedToCart", "✓ Item was added to your cart", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_Item", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_Item", "Item", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_ProductName", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_ProductName", "Product Name", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_Quantity", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_Quantity", "Quantity", testInfo);
			
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_Price", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_Price", "Price", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_DeliveryDtl", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_DeliveryDtl", "Delivery Detail", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_SbTtl", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_SbTtl", "Sub Total", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_Action", testInfo);
				webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_Action", "Action", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "btn_ProcedToAdd", testInfo);
				
				webUtils.assertExist(Constants.SHIMPLYPAGE, "txt_Coupen", testInfo);
				webUtils.assertExist(Constants.SHIMPLYPAGE, "btn_Apply", testInfo);
				
				
				webUtils.navigateTo("http://www.shimply.com/");
				webUtils.wait(10);
				
				 webUtils.press(Constants.SHIMPLYPAGE, "btn_SignedName");
				 webUtils.wait(5);
				 
				 webUtils.press(Constants.SHIMPLYPAGE, "lnk_logout");
				 webUtils.wait(5);
				 
				 if(webUtils.isAlertPresent()==true)
						webUtils.acceptAlert();
			
				 webUtils.wait(5);
				
	}
	
	//Test case to validate the UI Controls of page displayed after click on By State
		@Parameters({ "platform","browser","version","nodeURL","moduleName", "module","priority" })
		@Test(description="Smply_15",priority=4)
		public void Shimply_ClickOn_HOMEDECOR_Button_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority)
		{
			
			TestInfo testInfo = new TestInfo();
			testInfo.setModuleName(moduleName);
			testInfo.setFlowName("ShimplyByState");
			testInfo.setTCName("Shimply_ClickOn_HOMEDECOR_Button_Validate_UIControls");

			testInfo.setPlatform(platform);
	        testInfo.setBrowser(browser);
	        testInfo.setPriority(priority);
	        testInfo.setModule(module);
	        
	        CustomReporter reporter = new CustomReporter();
	        reporter.setTestInfo(testInfo);
			// Navigate to a particular page
			webUtils.navigateTo("http://www.shimply.com/");
			webUtils.wait(10);

			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_login", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_login", "Login", testInfo);
			
			webUtils.press(Constants.SHIMPLYPAGE, "lbl_login");
			webUtils.wait(10);
			
			webUtils.setValue(Constants.SHIMPLYPAGE, "txt_EmailName", "fntxautomation@gmail.com");
			webUtils.setValue(Constants.SHIMPLYPAGE, "txt_Password", "12345678");
			webUtils.press(Constants.SHIMPLYPAGE, "btn_SignIn");
			webUtils.wait(10);
			
			if(webUtils.isAlertPresent()==true)
				webUtils.acceptAlert();
			
			webUtils.press(Constants.SHIMPLYPAGE, "lnk_HOMEDECOR"); 
			webUtils.wait(10);
			 
            List<Object> ExpectedElements = new ArrayList<Object>();
            
            ExpectedElements.add("Oval");
            ExpectedElements.add("Pillar");
            ExpectedElements.add("Rectangle");
            ExpectedElements.add("Rectangular");
            ExpectedElements.add("Round");
            ExpectedElements.add("Square");

             
            webUtils.assertOptionsbyLIbyList("ShimplyPage", "lst_HD_HomeDecrOnline", ExpectedElements, testInfo);
 
     		webUtils.navigateTo("http://www.shimply.com/");
     		webUtils.wait(10);
    		
     		webUtils.press(Constants.SHIMPLYPAGE, "btn_SignedName"); 
     		webUtils.wait(10);
   		 
     		webUtils.press(Constants.SHIMPLYPAGE, "lnk_logout");
     		webUtils.wait(10);
			 
     		if(webUtils.isAlertPresent()==true)
				webUtils.acceptAlert();
			
				
		}
		
		//Test case to validate the Logout functionality of Shimply website 
		@Parameters({ "platform","browser","version","nodeURL","moduleName", "module","priority" })
		@Test(description="Smply_09",priority=5)
		public void Shimply_Validate_LogOutFunctionality(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority)
		{ 
			TestInfo testInfo = new TestInfo();
			testInfo.setModuleName(moduleName);
	    	testInfo.setFlowName("ShimplyByState");
	    	testInfo.setTCName("Shimply_Validate_LogOutFunctionality");

	    	testInfo.setPlatform(platform);
	        testInfo.setBrowser(browser);
	        testInfo.setPriority(priority);
	        testInfo.setModule(module);
	        
	        CustomReporter reporter = new CustomReporter();
	        reporter.setTestInfo(testInfo);
	    	
			// Navigate to a particular page
			webUtils.navigateTo("http://www.shimply.com/");
			webUtils.wait(10);
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_Signup", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_Signup", "Sign up", testInfo);		
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_login", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_login", "Login", testInfo);
			
			webUtils.press(Constants.SHIMPLYPAGE, "lbl_login");
			webUtils.wait(10);
			
			webUtils.setValue(Constants.SHIMPLYPAGE, "txt_EmailName", "fntxautomation@gmail.com");
			webUtils.setValue(Constants.SHIMPLYPAGE, "txt_Password", "12345678");
			webUtils.press(Constants.SHIMPLYPAGE, "btn_SignIn");
			webUtils.wait(10);
			
			if(webUtils.isAlertPresent()==true)
				webUtils.acceptAlert();
			webUtils.press(Constants.SHIMPLYPAGE, "btn_SignedName"); 
			webUtils.wait(10);
			webUtils.press(Constants.SHIMPLYPAGE, "lnk_logout");
			webUtils.wait(10);
			if(webUtils.isAlertPresent()==true)
				webUtils.acceptAlert();
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_Signup", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_Signup", "Sign up", testInfo);
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_login", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_login", "Login", testInfo);
		}
		
		//Test case to validate the UI Controls of page displayed after click Food from State button
		@Parameters({ "platform","browser","version","nodeURL","moduleName", "module","priority" })
		@Test(description="Smply_17",priority=6)
		public void Shimply_ClickOn_FOODFROMSTATESButton_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority)
		{
			
			TestInfo testInfo = new TestInfo();
			testInfo.setModuleName(moduleName);
			testInfo.setFlowName("ShimplyByState");
			testInfo.setTCName("Shimply_ClickOn_FOODFROMSTATESButton_Validate_UIControls");

			testInfo.setPlatform(platform);
	        testInfo.setBrowser(browser);
	        testInfo.setPriority(priority);
	        testInfo.setModule(module);
	        
	        CustomReporter reporter = new CustomReporter();
	        reporter.setTestInfo(testInfo);
			// Navigate to a particular page
			webUtils.navigateTo("http://www.shimply.com/");
			webUtils.wait(10);
			
		
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_login", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_login", "Login", testInfo);
			
			webUtils.press(Constants.SHIMPLYPAGE, "lbl_login");
			webUtils.wait(10);
			
			webUtils.setValue(Constants.SHIMPLYPAGE, "txt_EmailName", "fntxautomation@gmail.com");
			webUtils.setValue(Constants.SHIMPLYPAGE, "txt_Password", "12345678");
			webUtils.press(Constants.SHIMPLYPAGE, "btn_SignIn");
			webUtils.wait(10);
			
			if(webUtils.isAlertPresent()==true)
				webUtils.acceptAlert();
			
			webUtils.press(Constants.SHIMPLYPAGE, "lnk_FoodFrmStates"); 
			webUtils.wait(10);
			 
            List<Object> ExpectedElements = new ArrayList<Object>();
            
            ExpectedElements.add("Assamica Agro Pvt Ltd");
            ExpectedElements.add("Anita Retail");
            ExpectedElements.add("Desi Karigar");
            ExpectedElements.add("Ghasitaram Gifts");
            ExpectedElements.add("Organo Snacks Cereal Industries");
            ExpectedElements.add("R.k.company");
            ExpectedElements.add("Aci Agro Solution");
            ExpectedElements.add("Zatara Tea Pvt Ltd");
            
            webUtils.assertOptionsbyLIbyList("ShimplyPage", "lst_FoodSupplier", ExpectedElements, testInfo);
            
            List<Object> ExpectedElements1 = new ArrayList<Object>();
            
            ExpectedElements.add("10% Off or More");
            ExpectedElements.add("25% Off or More");
            ExpectedElements.add("50% Off or More");
            ExpectedElements.add("75% Off or More");
            
            webUtils.assertOptionsbyLIbyList("ShimplyPage", "lst_FoodDiscount", ExpectedElements1, testInfo);
            
            List<Object> ExpectedElements2 = new ArrayList<Object>();
            
            ExpectedElements.add("Under Rs.100");
            ExpectedElements.add("Rs.100 to Rs.525");
            ExpectedElements.add("Rs.525 to Rs.950");
            ExpectedElements.add("Rs.950 to Rs.1,375");
            ExpectedElements.add("Above Rs.1,375");
            
            webUtils.assertOptionsbyLIbyList("ShimplyPage", "lst_FoodPrice", ExpectedElements2, testInfo);
 
     		webUtils.navigateTo("http://www.shimply.com/");
     		webUtils.wait(10);
     		webUtils.press(Constants.SHIMPLYPAGE, "btn_SignedName"); 
     		webUtils.wait(10);
     		webUtils.press(Constants.SHIMPLYPAGE, "lnk_logout");
			 
     		if(webUtils.isAlertPresent()==true)
				webUtils.acceptAlert();
			
				
		}
				
		//Test case to validate the UI Controls of page displayed after click on Books button
		@Parameters({ "platform","browser","version","nodeURL","moduleName", "module","priority" })
		@Test(description="Smply_18",priority=7)
		public void Shimply_ClickOn_BOOKSButton_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority)
		{
			
			TestInfo testInfo = new TestInfo();
			testInfo.setModuleName(moduleName);
			testInfo.setFlowName("ShimplyByState");
			testInfo.setTCName("Shimply_ClickOn_BOOKSButton_Validate_UIControls");

			testInfo.setPlatform(platform);
	        testInfo.setBrowser(browser);
	        testInfo.setPriority(priority);
	        testInfo.setModule(module);
	        
	        CustomReporter reporter = new CustomReporter();
	        reporter.setTestInfo(testInfo);
			// Navigate to a particular page
			webUtils.navigateTo("http://www.shimply.com/");
			webUtils.wait(10);
			
		
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_login", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_login", "Login", testInfo);
			
			webUtils.press(Constants.SHIMPLYPAGE, "lbl_login");
			webUtils.wait(10);
			
			webUtils.setValue(Constants.SHIMPLYPAGE, "txt_EmailName", "fntxautomation@gmail.com");
			webUtils.setValue(Constants.SHIMPLYPAGE, "txt_Password", "12345678");
			webUtils.press(Constants.SHIMPLYPAGE, "btn_SignIn");
			webUtils.wait(10);
			
			if(webUtils.isAlertPresent()==true)
				webUtils.acceptAlert();
			
			webUtils.press(Constants.SHIMPLYPAGE, "lnk_Books"); 
			webUtils.wait(10);
			 
            List<Object> ExpectedElements = new ArrayList<Object>();
            
            ExpectedElements.add("Atlantic Publishers Distributors Pvt Ltd");
            ExpectedElements.add("Atlantic Publishers & Distributors Pvt Ltd");
            ExpectedElements.add("Anita Books");
            ExpectedElements.add("Anita Imports");
            ExpectedElements.add("Compare Infobase Ltd.");
            ExpectedElements.add("D K Publishers Distributors P Ltd.");
            ExpectedElements.add("Dlb Infotech Pvt. Ltd");
            ExpectedElements.add("Dreamland Publications");
            ExpectedElements.add("Educational Book Centre");
            ExpectedElements.add("Global E-text");
            ExpectedElements.add("Gyan Books Pvt Ltd");
            ExpectedElements.add("Hindi Book Centre");
            
            
            webUtils.assertOptionsbyLIbyList("ShimplyPage", "lst_BookSupplier", ExpectedElements, testInfo);
            
            List<Object> ExpectedElements1 = new ArrayList<Object>();
            
            ExpectedElements.add("10% Off or More");
            ExpectedElements.add("25% Off or More");
            ExpectedElements.add("50% Off or More");
            ExpectedElements.add("75% Off or More");
            
            webUtils.assertOptionsbyLIbyList("ShimplyPage", "lst_BookDiscount", ExpectedElements1, testInfo);
            
            List<Object> ExpectedElements2 = new ArrayList<Object>();
            
            ExpectedElements.add("Under Rs.700");
            ExpectedElements.add("Rs.700 to Rs.1,150");
            ExpectedElements.add("Rs.1,150 to Rs.1,600");
            ExpectedElements.add("Rs.1,600 to Rs.2,050");
            ExpectedElements.add("Above Rs.2,050");
            
            webUtils.assertOptionsbyLIbyList("ShimplyPage", "lst_BookPrice", ExpectedElements2, testInfo);
            
            List<Object> ExpectedElements3 = new ArrayList<Object>();
            
            ExpectedElements.add("Hardcover");
            ExpectedElements.add("Paperback");
            
            webUtils.assertOptionsbyLIbyList("ShimplyPage", "lst_BookBinding", ExpectedElements3, testInfo);
 
     		webUtils.navigateTo("http://www.shimply.com/");
     		webUtils.wait(10);
     		webUtils.press(Constants.SHIMPLYPAGE, "btn_SignedName"); 
     		webUtils.wait(10);
     		webUtils.press(Constants.SHIMPLYPAGE, "lnk_logout");
			 
     		if(webUtils.isAlertPresent()==true)
				webUtils.acceptAlert();
									
		}
		
		// Test case to validate the UI Controls of page displayed after click on By State
		@Parameters({ "platform","browser","version","nodeURL","moduleName","module","priority" })
		@Test(description="Smply_19",priority=8)
		public void Shimply_ClickOn_OTHERSTORESButton_Validate_UIControls(String platform, String browser, String version,String nodeURL,String moduleName,String module,String priority)
		{ 
			TestInfo testInfo = new TestInfo();
			testInfo.setModuleName(moduleName);
			testInfo.setFlowName("ShimplyByState");
			testInfo.setTCName("Shimply_ClickOn_OTHERSTORESButton_Validate_UIControls");
	  	
			testInfo.setPlatform(platform);
	        testInfo.setBrowser(browser);
	        testInfo.setPriority(priority);
	        testInfo.setModule(module);
	        
	        CustomReporter reporter = new CustomReporter();
	        reporter.setTestInfo(testInfo);
			// Navigation to a particular page
			webUtils.navigateTo("http://www.shimply.com/");
			webUtils.wait(10);
		
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_login", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_login", "Login", testInfo);
			
			webUtils.press(Constants.SHIMPLYPAGE, "lbl_login");
			webUtils.wait(10);
			
			webUtils.setValue(Constants.SHIMPLYPAGE, "txt_EmailName","fntxautomation@gmail.com");
			webUtils.setValue(Constants.SHIMPLYPAGE, "txt_Password", "12345678");
			webUtils.press(Constants.SHIMPLYPAGE, "btn_SignIn");
			webUtils.wait(10);
			
			if(webUtils.isAlertPresent()==true)
				webUtils.acceptAlert();
			webUtils.press(Constants.SHIMPLYPAGE, "lnk_OtherStores"); 
			webUtils.wait(10);
			 
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_OtherStores", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_OtherStores", "Other Stores", testInfo);
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_Pet", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_Pet", "Pet Supplies", testInfo);
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_HrdwrAcc", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_HrdwrAcc", "Hardware and Accessories", testInfo);
			
			webUtils.assertExist(Constants.SHIMPLYPAGE, "lbl_AutoParts", testInfo);
			webUtils.assertText(Constants.SHIMPLYPAGE, "lbl_AutoParts", "Auto Parts and Accesories", testInfo);
			
			
			webUtils.navigateTo("http://www.shimply.com/");
			webUtils.wait(5);
			
			 webUtils.press(Constants.SHIMPLYPAGE, "btn_SignedName"); 
			 
			 webUtils.press(Constants.SHIMPLYPAGE, "lnk_logout");
			 
			 if(webUtils.isAlertPresent()==true)
					webUtils.acceptAlert();
					
			
}	
		
				
		@AfterClass
	   	public void Close() throws IOException {
			webUtils.wait(5);
	   		webUtils.closeBrowser();
	   	}
}