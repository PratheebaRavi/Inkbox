package pageObjects;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class PDPBlocks extends base {
	public WebDriver driver;
	 public static Logger log =LogManager.getLogger(base.class.getName());

	public PDPBlocks(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		driver.manage().window().maximize();
	}
	
	//By disc=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]");
		
	public void validateDiscount() throws IOException, InterruptedException
	{
	List<WebElement> dynamicElement = driver.findElements(By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]"));
	{
	if(dynamicElement.size()!= 0){
	 //If list size is non-zero, element is present
	 System.out.println("Tiered discount is present");
	}
	else{
	 //Else if size is 0, then element is not present
	 System.out.println("Tiered discount is not present");
	}
	}

	}
	//you may also like
	public void validateYouMay() throws IOException, InterruptedException
	{
	List<WebElement> dynamicElement1 = driver.findElements(By.id("product_tray_you_may_also_like"));
	{
	if(dynamicElement1.size()!= 0){
	System.out.println("You may also like block is present");
	}
	else{
	 //Else if size is 0, then element is not present
	 System.out.println("You may also like block is not present");
	}
	}

	}
	
	//Shop insta
		public void validateShopInsta() throws IOException, InterruptedException
		{
		List<WebElement> dynamicElement1 = driver.findElements(By.cssSelector("#site-content > main > div.font-body.text-brand-black > div.lg\\:space-y-16.pt-10.space-y-12.xl\\:space-y-24 > div.ink-container.layout.space-y-2 > h1"));
		{
		if(dynamicElement1.size()!= 0){
		 //If list size is non-zero, element is present
		 System.out.println("Shop insta is present");
		}
		else{
		 //Else if size is 0, then element is not present
		 System.out.println("Shop insta is not present");
		}
		}

		}
	//Freehand shop insta	
		public void validateFHBrowseShopInsta() throws IOException, InterruptedException
		{
		List<WebElement> dynamicElement1 = driver.findElements(By.cssSelector("#site-content > main > div.font-body.text-brand-black > div > div > div > div:nth-child(6) > div"));
		{
		if(dynamicElement1.size()!= 0){
		 //If list size is non-zero, element is present
		 System.out.println("Shop insta is present");
		}
		else{
		 //Else if size is 0, then element is not present
		 System.out.println("Shop insta is not present");
		}
		}

		}
	
		//FAQ Block
				public void validateFAQ() throws IOException, InterruptedException
				{
				List<WebElement> dynamicElement1 = driver.findElements(By.cssSelector("#faq_block_5StZmAAP9GmcUZIfdvzD7M > div"));
				{
				if(dynamicElement1.size()!= 0){
				 //If list size is non-zero, element is present
				 System.out.println("FAQ block is present");
				}
				else{
				 //Else if size is 0, then element is not present
				 System.out.println("FAQ block is not present");
				}
				}

				}
				//Freehand browse FAQ
				public void validateFHBrowseFAQ() throws IOException, InterruptedException
				{
				List<WebElement> dynamicElement1 = driver.findElements(By.id("faq_block_5poA58DGPxv9I10bDQQsb0"));
				{
				if(dynamicElement1.size()!= 0){
				 //If list size is non-zero, element is present
				 System.out.println("FAQ block is present");
				}
				else{
				 //Else if size is 0, then element is not present
				 System.out.println("FAQ block is not present");
				}
				}

				}
}