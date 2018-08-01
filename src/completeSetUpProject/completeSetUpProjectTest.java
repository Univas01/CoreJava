package completeSetUpProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class completeSetUpProjectTest {

	public static WebDriver driver;
	public static Properties prop;
	
	public completeSetUpProjectTest() throws IOException {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/config.properties");
		prop.load(ip);
	}
	
	@BeforeMethod
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/browsers/chromedriver");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
	}

	@Test
	public void searchFunction() {
		
	}
	
	
	@AfterMethod(enabled = false)
	public void teatDown() {
		driver.quit();
	}
	
}
