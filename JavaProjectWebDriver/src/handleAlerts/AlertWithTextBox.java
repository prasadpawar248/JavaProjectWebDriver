package handleAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextBox 
{
	public static void main(String[] args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		
		driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Testing"); //alert with text box is used to sendkeys method
		driver.switchTo().alert().accept();
		
		String actText=driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
		String expText= "Hello Testing How are you today";
		
		if(actText.equals(expText))
		{
			System.out.println("test is passed");
		}
		
		
	}

}
