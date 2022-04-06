package Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import junit.framework.TestCase;

public class Wait extends TestCase{
	public static void testWait() 
	{
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationbookstore.dev/"); 
		driver.findElement(By.id("searchBar")).sendKeys("testing");
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li.ui-screen-hidden")));
		assertEquals(1, driver.findElements(By.cssSelector("li:not(.ui-screen-hidden)")).size());
		driver.close();
	}
	
	public static void main(String args[])
	{
		testWait();
	}
}