package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.TestCase;

public class Navigation extends TestCase{
	public static void testNavigate() 
	{
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kitchen.applitools.com/ingredients/links"); 
		driver.findElement(By.id ("button-the-kitchen-table")).click(); 
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab)); 
		assertTrue(driver.findElement(By.id("fruits-vegetables")).isDisplayed());
	}
	
	public static void main(String args[])
	{
		testNavigate();
	}
}