package com.sdet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 
		/*
		 * Implicit wait 
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement alertLink = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
		wait.until(ExpectedConditions.stalenessOf(alertLink));
		alertLink.click();
		
		Thread.sleep(1000);
		
		closeDriver();
	}
	
	public static void closeDriver() {
		driver.quit();
	}

}
