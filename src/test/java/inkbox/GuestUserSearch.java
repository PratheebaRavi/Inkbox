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
import pageObjects.ProdSearch;
import pageObjects.Upsell;
import resources.base;

//GUEST SEARCH & CHECKOUT 
//CART-- add, remove, increase, decrease cart, empty cart error message
//Check box-CHECKED-Sign up for exclusive offers and news via text messages & email.
//Check box-NOT CHECKED-Get 20% Off Your Next Order
//Checkout page - wrong format text fields error message validation
//UPSELL - add, reduce, remove
public class GuestUserSearch extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Driver is initialized");

		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home page");
		driver.manage().window().maximize();
	}

	
	@Test
	public void validateSearch() throws IOException, InterruptedException {

		driver.navigate().refresh();
		Thread.sleep(3000);
	
		// CART
		ProductandCart cerr=new ProductandCart(driver);
		cerr.CartError();
		
		ProdSearch s=new ProdSearch(driver);
		s.Search();
		
		ProductandCart ct=new ProductandCart(driver);
		ct.allCart();
		
		 //UPSELL
		Upsell u2=new Upsell(driver);
		u2.upsell2();
		
		//Upsell block check
		Upsell ub=new Upsell(driver);
		ub.validateFreqSoldWith();
		
		// CHECKOUT
		Checkout ce=new Checkout(driver);
		ce.validateCheckoutError();
	}


	  @AfterTest 
	  public void teardown() {
	  
	  driver.close();
	  
	  
	  }
	 

}
