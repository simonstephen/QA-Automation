package com.crm.util;

import org.testng.IClass;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.crm.config.BrowserDriver;

public class BaseListener extends TestListenerAdapter{
 static ExtentTest elogger;
 static ExtentReports extent = new ExtentReports();
 
	@Override
	public void onTestStart(ITestResult itr) { 
		log("Test Started...");
	}
	
	@Override
	public void onTestSuccess (ITestResult itr) {
		log("Test " +itr.getName()+" Passed"); 
		log(itr.getTestClass());
		log("Prority of the method is " +itr.getMethod().getPriority()); 
		elogger.pass(itr.getThrowable());
		elogger.log(Status.PASS, MarkupHelper.createLabel(itr.getName() + "Test Case Passed", ExtentColor.GREEN));
	}

	@Override
	public void onTestFailure (ITestResult itr) {
		extent = new ExtentReports();
		BrowserDriver.takeScreenShot();
		log("Test" +itr.getName() + " Failed");
		log(itr.getTestClass());
		log("Prority of the method is " +itr.getMethod().getPriority());
	}
	
	private void log(String methodName) { 
		System.out.println(methodName);
	}
	
	private void log(IClass testClass) { 
		System.out.println(testClass);
	}
}
