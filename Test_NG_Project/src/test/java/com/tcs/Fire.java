package com.tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Fire {
	
	@Test
	private void browser() {
WebDriver driver= new FirefoxDriver();
driver.get("https://www.amazon.in/");
	}

}
