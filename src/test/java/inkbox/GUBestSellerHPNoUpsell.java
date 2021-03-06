package inkbox;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ProductandCart;
import pageObjects.Checkout;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.ProdSearch;
import resources.base;
//GUEST SEARCH & CHECKOUT 
//HOMEPAGE & CART-- add
//Check box-CHECKED-Sign up for exclusive offers and news via text messages & email.
//Check box-NOT CHECKED-Get 20% Off Your Next Order
//Checkout page 
//UPSELL - add

public class GUBestSellerHPNoUpsell extends base{
	public WebDriver driver;
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 log.info("Driver is initialized");
			
		driver.get(prop.getProperty("url"));
		 log.info("Navigated to Home page");
		driver.manage().window().maximize();
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void validateBSHP() throws IOException, InterruptedException
	{

		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//CART
		ProductandCart ct=new ProductandCart(driver);
		ct.BestSellerHPNoUpsell();
				
		 //CHECKOUT
			Checkout c=new Checkout(driver);
			c.validateCheckout();
		
		}
	
	
	
	  @AfterTest 
	  public void teardown() {
	 
	  driver.close();
	  
	  
	  }
	
	 

	

	
}



	

