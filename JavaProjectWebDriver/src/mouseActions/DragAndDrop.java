package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	public static void main(String[]args) 
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
		
		WebElement photo=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]"));
		WebElement trash=driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		
		Actions obj= new Actions(driver);
		obj.dragAndDrop(photo, trash).perform();
		
	}

}
