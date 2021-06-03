package BTES_GiftShop.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BTES_GiftShop.Pages.LoginPage;
import BTES_GiftShop.TestBase.TestBase;

public class LoginPageTestCases extends TestBase {
	
       LoginPage LP;	

	@BeforeSuite
		public void Setup() 
	{
		EnvironmentSetup();
		LP= new LoginPage();
	}
	
	@Test(priority=3)
	public void EnterUsername() {
		LP.enterUsername(prop.getProperty("username"));
	}
	
	@Test(priority=4)
	public void EnterPassword() {
		LP.enterPassword(prop.getProperty("password"));
	}
	
	@Test(priority=5)
	public void EnterLoginBtn() {
		LP.clickLoginBtn();
	}
	
	@Test(priority=1)
	public void SignupBtnDisplayed() {
	boolean validate= LP.ValidateSignUpBtn();
		Assert.assertTrue(validate);
	}
	
	@Test(priority=2)
	public void BackBtnDisplayed() {
	boolean validate= LP.ValidateBackBtn();
	Assert.assertTrue(validate);
	}
	
	@AfterSuite
	public void TearDown() {
	 driver.quit();
	}
	
	
	
}
