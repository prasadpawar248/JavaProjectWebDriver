package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick 
{
	public static void main(String[]args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
		WebElement day=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		
		Actions obj=new Actions(driver);
		obj.contextClick(email).perform();  //Right click action of mouse.
		
		obj.doubleClick(day).perform();  //double click of mouse.
		
		
	}

}
