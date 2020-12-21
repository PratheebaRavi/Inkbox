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
import pageObjects.Upsell;
import pageObjects.ViewAll;
import resources.base;
//GUEST SEARCH & CHECKOUT 
//VIEW ALL & CART-- add, url validation
//Check box-CHECKED-Sign up for exclusive offers and news via text messages & email.
//Check box-NOT CHECKED-Get 20% Off Your Next Order
//Checkout page 
//UPSELL - add

public class GUJustDroppedBrowsePage extends base{
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
	public void validateJustDropped() throws IOException, InterruptedException
	{
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//VIEW ALL 
		ViewAll v=new ViewAll(driver);
		v.JustD();
	
		 //URL validation
		 String justdroppedUrl = driver.getCurrentUrl();
		 System.out.println("url is" + justdroppedUrl);
		 String expJDURL = "https://inkbox.com/products/all-tattoos?sort=newest";
		  if(justdroppedUrl.equals(expJDURL))
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
			ct.JustDroppedHP();
		
		 //UPSELL
			Upsell u1=new Upsell(driver);
			u1.upsell1();
		
		 //CHECKOUT
			Checkout c=new Checkout(driver);
			c.validateCheckout();
		
		}
	
	
	  @AfterTest 
	  public void teardown() {
      driver.close();
	  
	  	  }
	
}



	

