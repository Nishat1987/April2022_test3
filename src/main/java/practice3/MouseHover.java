package practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisha\\eclipse-cucumber\\test3\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.dell.com/en-us");
		
		
		WebElement deskTopElement=driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]"));
		WebElement productElement=driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/ul/li[10]/a"));
		Thread.sleep(3000);
		Actions act= new Actions(driver);
		act.moveToElement(deskTopElement).perform();
		act.moveToElement(productElement).perform();
	}

}
