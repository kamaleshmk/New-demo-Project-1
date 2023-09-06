package com.tcs;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Main_Page extends Base_Class {

	@BeforeClass
	public static void brlan() {
		Lanbroser();
		dogt_url("https://adactinhotelapp.com/");
	}

	@Test
	public void alogin_ad() throws InvalidFormatException, IOException, InterruptedException {
		Login_Page u = new Login_Page();
		u.Login(gtdata(0, 0, 0), gtdata(0, 0, 1));
		Thread.sleep(100);
	}

	@Test
	public void bdrop1() throws InterruptedException {
		Search_page s = new Search_page();
		Thread.sleep(2000);
		s.LocatD1();
		s.hotd2();
		s.roomtypedp3();
		s.roomnodp4();
		s.dateindp5();
		s.dateoutdp6();
		s.adultroomdp7();
		s.childroomdp8();
		s.sumitser();
}
	@Test
	public void cdrop2() throws InterruptedException {
		Selet_hotel m = new Selet_hotel();
		m.selclck();
		m.contin();
	}
	@Test
	public void ddrop3() throws InterruptedException {
		Booking_page g = new Booking_page();
		g.f_name("vijay");
		g.l_name("m");
		g.Ad_res("tambaram, chennai-60+0048");
		g.card_nu("5984512369875412");

		g.cc_tpe(3);
		g.cc_mons(7); 
		g.cc_yrs("2026");
		g.cvv_nu("123");
		g.b_cilk();

	}

	@AfterClass
	public static void close() {
		System.out.println("close: " + driver.getCurrentUrl());
		driver.quit();
	}

}
