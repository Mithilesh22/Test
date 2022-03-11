package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.ebay.com/");
	WebElement a = driver.findElement(By.id("gh-cat"));
	Select s= new Select(a);
          s.selectByIndex(5);
          Thread.sleep(1000);
          s.getAllSelectedOptions();
          Thread.sleep(1000);
          if(s.isMultiple())
          {
        	  s.deselectAll();
          }
          Thread.sleep(1000);
          s.deselectByIndex(5);
          Thread.sleep(1000);
          driver.quit();
}
}
