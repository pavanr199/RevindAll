package MyBasics;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Title {
	
	
	

	
	          @Test
	         public static void verifytitle() {

	
	        	 System.setProperty("webdriver.chrome.driver", "G:\\Eclipselatest\\chromedriver.exe");
	 			WebDriver driver=new ChromeDriver();
	 	    	
	 	    driver.manage().window().maximize();
	 	    driver.manage().deleteAllCookies();
	 	    driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	 	    
	 	    
	 	    driver.get("https://www.facebook.com/");
	 	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	   
	 	    //actuall title
	 	       String Homepagetitle=  driver.getTitle();
	 	   /*     
	           System.out.println("The title is " +Homepagetitle);
	           
	           
	       String expectedtitle="Facebook – log in or sign up";
	       
	         assert.assertEquals(Homepagetitle, expectedtitle):
	       
	     */  
	       driver.close();
	
	
	
	
	
	
	
	
	
	          }

			
	

}
