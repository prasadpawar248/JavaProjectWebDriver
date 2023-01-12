package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod 
{
	public static void main(String[] args)
	{
		System.setProperty("WebDriver.Chrome.Driver", "C:\\\\\\\\Users\\\\\\\\comp\\\\\\\\eclipse-workspace\\\\\\\\JavaProjectWebDriver\\\\\\\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	
	//navigate means if we want to move another web-page.
		
		driver.navigate().to("https://www.facebook.com/login.php");
		
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
	
		driver.close();
	
	
	}

}
