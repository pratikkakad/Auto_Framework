package webdriver_methods;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("pratik216@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pk215");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Not you?')]")).click();
		String URL = driver.getTitle();
		System.out.println(URL);
		String Title = driver.getCurrentUrl();
		System.out.println(Title);
		driver.navigate().to("https://www.zerodha.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Dimension d = new Dimension(200,250);
		driver.manage().window().setSize(d);
	    System.out.println(	driver.manage().window().getSize());
		Point p = new Point(400,600);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
		
		
		
		
		
		

	}

}
