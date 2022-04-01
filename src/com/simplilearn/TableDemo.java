package com.simplilearn;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shailesh.gohel\\Documents\\Shailesh\\Appium\\Eclipse_Workspace\\SeleniumBasics\\driver\\chromedriver.exe");

		WebDriver driver = new  ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
		WebElement tableElement = driver.findElement(By.xpath("//div[@id='maNSE']//table[@class='rhsglTbl']"));
		List<WebElement> rows = tableElement.findElements(By.tagName("tr"));
		List<WebElement> columns;
		for (WebElement rowElement : rows) {
			columns = rowElement.findElements(By.tagName("td"));
			for (WebElement colElement : columns) {
				System.out.print(" | "+colElement.getText());
			}
			System.out.println("-----------");
		}
	}
	

}
