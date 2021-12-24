package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinodhini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com/");
		
		WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		
		username.sendKeys("vino");
		
		WebElement password=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password.sendKeys("1234");
	
		

	
	}

}
