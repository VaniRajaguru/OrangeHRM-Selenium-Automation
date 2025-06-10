package commonActions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



public class CommonFunctions {
	 
	public static Properties properties =null;
	public static WebDriver driver;
	
	public static Logger logger = LogManager.getLogger(CommonFunctions.class);
	
	//To load the property file and read the details
	public Properties loadPropertyFile() throws IOException {
		
		//It provides a way to read data from a file
		FileInputStream fileInputStream = new FileInputStream("config.properties");
		//used to store and manage configuration settings or key-value pairs
		properties = new Properties();
		properties.load(fileInputStream);
		//return the values
		return properties;
	
	}
	
	//To launch the browser - before all the test cases 
	@BeforeSuite
	public void launchBrowser() throws IOException {
		logger.info("Orange HRM Test Begins");
		logger.info("Loading the property file");
		loadPropertyFile();
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		
		if(browser.equalsIgnoreCase("Chrome")) {
			logger.info("Launching Chrome Browser");
			driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Firefox")){
			logger.info("Launching Firefox Browser");
			driver= new FirefoxDriver();
		}else {
			System.out.println("Use either Chrome or Firefox");
		}
		
		driver.manage().window().maximize();
		logger.info("Heading to the Orange HRM portal");
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	
	//To close the browser - after all the test cases
	@AfterSuite
	public void tearDown() {
		logger.info("Quiting the browsers");
		driver.quit();
	}
	
	
	/*private static final Logger logger = LogManager.getLogger(CommonFunctions.class);

    public static void main(String[] args) {
        logger.debug("This is a DEBUG log");
        logger.info("This is an INFO log");
        logger.error("This is an ERROR log");
    }*/
}
