package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoveToAnElementWithOffset {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("rohithshetty313@gmail.com");
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("rohi@92422");
		driver.findElement(By.id("login-submit")).click();
		
		driver.findElement(By.xpath("//div[@title=\"SeleniumWork\"]")).click();
		
		Actions actions = new Actions(driver);
		WebElement scrElement = driver.findElement(By.xpath("//span[text()='WBT']"));
		WebElement drtElement = driver.findElement(By.xpath("//h2[text()='Java']/../..//span[text()='Add a card']"));
		
		actions.dragAndDrop(scrElement, drtElement).release().perform();
		
		

	}

}
