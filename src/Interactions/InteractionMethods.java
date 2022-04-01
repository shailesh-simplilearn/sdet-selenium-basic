package Interactions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestScripts.BaseClass;

public class InteractionMethods extends BaseClass{
	
	public void waitForElementToBePresent(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void clickOnElement(WebElement element) {
		waitForElementToBePresent(element);
		element.click();
	}

}
