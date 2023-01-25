package Com.NopCommerce.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.NopCommerce.BaseClass.TC01_NC_BaseClass;
import Com.NopCommerce.PageClass.TC01_NC_LoginPage;

public class TC01_NC_Login_TestCase extends TC01_NC_BaseClass {
	
	@Test
	public void LoginTestCases() throws InterruptedException, IOException {
		
		logger.info("open commerce URL");
		
		TC01_NC_LoginPage LP = new TC01_NC_LoginPage();
		
		LP.SetUsername(username);
		logger.info("enter email");
		Thread.sleep(2000);

		LP.SetPassword(password);
		logger.info("enter password");
		Thread.sleep(2000);

		LP.ClickButton();
		logger.info("click into login button");
		Thread.sleep(4000);
		
//		String expectedTitle ="nopCommerce demo store";
//        String actualTitle =driver.getTitle();
//        if(expectedTitle.equals(actualTitle)) {
//        	System.out.println("Verification successful");
//        }else
//        {
//        	System.out.println("unsuccessful");
//        }
//		
		if(driver.getTitle().equals("nopCommerce demo store")) {
			
			Assert.assertTrue(true);
			logger.info("Login success");

		}
		else 
		{
			getScreenshotAs("LoginTestCases");
			Assert.assertTrue(false);
//			getScreenshotAs("LoginTestCase");
			logger.info("login unsuccessfull");

		}
		

}
}