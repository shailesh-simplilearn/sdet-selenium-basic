package com.simplilearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ULLIDropDOwn {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shailesh.gohel\\Documents\\Shailesh\\Appium\\Eclipse_Workspace\\SeleniumBasics\\driver\\chromedriver.exe");

		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
		
		WebElement ulElement = driver.findElement(By.xpath("//ul[@class='clearfix main_nav']"));
		
		List<WebElement> listOfLi = ulElement.findElements(By.tagName("li"));
		for (WebElement webElement : listOfLi) {
			System.out.println(webElement.getText());
			
		}
	}

}
