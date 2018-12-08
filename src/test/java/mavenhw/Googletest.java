package mavenhw;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Googletest {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/Gurpreet/eclipse-workspace/mavenhw/Drivers/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void findTitle() {
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google");
		
		
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
