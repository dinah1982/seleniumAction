package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouveToTest {
	WebDriver driver;
	@Test
	public void moveTo() {
		driver.get("http://omayo.blogspot.com/");
		Actions action1 = new Actions(driver);
		WebElement link = driver.findElement(By.id("blogsmenu"));
		action1.contextClick(link).build().perform();
		action1.pause(3000);
		WebElement lien1 = driver.findElement(By.linkText("SeleniumByArun"));
		action1.moveToElement(lien1).click().build().perform();
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
		driver.quit();
	}

}
