package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAutoSuggestions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).click();
		List<WebElement> ListOfSuggetion = (List<WebElement>) driver.findElement(By.xpath("//li[@role='presentation' and @jsaction]"));
		WebElement DataForSuggetion = driver.findElement(By.xpath("//li[@role='presentation' and @jsaction]"));
System.out.println("no of auto suggestions" +ListOfSuggetion.size());
	}

}
