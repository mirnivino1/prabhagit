package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Attributeoptiondays {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinodhini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement loginBtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		loginBtn.click();
		
		Thread.sleep(4000);
		WebElement days = driver.findElement(By.id("day"));
		Select select=new Select(days);
		
		List<WebElement> options = select.getOptions();
		
		for(WebElement noday:options) {
			
			String finaldays = noday.getText();
			System.out.println(finaldays);
			
			
			
			
		}
		
		
		
		
	}

}
