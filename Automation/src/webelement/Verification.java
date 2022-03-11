package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification 
{
public static void main(String[] args) 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	
	WebElement UN = driver.findElement(By.id("username"));
	
	if(UN.isDisplayed())
	{
		System.out.println("displayed"); 
	}
	else
	{
		System.out.println("Not displayed");
	}
	
	WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
	
	if(login.isEnabled())
	{
		System.out.println("enabled"); 
	}
	else
	{
		System.out.println("Not enabled");
	}
	
	
	driver.quit();
	
}
}
