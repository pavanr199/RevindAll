package MyBasics;

import java.util.concurrent.TimeUnit;

import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FailreScreenshot {

	static WebDriver driver;


	@BeforeMethod
	public static void setup() {

		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		 driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



	}


	@Test
	public static void fileuplo() {
       


		driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\HP\\Pictures\\gopi edited pic.jpg");


	}

	
	@Test
	public static void title() {

       String source=driver.getPageSource();
        System.out.println("page source is :"+source);
		
	}
	
	

	@AfterMethod
	public static void teardown(ITestResult pavan) {

       if(ITestResult.FAILURE==pavan.getStatus()) {
    	   
    	   
    	  
       }




	}



























}
