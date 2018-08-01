package basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitializingFileProp {

	public static WebDriver driver;
	public static Properties prop;

	public InitializingFileProp() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"/Users/Olasunkanmi/Documents/workspace/CoreJava/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/Olasunkanmi/Documents/workspace/CoreJava/browsers/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver",
					"/Users/Olasunkanmi/Documents/workspace/CoreJava/browsers/geckodriver");
			driver = new FirefoxDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(prop.getProperty("URL"));
	}
	
	public void quitBrowser(){
		driver.quit();
	}

	public static void main(String[] args) throws IOException {

		InitializingFileProp setUp = new InitializingFileProp();
		setUp.initialization();
		setUp.quitBrowser();
	}

}
