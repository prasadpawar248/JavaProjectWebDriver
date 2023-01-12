package program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculationMoneyControl 
{
	
	public static void main(String[]args) throws IOException
	{
	System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\comp\\\\eclipse-workspace\\\\JavaProjectWebDriver\\\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.moneycontrol.com/personal-finance/tools/FD-calculator");
	
	driver.manage().window().maximize();
	
	FileInputStream file=new FileInputStream("F:\\D\\Software testing\\My docs\\Selenium\\Excel_files\\fixed diposite data.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int rowCount=sheet.getLastRowNum();  //4
	int cellCount=sheet.getRow(0).getLastCellNum(); //5
	
	for(int i=1;i<=rowCount;i++)
	{
		XSSFRow row=sheet.getRow(i);
		
		int cell0=(int)row.getCell(0).getNumericCellValue();
		WebElement a=driver.findElement(By.id("edulonvalue_1")); //sendKeys method not accept numeric data so we used string.valueOfmethod.
		a.clear();
		a.sendKeys(String.valueOf(cell0));
		
		int cell1=(int)row.getCell(1).getNumericCellValue();
		WebElement b=driver.findElement(By.id("edulonvalue_2"));
		b.clear();
		b.sendKeys(String.valueOf(cell1));
		
		int cell2=(int)row.getCell(2).getNumericCellValue();
		WebElement c=driver.findElement(By.id("edulonvalue_3"));
		c.clear();
		c.sendKeys(String.valueOf(cell2));
		
		String cell3=row.getCell(3).getStringCellValue();
		
		String Monthly="Monthly";
		String Quaterly="Quaterly";
		String HalfYearly="Half Yearly";
		String Yearly="Yearly";
		if(cell3.equals(Monthly))
		{
			driver.findElement(By.xpath("/html/body/div[14]/section/div/div/div[1]/div/div/div/div[4]/div/div[2]/div/div/span[1]")).click();
		}
		else if(cell3.equals(Quaterly))
		{
			driver.findElement(By.xpath("/html/body/div[14]/section/div/div/div[1]/div/div/div/div[4]/div/div[2]/div/div/span[2]")).click();
		}
		else if(cell3.equals(HalfYearly))
		{
			driver.findElement(By.xpath("/html/body/div[14]/section/div/div/div[1]/div/div/div/div[4]/div/div[2]/div/div/span[3]")).click();
		}
		else if(cell3.equals(Yearly))
		{
			driver.findElement(By.xpath("/html/body/div[14]/section/div/div/div[1]/div/div/div/div[4]/div/div[2]/div/div/span[4]")).click();
		}
		
		
		int cell4=(int)row.getCell(4).getNumericCellValue();
		WebElement d=driver.findElement(By.id("edulonvalue_4"));
		d.clear();
		d.sendKeys(String.valueOf(cell4));
		
		driver.findElement(By.cssSelector(".btn_common MR15")).click();
		
		String actualValue=driver.findElement(By.xpath("/html/body/div[14]/section/div/div/div[1]/div/div/div/div[7]/div[2]/div[3]/div/span[2]")).getText();
		
		int originalValue=(int)row.getCell(5).getNumericCellValue();
		if(Double.parseDouble(actualValue)==originalValue)
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		driver.findElement(By.id("reset_btn")).clear();
		
	}
	
	}

}
