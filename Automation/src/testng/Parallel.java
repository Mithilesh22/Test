package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Parallel {
	public WebDriver driver;
	
	
	@Parameters({"browserName"})
  @Test
  public void f(String browser) 
  {
		
	  if(browser.equals("chrome"))
	  {
		  WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();
	  }
	  else
	  {
		  System.setProperty("webdriver.gecko.driver", "../Automation/driver/geckodriver.exe");	
		  //WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
	  }
	  driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create a Page")).click();
		driver.findElement(By.xpath("//div[text()='Get Started']")).click();
		Reporter.log(driver.getCurrentUrl());
		Reporter.log(driver.getTitle());
		driver.quit();
		
  }
	
}
