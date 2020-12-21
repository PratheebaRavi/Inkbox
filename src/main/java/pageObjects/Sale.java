package pageObjects;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.base;

public class Sale extends base {
	public WebDriver driver;
	 public static Logger log =LogManager.getLogger(base.class.getName());

	public Sale(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		driver.manage().window().maximize();
	}
	
	By saleNav=By.xpath("//body/div[@id='site-content']/div[@id='nav-sticky']/div[@id='nav-links']/div[1]/a[7]");
	By compPrice=By.xpath("//*[@id=\"original-3967367086158-\"]/div[2]/div[1]/div[2]/div/div/span[1]");
	
	
	public void SalesNav() throws IOException, InterruptedException {
		driver.findElement(saleNav).click();
		 Thread.sleep(3000);
		 log.info("Clicked Sales from Nav");
}
	public void ComparePrice() throws IOException, InterruptedException {
		driver.findElement(compPrice).isDisplayed();
		String com = driver.findElement(compPrice).getText();
		Thread.sleep(3000);
		System.out.println("compared price is"+ com);
		log.info("compPrice is displayed");
}
	
}