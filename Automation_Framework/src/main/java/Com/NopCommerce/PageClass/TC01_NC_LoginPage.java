package Com.NopCommerce.PageClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.NopCommerce.BaseClass.TC01_NC_BaseClass;


public class TC01_NC_LoginPage extends TC01_NC_BaseClass{
	
	public TC01_NC_LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	public WebElement Username;
	
	
	@FindBy(id = "Password")
	public WebElement Password;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	public WebElement LoginBtn;
	
	
	public void SetUsername(String Uname) {
		
		Username.sendKeys(Uname);		
	}
	public void SetPassword(String Pass) {
		Password.sendKeys(Pass);
	}
	public void ClickButton() {
		LoginBtn.click();
	}
	
		
	
	public void Logout() {
		// TODO Auto-generated method stub
		
	}
    }


