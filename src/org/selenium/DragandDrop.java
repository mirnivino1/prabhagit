package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vinodhini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		WebElement source=driver.findElement(By.xpath("(//a[@style='color:#FFFFFF;'])[5]"));
		
		WebElement dest=driver.findElement(By.id("bank"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, dest).perform();
		
        WebElement source1=driver.findElement(By.xpath("((//a[text()=' 5000 '];)[2]"));
		
		WebElement dest1=driver.findElement(By.xpath("(//li[@class='placeholder'];)[1]"));
		
		Actions actions1 = new Actions(driver);
		actions1.dragAndDrop(source1, dest1).perform();
		
	}
}
