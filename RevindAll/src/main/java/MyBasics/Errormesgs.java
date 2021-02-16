package MyBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Errormesgs {
	
	
	
	
	 @Test
     public  void verimesg() {


    	 System.setProperty("webdriver.chrome.driver", "G:\\Eclipselatest\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	    	
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	    
	    
	    driver.get("https://www.braunhealthcare.com/us_en/customer/account/login/");
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	
	 driver.findElement(By.id("send2")).click();
	
	String mesg= driver.findElement(By.id("email-error")).getText();
	     
	    System.out.println(mesg);
	
	
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
