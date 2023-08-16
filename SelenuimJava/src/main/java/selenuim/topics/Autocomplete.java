package selenuim.topics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autocomplete {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
		Thread.sleep(2000);
		
		List<WebElement> list2 = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]//span"));
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@role='option']"));
		
		System.out.println(list2.size());
		
		for (int i = 0; i < list2.size(); i++) {
			
			System.out.println(list2.get(i).getText());
		}
		
		for (WebElement webElement : list) {
			
			if(webElement.getText().contains("download"))
			{
				webElement.click();
				break;
			}
			
			
		}
	}
	

}
