package selenuim.topics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CheckSortedDropDown {

	public static void main(String[] args) {


ChromeDriver driver = new ChromeDriver();
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disablenotifications");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.twoplugs.com/");
		
		driver.findElement(By.xpath("//a[normalize-space(text())='Live Posting']")).click();
		
		WebElement element = driver.findElement(By.name("category_id"));
		
		Select SDD = new Select(element);
		
		List<WebElement> options = SDD.getOptions();
		
		List<String> originallist = new ArrayList<String>();
		
		List<String> tempList = new ArrayList<String>();
		
		for (WebElement string : options) {
			
			originallist.add(string.getText());
			tempList.add(string.getText());
		}
		
		Collections.sort(tempList);
		
		System.out.println(originallist);
		System.out.println(tempList);
		
		if(originallist.equals(tempList)) {
			System.out.println("Sorted");
		}
		else
		{
			System.out.println("UnSorted");
		}
			

	}

}
