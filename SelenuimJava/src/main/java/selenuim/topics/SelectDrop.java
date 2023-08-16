package selenuim.topics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement element = driver.findElement(By.xpath("//select[@id='Skills']"));
		
		//Select Method
		/*
		 * Select sdd = new Select(element);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * 
		 * sdd.selectByIndex(1);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * sdd.selectByVisibleText("APIs");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * sdd.selectByValue("Certifications");
		 */
		
		Select sdd = new Select(element);
		
		List<WebElement> options = sdd.getOptions();
		
		for (WebElement webElement : options) {
			
			if(webElement.getText().equals("Corel Draw")) {
				
				webElement.click();
			}
		}
		
	}

}
