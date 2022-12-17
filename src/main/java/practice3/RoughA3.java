package practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RoughA3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisha\\eclipse-cucumber\\Exercise\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		
		WebElement countryDropDown=driver.findElement(By.xpath("//*[@id=\"continents\"]"));
		
		Select sel =new Select(countryDropDown);
		//sel.selectByVisibleText("Africa");
		sel.selectByIndex(2);

	}

}
