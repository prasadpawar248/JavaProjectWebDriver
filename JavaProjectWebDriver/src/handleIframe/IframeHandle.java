package handleIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle 
{
	public static void main(String[] args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[1]")));
		driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("hello");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frameset/frame[1]")));
		driver.findElement(By.xpath("//*[@id=\"id2\"]/div/input")).sendKeys("how are you");
		
		
		
	}

}
