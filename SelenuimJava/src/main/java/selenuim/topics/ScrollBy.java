package selenuim.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollBy {
	
	public static void main(String[] args) throws InterruptedException {
		

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,900)");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-900)");
		
		Thread.sleep(3000);
		
	}

}
