package pageObjects;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import resources.base;

public class ProductandCart {
	public WebDriver driver;
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 
	 public ProductandCart(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
			this.driver=driver;
			driver.manage().window().maximize();
		}
	 //search
	By addtoCart = By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[5]/div[2]/div[2]/button[1]");
	By increaseCart = By.id("cart-item-add");
	By decreaseCart = By.id("cart-item-sub");
	By addtoCart1 = By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[8]/div[2]/div[2]/button[1]");
	By removeProd = By.cssSelector("#cart > div > div > div.cart-body.overflow-y-auto > div.cart-contents > div:nth-child(2) > div > div.cart-itemInfo.col-span-2.grid > div.w-full > div.flex.justify-between > div:nth-child(2) > svg > path");
	By openCart = By.cssSelector("#nav-right-icons > div > svg");
	By emptyCarterror = By.cssSelector("#cart > div > div > div:nth-child(2) > h3");
	By emptyCartfreeshipping = By.cssSelector("#cart > div > div > div.w-full > div.w-full.py-3.bg-gray-200.flex.items-center.px-4 > p");
	By backarrowCart=By.cssSelector("#cart > div > div > div.w-full > div.w-full.bg-brand-black.text-brand-white.font-body.flex.justify-between.items-center.py-4.px-4 > div > p");
	By itemCount=By.className("cart-item-count");
	By cartItems=By.className("flex.justify-between.w-16");
	//PDP
	
	By PDPaddtoCart=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[1]/div[2]/div[6]/span[1]/button[1]");
	By product=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/img[1]");
	By PDPremoveProd = By.cssSelector("#cart > div > div > div.cart-body.overflow-y-auto > div.cart-contents > div > div > div.cart-itemInfo.col-span-2.grid > div.w-full > div.flex.justify-between > div:nth-child(2) > svg > path");
	
	//Bundle PDP
	By Bproduct=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/a[1]/div[1]");
	
