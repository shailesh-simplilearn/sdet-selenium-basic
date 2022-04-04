package com.testNg;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.util.ReportGenerator;

@Listeners(MyListeners.class)
public class TestNGClassWithListeners {
	//ReportGenerator report = new ReportGenerator();
	@Test
	public void firstMethod() {
		
		System.out.println("First Test Method");
		//report.test.log(LogStatus.PASS, "My Test is Passed");
	}
	@Test
	public void firstMethod1() {
	}
	@Test
	public void firstMethod2() {
		
		/*
		 * report.test.log(LogStatus.FAIL, "My Test is Failed" +
		 * report.test.addScreenCapture(System.getProperty
		 * ("user.dir")+"/data/flower.jpg"));
		 */
		
		Assert.fail();
	}
	@Test
	public void firstMethod3() {
	}
	
	@AfterTest
	public void closeBrowser() {
		/*
		 * report.reports.flush(); report.reports.endTest(report.test);
		 */
		
	}
	

}
