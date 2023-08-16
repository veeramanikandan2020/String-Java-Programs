package selenuim.topics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul//li"));
		
		for (WebElement webElement : list) {
			
			System.out.println(webElement.getText());
		}
		
		Thread.sleep(2000);
		//1st Alert
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		 
		driver.switchTo().alert().getText();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		//2nd Alert
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		 
		driver.switchTo().alert().getText();
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		//3nd Alert
		
				driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
				 
				driver.switchTo().alert().getText();
				
				driver.switchTo().alert().sendKeys("Hi this is alert");
				
				driver.switchTo().alert().accept();
	}

}
