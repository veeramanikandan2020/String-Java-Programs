package selenuim.topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://etrain.info/trains/Tambaram-TBM-to-Virudunagar-Jn-VPT?date=20230729");

		// 1. How many rows in table?
		List<WebElement> rows = driver
				.findElements(By.xpath("//table[@class='myTable data nocps nolrborder bx1_brm']//tr"));

		System.out.println("No.of rows:" + rows.size());

		// 2. How many columns in a table?

		List<WebElement> colums = driver.findElements(By.xpath("//table[@class='trainhead_tbs nocps nolrborder']//td"));

		// 3. Retrieve the * specific row/column data

		System.out.println("No.of columns:" + colums.size());

		List<WebElement> train = driver
				.findElements(By.xpath("//table[@class='myTable data nocps nolrborder bx1_brm']//tr[2]/td"));

		for (WebElement webElement : train) {

			System.out.print(webElement.getText());
		}

		// 4. Retrieve all the data from the table
		
		/*for (int i = 1; i <= rows.size(); i++) {
			
			for (int j = 1; j <= colums.size(); j++) {
				
				
						
						String text = driver.findElement(By.xpath("//table[@class='myTable data nocps nolrborder bx1_brm']//tr["+i+"]/td["+j+"]")).getText();
						System.out.print(text);
			}
			
			System.out.println();*/
		
		for (WebElement webElement : rows) {
			
			System.out.println(webElement.getText());
		}
			
		}

		


}
