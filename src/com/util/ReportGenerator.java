package com.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ReportGenerator {
	String pattern = "MM_dd_yyyy_hh_mm";
	SimpleDateFormat format = new SimpleDateFormat(pattern);
	
	public ExtentReports reports = new ExtentReports
			(System.getProperty("user.dir")+"/reports/test-report_"+ format.format(new Date())+".html");

	public ExtentTest test = reports.startTest("First-Test");
	
}
