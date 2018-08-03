package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TravelxFAQ {

    public static WebDriver driver;
    public static Properties prop;
    public static WebElement signUpBtn, faqBtn, searchTextBox, searchResult;

    public TravelxFAQ() {

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

    @BeforeMethod
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

    @Test
    public static void googleSignUpTest(){
        driver.findElement(By.xpath("//div[@class='landing-page']/descendant::*/abbr[contains(text(), 'FAQ')]")).click();

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();

        String parentWindow = iterator.next();
        String childnWindow = iterator.next();

        driver.switchTo().window(childnWindow);
        System.out.println("child Window Title is: "+driver.getTitle());

        WebElement searchFTF = driver.findElement(By.xpath("//input[@name='q']"));
        searchFTF.clear();
        searchFTF.sendKeys("Wire Transfer");
        searchFTF.sendKeys(Keys.ENTER);

        driver.close(); // close current window (child window)

        driver.switchTo().window(parentWindow);
        System.out.println("Parent Window Title is: "+driver.getTitle());



    }

    @AfterMethod (enabled = false)
    public void tearDown() {
        driver.quit();
    }
}
