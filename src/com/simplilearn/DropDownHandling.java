package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shailesh.gohel\\Documents\\Shailesh\\Appium\\Eclipse_Workspace\\SeleniumBasics\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dropDown = driver.findElement(By.id("dropdown"));
		Select select = new Select(dropDown);
		Thread.sleep(3000);
		select.selectByVisibleText("Option 1");
		
		Thread.sleep(3000);
		select.selectByValue("2");
		Thread.sleep(3000);

		/*
		 * driver.get("https://formstone.it/components/dropdown/demo/"); WebElement
		 * dropDown = driver.findElement(By.name("demo_basic")); Select select = new
		 * Select(dropDown); select.selectByIndex(1); Thread.sleep(3000);
		 */

		driver.quit();
	}

}
