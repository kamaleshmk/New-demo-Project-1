package com.tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome {



	@Test
	private void user_id() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

}
