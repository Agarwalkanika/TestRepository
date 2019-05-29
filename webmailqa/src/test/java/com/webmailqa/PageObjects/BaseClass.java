package com.webmailqa.PageObjects;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.webmailqa.Utilities.ReadConfig;

public class BaseClass 
{
   //public String url="https://webmail.qainfotech.com/";
   //public String username="kanikaagarwal";
   //public String password="Amity@1000";
   static WebDriver driver;
   public static Logger logger;
   
    
   //For reading the values from readconfig file, just call the methods 
   //for which we have to read the value
   //through object of readconfig file
   ReadConfig read=new ReadConfig();
   //As soon as we create the object it will invoke the constructor of readconfig.java class
   //now we can fetch the url as
   public String url=read.getApplicationURL();
}
