package com.simplilearn.testNg;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.simplilearn.SportyShoes.ATECapstone.HomePage;
import com.simplilearn.SportyShoes.ATECapstone.BaseClass;
import com.simplilearn.SportyShoes.ATECapstone.RegistrationPage;



public class Registration extends BaseClass {
	
	HomePage hp;
	RegistrationPage rp;
	
	@BeforeTest
	public void start_browser()
	{
		OpenBrowser("Chrome");
		hp = new HomePage(driver);
		rp = new RegistrationPage(driver);
	}

	
	@Test(priority='1')
	public void test_click_register_link() throws InterruptedException
	{
		Thread.sleep(1500);
		hp.click_register_link();
	}
	
	@Test(priority='2')
	public void test_getTitle_page()
	{
		String expected = "http://localhost:9010/register";
		String Actual = hp.getURL_page();
		Assert.assertEquals(Actual, expected);
		
	}
	
	@Test(priority='3')
	public void Test_register_user()
	{
		rp.register_user();
	}
	
	@Test(priority='4')
	public void Test_validate_registration_URL()
	{
		String expected = "http://localhost:9010/register-user";
		String Actual = rp.validate_registration_URL();
		assertEquals(Actual, expected);
	}
	
@Test(priority='5')
	
	public void Test_validate_registration_Text()
	{
		String expected = "Hello Nik !";
		String actualText = rp.validate_registration_Text();
		Assert.assertEquals(actualText, expected);
	}
	

}
