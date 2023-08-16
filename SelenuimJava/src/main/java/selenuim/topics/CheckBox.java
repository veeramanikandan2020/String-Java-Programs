package selenuim.topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		List<WebElement> list = driver
				.findElements(By.xpath("//input[@class='form-check-input' and contains(@id,'day')]"));

		System.out.println(list.size());

		/*
		 * //1. Specific check box
		 * 
		 * driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		 */

		/*
		 * //2. select all check box for (WebElement webElement : list) {
		 * 
		 * webElement.click(); }
		 */

		// 3. multiple check box by choice,

		/*
		 * for (WebElement webElement : list) {
		 * 
		 * String attribute = webElement.getAttribute("id");
		 * 
		 * if(attribute.equals("monday") || attribute.equals("sunday")) {
		 * 
		 * webElement.click(); } }
		 */

		// 4. Last 2 check box,

		/*
		 * for (int i = list.size() - 2; i < list.size() ; i++) {
		 * 
		 * list.get(i).click();
		 * 
		 * }
		 */

		// 5.first 2 check box

		for (int i = 0; i < list.size() - 5; i++) {

			list.get(i).click();

		}

	}

}
