package selenuim.topics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		//EdgeDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		//driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Veeramanikandan");
		
		String text = driver.findElement(By.xpath("//input[@class='email valid']")).getText();
		
		System.out.println(text);
		
		String attribute = driver.findElement(By.xpath("//input[@class='email valid']")).getAttribute("value");
		
		System.out.println(attribute);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}
