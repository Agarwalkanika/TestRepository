package Capturescreenshots;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webmailscreenshot
{
   @Test
   public void capturescreenshot() throws Exception
   {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://webmail.qainfotech.com/");
	   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("kanikaagarwal@qainfotech.com");
	   
	   TakesScreenshot ts = (TakesScreenshot)driver;
	   //type casting the driver to takescreenshot
	   //ts is the object
       File source = ts.getScreenshotAs(OutputType.FILE);
       //File is 
       //try {
           FileUtils.copyFileToDirectory(source, new File("./Screenshotall/facebook.png"));
           /* } catch (IOException ex) {
           Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
       }*/
	   System.out.println("Screenshot is captured");
	   driver.quit();
   }
}

