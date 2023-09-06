package com.tcs;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page extends Base_Class {
	public Login_Page() {
PageFactory.initElements( driver, this);

	}

	@FindBy(id = "username")
	private WebElement name;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(id = "login")
	private WebElement lginbtn;

	public WebElement getName() {
		return name;
	}
// this method returns webelement
	public WebElement getPass() {
		return pass;
	}

	public WebElement getClik() {
		return lginbtn;
	}

	public void Login(String a, String a1) throws InterruptedException {
		senkeys(name, a);
		senkeys(pass, a1);
		do_clk(lginbtn);
		System.out.println("Login: " + driver.getCurrentUrl());
	}

		
	}

