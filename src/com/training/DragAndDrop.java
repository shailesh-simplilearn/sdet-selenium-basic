package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shailesh.gohel\\Documents\\Shailesh\\Appium\\Eclipse_Workspace\\SeleniumBasics\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/drag-drop-javascript.html");
		Thread.sleep(5000);
		Actions actionBuilder  = new Actions(driver);
		WebElement draggedElement = driver.findElement(By.xpath("//div[@id='draggable1']"));
		WebElement droppedElement = driver.findElement(By.xpath("//div[@id='droppable1']"));
		WebElement draggedElement2 = driver.findElement(By.xpath("//div[@id='draggable2']"));
		WebElement droppedElement2 = driver.findElement(By.xpath("//div[@id='droppable2']"));
		//actionBuilder.dragAndDrop(draggedElement, droppedElement).perform();
		Action dragAndDrop = actionBuilder.clickAndHold(draggedElement).moveToElement(droppedElement).release(droppedElement).build();
		Action dragAndDrop2 = actionBuilder
				.clickAndHold(draggedElement2)
				.moveToElement(droppedElement2)
				.release(droppedElement2)
				.build();
		dragAndDrop.perform();
		Thread.sleep(2000);
		dragAndDrop2.perform();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
