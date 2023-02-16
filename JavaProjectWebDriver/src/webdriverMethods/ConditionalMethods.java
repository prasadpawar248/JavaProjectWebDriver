package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods 
{
	public static void main(String[] args)

	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	//1 isEnabled method is used to check weather web element is accepting input or not.
	//if its enable than o/p will true or if its disable than o/p will false.
		
		WebElement email =driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
		System.out.println(email.isEnabled());  //true
		
	//2 isDisplayed method is used to check web element is present or not.
	//if its displayed than o/p will true or if its not displayed than o/p will false.
		
		System.out.println(email.isDisplayed()); //true
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		
		driver.get("https://www.facebook.com/signup");
		
	//3 isSelected method is used to check radio/check box is selected or not
	//it will give o/p either true or false.
		
		WebElement gender=driver.findElement(By.xpath("//*[@type='radio']"));  //female path
		
	//	gender.isEnabled(); //true
		System.out.println(gender.isEnabled());
		gender.click();
	//	gender.isSelected(); //true	
		System.out.println(gender.isSelected());
		
		
		 
		
		
		
		
	}


}
