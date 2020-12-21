package inkbox;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Checkout;
import pageObjects.HeaderLinks;
import pageObjects.ProductandCart;
import pageObjects.QuantitySelector;
import resources.base;
//GUEST SEARCH & CHECKOUT 
//PDP - accordion, cart - add , remove, decrease to 0, quantity selector in PDP
//Check box-CHECKED-Sign up for exclusive offers and news via text messages & email.
//Check box-NOT CHECKED-Get 20% Off Your Next Order
//Checkout page 
//No UPSELL 
//ADD FAVOURITES

public class BundlesPDP extends base{
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
		
		//Quantity selector
		QuantitySelector qs=new QuantitySelector(driver);
				qs.quantitySelect();
				
		ProductandCart ct=new ProductandCart(driver);
		ct.BundlePDPcart();
			
			
//		//FAVORITES
//		By favourites =By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[1]/div[2]/div[6]/span[2]/button[1]");
//		driver.findElement(favourites).click();
//		Thread.sleep(5000);
		
	
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



	

