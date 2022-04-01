package com.sdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkWithDropDown {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * driver.get("https://the-internet.herokuapp.com/dropdown"); Select select =
		 * new Select(driver.findElement(By.id("dropdown")));
		 * 
		 * select.selectByIndex(1); Thread.sleep(2000);
		 */
		driver.get("https://the-internet.herokuapp.com/tables");
		WebElement table = driver.findElement(By.id("table1"));
		List<WebElement> tableData = table.findElements(By.xpath("//tbody/tr"));
		System.out.println(tableData.size());
		List<WebElement> tdData;
		for (WebElement webElement : tableData) {
			tdData = webElement.findElements(By.tagName("td"));
			for (WebElement cellValue : tdData) {
				System.out.print(cellValue.getText()+ " - ");
				if(cellValue.getText().equalsIgnoreCase("jason")) {
					System.out.println("Value is available *********");
					break;
				}
			}
			System.out.println("");
		}
		driver.quit();
		 
	}

}
