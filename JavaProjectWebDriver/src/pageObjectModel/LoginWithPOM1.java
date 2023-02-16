package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginWithPOM1 
{
	WebDriver driver;
	
	LoginWithPOM1(WebDriver d)
	{
		driver=d;
		
	}

	By usename=By.xpath("//input[@id='user-name']");  //username
	By password=By.xpath("//input[@id='password']"); //password
	By loginBtn=By.xpath("//input[@id='login-button']"); //loginBtn
	
	public void enterUsername(String u) throws InterruptedException  
	{
		Thread.sleep(2000);
		driver.findElement(usename).sendKeys(u);
		System.out.println("Username entered");
	}
	
	public void enterPassword(String p) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(password).sendKeys(p);;
		System.out.println("Password entered");
	}
	
	public void loginBtn() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(loginBtn);
		System.out.println("Clicked on login button");
	}
	
	
}
