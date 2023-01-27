package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class Listbox1 {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/");
		
		
	    driver.findElement(By.xpath("(//a[@class=\"button tiny_button button_pale regular_text\"])[10]")).click();
//	    
//		Select ct = new Select(country);
//		ct.selectByVisibleText("India");

	}

}
