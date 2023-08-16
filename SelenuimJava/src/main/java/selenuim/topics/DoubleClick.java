package selenuim.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		
		//WebElement frame = driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"));
		
		//driver.switchTo().frame(frame);
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(), ' Double click Here ')]   "));
		
		Actions action = new Actions(driver);
		
		action.doubleClick(doubleClick).perform();

	}

}
