package seleniumbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AdminBase {
	
	String URL = "http://wherewasitshoot.s3-website.ap-south-1.amazonaws.com/admin";
	
	protected RemoteWebDriver driver= null;
	
	@BeforeMethod
	public void StartApp() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);	
		
	}
	
	@AfterMethod
	public void CloseApp() {
		driver.quit();
	}

}
