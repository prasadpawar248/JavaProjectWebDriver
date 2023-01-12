package webDriverHandlingWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicWebTable 
{
	public static void main(String[]args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"input-username\"]")).sendKeys("demo");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("demo");
		driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
		
//		driver.switchTo().alert();
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert();
//		driver.switchTo().alert().dismiss();
//		driver.switchTo().alert();
		driver.findElement(By.xpath("//*[@id=\"modal-security\"]/div/div/div[1]/button")).click();
		
	}

}
