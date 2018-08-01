package handleCalendar;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class handleCalendarByJS {

	public static WebDriver driver;
	public static Properties prop;
	public WebDriverWait waitForCalendarMonthText, waitForCalendarObject;

	public handleCalendarByJS() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/config.properties");
			prop.load(ip);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/browsers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("urlEasyJet"));
	}

	
	@Test (enabled = true)
	public static void  datePickerByJSTest() {
		try {
		Thread.sleep(5000);
		WebElement dateField = driver.findElement(By.xpath("//span[contains(text(), 'Departing')]"));
		String dateValue = "Sun 29 July 2018";
		selectDateByJS(dateField,dateValue);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void selectDateByJS(WebElement element, String dateValue) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+dateValue+"');", element);
	}


	@AfterMethod(enabled = false)
	public void teatDown() {
		driver.quit();
		
	}

}
