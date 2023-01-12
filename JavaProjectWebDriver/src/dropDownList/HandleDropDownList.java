package dropDownList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownList 
{
	public static void main(String[]args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement dropDown= driver.findElement(By.id("input-country"));
		
		Select dropDownElem=new Select(dropDown);
//1
		//dropDownElem.selectByVisibleText("Australia");  // selectByVisibleTest method we need to pass element name in drop down list
//2	
		//dropDownElem.selectByIndex(4);  //using this method we need to pass index of element
//3	
		//dropDownElem.selectByValue("30"); //using this method we need to pass value of element.
		
//4 getOption method
		List <WebElement> allElement=dropDownElem.getOptions();
//		for(WebElement singleElement:allElement)
//		{
//			System.out.println(singleElement.getText());
//		}
		
		for(WebElement singleElement:allElement)
		{
			if((singleElement.getText()).equals("India"))
			{
				singleElement.click();   
				break;
			}
		}
	
	  
	}

}
