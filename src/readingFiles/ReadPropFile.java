package readingFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import webdriverwaitmethods.WaitMethods;

public class ReadPropFile {

	public static WebDriver driver;
	public static Properties prop;
	public static WebElement userName, password, submit, logout;

	@BeforeMethod
	public static void setUp() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/browsers/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/browsers/geckodriver");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {
			System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
			driver = new SafariDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
	}

	@Test(dependsOnMethods = {"initialization"})
	public void loginTest() {
		userName = driver.findElement(By.xpath("//input[@name='username']"));
		password = driver.findElement(By.xpath("//input[@name='password']"));
		submit = driver.findElement(By.xpath("//input[@value='Login']"));

		WaitMethods.sendKeys(driver, userName, 3, prop.getProperty("userName"));
		WaitMethods.sendKeys(driver, password, 3, prop.getProperty("password"));
		JavascriptExecutor webdriver = (JavascriptExecutor) driver;
		webdriver.executeScript("arguments[0].click();", submit);
		driver.switchTo().frame(1);
		int size = driver.findElements(By.name("iframe")).size();
		System.out.println("iframe size is " + size);
		logout = driver.findElement(By.xpath("//a[@href='https://www.freecrm.com/index.cfm?logout=1']"));
		WaitMethods.clickMethod(driver, logout, 3);
	}
	
	@Test(dependsOnMethods =  {"loginTest"})
	public void tearDown() {
		driver.quit();
	}
}
