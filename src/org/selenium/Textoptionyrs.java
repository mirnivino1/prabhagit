package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Textoptionyrs
{
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinodhini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement logBtn = driver.findElement(By.xpath("(//a[@role='button']) [2]"));
		logBtn.click();
		
		Thread.sleep(4000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select select= new Select(year);
		
		List<WebElement> options = select.getOptions();
		
		for(WebElement x:options) {
			
			String text = x.getText();
			System.out.println(text);
			
		}
		
		
		
		
	}

}
