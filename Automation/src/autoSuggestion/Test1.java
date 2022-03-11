package autoSuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("seleni");
	Thread.sleep(3000);
	List<WebElement> a = driver.findElements(By.xpath("//li[@class='sbct']"));
	System.out.println(a.size());
	for(WebElement b:a)
	{
		System.out.println(b.getText());
	}
	
	driver.quit();
	
}
}
