package practice3;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Display {

	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nisha\\eclipse-cucumber\\test3\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		boolean firstName = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[7]/input")).isDisplayed();
		System.out.println("First Name Is Present: " + firstName);
	}

	@After
	public void tearDown() {
		driver.quit();

	}

}
