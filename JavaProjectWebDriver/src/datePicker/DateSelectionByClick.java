
package datePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateSelectionByClick 
{
	public static void main(String[] args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		String mon="Aug",yr="2023";
		String day="24";
		driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
		
		while(true)
		{
			String monthYear=driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();
			String my[]=monthYear.split(" ");
			String month=my[0];
			String year=my[1];
			
			if(mon.equals(month) && yr.equals(year))
			{
				break;
			}
			else
			{
			driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
			}
		}
		
		List<WebElement> AllDats= driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]//tr/td"));
			
		for(WebElement d:AllDats)
		{
			String Day=d.getText();
			if(Day.equals(day))
			{
				d.click();
				break;
			}
		}
		
		
		
		
		
	}

}
