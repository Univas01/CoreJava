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

public class SpiceJetCalendarTest {

	public static WebDriver driver;
	public static Properties prop;
	public WebDriverWait waitForCalendarMonthText, waitForCalendarObject;

	public SpiceJetCalendarTest() {
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
		driver.get(prop.getProperty("urlSpiceJet"));
	}

	@Test
	public void datePickerTest() {

		// click on departing date field
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']")).click();

		// wait for presence of calendar object
		waitForCalendarObject = new WebDriverWait(driver, 5);
		waitForCalendarObject.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@class='ui-datepicker-calendar']")));

		// calendar object in web element
		WebElement calenderObject = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));

		// Loop through each date and select a date
		List<WebElement> dateList = calenderObject.findElements(By.tagName("td"));
		String datePicker = "25";
		for (WebElement cell : dateList) {
			if (cell.getText().equals(datePicker)) {
				System.out.println("Date found");
				cell.click();
				break;
			}
		}
	}

	@AfterMethod(enabled = false)
	public void teatDown() {
		driver.quit();
	}

}
