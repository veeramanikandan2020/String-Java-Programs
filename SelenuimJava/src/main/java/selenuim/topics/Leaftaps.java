package selenuim.topics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
	
		
		synchronized (driver) {
			
			driver.wait(5000);
			
		}
		
		String windowHandle = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		WebElement username = driver.findElement(By.id("username"));
		
		driver.executeScript("arguments[0].value='DemoCSR'", username);
		
		username.sendKeys(Keys.TAB);

	}

}
