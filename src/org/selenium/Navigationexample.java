package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationexample {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinodhini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
//		driver.get("https://facebook.com/");
//		driver.manage().window().maximize();
//		
//Navigation navigate=driver.navigate();
//navigate.to("https://www.amazon.in/");

		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().window().maximize();
		
		Navigation navigate= driver.navigate();
				navigate.to("https://www.amazon.in");
		
navigate.back();
navigate.refresh();

		
		
	}

}
