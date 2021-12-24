package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinodhini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		
driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);

//		WebElement okcancelBtn = driver.findElement(By.xpath("(//a[text()='Alert with OK & Cancel '])"));
//		okcancelBtn.click();
//		
//		
//		WebElement alertBtn = driver.findElement(By.xpath("(//button[text()='click the button to display a confirm box '])"));
//		alertBtn.click();
//		
//       Alert alert = driver.switchTo().alert();
//		alert.dismiss();
//		
//		
		WebElement alertTextBox= driver.findElement(By.xpath("(//a[text()='Alert with Textbox '])"));
		alertTextBox.click();
		
		Thread.sleep(2000);
		WebElement alertwithtext = driver.findElement(By.xpath("(//button[text()='click the button to demonstrate the prompt box '])"));
		alertwithtext.click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Vino");
		alert.accept();
		
		WebElement textbox = driver.findElement(By.id("demo1"));
        String text = textbox.getText();
		System.out.println(text);

		
}
}
