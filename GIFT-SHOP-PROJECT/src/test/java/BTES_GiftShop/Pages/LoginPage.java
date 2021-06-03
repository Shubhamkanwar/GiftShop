package BTES_GiftShop.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BTES_GiftShop.TestBase.TestBase;

public class LoginPage extends TestBase {

	 @FindBy(name="uname")
	 WebElement Username;
	 
	 @FindBy(name="pwd")
	 WebElement Password;
	 
	 @FindBy(name="submit")
	 WebElement Login;
	 
	 @FindBy(css="img[width='150']")
	 WebElement SignupBtn;
	 
	 @FindBy(xpath="/html/body/form/table/tbody/tr[4]/td/a/img")
	 WebElement BackBtn;
	 
	 public LoginPage()
	 {
		PageFactory.initElements(driver, this);
	 }
	
	 public void enterUsername(String username) {
		 Username.sendKeys(prop.getProperty("username"));
	 }
	 
	 public void enterPassword(String password) {
		 Password.sendKeys(prop.getProperty("password"));
	 }
	
	 public void clickLoginBtn() {
		 Login.click();
	 }
	 
	 public boolean ValidateSignUpBtn() {
		return  SignupBtn.isDisplayed();
	 }
	 
	 public boolean ValidateBackBtn() {
		return  BackBtn.isDisplayed();
	 }
	 
}
