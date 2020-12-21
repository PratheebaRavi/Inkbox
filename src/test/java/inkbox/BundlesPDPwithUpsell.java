package inkbox;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Checkout;
import pageObjects.HeaderLinks;
import pageObjects.PDPBlocks;
import pageObjects.ProductandCart;
import pageObjects.QuantitySelector;
import pageObjects.Upsell;
import resources.base;
//GUEST SEARCH & CHECKOUT 
//PDP - accordion, cart
//Check box-CHECKED-Sign up for exclusive offers and news via text messages & email.
//Check box-NOT CHECKED-Get 20% Off Your Next Order
//Checkout page 
//With UPSELL 


public class BundlesPDPwithUpsell extends base{
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
	public void validateBundlesPDP() throws IOException, InterruptedException
	{

		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//bundles page
		HeaderLinks p=new HeaderLinks(driver);
		p.Bundle();
	
		
		//PRODUCT
		ProductandCart bp=new ProductandCart(driver);
		bp.Bundleprod();
		
		//TD
		PDPBlocks td=new PDPBlocks(driver);
		td.validateDiscount();
		//You may also like
				PDPBlocks ym=new PDPBlocks(driver);
				ym.validateYouMay();
		//Shop insta
				PDPBlocks si=new PDPBlocks(driver);
				si.validateShopInsta();
				
				//FAQ
				PDPBlocks f=new PDPBlocks(driver);
				f.validateFAQ();
		ProductandCart ct=new ProductandCart(driver);
		ct.BundlePDPcartwUpsell();
			
		// UPSELL
				Upsell pu=new Upsell(driver);
				pu.PDPupsell();
	
		 //CHECKOUT
				Checkout c=new Checkout(driver);
				c.validateCheckout();
	
				}
	
//	@AfterTest 
//	  public void teardown() {
// 
//	  driver.close();
//	  
// 	  }
	
}



	

