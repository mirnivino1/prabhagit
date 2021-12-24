package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinodhini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://greenstechnologys.com/");
		
		 driver.manage().window().maximize();
		
		WebElement course=driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions actions= new Actions(driver);
		
		actions.moveToElement(course).perform();
		
		
	}

}
