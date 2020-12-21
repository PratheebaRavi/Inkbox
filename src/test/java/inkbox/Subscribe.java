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

import resources.base;
//GUEST SEARCH & CHECKOUT 
//PDP - accordion, cart
//Check box-CHECKED-Sign up for exclusive offers and news via text messages & email.
//Check box-NOT CHECKED-Get 20% Off Your Next Order
//Checkout page 
//UPSELL - add
//ADD FAVOURITES

public class Subscribe extends base{
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
	public void validateSubscription() throws IOException, InterruptedException
	{

		driver.navigate().refresh();
		Thread.sleep(3000);
		
		By sub=By.cssSelector("#subscribe_email_default");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 driver.findElement(sub).click();
			Thread.sleep(3000);
			driver.findElement(sub).sendKeys("testuser@gmail.com");
			Thread.sleep(3000);
			driver.findElement(sub).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			By submsg = By.xpath("/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]");
			String actual_msg = driver.findElement(submsg).getText();
			String expError = "Successfully subscribed to our email list!";
			if (actual_msg.equals(expError)) {
				System.out.println("Pass: E-mail error message validated");
				log.info("Pass: E-mail error message validated");
			} else {
				System.out.println("Fail: E-mail error message is not displayed");
				log.info("Fail: E-mail error message is not displayed");
			}
	
				}
	
	@AfterTest 
	  public void teardown() {
 
	  driver.close();
	  
 	  }
	
}



	

