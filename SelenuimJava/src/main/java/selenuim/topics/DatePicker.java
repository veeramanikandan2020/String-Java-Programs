package selenuim.topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//setTimeout(function(){debugger;},5000);

public class DatePicker {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();

		option.addArguments("--disablenotifications");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");

		String month = "Aug";

		String year = "2023";

		int date = 4;

		driver.findElement(By.id("onwardCal")).click();

		WebElement webElement = driver
				.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]"));

		String monthyear = webElement.getText();

		System.out.println(monthyear);

		for (int i = 0; i < 6; i++) {

			String[] split = monthyear.split(" ");

			if ((split[0].equalsIgnoreCase(month)) && split[1].equals(year)) {
				webElement.click();
				break;
			} else {
				driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")).click();
			}

		}

	}
}
