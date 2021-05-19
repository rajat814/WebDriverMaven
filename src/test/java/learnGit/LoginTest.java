package learnGit;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void doLogin() {
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("rajat814@gmail.com");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
