package inkbox;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Checkout;
import pageObjects.PDPBlocks;
import pageObjects.ProductandCart;
import pageObjects.QuantitySelector;
import pageObjects.Upsell;
import resources.base;
//GUEST SEARCH & CHECKOUT 
//PDP - accordion, cart, quantity selector
//Check box-CHECKED-Sign up for exclusive offers and news via text messages & email.
//Check box-NOT CHECKED-Get 20% Off Your Next Order
//Checkout page 
//UPSELL - add
//ADD FAVOURITES

public class PDP extends base{
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
	public void validatePDP() throws IOException, InterruptedException
	{

		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//PRODUCT
		
		ProductandCart p=new ProductandCart(driver);
		p.PDPprod();
		
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
						
		//Quantity selector
		QuantitySelector qs=new QuantitySelector(driver);
		qs.quantitySelect();
		
		By thingstoKnow=By.xpath("//*[@id=\"stop-sticky\"]/div/dl/div[1]/dt/button");
		driver.findElement(thingstoKnow).click();
		driver.findElement(thingstoKnow).click();
				
			
//		//FAVORITES
//		By favourites =By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[1]/div[2]/div[6]/span[2]/button[1]");
//		driver.findElement(favourites).click();
//		Thread.sleep(5000);
		
		//CART
		ProductandCart cerr=new ProductandCart(driver);
		cerr.CartError();
		
		ProductandCart ct=new ProductandCart(driver);
		ct.PDPcart();
//		ProductandCart ct1=new ProductandCart(driver);
//		ct1.CartItems();
		
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



	

