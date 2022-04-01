package com.training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shailesh.gohel\\Documents\\Shailesh\\Appium\\Eclipse_Workspace\\SeleniumBasics\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev");
		Thread.sleep(3000);
		WebElement dropDownElement = driver.findElement(By.xpath("//ul[@class='navbar-nav mr-4 mb-2 mb-lg-0 pl-4 pl-lg-2']"));
		
		List<WebElement> liELements = dropDownElement.findElements(By.tagName("li"));
		for (WebElement childLiElements : liELements) {
			System.out.println(childLiElements.getText());
			if(childLiElements.getText().equalsIgnoreCase("Documentation")) {
				childLiElements.click();
				break;
			}
			
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
