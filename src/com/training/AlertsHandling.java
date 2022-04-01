package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shailesh.gohel\\Documents\\Shailesh\\Appium\\Eclipse_Workspace\\SeleniumBasics\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		Thread.sleep(2000);
		/*
		 * driver.findElement(By.id("alertexamples")).click(); Thread.sleep(2000);
		 * System.out.println(driver.switchTo().alert().getText());
		 * driver.switchTo().alert().accept();
		 */
		driver.findElement(By.id("promptexample")).click();
		driver.switchTo().alert().sendKeys("Hello World");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
	}
}
