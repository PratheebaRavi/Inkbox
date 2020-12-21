package pageObjects;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.base;
//NOT COMPLETED
public class HeaderLinks extends base {
	public WebDriver driver;
	 public static Logger log =LogManager.getLogger(base.class.getName());

	public HeaderLinks(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		driver.manage().window().maximize();
	}
	
	By Shopmegamenu=By.xpath("//*[@id=\"nav-links\"]/div[1]/a[2]");
	By BestSeller=By.xpath("By.xpath(\"//body/div[@id='site-content']/div[@id='nav-sticky']/div[@id='nav-links']/div[@id='mega-menu']/section[@id='mega-menu-content']/nav[@id='menu-template-content']/div[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]\")");

	By bundles=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/div[2]/a[1]");
	By justdropped=By.xpath("//body/div[@id='site-content']/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]");
	By freehand=By.xpath("/html/body/div[3]/div[3]/div[2]/div[1]/a[6]");
	
	public void Bestsellerview() throws IOException, InterruptedException {
		driver.findElement(BestSeller).click();
		 Thread.sleep(3000);
		 log.info("Clicked Best seller");
}
	public void Bundle() throws IOException, InterruptedException {
		driver.findElement(bundles).click();
		 Thread.sleep(3000);
		 log.info("Clicked Bundles header link");
}
	public void JustD() throws IOException, InterruptedException {
		driver.findElement(justdropped).click();
		 Thread.sleep(3000);
		 log.info("Clicked Just dropped header link");
}
	public void freehandBrowse() throws IOException, InterruptedException {
		driver.findElement(freehand).click();
		 Thread.sleep(3000);
		 log.info("Clicked Free hand header link");
}
	
}