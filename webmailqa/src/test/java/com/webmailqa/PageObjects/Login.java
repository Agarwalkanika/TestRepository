package com.webmailqa.PageObjects;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Login extends BaseClass
{
	
	WebDriver driver = new ChromeDriver();
	@BeforeClass
	   public void setup()
	   {
		   //String exepath = "C://Users//kanikaagarwal//workspace//webmailqa//Drivers//chromedriver.exe";
		    //or we can write this way
		   String exepath=read.getchromepath();
		   System.setProperty("webdriver.chrome.driver", exepath);
		      
		   logger = Logger.getLogger("webmail");
		   PropertyConfigurator.configure("Log4j.properties");
		   
		   
	   } 
	public void launchurl()
	{
		driver.get(url);
		logger.info("URL is opened");
	}
	public void login()
	{
		//username
		driver.findElement(By.xpath("//input[@id='username']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("kanikaagarwal@qainfotech.com");
		logger.info("Username is entered");
		//password
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amity@1000");
		logger.info("Password is entered");
	}
	public void loginsubmit()
	{
		//login button
		driver.findElement(By.cssSelector("ZLoginButton DwtButton")).click();
	}
	@AfterClass
	   public void setdown()
	   {
		   driver.quit();
	   }
}
