package Com.NopCommerce.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import Com.NopCommerce.BaseClass.TC01_NC_BaseClass;
import Com.NopCommerce.PageClass.TC01_NC_LoginPage;
import Com.NopCommerce.PageClass.TC02_NC_AddToCart;

public class TC02_NC_AddToCart_TestCase extends TC01_NC_BaseClass {
	@Test
	public void AddProduct() throws InterruptedException, IOException {
		logger.info("Open URL");
		TC01_NC_LoginPage  TEL = new TC01_NC_LoginPage();
		Thread.sleep(3000);
		TEL.SetUsername(username);
		System.out.println("Hello");
		logger.info("Enter user mailL");
		Thread.sleep(3000);
		TEL.SetPassword(password);
		logger.info("Enter User password");
		Thread.sleep(3000);
		TEL.ClickButton();
		logger.info("Clicked on longin button");
		Thread.sleep(3000);

		TC02_NC_AddToCart TEA = new TC02_NC_AddToCart();

		Actions Act = new Actions(driver);

		WebElement Computer = driver.findElement(By.xpath("//a[contains(text(),'Computers ')]"));

		Act.moveToElement(Computer).perform();
		logger.info("Mouseover on computer");

		TEA.NoteBook();
		logger.info("Clicked on NotebookText");

		TEA.SelectProduct();
		logger.info("Product selected");

		TEA.AdsToCart();
		logger.info("Add to cart");

		TEA.ProductAdded();
		logger.info("Verified message");

		TEA.Close();
		logger.info("Clciked on close Tab");

	}

}
