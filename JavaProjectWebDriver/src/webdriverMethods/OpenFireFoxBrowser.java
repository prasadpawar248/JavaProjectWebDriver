package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFoxBrowser 
{
	public static void main(String[]args)
	{
		System.setProperty("Webdriver.gecko.driver","F:\\D\\Software testing\\My docs\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//Thread.sleep(5000);
		driver.get("https://www.facebook.com/login/"); 
	}

}
