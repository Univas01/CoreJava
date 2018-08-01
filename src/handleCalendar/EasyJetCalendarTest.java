package handleCalendar;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EasyJetCalendarTest {

	public static WebDriver driver;
	public static Properties prop;
	public WebDriverWait waitForCalendarMonthText, waitForCalendarObject;

	public EasyJetCalendarTest() {
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

	@Test
	public void datePickerTest() {

		// click on departing date field
		driver.findElement(By.xpath("//span[contains(text(), 'Departing')]")).click();

			// wait for presence of calendar object
			waitForCalendarObject = new WebDriverWait(driver, 10);
			waitForCalendarObject.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//div[@ng-show='IsCalendar']/child::div[1]")));

			// calendar object in web element
			WebElement calenderObject = driver
					.findElement(By.xpath("//div[@ng-show='IsCalendar']/descendant::div[@class='calendar-month']"));

			// Loop through each date and select a date
			List<WebElement> dateList = calenderObject.findElements(By.tagName("div"));
			String datePicker = "20";
			for (WebElement cell : dateList) {
				if (cell.getText().equals(datePicker)) {
					System.out.println("Date found");
					cell.click();
					break;
				} 
			}
		}


	@AfterMethod(enabled = true)
	public void teatDown() {
		driver.quit();
	}

}
