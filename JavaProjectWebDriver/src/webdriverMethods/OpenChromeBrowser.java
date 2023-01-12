package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser 
{
	public static void main(String[] args) 
	{
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\comp\\eclipse-workspace\\JavaProjectWebDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Thread.sleep(5000);
		driver.get("https://www.facebook.com/login/"); 
	//	driver.get("https://www.facebook.com/login/"); 
		
		String OrigTitle = "Log in to Facebook";
		
		String ActTitle=driver.getTitle();
		
		if(ActTitle.equals(OrigTitle))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("title is not correct");
		}
	
		driver.close();
	}

}
