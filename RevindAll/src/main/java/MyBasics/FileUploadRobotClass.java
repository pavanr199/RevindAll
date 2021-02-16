package MyBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadRobotClass {

	static Robot robo;
	static StringSelection store;

	@Test
	public static void Fileuploadrobotclass() throws Exception {

		System.setProperty("webdriver.chrome.driver", "G:\\Eclipselatest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);


		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\HP\\Pictures\\revlon\\Add to cart button is displaying and Code is displaying in Homepage in Japan store..PNG");
		
		
		 robo=new Robot();
		
		 store=new StringSelection("C:\\Users\\HP\\Pictures\\gopi edited pic.jpg");
		 
		 
		 robo.keyPress(KeyEvent.VK_CONTROL);
		 robo.keyPress(KeyEvent.VK_V);
		 
		 robo.keyRelease(KeyEvent.VK_CONTROL);
		 robo.keyRelease(KeyEvent.VK_V);
		 
		 robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		 

		


	}




}
