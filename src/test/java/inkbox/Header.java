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
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ProductandCart;
import pageObjects.Checkout;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.ProdSearch;
import pageObjects.Upsell;
import pageObjects.ViewAll;
import resources.base;
//Add custom, freehand, discover, sale, how it works

public class Header extends base{
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
	public void validateBS() throws IOException, InterruptedException
	{
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//SHOP
		By Shopmegamenu = By.xpath("//*[@id=\"nav-links\"]/div[1]/a[2]");
		driver.findElement(Shopmegamenu).click();
		 Thread.sleep(3000);
		 String shopurl = driver.getCurrentUrl();
		 System.out.println("url is" + shopurl);
		 String expshopURL = "https://inkbox.com/products/all-tattoos?";
		  if(shopurl.equals(expshopURL))
		  {
		        System.out.println("Pass: URL is correct");
		        log.info("Pass: URL is correct");
		    }
		        else {
		            System.out.println("Fail: Wrong shop url");
		            log.info("Fail: Wrong shop url");
		        }
		  Thread.sleep(3000);
		//Best seller
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"nav-links\"]/div[1]/a[2]"));
		action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//body/div[@id='site-content']/div[@id='nav-sticky']/div[@id='nav-links']/div[@id='mega-menu']/section[@id='mega-menu-content']/nav[@id='menu-template-content']/div[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))).click().build().perform();
	
		 String bestsellerUrl = driver.getCurrentUrl();
		 System.out.println("url is" + bestsellerUrl);
		 String expBSURL = "https://inkbox.com/products/all-tattoos?";
		  if(bestsellerUrl.equals(expBSURL))
		  {
		        System.out.println("Pass: URL is correct");
		        log.info("Pass: URL is correct");
		    }
		        else {
		            System.out.println("Fail: Wrong best seller url");
		            log.info("Fail: Wrong best seller url");
		        }
		  Thread.sleep(3000);
		
		  //Free hand - prokit
			Actions act = new Actions(driver);
			WebElement pk = driver.findElement(By.xpath("//*[@id=\"nav-links\"]/div[1]/a[2]"));
			action.moveToElement(pk).moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Pro Kit')]"))).click().build().perform();
		
			 String prokitUrl = driver.getCurrentUrl();
			 System.out.println("url is" + prokitUrl);
			 String expPKURL = "https://inkbox.com/products/freehand-pro-kit?artist_name=inkbox";
			  if(prokitUrl.equals(expPKURL))
			  {
			        System.out.println("Pass: URL is correct");
			        log.info("Pass: URL is correct");
			    }
			        else {
			            System.out.println("Fail: Wrong prokit url");
			            log.info("Fail: Wrong prokit url");
			        }
			  Thread.sleep(3000);
			//Free hand - 0.5 shading
				Actions shade = new Actions(driver);
				WebElement sh = driver.findElement(By.xpath("//*[@id=\"nav-links\"]/div[1]/a[2]"));
				action.moveToElement(sh).moveToElement(driver.findElement(By.xpath("//a[contains(text(),'0.5oz Shading Ink')]"))).click().build().perform();
			
				 String shadingUrl = driver.getCurrentUrl();
				 System.out.println("url is" + shadingUrl);
				 String expshURL = "https://inkbox.com/products/0-5-ounce-freehand-shading-ink";
				  if(shadingUrl.equals(expshURL))
				  {
				        System.out.println("Pass: URL is correct");
				        log.info("Pass: URL is correct");
				    }
				        else {
				            System.out.println("Fail: Wrong 0.5 shading url");
				            log.info("Fail: Wrong 0.5 shading url");
				        }
				  Thread.sleep(3000);
				//Free hand - 1oz 
					Actions oz1 = new Actions(driver);
					WebElement oz = driver.findElement(By.xpath("//*[@id=\"nav-links\"]/div[1]/a[2]"));
					action.moveToElement(oz).moveToElement(driver.findElement(By.xpath("//a[contains(text(),'0.5oz Shading Ink')]"))).click().build().perform();
				
					 String ozUrl = driver.getCurrentUrl();
					 System.out.println("url is" + ozUrl);
					 String expozURL = "https://inkbox.com/products/1-ounce-freehand-ink";
					  if(ozUrl.equals(expozURL))
					  {
					        System.out.println("Pass: 1ozURL is correct");
					        log.info("Pass: 1oz URL is correct");
					    }
					        else {
					            System.out.println("Fail: Wrong 1oz url");
					            log.info("Fail: Wrong 1oz url");
					        }
					  Thread.sleep(3000);
					  
					//Free hand - 0.5 freehandink 
						Actions fi1 = new Actions(driver);
						WebElement fi = driver.findElement(By.xpath("//*[@id=\"nav-links\"]/div[1]/a[2]"));
						action.moveToElement(fi).moveToElement(driver.findElement(By.xpath("//a[contains(text(),'0.5oz Shading Ink')]"))).click().build().perform();
					
						 String fiUrl = driver.getCurrentUrl();
						 System.out.println("url is" + fiUrl);
						 String expfiURL = "https://inkbox.com/products/0-5-ounce-freehand-ink?artist_name=inkbox";
						  if(fiUrl.equals(expfiURL))
						  {
						        System.out.println("Pass: 1ozURL is correct");
						        log.info("Pass: 1oz URL is correct");
						    }
						        else {
						            System.out.println("Fail: Wrong 1oz url");
						            log.info("Fail: Wrong 1oz url");
						        }
						  Thread.sleep(3000);
						  
						//Free hand -all
							Actions allfh1 = new Actions(driver);
							WebElement allfh = driver.findElement(By.xpath("//*[@id=\"nav-links\"]/div[1]/a[2]"));
							action.moveToElement(allfh).moveToElement(driver.findElement(By.xpath("//a[contains(text(),'All Freehand Ink')]"))).click().build().perform();
						
							 String allfhUrl = driver.getCurrentUrl();
							 System.out.println("url is" + allfhUrl);
							 String expfhURL = "https://inkbox.com/freehand-ink";
							  if(allfhUrl.equals(expfhURL))
							  {
							        System.out.println("Pass: all freehand URL is correct");
							        log.info("Pass: all freehand URL is correct");
							    }
							        else {
							            System.out.println("Fail: Wrong all freehand  url");
							            log.info("Fail: Wrong all freehand url");
							        }
							  Thread.sleep(3000);
							  

								//Moisturizer
									Actions moi = new Actions(driver);
									WebElement mo = driver.findElement(By.xpath("//*[@id=\"nav-links\"]/div[1]/a[2]"));
									action.moveToElement(mo).moveToElement(driver.findElement(By.xpath("//body/div[@id='site-content']/div[@id='nav-sticky']/div[@id='nav-links']/div[@id='mega-menu']/section[@id='mega-menu-content']/nav[@id='menu-template-content']/div[1]/ul[1]/li[2]/ul[1]/li[6]/ul[1]/li[1]/a[1]"))).click().build().perform();
								
									 String moUrl = driver.getCurrentUrl();
									 System.out.println("url is" + moUrl);
									 String expmoURL = "https://inkbox.com/products/1oz-tattoo-moisturizer-no?artist_name=inkbox";
									  if(moUrl.equals(expmoURL))
									  {
									        System.out.println("Pass: Moisturizer URL is correct");
									        log.info("Pass: Moisturizer URL is correct");
									    }
									        else {
									            System.out.println("Fail: Wrong Moisturizer url");
									            log.info("Fail: Wrong Moisturizer url");
									        }
									  Thread.sleep(3000);
									  
									  //Gift card
									  	Actions gf = new Actions(driver);
										WebElement gc = driver.findElement(By.xpath("//*[@id=\"nav-links\"]/div[1]/a[2]"));
										action.moveToElement(gc).moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]"))).click().build().perform();
									
										 String GCUrl = driver.getCurrentUrl();
										 System.out.println("url is" + GCUrl);
										 String expgcURL = "https://inkbox.com/products/1oz-tattoo-moisturizer-no?artist_name=inkbox";
										  if(GCUrl.equals(expgcURL))
										  {
										        System.out.println("Pass: Gift card URL is correct");
										        log.info("Pass: Gift card URL is correct");
										    }
										        else {
										            System.out.println("Fail: Wrong Gift card url");
										            log.info("Fail: Wrong Gift card url");
										        }
										  Thread.sleep(3000);
		//Collections tap
										  
										  By collectionmenu = By.xpath("//*[@id=\"nav-links\"]/div[1]/a[4]");
											driver.findElement(collectionmenu).click();
											 Thread.sleep(3000);
											 String curl = driver.getCurrentUrl();
											 System.out.println("url is" + curl);
											 String coURL = "https://inkbox.com/collections";
											  if(curl.equals(coURL))
											  {
											        System.out.println("Pass: URL is correct");
											        log.info("Pass: URL is correct");
											    }
											        else {
											            System.out.println("Fail: Wrong collection url");
											            log.info("Fail: Wrong collection url");
											        }
											  Thread.sleep(3000); 
			//all collection								  
			Actions action1 = new Actions(driver);
			WebElement c = driver.findElement(By.xpath("//*[@id=\"nav-links\"]/div[1]/a[4]"));
			action1.moveToElement(c).moveToElement(driver.findElement(By.xpath("//body/div[@id='site-content']/div[@id='nav-sticky']/div[@id='nav-links']/div[@id='mega-menu']/section[@id='mega-menu-content']/nav[@id='menu-template-content']/div[1]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[5]/a[1]"))).click().build().perform();
		
			 String collections = driver.getCurrentUrl();
			 System.out.println("url is" + collections);
			 String expCollURL = "https://inkbox.com/collections";
			  if(collections.equals(expCollURL))
			  {
			        System.out.println("Pass: URL is correct");
			        log.info("Pass: URL is correct");
			    }
			        else {
			            System.out.println("Fail: Wrong collection url");
			            log.info("Fail: Wrong collections url");
			        }
			  Thread.sleep(3000);
			  //collab
			  Actions action2 = new Actions(driver);
				WebElement cb = driver.findElement(By.xpath("//*[@id=\"nav-links\"]/div[1]/a[4]"));
				action1.moveToElement(cb).moveToElement(driver.findElement(By.xpath("//body/div[@id='site-content']/div[@id='nav-sticky']/div[@id='nav-links']/div[@id='mega-menu']/section[@id='mega-menu-content']/nav[@id='menu-template-content']/div[1]/ul[1]/li[4]/ul[1]/li[2]/ul[1]/li[6]/a[1]"))).click().build().perform();
			
				 String collab = driver.getCurrentUrl();
				 System.out.println("url is" + collab);
				 String expCollabURL = "https://inkbox.com/collections";
				  if(allfhUrl.equals(expCollabURL))
				  {
				        System.out.println("Pass: URL is correct");
				        log.info("Pass: URL is correct");
				    }
				        else {
				            System.out.println("Fail: Wrong collab url");
				            log.info("Fail: Wrong collab url");
				        }
				  Thread.sleep(3000);
				  
				  
		}
	
	
	
//	  @AfterTest 
//	  public void teardown() {
//	 
//	  driver.close();
//	  
//	  
//	  }
	
	 

	

	
}



	

