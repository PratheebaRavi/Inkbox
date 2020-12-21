package pageObjects;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import resources.base;

public class QuantitySelector extends base {
	public WebDriver driver;
	 public static Logger log =LogManager.getLogger(base.class.getName());

	public QuantitySelector(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		driver.manage().window().maximize();
	}
	
	
	//Quantity selector
	
		
	public void quantitySelect() throws IOException, InterruptedException {
		WebElement Quantity=driver.findElement(By.cssSelector("#quantity"));
			Select dropdown = new Select(Quantity);
		 	dropdown.selectByIndex(1);	 
			Thread.sleep(5000);
	 }
	
}