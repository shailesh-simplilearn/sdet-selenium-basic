package com.testNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;
import com.util.ReportGenerator;

public class MyListeners extends ReportGenerator implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("My Test Started");
		
	}
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
	
		test.log(LogStatus.PASS, "My Test is Passed");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		test.log(LogStatus.FAIL, "My test is failed");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
		reports.endTest(test);
	}
	
	
	
	
}
