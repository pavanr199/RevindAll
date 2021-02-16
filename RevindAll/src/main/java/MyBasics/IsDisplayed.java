package MyBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IsDisplayed {
	
	
	
	 @Test
     public  void displayed() {


    	 System.setProperty("webdriver.chrome.driver", "G:\\Eclipselatest\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	    	
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	    
	    
	    driver.get("http://demo.automationtesting.in/Register.html");
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//is displayed =is applicable for all the elements
	boolean cricket=   driver.findElement(By.id("checkbox1")).isDisplayed();
	
	System.out.println(cricket);
	
	//is enabled 
	boolean hockey=   driver.findElement(By.id("checkbox1")).isEnabled();
	System.out.println(hockey);
	
	//
	 driver.findElement(By.id("checkbox2")).click();
	boolean movies=   driver.findElement(By.id("checkbox2")).isSelected();
	System.out.println(movies);
	
	//geturl
	    String url=  driver.getCurrentUrl();
	    System.out.println(url);
	    
	   // driver.findElement(By.name("radiooptions")).click();
	    boolean radio=   driver.findElement(By.name("radiooptions")).isSelected();
		System.out.println(radio);
		
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	 }
	
	

}
