package selenuim.topics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesTest {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		System.out.println("Cookies size :"+cookies.size());;
		for (Cookie cookie : cookies) {
			
			System.out.println(cookie);
		}
		
		for (Cookie cookie : cookies) {
			
			System.out.println(cookie.getName()+" "+cookie.getValue()+" "+cookie.getExpiry());
		}
		
		//driver.manage().getCookieNamed(null)
	}

}
