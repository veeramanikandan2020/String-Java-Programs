package selenuim.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		  
		  option.addArguments("--disable-notifications");
		  
		  ChromeDriver driver = new ChromeDriver(option);
		  
		  driver.get("https://demoqa.com/radio-button");
		  
		  WebElement element = driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline'][1]//input"));
		  
		  WebElement yes =  driver.findElement(By.xpath("//input[@id='yesRadio']"));
		
		  boolean selected = yes.isSelected();
		  
		  System.out.println(selected);
		  
		  driver.executeScript("arguments[0].click()", yes);
		  
		  //yes.click();
		  
 boolean selected1 = yes.isSelected();
		  
		  System.out.println(selected1);
	}

}
