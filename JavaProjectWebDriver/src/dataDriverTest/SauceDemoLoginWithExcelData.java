package dataDriverTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLoginWithExcelData {

		public static void main(String[] args) throws InterruptedException, IOException
		{
			System.setProperty("Webdriver.chrome.driver","C:\\Users\\comp\\eclipse-workspace\\JavaProjectWebDriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			String path="F:\\D\\Software testing\\My docs\\Selenium\\Excel_files\\sauseDemoLogin.xlsx";
			FileInputStream file =new FileInputStream(path);
			
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet =workbook.getSheet("Sheet2");
			
			XSSFRow row=sheet.getRow(1);
			XSSFCell cell0=row.getCell(0);
			XSSFCell cell1=row.getCell(1);
			
			String usernameData=cell0.getStringCellValue();
			String passwordData=cell1.getStringCellValue();
			
			
			WebElement username=driver.findElement(By.id("user-name"));
			username.sendKeys("usernameData");
			Thread.sleep(2000);
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("passwordData");
			Thread.sleep(2000);
			
			WebElement loginbtn=driver.findElement(By.id("login-button"));
			loginbtn.click();
			Thread.sleep(2000);
		
		
	}

}
