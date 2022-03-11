package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com");
	
	driver.findElement(By.xpath("//a[@class='gb_A']")).click();
	driver.switchTo().frame(0);
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//span[@class='MrEfLc'])[2]")).click();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	driver.quit();
}
}
