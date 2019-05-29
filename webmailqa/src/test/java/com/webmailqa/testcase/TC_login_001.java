package com.webmailqa.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webmailqa.PageObjects.BaseClass;
import com.webmailqa.PageObjects.Login;

import junit.framework.Assert;

public class TC_login_001 extends BaseClass
{ 
	 
	  
	/*@BeforeTest
	public void test()
	{*/
		Login lp = new Login();
    		
	//before this method execution, before class will be executed
	@Test
    public void loginTest()
    {
		lp.launchurl();
		lp.login();
    	lp.loginsubmit();
    	
    	if(driver.getTitle().equals("ewgquifyiudgbvfydw"))
    	{
    		Assert.assertTrue(true);
    		logger.info("Login test passed");
    	}
    	else
    	{
    		Assert.assertTrue(false);
    		logger.info("Login test failed");
    	}
    }
	 
}
