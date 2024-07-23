package adminmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import seleniumbase.AdminBase;


public class AdminPage extends AdminBase {
	
//	WebDriver driver = null;
	

	public AdminPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public AdminPage enterUserName(String UserName) {
		
		driver.findElement(By.id("username")).sendKeys("wwis@admin.com");
		return this;
		
		
	}
	
	public AdminPage enterPassword(String Password) {
		
		driver.findElement(By.id("password")).sendKeys("N@rut0");
		return this;
		
	}
	
	public AdminPage checkBox() {
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/form[1]/label[1]")).click();
		return this;
		
	}
	
	public DashBoardPage clickButton() {
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		return new DashBoardPage(driver);
		
	}
	
	public MoviesPage clickButton2() {
		driver.findElement(By.xpath("//a[@href='/movies']"));
		return new MoviesPage();
		
	}
	
	

	public void login(String UserName, String Password) {
		driver.switchTo().frame(0);
		enterUserName(UserName);
		enterPassword(Password);
		checkBox();
		clickButton();
		
	}
}
