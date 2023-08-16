package selenuim.topics;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Windows.html");

		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='nav nav-tabs nav-stacked']//a"));

		list.get(list.size() - 1).click();

		driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();

		String parent = driver.getWindowHandle();

		String parentWindowTiltle = driver.getTitle();

		Set<String> windowHandles = driver.getWindowHandles();

		System.out.println(windowHandles.size()); // 3

		// Switching to all windows

		for (String string : windowHandles) {

			driver.switchTo().window(string);
			
			System.out.println(driver.getTitle());
			// Frames & windows //Selenium //Index
		}

		// Closing child window alone
		for (String string : windowHandles) {

			driver.switchTo().window(string);

			String childWindow = driver.getTitle();

			if (!childWindow.equals(parentWindowTiltle)) {
				driver.close();
				System.out.println("Closed child Window:" + childWindow);
				// Closed child Window:Index
				// Closed child Window:Selenium
			}

		}

	}

}
