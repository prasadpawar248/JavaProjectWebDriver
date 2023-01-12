package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector 
{
	public static void main(String[] args)
	{
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\comp\\eclipse-workspace\\JavaProjectWebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
//Tag and id  - 
//		driver.findElement(By.cssSelector("#email")).sendKeys("prasad");
//		driver.findElement(By.cssSelector("input#email")).sendKeys("prasad");
		
//Tag and class
//		driver.findElement(By.cssSelector(".inputtext")).sendKeys("akshay");
//		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("akshay");
		
//Tag and attribute
//		driver.findElement(By.cssSelector("[name=email]")).sendKeys("rohit");
//		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("rohit");
		
//Tag,class and attribute
		
		driver.findElement(By.cssSelector("input.inputtext[id=email]")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input.inputtext[id=pass]")).sendKeys("rahul123");
		
		
	}
	

}
