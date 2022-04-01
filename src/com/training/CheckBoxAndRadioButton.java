package com.training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxAndRadioButton {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shailesh.gohel\\Documents\\Shailesh\\Appium\\Eclipse_Workspace\\SeleniumBasics\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
		
		//Implicit Wait 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='cb1']")).click();
		driver.findElement(By.xpath("//input[@value='cb3']")).click();
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@value='rd1']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='rd3']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='rd2']")).click();
		Thread.sleep(2000);
		
		WebElement dropDownELement = driver.findElement(By.name("dropdown"));
		Select select = new Select(dropDownELement);
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByValue("dd5");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
