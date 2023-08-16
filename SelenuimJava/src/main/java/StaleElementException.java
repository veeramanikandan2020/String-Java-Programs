import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleElementException {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://ui.freecrm.com/");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.xpath("//input[@name='email']"));
		
		user.sendKeys("Veera@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Veera@gmail.com");
		
		driver.navigate().refresh();
		
		/*
		 * //1 Method try {
		 * 
		 * user.sendKeys("Veera@gmail.com"); }
		 * 
		 * catch (StaleElementReferenceException e) {
		 * 
		 * driver.findElement(By.xpath("//input[@name='email']")).sendKeys(
		 * "Veera@gmail.com"); }
		 */	
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.stalenessOf(user));
		
		user.sendKeys("Veera@gmail.com");
		
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		
	}

}
