package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup 
{
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
	driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
	Alert a = driver.switchTo().alert();
	Thread.sleep(2000);
	a.dismiss();
	driver.quit();
}
}
