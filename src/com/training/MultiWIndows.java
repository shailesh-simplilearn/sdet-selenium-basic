package com.training;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWIndows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shailesh.gohel\\Documents\\Shailesh\\Appium\\Eclipse_Workspace\\SeleniumBasics\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/windows");
		String parentWindowHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		// switch to other window
		// System.out.println(driver.getWindowHandle());
		Set<String> setOfWindows = driver.getWindowHandles();
		String childWindow = null;
		Iterator<String> winHandleIterator = setOfWindows.iterator();
		while (winHandleIterator.hasNext()) {
			childWindow = winHandleIterator.next();
			driver.switchTo().window(childWindow);
			System.out.println(driver.getTitle());
			if (driver.getTitle().contains("New Window")) {
				break;
			}
		}

		WebElement newWindowText = driver.findElement(By.xpath("//h3[normalize-space()='New Window']"));
		System.out.println("New window Text is ======= " + newWindowText.getText());

		Thread.sleep(2000);
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
