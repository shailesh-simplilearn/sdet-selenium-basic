package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Interactions.InteractionMethods;
import TestScripts.BaseClass;

public class LoginPage extends InteractionMethods{
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	private WebElement signInLink;
	
	@FindBy(id = "email")
	private WebElement emailTextBox;
	@FindBy(id = "passwd")
	private WebElement passwordTextBox;
	@FindBy(id="SubmitLogin")
	private WebElement submitButton;
	@FindBy(css = "div[class='alert alert-danger'] ol li")
	private WebElement validationErrorMessage;
	
	public void clickOnSignIn() {
		signInLink.click();
	}
	public void loginToApplication(String username, String password) {
		emailTextBox.clear();
		emailTextBox.sendKeys(username);
		passwordTextBox.clear();
		passwordTextBox.sendKeys(password);
		clickOnElement(submitButton);
	}
	public String getValidationMessage() {
		return validationErrorMessage.getText();
	}
}
