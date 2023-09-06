package com.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_page extends Base_Class {

	public Search_page() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "location")
	private WebElement drop1;

	@FindBy(id = "hotels")
	private WebElement drop2;

	@FindBy(id = "room_type")
	private WebElement drop3;

	@FindBy(id = "room_nos")
	private WebElement drop4;

	@FindBy(id = "datepick_in")
	private WebElement drop5date_in;

	@FindBy(id = "datepick_out")
	private WebElement drop6date_out;

	@FindBy(id = "adult_room")
	private WebElement drop7;

	@FindBy(id = "child_room")
	private WebElement drop8;
	
	@FindBy(id="Submit")
	private WebElement serbtn;

	public WebElement getDrop1() {
		return drop1;
	}

	public WebElement getDrop2() {
		return drop2;

	}

	public WebElement getDrop3() {
		return drop3;
	}

	public WebElement getDrop4() {
		return drop4;
	}

	public WebElement getDrop5date_in() {
		return drop5date_in;
	}

	public WebElement getDrop6date_out() {
		return drop6date_out;
	}

	public WebElement getDrop7() {
		return drop7;
	}

	public WebElement getDrop8() {
		return drop8;
	}
	public WebElement getSerbtn() {
		return serbtn;
	}

	public void LocatD1() {
		Doselect_index(drop1, 3);

	}

	public void hotd2() {
		Doselect_index(drop2, 2);
	}

	public void roomtypedp3() {
		Doselect_index(drop3, 2);
	}

	public void roomnodp4() {
		Doselect_index(drop4, 3);
	}

	public void dateindp5() {
		senkeys(drop5date_in, "10/08/2023");
	}

	public void dateoutdp6() {
		senkeys(drop6date_out, "12/08/2023");
	}

	public void adultroomdp7() {
		Doselect_index(drop7, 2);

	}

	public void childroomdp8() {
		Doselect_index(drop8, 3);
	}

	public void sumitser() throws InterruptedException  {
		do_clk(serbtn);
		System.out.println("search: " + driver.getCurrentUrl());

	}
	

}
