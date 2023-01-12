package handleAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleAlertOrPopupBox 
{
	public static void main(String[]args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
	
//switchTo alert method- used to handle alert,notification, pop-up message	
	//accept-close alert 
		
		driver.switchTo().alert();
		String ActText=driver.switchTo().alert().getText();
		String ExpText=	"I am an alert box!";
		
		if(ActText.equals(ExpText))
		{
			System.out.println("test is passed");
		}
		
		driver.switchTo().alert().accept();
		
	//dismiss-cancel alert
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		driver.switchTo().alert();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		
		driver.switchTo().alert().dismiss();
		
		
		
	}

}
