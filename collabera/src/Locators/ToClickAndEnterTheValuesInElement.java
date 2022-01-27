package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickAndEnterTheValuesInElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.jiosaavn.com");
		Thread.sleep(2000);
		WebElement s = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		s.clear();
		s.sendKeys("googly kannada",Keys.ENTER);
	
	}

}
