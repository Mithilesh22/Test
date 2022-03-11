package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{

	static
	{
	  System.setProperty("webdriver.chrome.driver", "../Automation/driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver rv= new ChromeDriver();
		rv.get("https://www.google.com");
		rv.close();
	}
}
