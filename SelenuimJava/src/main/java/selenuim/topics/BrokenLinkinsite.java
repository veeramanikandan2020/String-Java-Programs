package selenuim.topics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinkinsite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disablenotifications");

		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//ul//li//a"));
		
		System.out.println(links.size());
		
		for (WebElement webElement : links) {
			
			System.out.println(webElement.getAttribute("href"));
			
		}
		
		for (WebElement webElement : links) {
			
			String attribute = webElement.getAttribute("href");
			
			URL broken = new URL(attribute);
			
			HttpURLConnection openConnection = (HttpURLConnection)broken.openConnection();
			
			openConnection.connect();
			
			if(openConnection.getResponseCode()>=400) {
				
				System.out.println(attribute +" : link is broken");
			}
			else
			{
				System.out.println(attribute +" : link is valid and not broken");
			}
			}
			
			
		}
		
		

}
