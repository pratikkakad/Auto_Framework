package Com.NopCommerce.BaseClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Com.NopCommerce.Utilities.TestUtils;
import Com.NopCommerce_Configuration.ReadConfiguration;
import net.bytebuddy.utility.RandomString;


public class TC01_NC_BaseClass {
	
	ReadConfiguration readconfig = new ReadConfiguration();	
	public String BaseURL = readconfig.getApplicationURL();
	public String username =readconfig.getUsername();
	public String password =readconfig.getPassword();


	public static WebDriver driver;
	public static Logger logger;
//	@Parameters("Browser")
	@BeforeMethod
	public void SetUp() {
		
		logger = logger.getLogger("maven_project");
		PropertyConfigurator.configure("Log4j.properties");
//		if(Browsernames.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
	    driver = new ChromeDriver();
		
//		else if(Browsernames.equals("Edge")) {
//		System.setProperty("webdriver.edge.driver",readconfig.getEdgeDriver());
//		driver = new EdgeDriver();
//		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		
		 driver.get(BaseURL);
	}
		
	public String getScreenshotAs(String TestCasename) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String Random =RandomString.make(5);
		String destination =System.getProperty("user.dir")+"/screen/"+TestCasename+""+Random+".png";
		FileUtils.copyFile(source,new File(destination));
		return destination;
	
//public String getScreenshotAs(String TestCasename) throws IOException {		
//		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//
//		File source = ts.getScreenshotAs(OutputType.FILE);
//
//		String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
//    	String Name = "- screen -"+Timestamp;
//
//		String destination = System.getProperty("user.dir") + "/screen/" + TestCasename + "" + Name + ".png";
//
//		FileUtils.copyFile(source, new File(destination));
//
//		return destination;
//			
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();

}
}