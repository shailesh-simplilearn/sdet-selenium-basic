package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManipulationCommands {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shailesh.gohel\\Documents\\Shailesh\\Appium\\Eclipse_Workspace\\SeleniumBasics\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/index.html");
		Thread.sleep(2000);
		
		driver.findElement(By.id("htmlformtest")).click();
		driver.findElement(By.name("username")).sendKeys("shaileshgohel");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Helloworld");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Helloworld");
		Thread.sleep(2000);
		driver.findElement(By.name("HTMLFormElements")).submit();		
		driver.quit();
	}
}
