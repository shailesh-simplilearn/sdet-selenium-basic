package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shailesh.gohel\\Documents\\Shailesh\\Appium\\Eclipse_Workspace\\SeleniumBasics\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/iframe");
		
		driver.switchTo().frame("mce_0_ifr");
		System.out.println(driver.findElement(By.cssSelector("body p")).getText());
		
		Thread.sleep(2000);
		driver.quit();
	}
}
