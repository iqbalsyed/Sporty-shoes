package com.simplilearn.SportyShoes.ATECapstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass {
	
	@FindBy(xpath="//input[@id='name']")
	WebElement registername;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement registeremail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement registerpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement registerBtn;
	
	@FindBy(xpath="//div[@class='mt-4 p-5 bg-primary text-white rounded']/descendant::p[3]")
	WebElement userText;
	
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void register_user()
	{
		registername.sendKeys("Nik");
		registeremail.sendKeys("Nik@gmail.com");
		registerpassword.sendKeys("Nik@123");
		registerBtn.click();
	}
	
	public String validate_registration_URL()
	{
		String register_url = driver.getCurrentUrl();
		return register_url;
	}
	
	public String validate_registration_Text()
	{
		String user_name = userText.getText();
		return user_name;
	}
	


}
