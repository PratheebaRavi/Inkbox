package pageObjects;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.base;

public class Pagination extends base {
	public WebDriver driver;
	 public static Logger log =LogManager.getLogger(base.class.getName());

	public Pagination(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		driver.manage().window().maximize();
	}
	
	By rightArrow=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[2]/div[2]/div[3]/nav[1]/div[2]");
	By leftArrow=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[2]/div[2]/div[3]/nav[1]/div[1]");
	By pageNumber=By.xpath("/html[1]/body[1]/div[2]/main[1]/div[1]/div[1]/div[2]/div[2]/div[3]/nav[1]/ul[1]/li[4]/a[1]");
	
	public void ClickRight() throws IOException, InterruptedException {
		driver.findElement(rightArrow).click();
		 Thread.sleep(3000);
		 log.info("Clicked Right pagination");
}
	public void Bundle() throws IOException, InterruptedException {
		driver.findElement(leftArrow).click();
		 Thread.sleep(3000);
		 log.info("Clicked Left pagination");
}
	public void PageN() throws IOException, InterruptedException {
		driver.findElement(pageNumber).click();
		 Thread.sleep(3000);
		 log.info("Clicked Page number");
}
	
}