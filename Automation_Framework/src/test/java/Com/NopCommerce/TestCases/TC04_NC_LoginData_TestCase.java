package Com.NopCommerce.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.NopCommerce.BaseClass.TC01_NC_BaseClass;
import Com.NopCommerce.PageClass.TC01_NC_LoginPage;
import Com.NopCommerce.Utilities.XLUtils;


public class TC04_NC_LoginData_TestCase extends TC01_NC_BaseClass{

	
	@Test(dataProvider = "LoginData")
	public void LoginData(String user, String Pwd, String Expected) throws InterruptedException {
		
		logger.info("Open URL");
		TC01_NC_LoginPage TEL  = new TC01_NC_LoginPage();
		Thread.sleep(3000);
		TEL.SetUsername(user);
		System.out.println("Hello");
		logger.info("Enter user mail");
		Thread.sleep(3000);
		TEL.SetPassword(Pwd);
		logger.info("Enter User password");
		Thread.sleep(3000);
		TEL.ClickButton();
		logger.info("Clicked on longin button");
		String Actual_Result=driver.getTitle();
		String Expected_Result ="nopCommerce demo store";
		
		if(Expected.equals("Valid")) {
			
			if(Actual_Result.equals(Expected_Result)){
				TEL.Logout();
			    Assert.assertTrue(true);
			}	
			else {
				Assert.assertTrue(false);
			}
		}
		else if(Expected.equals("Invalid")) {
			 
			if(Expected_Result.equals(Actual_Result)) {
				TEL.Logout();
			    Assert.assertTrue(false);
			}
			else {
			    Assert.assertTrue(true);
			}

	}
		
	}
	
	@DataProvider(name = "LoginData")
	public String[][] getdata() throws IOException {
		
		String path =System.getProperty("user.dir")+"//src//main//java//Com//NopCommerce//TestData//30JulyTestData.xlsx";
	
	    int rownum=XLUtils.getRowCount(path, "Sheet1");
	    int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
	    
	    String logindata[][] = new String[rownum][colcount];
	    
	    for(int i=1;i<=rownum;i++) {
	    	
	    	for(int j=0;j<colcount;j++) {  //10 11 21
	    		 
	    		logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
	    	}
	    }
	    return logindata;
	    
	}
}
