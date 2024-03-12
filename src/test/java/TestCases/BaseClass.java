package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static WebDriver driver;
	@BeforeClass
	public void initialiseBrowser() 
	{
		driver = new ChromeDriver();
		
		
	}
     
	@AfterClass
	public void closeBDR()
	{
		driver.close();
		driver.quit();
	}
	
}
