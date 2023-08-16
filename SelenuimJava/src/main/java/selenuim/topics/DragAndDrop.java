package selenuim.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
		
		//Thread.sleep(3000);
		
		/*
		 * WebElement block1 = driver.findElement(By.xpath("//div[@id='block-2']"));
		 * 
		 * String block2 =
		 * driver.findElement(By.xpath("//div[@id='block-2']")).getText();
		 * 
		 * System.out.println(block2);
		 * 
		 * WebElement block3 = driver.findElement(By.xpath("//div[@id='column-2']"));
		 * 
		 * String blockT3 =
		 * driver.findElement(By.xpath("//div[@id='column-2']")).getText();
		 * 
		 * System.out.println(blockT3);
		 */
		
		WebElement block4 = driver.findElement(By.xpath("//div[@id='block-4']"));
		
		WebElement block1 = driver.findElement(By.xpath("//div[@id='block-1']"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(block4, block1).build().perform();
		
	}
}
