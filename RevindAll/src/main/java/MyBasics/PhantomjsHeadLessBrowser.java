package MyBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class PhantomjsHeadLessBrowser {
	
	@Test
	public static void headlesstest() {
		System.setProperty("phantomjs.binary.path", "G:\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		WebDriver driver =new PhantomJSDriver();
		
		
		
		driver.get("http://www.facebook.com");
	   String facebooktitle=driver.getTitle();
	   
	   System.out.println("the title is :"+facebooktitle);
		
	}
	
	

}
