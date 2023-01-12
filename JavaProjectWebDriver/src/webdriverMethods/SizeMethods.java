package webdriverMethods;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeMethods 
{
	public static void main(String [] args)
	{
		System.setProperty("Webdriver.chrome.driver", "C://Users//comp//eclipse-workspace//JavaProjectWebDriver//chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
	//1 Maximize method-// use to maximize the size/dimension browser
		driver.manage().window().maximize();    
		
	//2 setSize method- this method is use to change the dimension or Size
		Dimension name=new Dimension(1000,500);
		
		driver.manage().window().setSize(name);
	 
	//3 setPosition method-this method is use to set the position of browser on X-Y Axis.
		Point p=new Point(0,0);
		driver.manage().window().setPosition(p);
		
	//4 getSize-This method is use to identify the dimension or Size
		
		Dimension dim=driver.manage().window().getSize();
		System.out.println(dim);
		
	//5 getPosition-this method is used to get position of browser on X-Y axis.
		Point pos=driver.manage().window().getPosition();
		System.out.println(pos);
		
		
	}
	

}
