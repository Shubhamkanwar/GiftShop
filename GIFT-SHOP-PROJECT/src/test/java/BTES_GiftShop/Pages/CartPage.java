package BTES_GiftShop.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BTES_GiftShop.TestBase.TestBase;

public class CartPage extends TestBase {
	
	@FindBy(xpath="//h1[@id='logo']/child::a")
	WebElement Logo;
	
	@FindBy(css="img[height=\"40\"]")
    WebElement ContinueShopping;
	
	@FindBy(css="table[width=\"100%\"]")
	WebElement TableDisplayed;
	
	@FindBy(linkText="Home")
	WebElement HomeLink;
	
	@FindBy(xpath="//a[text()='Contact']")
	WebElement Contact;
	
	@FindBy(xpath="//a[text()='Hii admin']")
	WebElement HiiAdmin;
	
	@FindBy(linkText="Logout")
	WebElement Logout;
	
	@FindBy(linkText="About Us")
	WebElement AboutUs;
	
	@FindBy(linkText="Contact Us")
	WebElement ContactUs;
	
	@FindBy(linkText="FAQ's")
	WebElement FAQ;
	
	@FindBy(linkText="Cancellations and returns")
	WebElement CancellationAndreturns;
	
	@FindBy(linkText="Shipping")
	WebElement Shipping;
	
	@FindBy(linkText="Payments")
	WebElement Payments;
	
	@FindBy(linkText="Terms And Conditions")
	WebElement Conditions;
	
	@FindBy(linkText="Support")
	WebElement Support;
	
	public CartPage() {
		PageFactory.initElements(driver, this); 
	}
	
	
	public boolean GiftShopLogo() {
	return	Logo.isDisplayed();
	}
	
	public boolean ContinueShoppingLink() {
		return ContinueShopping.isDisplayed();
	}
	
	public boolean HomeLink() {
		  return HomeLink.isDisplayed();
	}
	
	public boolean ContactLink() {
		  return Contact.isDisplayed();
	}
	
	public boolean HiiAdminLink() {
		  return HiiAdmin.isDisplayed();
	}
	
	public boolean LogoutLink() {
		 return Logout.isDisplayed();
	}
	
	public boolean AboutUsLink() {
		  return AboutUs.isDisplayed();
	}
	
	public boolean ContactUsLink() {
		  return ContactUs.isDisplayed();
	}
	
	public boolean FAQLink() {
		  return FAQ.isDisplayed();
	}
	
	public boolean ShippingLink() {
		  return Shipping.isDisplayed();
	}
	
	public boolean PaymentLink() {
		return Payments.isDisplayed();
	}
	
	public boolean CancellationLink() {
		  return CancellationAndreturns.isDisplayed();
	}
	
	public boolean TermsAndCOnditionLink() {
		return Conditions.isDisplayed();
	}
	
	public boolean SupportLink() {
		return Support.isDisplayed();
	}
	
}
