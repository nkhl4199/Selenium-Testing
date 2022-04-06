package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

public class FilePicker extends TestCase{
	public static void testFileUpload() 
	{
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kitchen.applitools.com/ingredients/file-picker"); 
		driver.findElement(By.id("photo-upload")).sendKeys("C:/Users/Nkhl/eclipse-workspace/Selenium/src/Test/pic.jpg");
		assertEquals(1, driver.findElements(By.className("FilePicker_filePickerPreview__ACgv7")).size());
		driver.close();
	}
	
	public static void main(String args[])
	{
		testFileUpload();
	}
}
