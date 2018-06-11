package readingFiles;

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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReadPropFile {

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
	public void loginTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getProperty("userName"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
		Thread.sleep(3000);
		JavascriptExecutor webdriver = (JavascriptExecutor) driver;
		webdriver.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@value='Login']")));
		
		/*WebElement crmpro = driver.findElement(By.xpath("//td[@class='logo_text']"));
		if (crmpro.isDisplayed()) {
			System.out.println("loginTest is a Pass");
		}else{
			System.out.println("loginTest is a Fail");
		}*/
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame(0);
		
		int size = driver.findElements(By.name("iframe")).size();
		System.out.println("iframe size is " + size);
		
		//driver.findElement(By.xpath("//a[@href='https://www.freecrm.com/index.cfm?logout=1']")).click();
		
		Thread.sleep(3000);
		webdriver.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@href='https://www.freecrm.com/index.cfm?logout=1']")));
		
	}
	
	@Test(dependsOnMethods =  {"loginTest"})
	public void tearDown() {
		driver.quit();
	}
}
