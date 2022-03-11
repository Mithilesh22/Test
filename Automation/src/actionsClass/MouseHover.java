package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover 
{
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions option= new ChromeOptions();
	option.addArguments("--disable-notification");
	WebDriver driver= new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.myntra.com/");
	
	WebElement men = driver.findElement(By.xpath("(//a[@class='desktop-main'])[1]"));
	
	Actions a= new Actions(driver);
	a.moveToElement(men).perform();
	driver.findElement(By.xpath("(//a[@class='desktop-categoryLink'])[6]")).click();
	driver.quit();
	
	
	
}
}
