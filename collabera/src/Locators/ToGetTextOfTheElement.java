package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTextOfTheElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.skillrary.com/user/register");
		driver.findElement(By.linkText("X")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up ')]")).click();
		String expectedMsg="";
		WebElement errorMessageElement = driver.findElement(By.id("first_name-error"));
		String actualErrorMessage = errorMessageElement.getText();
		System.out.println(actualErrorMessage);
		if(actualErrorMessage.equals(expectedMsg)) {
			System.out.println("the proper error message is displayed");
		}
		else {
			System.out.println("error message is not proper");
		}
		
	}

}
