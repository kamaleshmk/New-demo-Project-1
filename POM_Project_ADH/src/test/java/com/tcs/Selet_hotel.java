package com.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selet_hotel extends Base_Class {
	public Selet_hotel() {
     PageFactory.initElements(driver,this );
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement selct;
	
	@FindBy(id="continue")
	private WebElement contine;

	public WebElement getContine() {
		return contine;
	}

	public WebElement getSelct() {
		return selct;
	}
	
	public void selclck() throws InterruptedException {
      do_clk(selct);
      
	}
	public void contin() throws InterruptedException {
   do_clk(contine);
	}

	
	

}
