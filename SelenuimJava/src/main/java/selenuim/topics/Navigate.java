package selenuim.topics;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.co.in/");
		
		driver.navigate().to("https://www.hdfcbank.com/personal/ways-to-bank/online-banking/credit-card-netbanking");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		
		
		

	}

}
