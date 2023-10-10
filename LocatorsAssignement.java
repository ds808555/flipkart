package assignments.july29;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class LocatorsAssignement {
	WebDriver driver;

	@Test
	public void testRelativeLocators() throws InterruptedException {
		driver.get("https://nichethyself.com/tourism/home.html");
		// WebElement user = driver.findElement(By.name("username"));
		
		// Pausing execution of program just to see result not for Element to be available
		Thread.sleep(5000);
		WebElement text = driver
				.findElement(with(By.tagName("a")).toRightOf(By.xpath("//a[text() = 'All about the world']")));
		System.out.println(text.getText());
		text.click();
		
		Thread.sleep(5000);
		
		/*
		 * WebElement button = driver
		 * .findElement(with(By.tagName("button")).toRightOf(By.
		 * xpath("//button[@id = 'knowgoa']"))); button.click();
		 */

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
