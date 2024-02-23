package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest_Para {

	public static WebDriver driver;
	
	public void launchBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
	}
	
	public void tearDown() {
		driver.quit();
	}
	
}
