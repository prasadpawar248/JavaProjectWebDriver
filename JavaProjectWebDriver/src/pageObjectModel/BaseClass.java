package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	static WebDriver driver;
	
	public static void openBrowser()
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		System.out.println("Browser opened");
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Url opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void closeBrowser()
	{
		driver.quit();
		System.out.println("Browser closed");
		System.out.println("End of program");
	}

}
