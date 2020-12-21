package pageObjects;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class Checkout extends base {
	public WebDriver driver;
	 public static Logger log =LogManager.getLogger(base.class.getName());

	public Checkout(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		driver.manage().window().maximize();
	}

	//checkout
	By checkoutButton = By.id("cart-checkout-button-main");
	By checkoutemail = By.id("checkout_email");
	By firstName = By.id("checkout_shipping_address_first_name");
	By lastName = By.id("checkout_shipping_address_last_name");
	By address = By.id("checkout_shipping_address_address1");
	By phone = By.id("checkout_shipping_address_phone");
	By submit = By.id("continue_button");
	By payment = By.id("continue_button");
	By completeOrder = By.id("continue_button");
	By emailError = By.xpath("//*[@id=\"error-for-email\"]");
	By FNError = By.xpath("//*[@id=\"error-for-first_name\"]");
	By LNError = By.xpath("//*[@id=\"error-for-last_name\"]");
	By AddrError = By.xpath("//*[@id=\"error-for-address1\"]");
	By CityError = By.xpath("//*[@id=\"error-for-city\"]");
	By PostalError = By.xpath("//*[@id=\"error-for-zip\"]");
	By PhoneError = By.xpath("//*[@id=\"error-for-phone\"]");
	//PAYMENT
	By giftCard=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/form[2]/div[1]/div[1]/div[1]/div[1]/input[1]");
	By giftError=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[2]/div[1]/div[1]/div[1]/div[1]/input[1]");
	By closeRefer=By.xpath("/html/body/div[2]/div/div[1]/svg");
	By orderNumber=By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/span");
	
	//negative flow 
	@Test
	 public void validateCheckoutError() throws IOException, InterruptedException {
		 
		String checkoutb = driver.findElement(checkoutButton).getText();
		String expText = "Continue To Checkout";
		System.out.println("Currently on webpage"+checkoutb);
		System.out.println("Expected text is"+expText);
		  if(expText.equals(checkoutb))
		  {
		        System.out.println("Pass: Checkout button text is correct");
		        log.info("Pass: Checkout button text is correct");
		    }
		        else {
		            System.out.println("Fail: Checkout button text is wrong");
		            log.info("Fail: Checkout button text is wrong");
		        }
		  Thread.sleep(3000); 
			driver.findElement(checkoutButton).click();
			Thread.sleep(5000);
			log.info("Clicked checkout");
			driver.findElement(checkoutemail).click();
			driver.findElement(checkoutemail).clear();
			driver.findElement(checkoutemail).sendKeys("inkcustomer@ gmail.com");
			Thread.sleep(3000);
			driver.findElement(firstName).click();
			driver.findElement(firstName).clear();
			Thread.sleep(3000);
			driver.findElement(lastName).click();
			driver.findElement(lastName).clear();
			Thread.sleep(3000);
			driver.findElement(address).click();
			driver.findElement(address).clear();
			Thread.sleep(3000);
		
			driver.findElement(phone).click();
			driver.findElement(phone).clear();
			Thread.sleep(3000);
			driver.findElement(submit).submit();
			Thread.sleep(5000);
			// email
			String actual_msg = driver.findElement(emailError).getText();
			System.out.println("error is" + actual_msg);
			String expError = "Enter a valid email";
			if (actual_msg.equals(expError)) {
				System.out.println("Pass: E-mail error message validated");
				log.info("Pass: E-mail error message validated");
			} else {
				System.out.println("Fail: E-mail error message is not displayed");
				log.info("Fail: E-mail error message is not displayed");
			}
			// First name
			String actual_FNmsg = driver.findElement(FNError).getText();
			System.out.println("error is" + actual_FNmsg);
			String expFNError = "Enter a first name";
			if (actual_FNmsg.equals(expFNError)) {
				System.out.println("Pass: FN error message validated");
				log.info("Pass: FN error message validated");
			} else {
				System.out.println("Fail: FN error message is not displayed");
				log.info("Fail: FN error message is not displayed");
			}

			// Last name
			String actual_LNmsg = driver.findElement(LNError).getText();
			System.out.println("error is" + actual_LNmsg);
			String expLNError = "Enter a last name";
			if (actual_LNmsg.equals(expLNError)) {
				System.out.println("Pass: LN error message validated");
				log.info("Pass: LN error message validated");
			} else {
				System.out.println("Fail: LN error message is not displayed");
				log.info("Fail: LN error message is not displayed");
			}

			// Address
			String actual_Addrmsg = driver.findElement(AddrError).getText();
			System.out.println("error is" + actual_Addrmsg);
			String expAddrError = "Enter an address";
			if (actual_Addrmsg.equals(expAddrError)) {
				System.out.println("Pass: Address error message validated");
				log.info("Pass: Address error message validated");
			} else {
				System.out.println("Fail: Address error message is not displayed");
				log.info("Fail: Address error message is not displayed");
			}

			// City
			String actual_Citymsg = driver.findElement(CityError).getText();
			System.out.println("error is" + actual_Citymsg);
			String expCityError = "Enter a city";
			if (actual_Citymsg.equals(expCityError)) {
				System.out.println("Pass: City error message validated");
				log.info("Pass: City error message validated");
			} else {
				System.out.println("Fail: City error message is not displayed");
				log.info("Fail: City error message is not displayed");
			}

			// Postal code
			String actual_Postalmsg = driver.findElement(PostalError).getText();
			System.out.println("error is" + actual_Postalmsg);
			String expPostalError = "Enter a ZIP / postal code";
			if (actual_Postalmsg.equals(expPostalError)) {
				System.out.println("Pass: Postal code error message validated");
				log.info("Pass: Postal code error message validated");
			} else {
				System.out.println("Fail: Postal code error message is not displayed");
				log.info("Fail: Postal code error message is not displayed");
			}

			// Phone
			String actual_Phonemsg = driver.findElement(PhoneError).getText();
			System.out.println("error is" + actual_Phonemsg);
			String expPhoneError = "Enter a valid phone number";
			if (actual_Phonemsg.equals(expPhoneError)) {
				System.out.println("Pass: Phone error message validated");
				log.info("Pass: Phone error message validated");
			} else {
				System.out.println("Fail: Phone error message is not displayed");
				log.info("Fail: Phone error message is not displayed");
			}

				 }
	 
	 //positive flow
	 public void validateCheckout() throws IOException, InterruptedException {
		
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
		 
//		 driver.findElement(giftCard).click();
//		 driver.findElement(giftCard).sendKeys("1234567890");
//		 Thread.sleep(3000);
//		 driver.findElement(giftCard).sendKeys(Keys.ENTER);
//		 String actual_giftmsg = driver.findElement(giftError).getText();
//		  System.out.println("error is"+actual_giftmsg); 
//		  String expgiftError = "Enter a valid discount code or gift card"; 
//		
//		  if(actual_giftmsg.equals(expgiftError))
//		  {
//		        System.out.println("Pass: Gift card error message validated");
//		        log.info("Pass: Gift card error message validated");
//		    }
//		        else {
//		            System.out.println("Fail: Gift card error message is not displayed");
//		            log.info("Fail: Gift card error message is not displayed");
//		        }
//		  driver.findElement(giftCard).click();
//		  driver.findElement(giftCard).clear();
//		  driver.findElement(giftCard).sendKeys("4BA8 FAC8 F642 FB9A");
//		  driver.findElement(giftCard).sendKeys(Keys.ENTER);
//		
//		 
//			 
//		 driver.findElement(completeOrder).submit(); 
//		 Thread.sleep(10000);
//		 driver.findElement(closeRefer).click();
//		 Thread.sleep(3000);
//		String orderNo = driver.findElement(orderNumber).getText();
//		System.out.println("CANCEL this order from Shopify"+orderNo);
//        log.info("CANCEL this order from Shopify");
	 }
	 
	 }



