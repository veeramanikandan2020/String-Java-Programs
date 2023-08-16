package selenuim.topics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bootstrapdropdown {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disablenotifications");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.hdfc.com/");
		
		//driver.findElement(By.xpath("//div[normalize-space(text())='Select Product Type']")).click();
		
		WebElement element = driver.findElement(By.xpath("//div[@class='dropdown-active-item product-category-active']"));
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * 
		 * js.executeScript(arguments[0].click(), element);
		 */
		
		driver.executeScript("arguments[0].click()", element);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='productType']//li"));
		
		System.out.println(list.size());
		
		
		for (WebElement webElement : list) {
			
			if(webElement.getText().equals("Refinance")) {
				webElement.click();
			}
			
		}
		
		
		
	}

}
