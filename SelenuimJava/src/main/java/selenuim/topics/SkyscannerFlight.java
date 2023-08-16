package selenuim.topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkyscannerFlight {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.skyscanner.co.in/hotels/search?entity_id=27539520&checkin=2023-08-23&checkout=2023-08-24&adults=2&rooms=1&impression_id=6a570513-e5f7-4e3b-b94e-e4bd77c16eab");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='CardLayout__contentRows--horizontal']//span[contains(@class,'heading')]"));
		
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
		
		List<WebElement> list2 = driver.findElements(By.xpath("//span[contains(@class,'BpkPrice_bpk-price__price')]"));
		
		for (WebElement webElement : list2) {
			
			String web = webElement.getText();
			
			char[] arrayCh = web.toCharArray();
			
			String price = "";
			
			for (char ch : arrayCh) {
				
				if(ch>='0'&& ch<='9')
				{
					price += ch;
				}
			}
			
			
			System.out.println(price);
			
			
		}
	}

}
