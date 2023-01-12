package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2
{
	public static void main(String[] args)
	{
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\comp\\eclipse-workspace\\JavaProjectWebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	//className locator - this will find no. of images
		
		int images=	driver.findElements(By.className("a-carousel-card")).size();
		System.out.println(images);
		
	//tagName locator- this will find no. links
		
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println(links);
	}

}


