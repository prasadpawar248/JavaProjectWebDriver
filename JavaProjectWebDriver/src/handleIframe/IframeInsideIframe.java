package handleIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeInsideIframe 
{
	public static void main(String[]args)
	{
	System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[3]/a")).click();
	driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
	
	
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"))); //by webelement
	driver.switchTo().frame(0); //this is inside frame (iframe) by index
	
	driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("hello");
	
	
	
	}

}
