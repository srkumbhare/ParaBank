package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Para {
	
	public WebDriver driver;
	
	@FindBy (xpath = "//input[@id='username']")
	private WebElement Username;
	
	@FindBy (xpath = "//input[@id='password']")
	private WebElement Password;
	
	@FindBy (xpath = "//span[@class='UICheckbox__PrivateCheckboxIcon-sc-1cz2mxu-4 kvyxXO private-checkbox__dash']//*[name()='svg']")
	private WebElement RememberMe;
	
	@FindBy (xpath = "//span[normalize-space()='Show Password']")
	private WebElement ShowPassword;
	
	public LoginPage_Para(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginApp() throws InterruptedException {
		Username.sendKeys("swap01@gmail.com");
		Thread.sleep(2000);	
		Password.sendKeys("prad@1990");
		Thread.sleep(3000);	
		}
	
	public void clickRememberMe() throws InterruptedException {
		RememberMe.click();
		Thread.sleep(3000);	
	}
	
	public void clickShowPass() throws InterruptedException {
		ShowPassword.click();
		Thread.sleep(3000);	
	}
				
	
	
}

