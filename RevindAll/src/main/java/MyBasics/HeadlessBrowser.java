package MyBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadlessBrowser {

	static WebDriver driver;

	@Test
	public static void HeadlessTest() {




	//	System.setProperty("webdriver.gecko.driver", "G:\\Eclipselatest\\geckodriver.exe");
	//	WebDriver driver=new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32 (1)\\chromedriver.exe");
   		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);


		//driver.get("https://stinger-dev.heledigital.com/stinger/customer/account/login");
/*
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		String beforeloginpagetitle=driver.getTitle();
		System.out.println("the title is "+beforeloginpagetitle);

		driver.findElement(By.linkText("Login")).click();

		driver.findElement(By.id("email")).sendKeys("pavanst@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pavan@123");

		driver.findElement(By.id("send2")).click();

		String afterloginpagetitle=driver.getTitle();
		System.out.println("the title is "+afterloginpagetitle);


*/

	}





	}
