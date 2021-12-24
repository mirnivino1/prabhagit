package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lastfivemonth {
	
	
		
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinodhini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			Thread.sleep(4000);
			
			WebElement loginBtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
			loginBtn.click();
			
			Thread.sleep(7000);
			
		WebElement month = driver.findElement(By.id("month"));
		Select select= new Select(month);
		
	List<WebElement> options = select.getOptions();
	
	for (int i = options.size()-5; i < options.size(); i++) {
		
		WebElement last = options.get(i);
		String text = last.getText();
		System.out.println(text);
		
		
		
		
	}
		
	
		}
	
	
	
	


}
