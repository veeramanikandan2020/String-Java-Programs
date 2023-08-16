package selenuim.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElement {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		
		WebElement text = driver.findElement(By.xpath("//textarea[@id='ta1']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].setAttribute('style','background:yellow;');",text);

	}

}
