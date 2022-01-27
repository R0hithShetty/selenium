package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollElementToTopOrBottom {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
        WebElement scrollElement = driver.findElement(By.xpath("//h2[text()='Explore top companies hiring now']"));
        js.executeScript("arguments[0].scrollIntoView(false);",scrollElement);//false to scroll completly down
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true);",scrollElement);//true to scroll that element completey up
	}

}
