package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 
{
	public static void main(String[] args)
	{
	
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\comp\\eclipse-workspace\\JavaProjectWebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	//id locator- id attribute 
		
	//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mpbiles");
		
	//name locator - name attribute
		
		driver.findElement(By.name("url")).click();
		
		
	//className locator - className attribute
	//	driver.findElement(By.className("nav-input nav-progressive-attribute")).click();
		
	//linkText Locator - name of link
		
		//driver.findElement(By.linkText("Mobiles")).click();
		
	//partialLinkText locator - partial name of link
		
		//driver.findElement(By.partialLinkText("miniTV")).click();
	
	
	}

}
