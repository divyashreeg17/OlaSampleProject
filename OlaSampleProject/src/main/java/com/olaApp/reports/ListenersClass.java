package com.olaApp.reports;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.olaApp.init.Constants;
import com.olaApp.lib.BaseLib;

public class ListenersClass extends BaseLib implements ITestListener{

	public void onFinish(ITestContext arg0) {
		extentreports.flush();
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		extenttest.log(Status.FAIL, testCaseName + " is fail");
		extentreports.flush();
	}

	public void onTestSkipped(ITestResult result) {
		Extent_Report_Manager.extenttest.log(Status.SKIP, testCaseName + " is skipped");
		extentreports.flush();
	}

	public void onTestStart(ITestResult result) {
		testCaseName = result.getTestClass().getName().toString();
		Extent_Report_Manager.createExtentReport();
		extenttest = extentreports.createTest(testCaseName);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
		String sDate = sdf.format(date);
		Extent_Report_Manager.screenShotPath = Constants.DirPath + "/reports" + "/Run-" + sDate + "/screenshots/";
		
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.log(Status.PASS, testCaseName + " is pass");
		extentreports.flush();
	}

}
