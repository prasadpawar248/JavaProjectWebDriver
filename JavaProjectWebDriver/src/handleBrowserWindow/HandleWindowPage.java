package handleBrowserWindow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPage 
{
	public static void main(String[]args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().window().maximize();
		
//		String windowId=driver.getWindowHandle();  // this method will get the id of parent web page always.
//		System.out.println(windowId);  //CDwindow-D9117032D320837C1BC775F42B367FD0
		
		driver.findElement(By.xpath("//*[@id=\"cms-demo\"]/div[2]/div/div[1]/div/a")).click();
		
		Set<String>windowIds= driver.getWindowHandles();// this will return all browser window ids
		
	//1) By iterator method
//		Iterator<String> it=windowIds.iterator();
//		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//		
//		String firstId=it.next();
//		String secondId=it.next();
//		
//		System.out.println(firstId);
//		System.out.println(secondId);
		
	//2)List/ArrayList method
		List<String> list=new ArrayList(windowIds);
		
		String firstId=list.get(0);
		String secondId=list.get(1);
		
		System.out.println(firstId);
		System.out.println(secondId);
		
	//	driver.findElement(By.xpath("//*[@id=\"search\"]/button")).click(); // we can not perform task to another window until below method.
		driver.switchTo().window(secondId);
		driver.findElement(By.xpath("//*[@id=\"search\"]/button")).click();
		
		
	}
}
