package scroll;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriverManager.chromedriver().setup();
	ChromeOptions option= new ChromeOptions();
	option.addArguments("--disable-notification");
	WebDriver driver= new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.myntra.com/");
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,5000)");
	Thread.sleep(1000);
	js.executeScript("window.scrollBy(0,-5000)");
	Thread.sleep(1000);
	driver.quit();
	
	
}
}
