package pageObjects;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.base;

public class ViewAll extends base {
	public WebDriver driver;
	 public static Logger log =LogManager.getLogger(base.class.getName());

	public ViewAll(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		driver.manage().window().maximize();
	}
	
	By BestSeller=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/a[1]");
	By bundles=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[2]/a[1]");
	By justdropped=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]");
	
	public void Bestsellerview() throws IOException, InterruptedException {
		driver.findElement(BestSeller).click();
		 Thread.sleep(3000);
		 log.info("Clicked Just dropped View all");
}
	public void Bundle() throws IOException, InterruptedException {
		driver.findElement(bundles).click();
		 Thread.sleep(3000);
		 log.info("Clicked Bundles View all");
}
	public void JustD() throws IOException, InterruptedException {
		driver.findElement(justdropped).click();
		 Thread.sleep(3000);
		 log.info("Clicked Just dropped View all");
}
	
}