package Com.NopCommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Com.NopCommerce.BaseClass.TC01_NC_BaseClass;

public class TC02_NC_AddToCart extends TC01_NC_BaseClass {

	//1.
	public TC02_NC_AddToCart() {
		
		PageFactory.initElements(driver, this);
	}	
	//2.	
//	@FindBy(xpath = "//a[contains(text(),'Computers ')]")
//	public WebElement Com;
	
	@FindBy(xpath = "//a[contains(text(),'Notebooks ')]")
	public WebElement Notebook;
	
	@FindBy(xpath = "(//a[contains(text(),'Apple MacBook Pro 13-inch')])[2]")
	public WebElement SelectMacbook;
	
	@FindBy(xpath="//button[@type=\"button\"]")
	private WebElement Addtocart;
	
	@FindBy(xpath = "//p[contains(text(),'The product has been added to your ')]")
	public WebElement Message;
		
	@FindBy(xpath = "//span[@title=\"Close\"]")
	public WebElement CloseTab;
		
	//3.
	public void NoteBook() {
		Notebook.click();
	}
	public void SelectProduct() {
		SelectMacbook.click();
	}
	public void AdsToCart() {
		Addtocart.click();
	}	
	public void ProductAdded() {
		Message.isDisplayed();
	}
	public void Close() {
		CloseTab.click();
	}
}

