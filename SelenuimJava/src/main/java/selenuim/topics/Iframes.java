package selenuim.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		/*
		 * driver.get(
		 * "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html"
		 * );
		 * 
		 * //1st Frame driver.switchTo().frame("packageListFrame");
		 * 
		 * driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		 * 
		 * driver.switchTo().defaultContent();
		 * 
		 * //2nd Frame driver.switchTo().frame("packageFrame");
		 * 
		 * driver.findElement(By.xpath("//span[text()='OutputType']")).click();
		 * 
		 * driver.switchTo().defaultContent();
		 * 
		 * //3rd Frame driver.switchTo().frame("classFrame");
		 * 
		 * driver.findElement(By.xpath("//a[text()='Field']")).click();
		 */
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("Iframe with in an Iframe")).click();
				
		
		
		
		
	
		
		

	}

}
