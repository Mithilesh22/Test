package pom;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestScript1 
{
@FindBy(id="username")
 private WebElement usernametb;

@FindBy(name="pwd")
private WebElement passwordtb;

@FindBy(xpath="//div[text()='Login ']")
 private WebElement loginbtn;

public TestScript1(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

public void username(String un)
{
usernametb.sendKeys(un);	
}
public void password(String pwd)
{
	passwordtb.sendKeys(pwd);
}
public void login()
{
	loginbtn.click();
}
}