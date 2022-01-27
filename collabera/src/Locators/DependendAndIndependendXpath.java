package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class DependendAndIndependendXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com");
	}

}
