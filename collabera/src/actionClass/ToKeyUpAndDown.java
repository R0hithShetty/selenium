package actionClass;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToKeyUpAndDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=CjwKCAiA24SPBhB0EiwAjBgkhmWvpZGGsOG8FsqCNKqFmFU6wENwB5_w8le-40HvxsDbcb7T9oZB9xoCgykQAvD_BwE");
		List<WebElement> navElements = driver.findElements(By.xpath("//a[@data-type=\"navElements\"]"));
		
		Actions actions = new Actions(driver);
		for(WebElement Ele : navElements) {
			actions.keyDown(Keys.CONTROL).click(Ele).perform();
			actions.keyUp(Keys.CONTROL).perform();
		}
			
		Set<String> allWindowsId = driver.getWindowHandles();
		for(String All : allWindowsId){
			driver.switchTo().window(All);
			String actualTitle = driver.getTitle();
			String expectedTitle = "Home and Living - Buy Interior Decoration Products and Accessories Online in India";
			if(expectedTitle.equals(actualTitle)) {
				driver.close();
			}
		}
		
		
			
		}

	}


