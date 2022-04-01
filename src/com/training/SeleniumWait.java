package com.training;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shailesh.gohel\\Documents\\Shailesh\\Appium\\Eclipse_Workspace\\SeleniumBasics\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//Implicit Wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//Explicit Wait 
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement btnClick = driver.findElement(By.id("btnLogin"));
		wait.until(ExpectedConditions.elementToBeClickable(btnClick));
		wait.until(ExpectedConditions.stalenessOf(btnClick));
		btnClick.click();
		
		
		System.out.println(driver.findElement(By.xpath("//span[normalize-space()='Assign Leave']")).getText());
		
		driver.quit();
		
	}

}
