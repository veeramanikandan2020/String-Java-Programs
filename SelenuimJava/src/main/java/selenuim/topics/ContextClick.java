package selenuim.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"));
		
		driver.switchTo().frame(frame);
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='b-query']"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(searchbox).perform();

	}

}
