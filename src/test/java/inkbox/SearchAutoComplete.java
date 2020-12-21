package inkbox;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Checkout;
import pageObjects.ProdSearch;
import pageObjects.ProductandCart;
import pageObjects.Upsell;
import resources.base;

public class SearchAutoComplete extends base{
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
	public void validateGUSearchAutoComplete() throws IOException, InterruptedException
	{
		driver.navigate().refresh();
		Thread.sleep(3000);
	
		
		
	
		By search=By.id("search-field-input");
		//search
		 driver.findElement(search).click();
			Thread.sleep(3000);
		driver.findElement(search).sendKeys("cho");
		Thread.sleep(3000);
		Thread.sleep(3000);
		By opt3=By.xpath("//body/div[@id='site-content']/div[@id='nav-sticky']/div[@id='nav-main']/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/a[4]");
		
		String searchedtext=driver.findElement(opt3).getText();
		driver.findElement(opt3).click();
		Thread.sleep(3000);
		By searchpdp=By.xpath("//*[@id=\"browse\"]/div[1]/h3");
		String actualtext=driver.findElement(searchpdp).getText();
		String searchUrl = driver.getCurrentUrl();
		System.out.println("search text is"+searchedtext);
		System.out.println("search url is"+searchUrl);
		System.out.println("search term is"+actualtext);
		if(actualtext.contains(searchedtext)&&searchUrl.contains(searchedtext))
		{
			System.out.println("Pass: Compared search term with url and results");
			log.info("Pass: Compared search term with url and results");
		
		} 
		else {
			
			System.out.println("Fail: search term, url and results mismatch");
			log.info("Fail: search term, url and results mismatch");
			
		}
		}
	
	

	  @AfterTest public void teardown() {
	  
	  driver.close();
	  
	  }
	}
	 
	 

	

	




	

