package pageObjects;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class ProdSearch {
	public WebDriver driver;
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	By search=By.id("search-field-input");

	
	public ProdSearch(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		driver.manage().window().maximize();
	}
	
	 public void Searchclick() throws IOException, InterruptedException {
		 
		 driver.findElement(search).click();
			Thread.sleep(3000);
	 }
			 public void Search() throws IOException, InterruptedException {
			driver.findElement(search).sendKeys("Flower");
			Thread.sleep(3000);
			driver.findElement(search).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			log.info("Successfully entered text");
			log.info("Text entered");
	 }
			 public void EmptySearchclick() throws IOException, InterruptedException {
				 
				 driver.findElement(search).click();
					Thread.sleep(3000);
					 driver.findElement(search).sendKeys(Keys.ENTER);
					 Thread.sleep(3000);			 }
}
