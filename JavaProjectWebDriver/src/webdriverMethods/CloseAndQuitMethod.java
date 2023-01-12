package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuitMethod 
{
	public static void main(String[] args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		
		ChromeDriver obj=new ChromeDriver();
		
		
		obj.get("https://www.amazon.in/");
		obj.get("https://en-gb.facebook.com/");
		
		obj.close();  //  close the current tab of the browser
		obj.quit();  // close all the tabs of browser.
		
		
	}

}
