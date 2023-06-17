package com.Base;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends CommonDriver implements ITestListener{
	public void onTestFailure(ITestResult result) {
		failedTest(result.getMethod().getMethodName());
	}
}
