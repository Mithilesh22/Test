package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {
	static
	{
	  System.setProperty("webdriver.gecko.driver", "../Automation/driver/geckodriver.exe");	
	}
	public static void main(String[] args) {
		//ChromeDriver rv= new ChromeDriver();
		WebDriver rv = new FirefoxDriver();
		rv.get("https://www.google.com");
		rv.quit();
	}
}
