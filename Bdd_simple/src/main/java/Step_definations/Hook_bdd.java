package Step_definations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook_bdd {
	private static WebDriver wd;
	
	
	@Before("@login")
	public void init() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\X240\\OneDrive\\Desktop\\nikita\\chromedriver_win32\\chromedriver.exe");
	wd=new ChromeDriver();
	wd.get("http://automationpractice.com/index.php");
	Thread.sleep(5000);
	
	wd.manage().window().maximize();
	
	Thread.sleep(3000);
	}
	
	@After("@cateoryTest")
	public void logout()
	{
		wd.close();
	}
	
	public static WebDriver getDriver()
	{
		return wd;
		
	}
	
}
