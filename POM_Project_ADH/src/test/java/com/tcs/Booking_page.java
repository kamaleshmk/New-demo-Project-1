package com.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_page extends Base_Class {
	public Booking_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement firname;

	@FindBy(id = "last_name")
	private WebElement lstname;

	@FindBy(id = "address")
	private WebElement addres;

	@FindBy(id = "cc_num")
	private WebElement cardno;

	@FindBy(id = "cc_type")
	private WebElement cc_types;

	@FindBy(id = "cc_exp_month")
	private WebElement cc_mon;

	@FindBy(id = "cc_exp_year")
	private WebElement cc_yr;

	@FindBy(id = "cc_cvv")
	private WebElement cvv_no;

	@FindBy(id = "book_now")
	private WebElement book_btn;

	public WebElement getFirname() {
		return firname;
	}

	public WebElement getLstname() {
		return lstname;
	}

	public WebElement getAddres() {
		return addres;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCc_types() {
		return cc_types;
	}

	public WebElement getCc_mon() {
		return cc_mon;
	}

	public WebElement getCc_yr() {
		return cc_yr;
	}

	public WebElement getCvv_no() {
		return cvv_no;
	}

	public WebElement getBook_btn() {
		return book_btn;
	}

	public void f_name(String a) {
		senkeys(firname, a);
	}

	public void l_name(String s) {
		senkeys(lstname, s);
	}

	public void Ad_res(String adrs) {
		senkeys(addres, adrs);
	}

	public void card_nu(String d) {
		senkeys(cardno, d);
	}

	public void cc_tpe(int b) {
    Doselect_index(cc_types, b);
	}
	
	public void cc_mons(int v) {
Doselect_index(cc_mon, v);
	}
	
	public void cc_yrs(String n) {
Doselect_value(cc_yr, n);
	}
	
	public void cvv_nu(String m) {
senkeys(cvv_no, m);
	}
	
	public void b_cilk() throws InterruptedException {
do_clk(book_btn);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
