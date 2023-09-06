package com.extent;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

public class ExtentReportss {
	
	

	
		@Test
		public void Demo() {
			ExtentReports extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("automation Report");
			spark.config().setReportName("Extent Report Demo");
			extent.attachReporter(spark);

			ExtentTest test = extent.createTest("login test");

			test.pass("Login test started successfully ");
			test.info("url is loaded");
			test.info("value entered");
			test.pass("login test completed successfully");

			ExtentTest test1 = extent.createTest("Homepage test");

			test1.pass("Homepage test started successfully ");
			test1.info("url is loaded");
			test1.info("value entered");
			test1.fail("Homepage test completed successfully");

			extent.flush();

		

	}
	
	
	

}
