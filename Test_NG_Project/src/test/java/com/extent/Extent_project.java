package com.extent;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_project {
	
	
	@Test
	public void extentest () {
 ExtentReports extent= new ExtentReports();
 ExtentSparkReporter spark=new ExtentSparkReporter("index.html");
 ExtentSparkReporter failspark =new ExtentSparkReporter("failed-tests-index.html");
		
		
		
		
	}
	
	
	
	

}
