package com.tcs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	static WebDriver driver;

	public static void Lanbroser() {
		EdgeOptions option = new EdgeOptions();
		option.addArguments("InPrivate");
		WebDriverManager.edgedriver().setup();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\palan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		driver = new EdgeDriver(option);
	
		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}

	public static void dogt_url(String s) {
		driver.get(s);
	}

	public WebElement findele_id(String s) {
		WebElement element = driver.findElement(By.id(s));
		return element;
	}

	public void senkeys(WebElement e, String s) {
		e.sendKeys(s);

	}

	public String gtdata(int a, int b, int c) throws InvalidFormatException, IOException {
		File file = new File("C:\\Users\\palan\\OneDrive\\Desktop\\Book3.xlsx");
		Workbook wb = new XSSFWorkbook(file);
		Sheet sheet = wb.getSheetAt(a);
		Row row = sheet.getRow(b);
		Cell cell = row.getCell(c);
		String Value = cell.getStringCellValue();
		wb.close();
		return Value;

	}

	public void do_clk(WebElement e) throws InterruptedException {
		e.click();
		Thread.sleep(3000);
	}

	public void Doselect_index(WebElement e, int a) {
		System.out.println("Doselect_index: " + driver.getCurrentUrl());
		Select s = new Select(e);
		s.selectByIndex(a);

	}

	public void Doselect_value(WebElement e, String d) {
		System.out.println("Doselect_index: " + driver.getCurrentUrl());
		Select s = new Select(e);
		s.selectByValue(d);

	}
}
