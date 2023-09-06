package com.sos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	@Parameters({"email","pass"})
	
	@Test
	
	private void launch(String string, String string1) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys(string);
        driver.findElement(By.id("pass")).sendKeys(string1);
	}
	
	
}
