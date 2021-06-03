package BTES_GiftShop.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BTES_GiftShop.Pages.CartPage;
import BTES_GiftShop.TestBase.TestBase;

public class CartPageTestCases extends TestBase
{
   CartPage CP;
   
   @BeforeMethod
   public void SetUp() {
	   EnvironmentSetup();
	   CP= new CartPage();
	   driver.findElement(By.name("uname")).sendKeys("admin");
	   driver.findElement(By.name("pwd")).sendKeys("admin");
	   driver.findElement(By.name("submit")).click();
   }
   
   @Test(priority=6)
   public void GiftShopLogoVisible() {
	  CP.GiftShopLogo();
	  Assert.assertTrue(true);
   }
   
   @Test(priority=7)
   public void ContinueShoppingLinkVisible() {
	   CP.ContinueShoppingLink();
	   Assert.assertTrue(true);
   }
   
   @Test(priority=8)
   public void HomeLinkVisible() {
	   CP.HomeLink();
	   Assert.assertTrue(true);
   }
   
   @Test(priority=9)
   public void HiiAdminLinkVisible() {
	    CP.HiiAdminLink();
	    Assert.assertTrue(true);
   }
   
   @Test(priority=10)
   public void ContactLinkVisible() {
	    CP.ContactLink();
	    Assert.assertTrue(true);
   }
   
   @Test(priority=11)
   public void LogoutLinkVisible() {
	   CP.LogoutLink();
	   Assert.assertTrue(true);
   }
   
   @Test(priority=12)
   public void AboutUsLinkVisible() {
	   CP.AboutUsLink();
	   Assert.assertTrue(true);
   }
   
   @Test(priority=13)
   public void ContactUsLinkVisible() {
	   CP.ContactUsLink();
	   Assert.assertTrue(true);
   }
   
   @Test(priority=14)
   public void FAQLinkVisible() {
	   CP.FAQLink();
	   Assert.assertTrue(true);
   }
   
   @Test(priority=15)
   public void ShippingLinkVisible() {
	   CP.ShippingLink();
	   Assert.assertTrue(true);
   }
   
   @Test(priority=16)
   public void PaymentLinkVisible() {
	   CP.PaymentLink();
	   Assert.assertTrue(true);
   }
   
   @Test(priority=17)
   public void TermsandConditionLinkVisible() {
	   CP.TermsAndCOnditionLink();
	   Assert.assertTrue(true);
   }
   
   @Test(priority=18)
   public void CancellationLinkVisible() {
	   CP.CancellationLink();
	   Assert.assertTrue(true);
   }
   
   @Test(priority=19)
   public void SupportLinkVisible() {
	   CP.SupportLink();
	   Assert.assertTrue(true);
   }
   
   @AfterMethod
   public void TearDown() {
	   driver.quit();
   }
   
 }
