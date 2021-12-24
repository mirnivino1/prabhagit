package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprog
{
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinodhini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement signBtn = driver.findElement(By.xpath("(//input[@name='proceed'])"));
		//to click the sign button
		signBtn.click();
		
	Alert alert = driver.switchTo().alert();
			String text2 = alert.getText();
		System.out.println(text2);
		 
		
		
		
	}

}
