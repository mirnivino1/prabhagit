package org.selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstday {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinodhini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
	
	
		
	}