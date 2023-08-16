package selenuim.topics;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		
		//Resize the window
		Dimension d = new Dimension(500,900);
		
		driver.manage().window().setSize(d);
		
		//Method 1
		
		driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys("C:\\Users\\Veeramanikandan\\Desktop\\Desktop\\Selenium\\Login.xlsx");
		
		//Method 2
		
		String dir = System.getProperty("user.dir");
		
		driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys(dir+"\\snaps\\home.png");
		
	}

}
