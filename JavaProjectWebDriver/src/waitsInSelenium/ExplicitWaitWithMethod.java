package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitWithMethod 
{
	public static void main(String[]args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		By loc1=By.xpath("//h3[text()='Selenium - Wikipedia']");
		By loc2=By.xpath("//*[@id=\"n-mainpage-description\"]");
		
		method(driver,loc1,5).click();	
	//	method(driver,loc2,5).click();  this is not possible bcoz webpage url is different.	
	}
	
	
	public static WebElement method(WebDriver driver, By locator, int time)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement a=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium - Wikipedia']")));
		return driver.findElement(locator);	
	}

}


