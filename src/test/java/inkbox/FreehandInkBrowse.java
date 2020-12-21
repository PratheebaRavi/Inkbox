package inkbox;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ProductandCart;
import pageObjects.Checkout;
import pageObjects.HeaderLinks;
import pageObjects.Upsell;
import resources.base;

// CART-- add, url validation
//Check box-CHECKED-Sign up for exclusive offers and news via text messages & email.
//Check box-NOT CHECKED-Get 20% Off Your Next Order
//Checkout page 
//UPSELL - add

public class FreehandInkBrowse extends base{
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
	
		//free hand page
		HeaderLinks p=new HeaderLinks(driver);
		p.freehandBrowse();
	
		 //URL validation
		 String freehandUrl = driver.getCurrentUrl();
		 System.out.println("url is" + freehandUrl);
		 String expFHURL = "https://inkbox.com/freehand-ink";
		  if(freehandUrl.equals(expFHURL))
		  {
		        System.out.println("Pass: URL is correct");
		        log.info("Pass: URL is correct");
		    }
		        else {
		            System.out.println("Fail: Wrong bundle url");
		            log.info("Fail: Wrong bundle url");
		        }
		 //add to cart
		  ProductandCart ct=new ProductandCart(driver);
		  ct.FreehandinkBrwse();
					
		 //UPSELL
			Upsell u4=new Upsell(driver);
			u4.upsell4();
		
		 //CHECKOUT
		Checkout c=new Checkout(driver);
		c.validateCheckout();
		
		}
	
	
	
	  @AfterTest 
	  public void teardown() {
	 
	  driver.close();
	  
	  
	  }
	
	 

	

	
}



	

