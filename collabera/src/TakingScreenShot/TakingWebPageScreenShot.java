package TakingScreenShot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingWebPageScreenShot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.zomato.com");
		File tempararyFile = driver.getScreenshotAs(OutputType.FILE);
		 File deskFile = new File("./screenshots/ss2.png");
		 tempararyFile.renameTo(deskFile);
		File tempFile = driver.findElement(By.xpath("//img[@alt='Order Food Online']")).getScreenshotAs(OutputType.FILE);
		System.out.println(tempFile);
		File webElementss = new File("./screenshots/ss1.png");
		tempFile.renameTo(webElementss);
	}

}
