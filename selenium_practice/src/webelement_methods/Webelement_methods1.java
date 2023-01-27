package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_methods1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("pratik216@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("pratik216@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pk215");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("pk215");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		boolean button = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).isEnabled();
		System.out.println(button);
		boolean button1 = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).isDisplayed();
		System.out.println(button1);
		boolean link = driver.findElement(By.xpath("//a[contains(text(),'Not you?')]")).isSelected();
		System.out.println(link);
	    String text = driver.findElement(By.xpath("//div[contains(text(),'Is this your account?')]")).getText();
	    System.out.println(text);

	}

}
