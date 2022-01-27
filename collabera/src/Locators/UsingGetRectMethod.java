package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetRectMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	   WebElement a = driver.findElement(By.id("email"));
	   Rectangle userNamePosition = a.getRect();
	   System.out.println(userNamePosition.getX());
	   
	   WebElement b = driver.findElement(By.id("passContainer"));
	   Rectangle PasswordPosition = b.getRect();
	   System.out.println(PasswordPosition.getX());
	   if(userNamePosition.getX()==PasswordPosition.getX()) {
		   System.out.println("It is aligned properly");
	   }
	   else {
		   System.out.println("It is not aligned properly");
	   }
	}

}
