package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullPageScreenShot 
{
	public static void main(String[]args) throws IOException
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		
		
//full page screen shot
//		TakesScreenshot ts=driver;  //	if this syntax will there WebDriver driver=new ChromeDriver(); then we need to do casting
//									//	TakesScreenshot ts=(TakesScreenshot) driver; 
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File trg=new File(".\\ScreenShots\\homepage.png");
//		FileUtils.copyFile(src, trg);
		
//screen shot of portion/section
//		WebElement portion=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]"));
//		File src1=portion.getScreenshotAs(OutputType.FILE);
//		File trg1=new File(".\\ScreenShots\\portion.png");
//		FileUtils.copyFile(src1, trg1);
		
//screen shot of web element
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/a/img"));
		File src2=ele.getScreenshotAs(OutputType.FILE);
		File trg2=new File(".\\ScreenShots\\logo.png");
		FileUtils.copyFile(src2, trg2);
		
		
		
		
		
		
	}

}
