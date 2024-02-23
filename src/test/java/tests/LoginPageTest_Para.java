package tests;

import org.testng.annotations.*;
import org.testng.annotations.Test;

import pages.LoginPage_Para;

public class LoginPageTest_Para extends BaseTest_Para{
	
	public LoginPage_Para lp;
	
	public void initObjects() {
		lp = new LoginPage_Para(driver);
	}
	
	@BeforeClass
	public void init() throws InterruptedException {
		launchBrowser();
		initObjects();
	}
	
  @Test (priority = 1)
  public void enterCred() throws InterruptedException {
	  lp.loginApp();
  }
  
  @Test (priority = 3)
  public void clickChechBox() throws InterruptedException {
	  lp.clickRememberMe();
  }
  
  @Test (priority = 2)
  public void clickPassLink() throws InterruptedException {
	  lp.clickShowPass();
  }
  
  @AfterClass
  public void closeBrowser() throws InterruptedException {
	  Thread.sleep(2000);
	  tearDown();
  }
}
