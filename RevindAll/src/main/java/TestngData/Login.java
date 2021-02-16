package TestngData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {



	WebDriver driver;

	@BeforeMethod
	public void login() {

		System.setProperty("webdriver.chrome.driver", "G:\\Eclipselatest\\chromedriver.exe");
		driver=new ChromeDriver();



		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		driver.get("https://stinger-dev.heledigital.com/stinger/customer/account/login");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void logintest() {


		driver.findElement(By.id("email")).sendKeys("pavanst@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pavan@123");

		driver.findElement(By.id("send2")).click();
		



	}








	@AfterMethod
	public void teardown() {

		driver.close();
	}






}
