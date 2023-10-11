package assignments.july30;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class CookbookAssignment {
	WebDriver driver;

	@Test
	public void verfifyClickRadioAndCheckbox() throws InterruptedException {
		driver.get("http://www.cookbook.seleniumacademy.com/Config.html");
		driver.findElement(By.xpath("//input[@value = 'Diesel']")).click();
		driver.findElement(By.xpath("//input[@value = 'ABS']")).click();

		// Pausing execution of program just to see result not for Element to be available
		// Aplying Thread.sleep
		Thread.sleep(4000);
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
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
