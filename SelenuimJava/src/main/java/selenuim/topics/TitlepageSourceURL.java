package selenuim.topics;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitlepageSourceURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		//EdgeDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.co.in/");
		
		System.out.println("Title:" +driver.getTitle()); 
		
		System.out.println("URL:" +driver.getCurrentUrl());
		
		//System.out.println("page:" +driver.getPageSource());
	}

}
