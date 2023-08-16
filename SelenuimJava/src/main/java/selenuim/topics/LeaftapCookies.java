package selenuim.topics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapCookies {
	
	public static String string;
	
	public static void main(String[] args) {
		
		//Cookies cookie = new Cookies();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		Cookie cookieNamed = driver.manage().getCookieNamed("JSESSIONID");
		
		System.out.println(cookieNamed);
		
		//driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		Cookie sessionID = driver.manage().getCookieNamed("JSESSIONID");
		
		string = sessionID.toString();
		
		System.out.println("String session ID:"+string);
		
		System.out.println(sessionID);
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		for (Cookie cookie2 : cookies) {
			
			System.out.println(cookie2.getName());
			
		}
		
	}
	

}
