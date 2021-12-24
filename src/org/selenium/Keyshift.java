package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyshift {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinodhini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("email"));
		Actions actions= new Actions (driver);
		
	actions.keyDown(Keys.SHIFT).sendKeys("vino").keyUp(Keys.SHIFT).perform();
	
		
		driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
		
	WebElement userName1 = driver.findElement(By.id("twotabsearchtextbox"));
		userName1.sendKeys("watches",Keys.ENTER);
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement userName2 = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"))	;
		userName2.sendKeys("tops",Keys.ENTER);
		
		    
		
		
		
	}

}
