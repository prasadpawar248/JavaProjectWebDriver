package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CloseAndQuitMethod 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("https://demo.opencart.com");
//		obj.get("https://en-gb.facebook.com/");
//		
//		obj.close();  //  close the current tab of the browser
//		obj.quit();  // close all the tabs of browser.
		
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='dropdown-item'])[4]")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("akshay");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("pawar");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("akshaypawar789@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("aksahy@789");
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
//		checkbox.click();
		WebElement continu=driver.findElement(By.xpath("//button[@type='submit']"));
//		continu.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(checkbox).click().build().perform();
		actions.moveToElement(continu).click().build().perform();
		
	}

}
