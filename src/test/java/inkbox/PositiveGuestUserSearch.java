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
import pageObjects.ProdSearch;
import pageObjects.ProductandCart;
import pageObjects.Upsell;
import resources.base;
//GUEST SEARCH & CHECKOUT 
//CART-- add
//Check box-CHECKED-Sign up for exclusive offers and news via text messages & email.
//Check box-NOT CHECKED-Get 20% Off Your Next Order
//Checkout page 
//UPSELL - add
//Gift card error message validation  -- NOT ABLE TO INSPECT GIFT CARD FIELD
//emtpysearch
public class PositiveGuestUserSearch extends base{
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
	public void validateGUSearch() throws IOException, InterruptedException
	{
		driver.navigate().refresh();
		Thread.sleep(3000);
	
		//CART
		By addtoCart=By.xpath("//*[@id=\"original-3967355945038-\"]/div[2]/div[2]/button");
		
		//emtpysearch
				ProdSearch esc=new ProdSearch(driver);
				esc.EmptySearchclick();
				 String url = driver.getCurrentUrl();
				 System.out.println("url is" + url);
				 String sURL = "https://inkbox.com/products/all-tattoos?";
				  if(url.equals(sURL))
				  {
				        System.out.println("Pass: URL is correct");
				        log.info("Pass: URL is correct");
				    }
				        else {
				            System.out.println("Fail: Wrong shop all url");
				            log.info("Fail: Wrong shop all url");
				        }
				  Thread.sleep(3000); 
	
		//search
		ProdSearch sc=new ProdSearch(driver);
		sc.Searchclick();
		
		ProdSearch ps=new ProdSearch(driver);
		ps.Search();
		
		//add to cart
		ProductandCart ct=new ProductandCart(driver);
		ct.pgus();
		
		 //UPSELL
			Upsell u=new Upsell(driver);
			u.upsell3();
		 
			ProductandCart ct1=new ProductandCart(driver);
			ct1.CartItems();
		 //CHECKOUT
			Checkout c=new Checkout(driver);
			c.validateCheckout();

		}
	
	

	  @AfterTest public void teardown() {
	  
	  driver.close();
	  
	 
	}
	 
	 

	

	
}



	

