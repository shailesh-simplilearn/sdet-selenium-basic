package com.training;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDEmo {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shailesh.gohel\\Documents\\Shailesh\\Appium\\Eclipse_Workspace\\SeleniumBasics\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='drag-drop-upload']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\shailesh.gohel\\Documents\\Shailesh\\SimpliLearn\\AutoIT\\Scripts\\uploadDialogue.exe");
		//driver.findElement(By.xpath("//input[@id='file-submit']")).click();
		Thread.sleep(2000);
	}

}
