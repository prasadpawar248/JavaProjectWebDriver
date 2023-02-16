package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWith_blank_U_blank_P extends BaseClass
{
	public static void main(String []args) throws InterruptedException
	{
		openBrowser();
		
		LoginWithPom2 obj=new LoginWithPom2(driver); //with POM
		
//		obj.enterUsername("standard");
		obj.enterPassword("secret_sauce");
		obj.loginBtn();
		
		String expectedPopup="Epic sadface: Username is required";
		String actualPopup=obj.popupMsg();
		System.out.println(actualPopup);
		if(expectedPopup.equals(actualPopup))  
			System.out.println("Login with blank username and valid password test case passed");
		else
			System.out.println("Login with blank username and valid password test case failed");
		
		closeBrowser();
		
	}

}
