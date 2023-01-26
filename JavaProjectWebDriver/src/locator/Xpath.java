package locator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[]args) throws Exception
	{

//	System.setProperty("Webdriver.chrome.driver","C:\\Users\\comp\\eclipse-workspace\\JavaProjectWebDriver\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//	
//	driver.get("https://www.facebook.com/login/");
//	driver.manage().window().maximize();
	
	//1 xpath by attribute
	
	//tagName[@Attribute='attributeName'] -- here we can use any attribute
	
		//2 xpath by contains by attribute -- here we can write partial attribute value
		
		//tagName[contains(@attribute,'attribute value')]
		
		
	//3 xpath by text
		
	//tagName[text()='html text']
		
		//4 xpath by contains by text- here we can write parital text value.
		
		//tagName[contains(text(),'value')]
		
	//5 xpath by index - applicable to above 1-2-3 syntaxes (Multiple matching xpath)[index]
		
//	(//tagName[@attribute='attribute value'])[1]	
		
		
		
		
		
	//1 Relative xpath-
	


	
	//2 Absolute xpath-
	
	
	
	}
	
}
	
