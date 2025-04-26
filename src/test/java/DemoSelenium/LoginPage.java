package DemoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
	WebDriver driver;

	
	@FindBy(xpath = "(//*[@type='text'])[1]")
	WebElement Base;
			
	@FindBy(xpath = "(//*[@name='linkName1'])[1]")
	WebElement User;			
	
	
	public void User_Name(String Name) {
		
	Base.sendKeys(Name);
		
	}
	
	public void Click_Url() {
		
		User.click();
		
	}
}
