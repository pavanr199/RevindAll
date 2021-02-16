package MyBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts {
	
	
	   @Test
       public  void verifyalert() throws InterruptedException {


      	 System.setProperty("webdriver.chrome.driver", "G:\\Eclipselatest\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	    	
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	    
	    
	    driver.get("http://demo.automationtesting.in/Alerts.html");
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	   driver.findElement(By.linkText("Alert with Textbox")).click();
	
	    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	    
	 String mesg= driver.switchTo().alert().getText();
	  System.out.println(mesg);
	       Thread.sleep(4000);
	        Alert alt=driver.switchTo().alert();
	        alt.sendKeys("pavan");
	        alt.accept();
	            
	   }
	
	
	
	

}
