package inkbox;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	public WebDriver driver;
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 log.info("Driver is initialized");
			
			driver.get(prop.getProperty("url"));
			 log.info("Navigated to Home page");
			driver.manage().window().maximize();
	}
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String Username,String Password,String text) throws IOException, InterruptedException
	{
		driver.navigate().refresh();
		Thread.sleep(3000);
		//one is inheritance

		// creating object to that class and invoke methods of it
		//driver.get(prop.getProperty("url"));
		//LandingPage l=new LandingPage(driver);
		
		//driver.switchTo().alert().dismiss();
		//close popup
		
		/*
		 * driver.switchTo().frame(driver.findElement(By.className(
		 * "ub-emb-iframe-wrapper.ub-emb-visible"))); By
		 * closepopup=By.cssSelector("ub-emb-close");
		 * driver.findElement(closepopup).click(); driver.switchTo().defaultContent();
		 */
		
		
		//LoginPage lp=l.getLogin(); //driver.findElement(By.css()
		LoginPage lp=new LoginPage(driver);
		lp.getLogin();
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);

		log.info(text);
		
		lp.getSignup().click();
		//ForgotPassword fp= lp.forgotPassword();
		//fp.getEmail().sendKeys("xxx");
		//fp.sendMeInstructions().click();
		//String actualPwd=lp.wPwd().getText();
		/*
		 * String ePwd="The password must be at least 8 characters.";
		 * if(actualPwd.equalsIgnoreCase(ePwd)) {
		 * System.out.println("<8 characters error is displayed"); } else {
		 * System.out.println("Fail: <8 characters error is displayed"); }
		 */
		}

	@AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}

	
	@DataProvider
	public Object[][] getData() throws InterruptedException
	{
		
		Object[][] data=new Object[5][3];
		//Valid email & invalid Password
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="1256";
		data[0][2]="Valid email & invalid Password";
		//wait(5000);
		
		
		//Invalid email & valid Password
		data[1][0]="restrictedus..er@qw.com";
		data[1][1]="45678867879880";
		data[1][2]= "Invalid email & valid Password";
		//wait(5000);
		
		//Invalid email & invalid Password
		data[2][0]="restric..teduser@qw.com";
		data[2][1]="4567";
		data[2][2]= "Invalid email & invalid Password";
		//wait(5000);
		
		//already signed up
		
		 data[3][0]="restricteduser2@qw.com"; 
		 data[3][1]="45678867879880"; 
		 data[3][2]= "Exists";
		 
		//wait(5000);
		
		//Valid email & Password
		data[4][0]="restricteduser7@qw.com";
		data[4][1]="45678867879880";
		data[4][2]= "Valid email & Password";
		//wait(5000);
		
		return data;
		
		
		
		
		
		
	}
	
}
