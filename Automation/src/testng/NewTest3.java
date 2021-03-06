package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest3 {
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
	public void tc3() {
	driver.findElement(By.linkText("Create a Page")).click();
	driver.findElement(By.xpath("//div[text()='Get Started']")).click();
	Reporter.log(driver.getCurrentUrl());
	Reporter.log(driver.getTitle());
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}