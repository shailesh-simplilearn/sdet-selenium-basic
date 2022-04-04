package com.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
	//test trrt
	public static void main(String[] args) throws InterruptedException {
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
		String downloadText = driver.findElement(By.xpath("//a[normalize-space()='CHANGELOG']"))
				.getCssValue("color");
		System.out.println(downloadText);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("grid");
		/*
		 * Thread.sleep(1000); driver.navigate().back(); Thread.sleep(1000);
		 * driver.navigate().forward(); Thread.sleep(1000); driver.navigate().refresh();
		 */
		Thread.sleep(2000);
		driver.quit();
	}

}
