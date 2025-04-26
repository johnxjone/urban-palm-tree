package DemoSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName;

public class SeluniumBaseTest {
	
	static WebDriver driver;
	@BeforeAll
	public static void main() {
		
		
		driver = new ChromeDriver();
		
		driver.get("https://seleniumbase.io/demo_page");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		
	}
@AfterAll
public static void Taredown() {
	
	
	driver.quit();
	
}

 public static WebDriver getDriver() {
	return driver;
}
	
	
	
	
	
}
	
		
	
	


