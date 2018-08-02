package basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwitchToWindows2 {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/Olasunkanmi/Downloads/drivers/chromedriver_3");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://support.google.com/accounts/answer"
				+ "/2917834?visit_id=0-636664529089788902-1620268133&p=signin_privatebrowsing&hl=en&rd=1");
	}
	
	@Test
	public void switchWindowTest(){
		driver.findElement(By.xpath("//div[@class='appbar-links']/descendant::a")).click();
		Set <String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		System.out.println("childWindow Title:"+driver.getTitle());
		
		WebElement welcomeText = driver.findElement(By.xpath("//div[contains(text(),'Welcome')]"));
		Assert.assertEquals(welcomeText.getText(), "Welcome");
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println("parentWindow Title:"+driver.getTitle());
		
	}

	@AfterMethod(enabled = true)
	public void tearDown(){
		driver.quit();
	}
}
