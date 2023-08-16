package selenuim.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSendKeys {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement username = driver.findElement(By.id("username"));
		
		//Method1
			//driver.executeScript("arguments[0].value='Demosalesmanager'", username);
		
		//Method 2
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='DemoCSR'", username);
		
		
		username.sendKeys(Keys.TAB);
		
		
		
	}

}
