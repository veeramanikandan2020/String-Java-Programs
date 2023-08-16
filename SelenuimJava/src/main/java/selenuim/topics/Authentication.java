package selenuim.topics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Authentication {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.redbus.in/");

		//ChromeDriver driver = new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		// https://username:password@the-internet.herokuapp.com/basic_auth
	}
	

}
