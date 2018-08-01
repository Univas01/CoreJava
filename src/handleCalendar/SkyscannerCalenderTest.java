package handleCalendar;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SkyscannerCalenderTest {

	public static WebDriver driver;
	public static Properties prop;

	public SkyscannerCalenderTest() {
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
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("urlSkyScanner"));
	}

	@Test
	public void searchFunction() {
		// Click on departing textbox
		driver.findElement(By.xpath("//input[@id='depart-fsc-datepicker-input']")).click();
		
		// Wait until table is present
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@class='bpk-calendar-grid-2VWOF']")));
		
		WebElement calendarObject = driver.findElement(By.xpath("//table[@class='bpk-calendar-grid-2VWOF']"));
		
		List<WebElement> departList = calendarObject.findElements(By.tagName("td"));
		String departDate = "28";
		for (WebElement cell : departList) {
			if (cell.getText().equals(departDate)) {
				System.out.println("Cell found");
				cell.click();
				break;
			} else {
				System.out.println("Cell NOT found");
			}
		}
	}

	@AfterMethod(enabled = true)
	public void teatDown() {
		driver.quit();
	}

}
