package TakingScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilesUtil {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		File tempararyFile = driver.getScreenshotAs(OutputType.FILE);
		 File deskFile = new File("./screenshots/ss3.png");
		FileUtils.copyFile(tempararyFile, deskFile);//instead of using rename property we use fileUtils method just to images when new images are updates
	
	}

}
