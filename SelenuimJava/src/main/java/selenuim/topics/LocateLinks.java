package selenuim.topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocateLinks {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disablenotifications");
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='nav-xshop']//a"));
		
		System.out.println(links.size());
		
		for (WebElement webElement : links) {
			
			String attribute = webElement.getAttribute("href");
			
			System.out.println(attribute);
			
		}
		
		/*
		
		driver.findElement(By.linkText("Today's Deals")).click();
		
		//driver.findElement(By.partialLinkText("miniTV")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//li[contains(@class,'a-carousel-card GridPresets-module')]"));
		
		System.out.println(list.size());
		
		for(int i =0; i<list.size(); i++) {
			
			System.out.println(list.get(i).getText());
			
		}
		
		List<WebElement> elements = driver.findElements(By.xpath("//li[contains(@class,'a-carousel-card GridPresets-module')]//a//span"));

		for (WebElement webElement : elements) {
			
			System.out.println(webElement.getText());
			
		}*/
	}

}
