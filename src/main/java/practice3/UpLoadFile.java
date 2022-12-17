package practice3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpLoadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nisha\\eclipse-cucumber\\test3\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//*[@id=\"photo\"]")).sendKeys("E:\\Car Description.pdf");
		
		driver.quit();
	}


	}


