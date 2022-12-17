package practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisha\\eclipse-cucumber\\test3\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://objectspy.space/");
		
		WebElement doubleClickElement=driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[4]/a/strong"));
		
		Actions act= new Actions(driver);
		act.doubleClick().perform();

	}

}
