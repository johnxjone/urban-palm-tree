package Step.Def.DemoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import DemoSelenium.LoginPage;
import DemoSelenium.SeluniumBaseTest;
import io.cucumber.java.en.Given;

public class StepDef {
	WebDriver driver;
	LoginPage LoginPage1;
	
	
	public StepDef() {
		driver=SeluniumBaseTest.getDriver();
		LoginPage1=PageFactory.initElements(driver, LoginPage.class);
	}
	
	@Given("name of the Demo selenium page")
	public void name_of_the_demo_selenium_page() {
		

		
		LoginPage1.User_Name("John");
		
	    	}

	@Given("click url of the demo selenium page")
	public void click_url_of_the_demo_selenium_page() {
		
		LoginPage1.Click_Url();
		
	    	}


}
