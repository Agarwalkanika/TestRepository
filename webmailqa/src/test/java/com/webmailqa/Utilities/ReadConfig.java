package com.webmailqa.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

// this is the utility class(Readconfig.java)
//similiar to p[age object class
// read for every variables that is present in config.property file, we need to create method to read these values
public class ReadConfig 
  {

	    //creating object for proprty class
	    Properties pro;
	
	    //we need to create constructor
	    public ReadConfig()
	    {
			File src= new File("./Configuration/config.properties");
			//specifying the path from where we are reading the data
			//we need to import file from java.io
			//src is refering the config file
			try
		     {
		   
	      	   //becoz we are reading the data from the file, we need import fileinputstream
               //we need to open the file in the read mode that is why we are using fileinputstream
		       FileInputStream fis=new FileInputStream(src);
	           //initiating the object, load is a method which will load the complete file(config.property) at the run time
		       pro.load(fis);	
		     }
		    //if suppose file is not available at this location, there is a chance to get an exception
			//for which i am putting the catch statements
		    catch(Exception e)
			{
		    	System.out.println("Exception is " + e.getMessage());
			}
	     }
	    public String getApplicationURL()
	    {
	    	String url=pro.getProperty("url");
	    	return url;
	    }
	    public String getusrename()
	    {
	    	String username=pro.getProperty("username");
	    	return username;
	    }
	    public String getchromepath()
	    {
	    	String chromepath=pro.getProperty("chromepath");
	    	return chromepath;
	    }
}
//this constructor is used for loading whole file(config file)
//this is a constructor, as soon as we created the object for this readconfig class
//this constructor would be invoked and the property file will be loaded
//once the file is 