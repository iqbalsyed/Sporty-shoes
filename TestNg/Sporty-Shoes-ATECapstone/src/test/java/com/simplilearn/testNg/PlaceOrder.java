package com.simplilearn.testNg;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.simplilearn.SportyShoes.ATECapstone.HomePage;
import com.simplilearn.SportyShoes.ATECapstone.BaseClass;
import com.simplilearn.SportyShoes.ATECapstone.RegistrationPage;
import com.simplilearn.SportyShoes.ATECapstone.LoginPage;
import com.simplilearn.SportyShoes.ATECapstone.Placeorder;

public class PlaceOrder extends BaseClass {
	
	HomePage hp;
	RegistrationPage rp;
	LoginPage lp;
	Placeorder op;
	
	@BeforeTest
	public void start_browser()
	{
		OpenBrowser("Chrome");
		hp = new HomePage(driver);
		rp = new RegistrationPage(driver);
		lp = new LoginPage(driver);
		op = new Placeorder(driver);
	}

	
	@Test(priority='1')
	public void test_login()
	{
		lp.user_login();
	}
	
	@Test(priority='2')

	public void test_click_orders()
	{
		op.click_orderPage();
	}

	
	@Test(priority='3')
	public void test_getTitle_page()
	{
		String expected = "http://localhost:9010/orders";
		String Actual = hp.getURL_page();
		Assert.assertEquals(Actual, expected);
		
	}

}
