package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScript1_execution  
{
public static void main(String[] args) 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	TestScript1 t= new TestScript1(driver);
	t.username("admin");
	t.password("manager");
	t.login();
	
	
	
	driver.quit();
	
	
}
}
