package com.simplilearn.testNg;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.simplilearn.SportyShoes.ATECapstone.AddProductToCartPage;
import com.simplilearn.SportyShoes.ATECapstone.BaseClass;
import com.simplilearn.SportyShoes.ATECapstone.LoginPage;
import com.simplilearn.SportyShoes.ATECapstone.RegistrationPage;
import com.simplilearn.SportyShoes.ATECapstone.HomePage;

public class AddProductToCart extends BaseClass {
	
	HomePage hp;
	RegistrationPage rp;
	LoginPage lp;
	AddProductToCartPage ac;
	
	@BeforeTest
	public void start_browser()
	{
		OpenBrowser("Chrome");
		hp = new HomePage(driver);
		rp = new RegistrationPage(driver);
		lp = new LoginPage(driver);
		ac = new AddProductToCartPage(driver);
	}
	
	@Test(priority='1')
	public void test_login()
	{
		lp.user_login();
	}
	

	@Test(priority='2')
	public void test_add_product_to_cart() throws InterruptedException
	{
		ac.add_product_to_cart();
	}
	
	@Test(priority='3')
	public void test_validate_success_message()
	{
		String expected = "Message:Shoe BlueWave Running Shoes Added Successfully to Cart";
	String actualText=	ac.validate_success_message();
	Assert.assertEquals(actualText, expected);
	}

}
