package selenuim.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ColorOfElement {
	
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.howtocodeschool.com/2022/01/demo-background-color-change-slider-with-html-css-javascript.html");
		
		WebElement header = driver.findElement(By.cssSelector("h1[itemprop=name]"));
		
		String cssValue = header.getCssValue("color");
		
		System.out.println(cssValue); //rgba(36, 36, 120, 1)
		
		String asHex = Color.fromString(cssValue).asHex();
		
		System.out.println(asHex);  //#242478
		
		WebElement header4 = driver.findElement(By.cssSelector("h4.more-posts-links-para"));
		
		String cssValue2 = header4.getCssValue("color");
		
		System.out.println(cssValue2); //rgba(36, 36, 120, 1)
		
		String asHex2 = Color.fromString(cssValue2).asHex();
		
		System.out.println(asHex2); //#242478
		
		if(asHex.equals(asHex2))
		{
			System.out.println("Same color");
		}
		else
		{
			System.out.println("Different color");
		}
		
		WebElement html = driver.findElement(By.xpath("(//a[@class='menu-page-links'])[1]"));
		
		String value = html.getCssValue("background-color"); //rgba(34, 67, 140, 1)
		
		System.out.println(value);
		
		String asHex3 = Color.fromString(value).asHex();
		
		System.out.println(asHex3); //#22438c
		
		/*
		 * Output
		 * 
		 * rgba(36, 36, 120, 1) 
		 * #242478 
		 * rgba(36, 36, 120, 1) 
		 * #242478 
		 * Same color 
		 * rgba(34,67, 140, 1) 
		 * #22438c
		 */

	}

}
