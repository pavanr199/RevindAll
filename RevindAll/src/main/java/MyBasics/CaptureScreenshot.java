package MyBasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.apache.tools.ant.taskdefs.optional.depend.ClassFileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureScreenshot {
	static File file;



	@Test
	public static  void Screenshot() throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\Eclipselatest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);


		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



		//take screenshot and store it as a file

		file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		//FileUtils.copyFile(file, new File("G://Eclipselatest//RevindAll//Myscreenshots.png"));

		org.apache.commons.io.FileUtils.copyFile(file, new File("G:\\Eclipselatest\\RevindAll\\Myscreenshots.png"));



		driver.close();





	}

}
