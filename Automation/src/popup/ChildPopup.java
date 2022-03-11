package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildPopup 
{
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com");
	
	driver.switchTo().newWindow(WindowType.TAB);
	
	driver.get("https://www.facebook.com");
	Set<String> parent = driver.getWindowHandles();
	for(String a:parent)
	{
		driver.switchTo().window(a);
	}
	driver.findElement(By.name("q")).sendKeys("seleniu,");
	
	
	
	driver.quit();
}
}
