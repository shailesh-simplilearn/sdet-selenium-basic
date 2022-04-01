package com.training;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class ScreenShotClass {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shailesh.gohel\\Documents\\Shailesh\\Appium\\Eclipse_Workspace\\SeleniumBasics\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		takeScreenShot("test1", driver);
		driver.navigate().to("http://www.yahoo.com");
		takeScreenShot("yahoo", driver);
		driver.navigate().to("http://www.google.com");
		takeScreenShot("google", driver);
		
		driver.quit();
		
	}
	
	public static void takeScreenShot(String fileName, WebDriver driver) {
		TakesScreenshot screenShot = ((TakesScreenshot)driver);
		File screenShotFile = screenShot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShotFile, new File("C:\\Users\\shailesh.gohel\\Documents\\Shailesh\\Appium\\ScreenShots\\"+fileName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
