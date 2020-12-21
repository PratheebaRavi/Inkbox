package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class LandingPage {

	
	public WebDriver driver;
	
	//driver.switchTo().frame(driver.findElement(By.className("ub-emb-iframe-wrapper.ub-emb-visible"))); 
	//By closepopup=By.cssSelector("ub-emb-close");
	
	//driver.switchTo().defaultContent();
	
	By jointhefam=By.cssSelector("#header-user > button");

	By clicksearch=By.id("search-field-input");
	
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		driver.manage().window().maximize();
	}

	
	public LoginPage getLogin() 
	{
		//driver.findElement(closepopup).click(); 
		driver.navigate().refresh();
		//wait(3000);
		 driver.findElement(jointhefam).click();
		 LoginPage lp=new LoginPage(driver);
		 return lp;
		 
		 
		 
		 
	}
//	public WebElement getNavigationBar()
//	{
//		return driver.findElement(signupemail);
//	}
//	public WebElement getTitle()
//	{
//		return driver.findElement(signuppwd);
//	}
//	
	
	
}
