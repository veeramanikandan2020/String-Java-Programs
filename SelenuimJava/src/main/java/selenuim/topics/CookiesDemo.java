package selenuim.topics;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesDemo {	

	public static void main(String[] args){
	//WebDriver driver; 
	//System.setProperty("webdriver.chrome.driver","Chrome_driver_path"); 
	ChromeDriver driver=new ChromeDriver(); 
	driver.get("https://www.facebook.com");
	//Enter Email id and Password if you are already Registered user 
	driver.findElement(By.cssSelector("input#email")).sendKeys("veeramanikandan2020@gmail.com"); 
	driver.findElement(By.cssSelector("input#pass")).sendKeys("M@noharan2020"); 
	driver.findElement(By.cssSelector("button[name='login']")).click(); 
	// Create a file to store Login Information 
	
	Set<Cookie> cookies = driver.manage().getCookies();
	
	System.out.println("Cookies size :"+cookies.size());;
	
	for (Cookie cookie : cookies) {
		
		System.out.println(cookie.getName()+" "+cookie.getValue()+" "+cookie.getExpiry());
	}
	File file = new File("Cookies.data"); 
	try{ 
	// Delete old file if already exists
	file.delete(); 
	file.createNewFile(); 
	FileWriter file1 = new FileWriter(file); 
	BufferedWriter Bwritecookie = new BufferedWriter(file1); //Getting the cookie information 
	for(Cookie ck : driver.manage().getCookies()) { 
	Bwritecookie.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure())); 
	Bwritecookie.newLine(); 
	} 
	Bwritecookie.close(); 
	file1.close(); 
	}
	catch(Exception ex) 
	{ 
	ex.printStackTrace(); 
	} 
	} 
	}

