package lunchBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LunchBrowswerTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/Olasunkanmi/Downloads/drivers/chromedriver_3");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.ebay.co.uk/");
	}
	
	@Test
	public void initialization(){
		WebElement advancedLink = driver.findElement(By.xpath("//a[contains(text(), 'Advanced')]"));
		advancedLink.click();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}
