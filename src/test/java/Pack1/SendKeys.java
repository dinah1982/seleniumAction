package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeys {
	WebDriver driver;
	@Test
	public void sendKeys() {
		driver.get(
				"http://tutorialsninja.com/demo/index.php?route=account/register");
		Actions action1 = new Actions(driver);
		driver.findElement(By.id("input-firstname")).sendKeys("sam");
		driver.findElement(By.id("input-lastname")).sendKeys("kent");
		driver.findElement(By.id("input-email")).sendKeys("kent@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("514-514-5143");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.id("input-confirm")).sendKeys("12345");
		action1.sendKeys(Keys.TAB).build().perform();
		action1.sendKeys(Keys.TAB).build().perform();
		action1.sendKeys(Keys.TAB).build().perform();
		action1.sendKeys(Keys.ENTER).build().perform();

	}
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown() {
		// driver.close();
	}

}
