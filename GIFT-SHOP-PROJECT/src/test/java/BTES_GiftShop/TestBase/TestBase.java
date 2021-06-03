package BTES_GiftShop.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
     public static WebDriver driver;
	public static Properties prop;
	 
	 public TestBase()
	 {
		
	try {
    
		FileInputStream input = new FileInputStream("C:\\Users\\Shubham\\eclipse-workspace\\GIFT-SHOP-PROJECT\\src\\test\\java\\BTES_GiftShop\\configuration\\config.properties");
       prop   = new Properties();
       prop.load(input);
	    }
	catch (FileNotFoundException e) {
			e.printStackTrace();
	    } 
	catch (IOException e) {
		    e.printStackTrace();
	    }
	
	}
	 
	 public void EnvironmentSetup() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	 }
	 
}	

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

