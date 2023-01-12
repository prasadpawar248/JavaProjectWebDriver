package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScreenShot 
{
	public static void main(String[]args) throws IOException
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("login")).click();  //click on login button
//		Set<String> windoID=driver.getWindowHandles();
//		
//		Iterator <String> it=windoID.iterator();
//		String first=it.next();
//		String second =it.next();
//		
//		System.out.println(first);
//		System.out.println(second);
//		
//		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/div[2]")).getText());
		
		WebElement popupmsg=driver.findElement(By.xpath("//*[@id=\"loginform\"]"));
		File src=popupmsg.getScreenshotAs(OutputType.FILE);
		File loc=new File(".\\ScreenShots\\popupmsg.png");
		FileUtils.copyFile(src, loc);
		
	}

}
