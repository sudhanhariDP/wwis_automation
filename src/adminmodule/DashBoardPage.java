package adminmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import TestCase.AdminPageTest;

public class DashBoardPage extends AdminPageTest {
	

	public DashBoardPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public DashBoardPage MoviesCardLink() {
		driver.findElement(By.xpath("//a[@href='/movies']")).click();
		return this;
	}
	
	public DashBoardPage LocationsCardLink() {
		driver.findElement(By.xpath("//a[@href='/location']")).click();
		return this;
	}

	

}
