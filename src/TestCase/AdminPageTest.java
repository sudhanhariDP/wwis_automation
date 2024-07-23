package TestCase;


import org.testng.annotations.Test;

import adminmodule.AdminPage;
import adminmodule.DashBoardPage;
import seleniumbase.AdminBase;

public class AdminPageTest extends AdminBase {
	
	@Test(priority = 1)
	public void TestCase() {

		
		new AdminPage(driver)
		.enterUserName("wwis@admin.com")
		.enterPassword("N@rut0")
		.checkBox()
		.clickButton();
		
		
		new DashBoardPage(driver)
		.MoviesCardLink()
		.LocationsCardLink();
		
	}

    
}
