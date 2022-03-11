package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions option= new ChromeOptions();
	option.addArguments("--disable-notification");
	WebDriver driver= new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.myntra.com/");
	
	TakesScreenshot ss= (TakesScreenshot) driver;
	
	File src= ss.getScreenshotAs(OutputType.FILE);
	
	File dest=new File("./photo/myntra.png");
	
	FileUtils.copyFile(src, dest);
	driver.close();
	
}

}
