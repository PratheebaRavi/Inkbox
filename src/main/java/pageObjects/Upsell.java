package pageObjects;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import resources.base;

public class Upsell extends base {
	public WebDriver driver;
	 public static Logger log =LogManager.getLogger(base.class.getName());

	public Upsell(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		driver.manage().window().maximize();
	}
	 
	//UPSELL
		By upsell1=By.cssSelector("#cart > div > div > div.cart-body.overflow-y-auto > div.cart-upsell > div > div > div > div:nth-child(1) > div.self-end.grid.space-y-2 > button");
		By upsell2 = By.cssSelector("#cart > div > div > div.cart-body.overflow-y-auto > div.cart-upsell > div > div > div > div:nth-child(2) > div.self-end.grid.space-y-2 > button");
		By upsell3=By.cssSelector("#cart > div > div > div.cart-body.overflow-y-auto > div.cart-upsell > div > div > div > div:nth-child(3) > div.self-end.grid.space-y-2 > button");
		By upsell4=By.cssSelector("#cart > div > div > div.cart-body.overflow-y-auto > div.cart-upsell > div > div > div > div:nth-child(4) > div.self-end.grid.space-y-2 > button");
		
		By upsellIncrease = By.xpath(
				"/html/body/div[2]/div[5]/div/section/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/div[2]/div[1]/button[2]");
		By upsellDecrease = By.xpath(
				"/html/body/div[2]/div[5]/div/section/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/div[2]/div[1]/button[1]");
		By upsellRemove = By.xpath(
				"//body/div[@id='site-content']/div[@id='drawerCart']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]");		
		
		By PDPupsellIncrease = By.xpath(
				"//body/div[@id='site-content']/div[@id='drawerCart']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[2]/*[1]");
		By PDPupsellDecrease = By.xpath(
				"//body/div[@id='site-content']/div[@id='drawerCart']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]/*[1]");
		By PDPupsellRemove = By.xpath(
				"//body/div[@id='site-content']/div[@id='drawerCart']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/*[1]");
	
		@Test
		public void upsell1() throws IOException, InterruptedException {
			 driver.findElement(upsell1).click();
			 Thread.sleep(5000);
			 log.info("Upsell product added to cart");
	 }
		public void upsell2() throws IOException, InterruptedException {
			driver.findElement(upsell2).click();
			Thread.sleep(5000);
			log.info("Upsell product added to cart");

			driver.findElement(upsellIncrease).click();
			Thread.sleep(5000);
			log.info("Upsell product increased");
			driver.findElement(upsellDecrease).click();
			Thread.sleep(5000);
			log.info("Upsell product decreased");
			driver.findElement(upsellRemove).click();
			Thread.sleep(5000);
			log.info("Upsell product removed from cart");
	 }
		
		public void upsell3() throws IOException, InterruptedException {
			 driver.findElement(upsell3).click();
			 Thread.sleep(5000);
			 log.info("Upsell product added to cart");
	 }
		
		public void upsell4() throws IOException, InterruptedException {
			 driver.findElement(upsell4).click();
			 Thread.sleep(5000);
			 log.info("Upsell product added to cart");
	 }
		public void PDPupsell() throws IOException, InterruptedException {
			driver.findElement(upsell2).click();
			Thread.sleep(5000);
			log.info("Upsell product added to cart");

			driver.findElement(PDPupsellIncrease).click();
			Thread.sleep(5000);
			log.info("Upsell product increased");
			driver.findElement(PDPupsellDecrease).click();
			Thread.sleep(5000);
			log.info("Upsell product decreased");
			driver.findElement(PDPupsellRemove).click();
			Thread.sleep(5000);
			log.info("Upsell product removed from cart");
			driver.findElement(upsell2).click();
			Thread.sleep(5000);
			log.info("Upsell product added to cart again");
	 }
		//Upsell Block
				public void validateFreqSoldWith() throws IOException, InterruptedException
				{
				List<WebElement> dynamicElement1 = driver.findElements(By.cssSelector("#cart > div > div > div.cart-body.overflow-y-auto > div.cart-upsell > div"));
				{
				if(dynamicElement1.size()!= 0){
				 System.out.println("Upsell block is present");
				}
				else{
				
				 System.out.println("Upsell block is not present");
				}
				}

				}
	 }
