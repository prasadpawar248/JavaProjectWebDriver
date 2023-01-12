package dropDownList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsDropListSorted
{
	public static void main(String[]args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement droplist=driver.findElement(By.id("input-country"));
		Select list=new Select(droplist);
		List<WebElement> options=list.getOptions();	
		
		ArrayList <String>originalList=new <String>ArrayList();
		ArrayList <String>sortedList=new <String>ArrayList();
		
		for(WebElement value:options)
		{
			originalList.add(value.getText());
			sortedList.add(value.getText());
		}
		
//		System.out.println(originalList);
//		System.out.println(sortedList);
		
		Collections.sort(sortedList);
	
//		System.out.println(originalList);
//		System.out.println(sortedList);
		
		if(originalList.equals(sortedList))
		{
			System.out.println("Dropdown List is sorted");
		}
		else
		{
			System.out.println("Dropdown List is not sorted");
		}
	}

}
