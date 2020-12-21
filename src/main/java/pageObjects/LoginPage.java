package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class LoginPage {

	
	public WebDriver driver;
	
//	By email=By.cssSelector("[id='user_email']");
//	By password=By.cssSelector("[type='password']");
By signup=By.cssSelector("#createAccountForm_popup > div > button");
//	By forgotPassword = By.cssSelector("[href*='password/new']");
	
	By signupemail=By.cssSelector("#signup-email-field");
	By signuppwd=By.cssSelector("#signup-password-field");
	By lesspwd=By.xpath("//*[@id=\"site-content\"]/main/div[1]/div/div/div/div[2]/div/ul/li/text()");
	By jointhefam=By.cssSelector("#header-user > button");

	By clicksearch=By.id("search-field-input");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}



	/*
	 * public ForgotPassword forgotPassword() {
	 * driver.findElement(forgotPassword).click(); return new
	 * ForgotPassword(driver);
	 * 
	 * }
	 */
	public void getLogin() throws InterruptedException 
	{
		//driver.findElement(closepopup).click(); 
		driver.navigate().refresh();
		//wait(3000);
		 driver.findElement(jointhefam).click();
		 wait(3000);
		 
		 
		 
		 
	}
	public void getEmail()
	{
	driver.findElement(signupemail).click();
	}
	

	public void getPassword()
	{
	driver.findElement(signuppwd).click();
	}
	
	public void getSignup()
	{
		driver.findElement(signup).click();
	}
	
	/*
	 * public WebElement wPwd() { return driver.findElement(lesspwd); }
	 */
	
	
}
