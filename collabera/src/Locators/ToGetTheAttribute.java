package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.instagram.com");	
		Thread.sleep(2000);
		String username="rohith";
		WebElement a = driver.findElement(By.name("username"));
		a.clear();
		a.sendKeys("rohith");
		String actualEnteredData = a.getAttribute("value");
		System.out.println(actualEnteredData);
		if(actualEnteredData.equals(username)) {
			System.out.println("username is entered properly");
		}else {
			System.out.println("username is entered wrong");
		}
	}

}
