package rightmove;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import webdriverwaitmethods.WaitMethods;

public class PageTests {

	public static WebDriver driver;
	public static Properties prop; 

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
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get(prop.getProperty("URL"));
		
	}

	@Test(dependsOnMethods = {"initialization"})
	public void homePageTest() {
		
	WebElement searchBox = driver.findElement(By.name("searchLocation"));
	WebElement forSale = driver.findElement(By.id("buy"));
	WebElement toRent = driver.findElement(By.id("rent"));
	
	WaitMethods.sendKeys(driver, searchBox, 10, "SW9 0EQ");
	WaitMethods.clickMethod(driver, forSale, 10);
	
	Select searchRadius = new Select(driver.findElement(By.id("radius")));
	Select minPriceRange = new Select(driver.findElement(By.id("minPrice")));
	Select maxPriceRange = new Select(driver.findElement(By.id("maxPrice")));
	Select minBedrooms = new Select(driver.findElement(By.id("minBedrooms")));
	Select maxBedrooms = new Select(driver.findElement(By.id("maxBedrooms")));
	Select displayPropertyType = new Select(driver.findElement(By.id("displayPropertyType")));
	Select addedToSite = new Select(driver.findElement(By.id("maxDaysSinceAdded")));
	
	WebElement findPropertiesButton = driver.findElement(By.id("submit"));
	
	searchRadius.selectByIndex(5);
	minPriceRange.selectByIndex(8);
	maxPriceRange.selectByIndex(10);
	minBedrooms.selectByIndex(2);
	maxBedrooms.selectByIndex(3);
	displayPropertyType.selectByIndex(2);
	addedToSite.selectByIndex(3);
	
	WaitMethods.clickMethod(driver, findPropertiesButton, 10);
	}
	
	@Test(enabled = false, dependsOnMethods =  {"homePageTest"})
	public void tearDown() {
		driver.quit();
	}
}
