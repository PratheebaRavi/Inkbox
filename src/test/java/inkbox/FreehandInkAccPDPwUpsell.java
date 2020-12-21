package inkbox;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ProductandCart;
import pageObjects.Upsell;
import pageObjects.Checkout;
import pageObjects.HeaderLinks;
import pageObjects.PDPBlocks;
import resources.base;
// CART-- add
//Check box-CHECKED-Sign up for exclusive offers and news via text messages & email.
//Check box-NOT CHECKED-Get 20% Off Your Next Order
//Checkout page 


public class FreehandInkAccPDPwUpsell extends base{
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
	public void validateFHBS() throws IOException, InterruptedException
	{
		
		driver.navigate().refresh();
		Thread.sleep(3000);
	
			
		//freehand page
		HeaderLinks p=new HeaderLinks(driver);
		p.freehandBrowse();
	
		 
		
		 //PDP
		  ProductandCart Ict=new ProductandCart(driver);
		  Ict.FreehandinkPDP();
		//add to cart
		  ProductandCart cart=new ProductandCart(driver);
		  cart.FreehandInkAcccartwUpsell();
		  driver.navigate().back();
		  Thread.sleep(5000);
		  driver.navigate().back();
		  Thread.sleep(5000);
		  ProductandCart Act=new ProductandCart(driver);
		  Act.FreehandaccPDP();
		  ProductandCart Acart=new ProductandCart(driver);
		  Acart.FreehandInkAcccartwUpsell();
		
			
		 //CHECKOUT
		Checkout c=new Checkout(driver);
		c.validateCheckout();
		
		}
	
	
	
//	  @AfterTest 
//	  public void teardown() {
//	 
//	  driver.close();
//	  
//	  
//	  }
	
	 

	

	
}



	

