package chrome;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {
            public static void main(String[] args) throws IOException{
                System.setProperty("webdriver.chrome.driver",
                		System.getProperty("user.dir") + "/browsers/chromedriver");
                
                ChromeOptions options = new ChromeOptions();
                options.addArguments("headless");
                WebDriver driver = new ChromeDriver(options);
                
                driver.get("https://www.ebay.co.uk/");
                System.out.println("Title is: " + driver.getTitle());
                File scrFile = ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File("/Users/Olasunkanmi/Documents/workspace/CoreJava/screenshots/screen.png"));
                driver.quit();
            }
        }
