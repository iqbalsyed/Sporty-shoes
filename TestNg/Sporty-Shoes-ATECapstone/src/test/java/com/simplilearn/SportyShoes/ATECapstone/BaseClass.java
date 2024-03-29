package com.simplilearn.SportyShoes.ATECapstone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;

	public static void  OpenBrowser(String browser)
	{
		if(browser == "Chrome")
		{
			driver = new ChromeDriver();
		}
		
		if(browser == "FireFox")
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:9010/");
		
	}
	
	public static void closebrowser() {
		driver.close();
	}
	
}
