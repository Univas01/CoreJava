package getnumberoflinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AvailableLinks {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/Olasunkanmi/Documents/workspace/CoreJava/browsers/chromedriver");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://elementalselenium.com/tips/38-headless");
		
	}
	
	@Test
	public void findAllLinksTest(){
		List<WebElement>  links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i = 0; i<links.size(); i++){
			System.out.println(links.get(i).getText());
		}
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
