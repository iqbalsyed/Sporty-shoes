package com.simplilearn.SportyShoes.ATECapstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Placeorder {
	
	@FindBy(linkText="Orders")
	WebElement orderlink;
	
	public Placeorder(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void click_orderPage()
	{
		orderlink.click();
		
	}
}
