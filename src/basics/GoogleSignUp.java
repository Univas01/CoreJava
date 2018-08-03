package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
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

public class GoogleSignUp {

    public static WebDriver driver;
    public static Properties prop;
    public static WebElement signUpBtn, faqBtn, searchTextBox, searchResult;

    public GoogleSignUp() {

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
        driver.get(prop.getProperty("urlGoogle"));
    }

    @Test
    public static void googleSignUpTest(){
        driver.findElement(By.xpath("//a[contains(text(), 'Create an account')]")).click();

        /*Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();

        String parentWindow = iterator.next();
        String registrationWindow = iterator.next();

        driver.switchTo().window(registrationWindow);
        System.out.println("Registration Window Title "+driver.getTitle());*/

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));

        WebDriverWait web = new WebDriverWait(driver, 10);
        web.until(ExpectedConditions.elementToBeClickable(firstName));
        firstName.sendKeys("first");

       /* JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].value = 'first';", firstName);
        jse.executeScript("document.getElementById('lastName').value = 'last';");*/


    }

    @AfterMethod (enabled = false)
    public void tearDown() {
        driver.quit();
    }
}
