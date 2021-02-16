package MyBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class Prperties {
	
	     static Properties prop;
	          @Test
	          public static void readproperties() throws IOException {
	        	  
	        	   prop=new Properties();
	        	  
	        	  InputStream input=new FileInputStream("G:\\Eclipselatest\\RevindAll\\src\\main\\java\\MyBasics\\config.properties");
	        	  
	        	  
	        	  prop.load(input);
	        	  
	        System.out.println(prop.getProperty("browser"));
	        	  
	        	  
	          }
	
	
	
	

}
