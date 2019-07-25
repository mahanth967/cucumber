package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="")public WebElement username;
	@FindBy(xpath="")public WebElement password;
	@FindBy(xpath="")public WebElement login;
	@FindBy(xpath="")public WebElement logout;

}
