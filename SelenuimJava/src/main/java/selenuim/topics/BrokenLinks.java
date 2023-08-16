package selenuim.topics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	public static void main(String[] args) throws IOException {
		
		
ChromeDriver driver = new ChromeDriver();
		//driver.get("https://demoqa.com/links");
		
		driver.get("https://demoqa.com/broken");
		
		List<WebElement> list = driver.findElements(By.xpath("//a"));
		
		System.out.println(list.size());
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getAttribute("href") != null) {
			
			String url = list.get(i).getAttribute("href");
			
			URL urllink = new URL(url);
			
			HttpURLConnection con = (HttpURLConnection)urllink.openConnection();
					
			con.connect();
			
			int responseCode = con.getResponseCode();
			
			if(responseCode >= 400)
			{
				System.out.println(url+" is Broken link");
			}
			else
			{
				System.out.println(url+" is valid link");
			}
			}
		
		}
		
		
	}

}
