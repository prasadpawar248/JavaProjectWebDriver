  package dropDownList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JQueryDropDown 
{
	public static void main(String[]args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.htmlelements.com/demos/dropdownlist/checkboxes/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.cssSelector(".smart-buttons-container")).click();
//		driver.findElement(By.xpath("//span[@class='smart-content-label']")).click();
		
		method( driver,"Breve");
	//	method( driver,"all");
		
		}
	
		public static void method(WebDriver driver,String...value)
		{
			WebElement alldata=driver.findElement(By.xpath("//*[@id=\"dropDownListf0c4ActionButton\"]")); // path is not correct
			Select option=new Select(alldata);
			List<WebElement> alloption=option.getOptions();
			
			if(!value[0].equals("all"))
			{
				for(WebElement singleValue:alloption)
				{
					String text=singleValue.getText();
					if(value.equals(text))
					{
						singleValue.click();
						break;
					}
				}
			}
			else
			{
				for(WebElement singleValue:alloption)
				{
				singleValue.click();
				}
			}
			
			
		}
	
}
