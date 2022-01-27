package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingOfChromeDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.zomato.com");
	}

}
