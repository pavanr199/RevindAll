package MyBasics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageScroller {

	
	
	@Test
	public static void scrollpage() {

		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		

		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("scroll(0,400)");
		
		
	
	
	
	}
	
}
