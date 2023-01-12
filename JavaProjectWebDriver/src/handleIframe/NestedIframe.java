package handleIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe 
{
	public static void main(String[]args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frameset/frame[2]")));
		driver.switchTo().frame(0);
	//	driver.switchTo().frame(driver.findElement(By.xpath("/html/body/center/iframe")));
		
		driver.findElement(By.xpath("//*[@id=\"i5\"]/div[3]")).click();
	//	driver.findElement(By.xpath("//*[@id=\"i19\"]/div[3]")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//*[@id=\"id3\"]/div/input")).sendKeys("iframe");
		
		
	}

}
