package basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SwitchingWindowsConcept {

	static WebDriver driver;
	
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/browsers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://wire.travelex.co.uk/");
		
		driver.findElement(By.xpath("//a[@class='account-action']/child::*")).click();
		
		Set <String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		
		String parentWindow = it.next(); // Pointer to parent window
		String childWindow = it.next(); // Pointer to child window
		
		driver.switchTo().window(childWindow);
		System.out.println("Child Window Title"+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Wire - Help & Support");
		
		WebElement two = driver.findElement(By.xpath("//h2[contains(text(), 'The basics of Travelex Wire')]"));
		System.out.println("Getting text from Child Window: "+two.getText());

		WebElement searchTextBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchTextBox.sendKeys("travelex");
		searchTextBox.sendKeys(Keys.ENTER);
		
		driver.close();
		driver.switchTo().window(parentWindow);
		
		WebElement three = driver.findElement(By.xpath("//h1[contains(text(), 'currency')]"));
		System.out.println("Getting text from Parent Window: "+three.getText());
		
		driver.close();
		
	}

}
