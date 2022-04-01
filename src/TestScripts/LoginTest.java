package TestScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjects.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test(dataProvider = "myData")
	public void loginTest(String unsme, String password) throws InterruptedException {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnSignIn();
		loginPage.loginToApplication(unsme, password);
		Thread.sleep(2000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(loginPage.getValidationMessage(), "Invalid password.");
		softAssert.assertAll();
	}
	
	@DataProvider
	public Object[][] myData() {
		Object[][] myData = {{"shailesh@test.com", "pasword"}};
		return myData;
	}

}