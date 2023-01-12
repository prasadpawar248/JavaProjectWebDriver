package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods 
{
	public static void main(String[] args)
	{
		System.setProperty("Webdriver.chrome.driver", "C://Users//comp//eclipse-workspace//JavaProjectWebDriver//chromedriver.exe");
	
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();		
		WebElement a=driver.findElement(By.xpath("//input[@type='text']"));
		
		a.sendKeys("samsung moblie"); // this method is used to enter value in text box
		a.clear();                    // this method is used to clear entered input in text box
		a.sendKeys("iphone");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();  // this method is used to click on button,tab,links.
		
//		String text=driver.findElement(By.xpath("//*[@id=\"glow-ingress-line2\"]")).getText();
//		System.out.println(text);
		
		
	
		
		
		
		
	}
	

}
