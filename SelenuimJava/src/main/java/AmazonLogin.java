import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		/*
		 * driver.get(
		 * "https://www.amazon.in/s?k=ac+1.5+ton&crid=3J7LIIPYVR1YF&sprefix=ac%2Caps%2C281&ref=nb_sb_ss_ts-doa-p_2_2"
		 * );
		 * 
		 * List<WebElement> acProducts = driver.findElements(By.
		 * xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"
		 * ));
		 * 
		 * // Display list of AC products name
		 * 
		 * for (WebElement webElement : acProducts) {
		 * 
		 * System.out.println(webElement.getText());
		 * 
		 * }
		 * 
		 * 
		 * List<WebElement> pricelist =
		 * driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		 * 
		 * 
		 * for (WebElement price : pricelist) {
		 * 
		 * System.out.println(price.getText());
		 * 
		 * }
		 * 
		 * 
		 * List<Integer> list = new ArrayList<Integer>();
		 * 
		 * for (WebElement price : pricelist) {
		 * 
		 * String text = price.getText();
		 * 
		 * String replacedtext = text.replace(",", "");
		 * 
		 * int parseInt = Integer.parseInt(replacedtext);
		 * 
		 * if(parseInt>10000) { list.add(parseInt); }
		 * 
		 * 
		 * //System.out.println(price.getText());
		 * 
		 * }
		 * 
		 * Collections.sort(list);
		 * 
		 * System.out.println(list.get(0));
		 * 
		 */
		// 5 start AC

		driver.get(
				"https://www.amazon.in/s?k=ac+1.5+ton+5+star&crid=1PT0Q6YGJQQUS&sprefix=ac+1.5+ton%2Caps%2C420&ref=nb_sb_ss_ts-doa-p_2_10");

		List<WebElement> aclist = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

		List<String> acNamelist = new ArrayList<String>();
		for (WebElement webElement : aclist) {
			acNamelist.add(webElement.getText());
		}

		System.out.println(acNamelist);
		for (int i = 0; i < acNamelist.size(); i++) {
			
			System.out.println(acNamelist.get(i));
			
		}
		System.out.println(acNamelist.size());

		List<WebElement> priceofAC = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		// List<WebElement> priceofAC =
		// driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base
		// a-text-normal']"));

		List<String> pricesofAC = new ArrayList<String>();
		for (WebElement webElement : priceofAC) {
			pricesofAC.add(webElement.getText());
		}

		//System.out.println(pricesofAC);
		System.out.println(pricesofAC.size());

			
		Map<String, String> map = new LinkedHashMap<String, String>();
		
		for (int i = 0; i < acNamelist.size()-1; i++) {
			
			map.put(acNamelist.get(i), pricesofAC.get(i));
			
		}
		
		System.out.println(map);
		
		
	}

}
