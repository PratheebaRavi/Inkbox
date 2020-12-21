package inkbox;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ProductandCart;
import pageObjects.QuantitySelector;
import pageObjects.Checkout;
import pageObjects.HeaderLinks;
import pageObjects.Upsell;
import resources.base;

// CART-- add, remove, quantity selector
//Check box-CHECKED-Sign up for exclusive offers and news via text messages & email.
//Check box-NOT CHECKED-Get 20% Off Your Next Order
//Checkout page 


public class FreehandInkPDP extends base{
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
	
	
	@Test
	public void validateFHPDP() throws IOException, InterruptedException
	{
		
		driver.navigate().refresh();
		Thread.sleep(3000);
	
		//free hand page
		HeaderLinks p=new HeaderLinks(driver);
		p.freehandBrowse();
	
		 
		 //PDP
		  ProductandCart ct=new ProductandCart(driver);
		  ct.FreehandinkPDP();
			//Quantity selector
			QuantitySelector qs=new QuantitySelector(driver);
					qs.quantitySelect();
					
					//add to cart
		  ProductandCart cart=new ProductandCart(driver);
		  cart.BundlePDPcart();
					
		
		
		 //CHECKOUT
		Checkout c=new Checkout(driver);
		c.validateCheckout();
		
		}
	
	
//	
//	  @AfterTest 
//	  public void teardown() {
//	 
//	  driver.close();
//	  
//	  
//	  }
	
	 

	

	
}



	

