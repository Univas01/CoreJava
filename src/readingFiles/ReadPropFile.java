package readingFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class ReadPropFile {

	WebDriver driver;

	@Test
	public void setUp() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/config.properties");
		prop.load(ip);

		String userName = prop.getProperty("name");
		String userAge = prop.getProperty("age");
		String url = prop.getProperty("URL");
		String browserName = prop.getProperty("browser");

		System.out.println(userName);
		System.out.println(userAge);
		System.out.println(url);
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/browsers/chromedriver");
			driver = new ChromeDriver();
		} else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/browsers/geckodriver");
			driver = new FirefoxDriver();
		}
		driver.get(url);

	}

}
