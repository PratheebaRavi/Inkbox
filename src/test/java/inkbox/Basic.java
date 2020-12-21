package inkbox;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Favourites;
import resources.base;
//Add custom, freehand, discover, sale, how it works

public class Basic extends base{
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
	public void validateBS() throws IOException, InterruptedException
	{
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		Favourites f = new Favourites(driver);
		f.Bestsellerview();
		
				  
		}
	
	
	
//	  @AfterTest 
//	  public void teardown() {
//	 
//	  driver.close();
//	  
//	  
//	  }
	
	 

	

	
}



	

