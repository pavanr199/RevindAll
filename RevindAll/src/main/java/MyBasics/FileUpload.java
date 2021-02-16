package MyBasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.core.config.Loggers;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {

   static Loggers logger;

	@Test
	public void Fileuploadsendkeys() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		Logger logger =LogManager.getLogger(FileUpload.class);
		logger.error("corect");

		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\HP\\Pictures\\gopi edited pic.jpg");

		
		driver.close();


	}




}
