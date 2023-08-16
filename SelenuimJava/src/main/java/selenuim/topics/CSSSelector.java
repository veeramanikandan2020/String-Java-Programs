package selenuim.topics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class CSSSelector {
	
	public static void main(String[] args) {
		
		//ChromeOptions option = new ChromeOptions();
		
		FirefoxOptions option = new FirefoxOptions();
		
		
		//option.setHeadless(true);
		
		option.addArguments("--headless");
		
		option.addArguments("--disablenotifiactions");
		
		FirefoxDriver driver = new FirefoxDriver(option);
		
		//ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("veeramanikandan2020@gmail.com");
		
		driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("M@noharan2020");
		
		driver.findElement(By.cssSelector("button[data-testid=royal_login_button]")).click();
		
		
	}

}
