package webDriverHandlingWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable
{
	public static void main(String[]args)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		//1- find how many colums are present.
		int col=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
		System.out.println("count or colum: "+col);
		
		//2- find how many row are present.
		int row=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		System.out.println("Count of row: "+row);
		
		//3-Retrieve text in table
		String value=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]")).getText();
		System.out.println(value);
		
		//print all table data
		
		/*for(int i=2;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				String text=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text+"       ");
			}
			System.out.println();
		}*/
		
		
		//4-retrieve specific element from table.
		
		for(int r=2; r<=row;r++)
		{
			String sElement=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td[1]")).getText();
			
			if(sElement.equals("Amazon"))
			{
				System.out.print(sElement+" ");
				String contact=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td[2]")).getText();
				System.out.print(contact+" ");
				String country=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td[3]")).getText();
				System.out.print(country+" ");
			}
		}
		
		
		
		
		
	}

}
