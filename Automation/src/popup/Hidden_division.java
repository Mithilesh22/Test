package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_division
{
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Feb 21 - Feb 27, 2022']")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//span[text()='16']")).click();
	Thread.sleep(1000);
	driver.quit();
	
	
	
}
}
