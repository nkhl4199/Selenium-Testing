package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.TestCase;

public class Screenshot extends TestCase{
	
	public static void testTakeScreenshot() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kitchen.applitools.com/ingredients/table"); 
		driver.findElement(By.id("column-button-name")).click(); 
		File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile, new File("C://Users//Nkhl//eclipse-workspace//Selenium//src//test.png"));
		driver.close();
	}
	
	public static void main(String args[]) throws IOException
	{
		testTakeScreenshot();
	}
}