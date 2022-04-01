package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverGETs {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shailesh.gohel\\Documents\\Shailesh\\Appium\\Eclipse_Workspace\\SeleniumBasics\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		WebElement menuOptionFirst = driver.findElement(By.xpath("//a[@title='Women']"));
		//Thread.sleep(2000);
		System.out.println(menuOptionFirst.getText());
		WebElement menuItemSecond = driver.findElement(By.xpath("//a[@title='Dresses']"));
		System.out.println("Test is -------- "+menuItemSecond.getAttribute("href"));
		System.out.println("CSS is -------- "+menuItemSecond.getCssValue("font"));
		System.out.println(driver.findElement(By.cssSelector("div[id='editorial_block_center'] h1")).getText());
		driver.quit();
	}

}
