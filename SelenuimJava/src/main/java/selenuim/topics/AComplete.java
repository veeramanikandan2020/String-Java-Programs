package selenuim.topics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AComplete {

	public static void main(String[] args) {

ChromeDriver driver = new ChromeDriver();
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disablenotifications");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.twoplugs.com/");
		
		driver.findElement(By.xpath("//a[normalize-space(text())='Live Posting']")).click();
		
		WebElement element = driver.findElement(By.name("category_id"));
		
		WebElement search = driver.findElement(By.id("autocomplete"));
		
		search.clear();
		
		search.sendKeys("Toronto");
		
		String text;
		
		do {
			
			search.sendKeys(Keys.ARROW_DOWN);
			
			text = search.getAttribute("value");
			
			if(text.equals("Toronto, ON, Canada")) {
				
				search.sendKeys(Keys.ENTER);
				break;
			}
			
			
		}while(!text.isEmpty());
		
		

	}

}
