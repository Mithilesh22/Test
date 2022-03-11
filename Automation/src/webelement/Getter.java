package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getter 
{
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com");
	
	// get text
	WebElement text = driver.findElement(By.xpath("//a[text()='Images']"));
	System.out.println(text.getText());
	
	//get location
	WebElement location = driver.findElement(By.name("q"));
	Point a = location.getLocation();
	System.out.println(a.getX());
	System.out.println(a.getY());
	
	//get size
	
	Dimension size = location.getSize();
	System.out.println(size.height);
	System.out.println(size.width);
	
	
	
	driver.quit();
	
	
}
}
