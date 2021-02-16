package MyBasics;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class DroupDown  {
	
	
	//what is log=to capture the information at the time of execution.
	//type of logs
	//1.info
	//2.warning
	//3.fatal
	//4.error
	
    //how to generate logs ?=using log4j appache api
	//where to create=create inside resourses folder.
	
	
	
	static WebDriver driver;
	
	
	 @BeforeMethod
	    public void setup() {
	    	
	    	
		 System.setProperty("webdriver.gecko.driver", "G:\\Eclipselatest\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
	    	
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	    
	    
	    driver.get("http://demo.automationtesting.in/Register.html");
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	 }
	  
             @Test
              public void select() {
            	  
	  driver.findElement(By.name("radiooptions")).click();
	  driver.findElement(By.id("checkbox1")).click();
	  
	  Select skills=new Select(driver.findElement(By.id("Skills")));
      skills.selectByVisibleText("Adobe Photoshop");
      
      
		Select year=new Select(driver.findElement(By.id("yearbox")));
		      year.selectByValue("1996");
		     
		      String url= driver.getCurrentUrl();  
	             System.out.println("page url is " +url);
		  
           
	             
		   
		      Select day=new Select(driver.findElement(By.id("daybox")));
		      day.selectByValue("25");
		
		     driver.findElement(By.id("firstpassword")).sendKeys("12345");
		
		     driver.findElement(By.id("secondpassword")).sendKeys("12345");
		     
		        String title=driver.getTitle();
		        System.out.println("the title is"+title);
		
             }
	

             
                 @AfterMethod
                 public void teardown() {
                	 
                	 driver.close();
                 }
             
             
             
        
             
             
             
}
