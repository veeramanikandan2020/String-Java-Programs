package selenuim.topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ChromeDriver driver = new ChromeDriver();
		  
		  driver.get("https://demoqa.com/webtables");
		
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='rt-table']//div[@class='rt-th rt-resizable-header -cursor-pointer']"));
		
		for (WebElement webElement : findElements) {
			
			System.out.println(webElement.getText());
		}
	}

}
