package inkbox;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.ProdSearch;
import resources.base;
//GUEST SEARCH & CHECKOUT 
//HOMEPAGE & CART-- add
//Check box-CHECKED-Sign up for exclusive offers and news via text messages & email.
//Check box-NOT CHECKED-Get 20% Off Your Next Order
//Checkout page 
//UPSELL - add

public class HeroBanner extends base{
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
	public void validateSearch() throws IOException, InterruptedException
	{

		driver.navigate().refresh();
		Thread.sleep(3000);
		By search=By.id("search-field-input");
		
		//CART
		By addtoCart=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]/*[1]");
		
		 driver.findElement(addtoCart).click();
		 Thread.sleep(5000);
		
		
		 //CHECKOUT
		 By checkoutButton=By.id("cart-checkout-button-main");
		 By checkoutemail=By.id("checkout_email");
		 By firstName=By.id("checkout_shipping_address_first_name");
		 By lastName=By.id("checkout_shipping_address_last_name");
		 By address=By.id("checkout_shipping_address_address1");
		 By phone=By.id("checkout_shipping_address_phone");
		 By submit=By.id("continue_button");
		 By payment=By.id("continue_button");
		
		 driver.findElement(checkoutButton).click();
		 Thread.sleep(5000);
		 log.info("Clicked checkout");
		 driver.findElement(checkoutemail).click();
		 driver.findElement(checkoutemail).clear();
		 driver.findElement(checkoutemail).sendKeys("inkcustomer@gmail.com");
		 Thread.sleep(3000);
		 driver.findElement(firstName).click();
		 driver.findElement(firstName).clear();
		 driver.findElement(firstName).sendKeys("TestFN");
		 Thread.sleep(3000);
		 driver.findElement(lastName).click();
		 driver.findElement(lastName).clear();
		 driver.findElement(lastName).sendKeys("TestLN");
		 Thread.sleep(3000);
		 driver.findElement(address).click();
		 driver.findElement(address).clear();
		 driver.findElement(address).sendKeys("393 ");
		 Thread.sleep(3000);
		 List<WebElement> options =driver.findElements(By.cssSelector("li[class='combo-box__option'] div"));
		 for(WebElement option :options)

		 {
			 Thread.sleep(5000);
		 if(option.getText().equalsIgnoreCase("393 King Street West, Toronto, ON, Canada"))
			 Thread.sleep(5000);
		 {

		 option.click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//body")).click();
		 break;

		 }
		 }
		 driver.findElement(phone).click();
		 driver.findElement(phone).clear();
		 driver.findElement(phone).sendKeys("1234567890");
		 Thread.sleep(3000);
		  
		 driver.findElement(submit).submit();
		 Thread.sleep(5000);
		 driver.findElement(payment).submit(); 
		 Thread.sleep(5000);
		
		}
	
	
	
	  @AfterTest 
	  public void teardown() {
	 
	  driver.close();
	  
	  
	  }
	
	 

	

	
}



	

