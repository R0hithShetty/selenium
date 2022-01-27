package TakingScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTakingScreenShotsUsingWebDriverInterface {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com");
		TakesScreenshot ts = (TakesScreenshot)driver;//explicit typecasting because we cant access takesscreen method through webdriver refence so we should type cast here
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./screenshots/ss6.png");
		FileUtils.copyFile(tempfile, destFile);
	}

}
