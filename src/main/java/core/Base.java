package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	//This class will the parent of all other classes in this framework
		//Here we will define the property of WebDriver interface; 
		// Initialize class properties
		// we have logger that generates the log 
		// Methods to do the cross browser testing
		//Create methods for selecting browser types;
		//Create methods to generate logs 
		//Create methods to read the data from config file; 
		// in this class we use the OPPs concept 
		public static WebDriver driver; 
		public static Properties properties;// read the files with .properties extension
		public static Logger logger; // this class store our logs 
		private String configPath =".\\src\\test\\resources\\input\\config.properties"; 
		private String log4JPath = ".\\src\\test\\resources\\input\\log4j.properties"; 
		
			//class buffer is similar to interface class, its from java it reads the data from property file
			//reads the data as character. 
			//three steps involved to read the data from a file: 
			//1. Navigate to file, 2. Load/open 3. Read the character 
		public Base() { 
			//cread the ojb of BufferReader, and File reader class read the files. 
			try {
				BufferedReader reader = new BufferedReader(new FileReader(configPath));
				properties = new Properties(); 
				properties.load(reader);
				reader.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
			logger = Logger.getLogger(log4JPath); 
			PropertyConfigurator.configure(log4JPath);
			
			
		}
		public static String getURL() {
			String url = properties.getProperty("url"); 
			return url; 
		}
		
		public static String getBrowser() {
			String browser = properties.getProperty("browser"); 
			return browser; 
		}
		
		public static void openBrowser() {
			driver.get(getURL());
			
		}
		
		public static void selectBrowser() {
			switch(getBrowser()) { 
			
			case "Chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(); 
				break;
			
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver(); 
				break;
				
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
				
			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(); 
				
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
			
			
		}
		
		

}
