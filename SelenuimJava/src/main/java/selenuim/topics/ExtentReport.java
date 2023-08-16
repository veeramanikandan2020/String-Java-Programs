package selenuim.topics;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	public static void main(String[] args) throws IOException {
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		
		reporter.setAppendExisting(true);
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		// Creating test case
		
		ExtentTest test1 = extent.createTest("Verify Login", "Login with Valid Credential");
		
		test1.assignCategory("Smoke");
		
		test1.assignAuthor("Veera");
		
		test1.pass("Enter username",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/home.png").build());
		test1.pass("Enter password");
		
		test1.pass("Login failed");
		
		ExtentTest test2 = extent.createTest("Home Page", "Entered successfully");
		test2.assignCategory("Regression");
		test2.assignAuthor("Mani");
		test2.pass("Home paged displayed");
		
		extent.flush();
	}

}
