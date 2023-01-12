package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods 
{
	public static void main(String [] args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		
		WebDriver obj = new ChromeDriver();
		
	//1 get method-if we want of open webpage than paste url in get method.
		obj.get("https://www.facebook.com/login/");
		
	//2 getTitle method-if we want to find title of page than this method is used.
		
		System.out.println(obj.getTitle());  //Log in to Facebook
		
	//3 get current url- if we want to get url of current page
		
		System.out.println(obj.getCurrentUrl());  // https://www.facebook.com/login/
		
	//4 get page source-if we want to get page source than this method is used.
		
		//System.out.println(obj.getPageSource());
		
	//5 get text- if we want to find some text is present in web page or not than this method is used.
		
		String text=obj.findElement(By.xpath("//*[@id=\"header_block\"]/span/div")).getText();  //Log in to Facebook
		System.out.println(text);
		
		obj.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		
		obj.close();
		
		
	}

}
