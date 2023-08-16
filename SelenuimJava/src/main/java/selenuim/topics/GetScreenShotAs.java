package selenuim.topics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenShotAs {

	
	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://unifiedportal-mem.epfindia.gov.in/memberinterface/");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File desc = new File("./snaps/home.png");
		
		FileUtils.copyFile(src,desc);
		
		
	}
}
