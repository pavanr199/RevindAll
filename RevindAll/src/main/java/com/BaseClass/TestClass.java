package com.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.Utill.TestUtill;

public class TestClass {
	
	static Properties prop;
	static WebDriver driver;
	
	          public TestClass() throws IOException {
	        	  
	        	  
                 prop=new Properties();
	        	  
	        	  InputStream input=new FileInputStream("G:\\Eclipselatest\\RevindAll\\src\\main\\java\\MyBasics\\config.properties");
	        	  
	        	  
	        	  prop.load(input);
	        	  
	          }
	
	
	          public static void Inilization() {
	        	  
	        	  
	        	 String browsername= prop.getProperty("browser");
	        	 
	        	 if(browsername.equals("chrome")) {
	        		 
	        		 System.setProperty("webdriver.chrome.driver", "G:\\Eclipselatest\\chromedriver.exe");
	     			driver=new ChromeDriver();
	        	 }
	        	 
	        	 driver.manage().window().maximize();
	     	    driver.manage().deleteAllCookies();
	     	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	     	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     	   
	     	  driver.get(prop.getProperty("url"));
	        		 
	        	 }
	        	  
	        	  
	          }
	
	
	
	
	
	
	
	
	


