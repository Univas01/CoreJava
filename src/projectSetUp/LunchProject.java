package projectSetUp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LunchProject {

	public static WebDriver driver;
	public static Properties prop;
	public static WebElement signUpBtn, faqBtn, searchTextBox, searchResult;

	public LunchProject() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/ola.ajala/Desktop/OwnProject/CoreJava/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void setUp() {

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/browsers/chromedriver");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/browsers/geckodriver");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get(prop.getProperty("urlTravelex"));
	}
	
	@Test(priority=1, enabled = false)
	public static void getTitleTest() {
		setUp();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Wire - Trusted money transfer by the experts");
	}
	
	@Test(priority=2, enabled = false)
	public static void signUpTest() {
		setUp();
		signUpBtn = driver.findElement(By.xpath("//a[contains(text(), 'Sign up')]"));
		signUpBtn.click();
		String signUpPageTitle = driver.getTitle();
		Assert.assertEquals(signUpPageTitle, "Wire - Register");		
	}
	
	@Test(priority=3)
	public static void faqTest() {
		setUp();
		String parentHandle = driver.getWindowHandle();
		faqBtn = driver.findElement(By.xpath("//a[@class='account-action']/child::*"));
		faqBtn.click();
		
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			//Assert.assertEquals(driver.getTitle(), "Wire - Help & Support");
			searchTextBox = driver.findElement(By.xpath("//input[@name='q']"));
			searchTextBox.sendKeys("travelex");
			searchTextBox.sendKeys(Keys.ENTER);
			searchResult = driver.findElement(By.xpath("//span[contains(text(), 'Search results for:')]"));
			Assert.assertEquals(searchResult.getText(), "Search results for:");	
			
		//	ExpectedCondition<WebElement> element = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(locator));
		}
		
		driver.close();
		driver.switchTo().window(parentHandle);	
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
