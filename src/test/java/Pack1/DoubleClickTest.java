package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickTest {
	WebDriver driver;
	@Test
	public void doubleClickConext() throws InterruptedException {
		driver.get("http://omayo.blogspot.com/");
		Actions action1 = new Actions(driver);
		// faire deplacer l'ascenc=sseur java script
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,1500)");
		WebElement doubleClick = driver.findElement(By.id("testdoubleclick"));
		Thread.sleep(4000);
		action1.contextClick(doubleClick).perform();

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
