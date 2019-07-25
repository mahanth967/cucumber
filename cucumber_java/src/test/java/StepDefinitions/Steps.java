package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import page_objects.LoginPage;

public class Steps {
    
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("^user launch chromme browser$")
	public void user_launch_chromme_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahanth\\git\\cucumber\\cucumber_java\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		lp=new LoginPage(driver);
	    
	}

	@When("^user opens URL \"([^\"]*)\"$")
	public void user_opens_URL(String arg1) throws Throwable {
	    driver.get(arg1);
	}

	@When("^User enters Email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_Email_as_and_password_as(String arg1, String arg2) throws Throwable {
	    
	}

	@When("^Click on login$")
	public void click_on_login() throws Throwable {
	  
	}

	@Then("^Page Title should be \"([^\"]*)\"$")
	public void page_Title_should_be(String arg1) throws Throwable {
	 
	}

	@When("^user click on log out link$")
	public void user_click_on_log_out_link() throws Throwable {
	    
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
	 
	}
}
