package assignments.july29;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class TestNGOrangeHRM {

	WebDriver driver;
	// Explicit wait code
	WebDriverWait wait;

	@Test
	public void VeryLoginToOrangeHRM() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//Explicit Wait Code
		wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		user.submit();

		// Pausing execution of program just to see result not for Element to be
		// available 
		Thread.sleep(4000);

		String expectedTitleAfterLogin = "OrangeHRM";
		String actualTitleAfterLogin = driver.getTitle();
		assertEquals(expectedTitleAfterLogin, actualTitleAfterLogin);
	}

	@BeforeMethod
	public void beforeMethod() {

	}

	@AfterMethod
	public void afterMethod() {

	}

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Implicit Wait Code
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		// Explicit Wait Code
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