	By BundleaddtoCart=By.xpath("//*[@id=\"site-content\"]/main/div[1]/div[1]/div/div[2]/div[5]/span[1]/button");
	//from home page
	By bshp=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[8]/div[2]/div[2]/button[1]/*[1]");
	By bshpnu=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/button[1]/*[1]");
	By bundle=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/button[1]");
	By bundlehpnu=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/button[1]");
	By justdropped=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/button[1]");
	By justdroppedhpnu=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]");
	
	//Sale
	By saleprod=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[1]/div[2]/div[11]/div[1]/div[2]/div[2]/button[1]");
	By freehandi=By.xpath("/html/body/div[3]/main/div[1]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div[2]/button");
	By freehanda=By.xpath("/html/body/div[3]/main/div[1]/div/div/div/div[4]/div/div/div[4]/div/div[2]/div[2]/button");
	By freehandinkProd=By.xpath("/html/body/div[3]/main/div[1]/div/div/div/div[2]/div/div/div[3]/div/div[1]/a/div[1]");
	By freehandaccProd=By.xpath("//*[@id=\"original-1358077263950-\"]/div[1]/a/div[1]");
	
	public void FreehandinkPDP() throws IOException, InterruptedException {
		 driver.findElement(freehandinkProd).click();
		 Thread.sleep(5000);
	 }
	public void FreehandaccPDP() throws IOException, InterruptedException {
		 driver.findElement(freehandaccProd).click();
		 Thread.sleep(5000);
	 }
	public void FreehandinkBrwse() throws IOException, InterruptedException {
		 driver.findElement(freehandi).click();
		 Thread.sleep(5000);
	 }
	public void FreehandAccBrwse() throws IOException, InterruptedException {
		 driver.findElement(freehanda).click();
		 Thread.sleep(5000);
	 }
	public void saleProduct() throws IOException, InterruptedException {
		 driver.findElement(saleprod).click();
		 Thread.sleep(5000);
	 }
	public void BestSellerHP() throws IOException, InterruptedException {
		 driver.findElement(bshp).click();
		 Thread.sleep(5000);
	 }
	 public void BestSellerHPNoUpsell() throws IOException, InterruptedException {
		 driver.findElement(bshpnu).click();
		 Thread.sleep(5000);
	 }
	 public void BundleHP() throws IOException, InterruptedException {
		 driver.findElement(bundle).click();
		 Thread.sleep(5000);
	 }
	 public void BundleHPNoUpsell() throws IOException, InterruptedException {
		 driver.findElement(bundlehpnu).click();
		 Thread.sleep(5000);
	 }
	 
	 public void JustDroppedHP() throws IOException, InterruptedException {
		 driver.findElement(justdropped).click();
		 Thread.sleep(5000);
	 }
	 public void JustDroppedHPNoUpsell() throws IOException, InterruptedException {
		 driver.findElement(justdroppedhpnu).click();
		 Thread.sleep(5000);
	 }
	 
	 public void PDPprod() throws IOException, InterruptedException {
		 driver.findElement(product).click();
		 Thread.sleep(5000);
	 }
	 //PDPcart
	 public void PDPcart() throws IOException, InterruptedException {
		 driver.findElement(PDPaddtoCart).click();
		 Thread.sleep(5000);
		 
			driver.findElement(increaseCart).click();
			Thread.sleep(5000);
			log.info("Increased cart");
			driver.findElement(decreaseCart).click();
			Thread.sleep(5000);
			log.info("Decreased cart");
			driver.findElement(PDPremoveProd).click();
			Thread.sleep(5000);
			log.info("Removed an item from cart");
			driver.findElement(By.xpath("//body")).click();
			

			 driver.findElement(PDPaddtoCart).click();
			 Thread.sleep(5000);
	 }
	 //Bundle
	 
	 public void Bundleprod() throws IOException, InterruptedException {
		 driver.findElement(Bproduct).click();
		 Thread.sleep(5000);
	 }
	 
	 public void BundlePDPcart() throws IOException, InterruptedException {
		 driver.findElement(BundleaddtoCart).click();
		 Thread.sleep(5000);
		 
			driver.findElement(increaseCart).click();
			Thread.sleep(5000);
			log.info("Increased cart");
			driver.findElement(decreaseCart).click();
			Thread.sleep(5000);
			log.info("Decreased cart");
			driver.findElement(decreaseCart).click();
			Thread.sleep(5000);
			driver.findElement(decreaseCart).click();
			Thread.sleep(5000);
			log.info("Decreased cart to 0");
			driver.findElement(By.xpath("//body")).click();
			
			driver.findElement(BundleaddtoCart).click();
			 Thread.sleep(5000);
		
	 }
	 
	 public void BundlePDPcartwUpsell() throws IOException, InterruptedException {
		 driver.findElement(BundleaddtoCart).click();
		 Thread.sleep(5000);
		 
			driver.findElement(increaseCart).click();
			Thread.sleep(5000);
			log.info("Increased cart");
			driver.findElement(decreaseCart).click();
			Thread.sleep(5000);
			log.info("Decreased cart");
			driver.findElement(PDPremoveProd).click();
			Thread.sleep(5000);
			log.info("Removed an item from cart");
			driver.findElement(By.xpath("//body")).click();
			
			driver.findElement(BundleaddtoCart).click();
			 Thread.sleep(5000);
		
	 }
	 
	 public void FreehandInkAcccartwUpsell() throws IOException, InterruptedException {
		 driver.findElement(BundleaddtoCart).click();
		 Thread.sleep(5000);
		 
			
			
	 }
	 public void CartError() throws IOException, InterruptedException {
		 driver.findElement(openCart).click();
			Thread.sleep(3000);
			String actual_cartmsg = driver.findElement(emptyCarterror).getText();
			System.out.println("error is" + actual_cartmsg);
			String expcartError = "You have no items in your cart";

			if (actual_cartmsg.equals(expcartError)) {
				System.out.println("Pass: Empty cart error message validated");
				log.info("Pass: Empty cart error message validated");
			} else {
				System.out.println("Fail: Empty cart error message is not displayed");
				log.info("Empty cart error message is not displayed");
			}

			//Free shipping message
			String actual_freeshipmsg = driver.findElement(emptyCartfreeshipping).getText();
			System.out.println("error is" + actual_freeshipmsg);
			String expfreeShipping = "Free Shipping on orders over CAD $43.00";
			System.out.println("error is" + expfreeShipping);
			if (expfreeShipping.equals(actual_freeshipmsg)) {
				System.out.println("Pass: Free shipping message validated");
				log.info("Pass: Free shipping validated");
			} else {
				System.out.println("Fail: Free shipping is wrong");
				log.info("Fail: Free shipping is wrong");
			}
			Thread.sleep(3000);
			String actual_shipmsg = driver.findElement(backarrowCart).getText();
			System.out.println("error is" + actual_shipmsg);
			String expShipError = "Keep Shopping";
			System.out.println("Current msg is"+actual_shipmsg);
			System.out.println("Expected msg is"+expShipError);
			if (actual_shipmsg.equals(expShipError)) {
				System.out.println("Pass: correct shipping msg ");
				log.info("Pass: correct shipping msg is");
			} else {
				System.out.println("Fail:shipping msg");
				log.info("Fail shipping msg");
			}
			driver.findElement(backarrowCart).click();
			Thread.sleep(3000); 
	 }
	 
	 public void CartItems() throws IOException, InterruptedException {
		 Thread.sleep(3000);
		String items=	driver.findElement(itemCount).getText();
		int orders = Integer.parseInt(items);
		 System.out.println("order is" + orders);
		List<WebElement> total = driver.findElements(cartItems);
		System.out.println("Total is" + total.size());
		int orderCount=0;
		for(int i=0;i<total.size();i++) {
		String x=total.get(i).getText();
		orderCount = Integer.parseInt(x)+orderCount;
		}
		System.out.println("orderCount is" + orderCount);
		if (orders==orderCount) {
			System.out.println("Pass: Items count match");
			log.info("Pass: Items count match\"");
		} else {
			System.out.println("Fail:");
			log.info("Fail:");
		}
	 }
	
	 //search
	 public void allCart() throws IOException, InterruptedException {
		 	
		 	driver.findElement(addtoCart).click();
			Thread.sleep(5000);
			driver.findElement(increaseCart).click();
			Thread.sleep(5000);
			log.info("Increased cart");
			driver.findElement(decreaseCart).click();
			Thread.sleep(5000);
			log.info("Decreased cart");
			driver.findElement(By.xpath("//body")).click();
			Thread.sleep(3000);
			driver.findElement(addtoCart1).click();
			Thread.sleep(5000);
			log.info("Added 2nd product to cart");
			driver.findElement(removeProd).click();
			Thread.sleep(5000);
			log.info("Removed an item from cart");
	 }
	 
	 public void pgus() throws IOException, InterruptedException {
		 driver.findElement(addtoCart).click();
		 Thread.sleep(5000);
	 }
	 }

