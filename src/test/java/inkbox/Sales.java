package inkbox;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Checkout;
import pageObjects.ProductandCart;
import pageObjects.Sale;
import pageObjects.ViewAll;
import resources.base;
//sales nav
//Compare to price
// add & check out

public class Sales extends base{
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
	public void validateSales() throws IOException, InterruptedException
	{

		driver.navigate().refresh();
		Thread.sleep(3000);
		
		Sale s=new Sale(driver);
		s.SalesNav();
		
		Sale s1=new Sale(driver);
		s1.ComparePrice();
		
		ProductandCart p=new ProductandCart(driver);
		p.saleProduct();
		
		Checkout c=new Checkout(driver);
		c.validateCheckout();
				}
	
	@AfterTest 
	  public void teardown() {
 
	  driver.close();
	  
 	  }
	
}



	

