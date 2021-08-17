package com.crm.tests;

import java.util.List;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountsService;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
import com.crm.validators.AccountValidators;

public class CreateCrmAccount {

	LoginService loginService = null;
	HomeService homeService = null;
	AccountsService accountService = null;
	AccountValidators accountValidators = null;

	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;
	
	static ExtentTest elogger;
	static ExtentReports extent = new ExtentReports();

	@BeforeClass
	public void init() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("Reports//crm-test-result.html");
		
	
		extent.setSystemInfo("OS Name", "Windows");
		extent.setSystemInfo("Environment", "QA");
		reporter.config().setDocumentTitle("Crm automation test report for QA environment");
		loginService = new LoginService();
		homeService = new HomeService();
		accountService = new AccountsService();
		accountValidators = new AccountValidators();

		crmLoginData = CrmTestData.getTestData();
		appData = crmLoginData.getcrmlogindata();

		InitializeViews.init();
		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication(appData.get(0).getUsername(), appData.get(0).getPassword());

	}
	
	@AfterClass
	public void tearDown() {
		BrowserDriver.getCurrentDriver();
	}
	
	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			elogger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test case FAILED due yo below issues", null));
			elogger.fail(result.getThrowable());
		}else if (result.getStatus() == ITestResult.SUCCESS) {
				elogger.log(Status.PASS, 
						MarkupHelper.createLabel(result.g, null))
			}
			
		}
		extent.flush();
		
	}
	

	@Test(description = "It creates account with billing address", priority=0)
	public void insertAccountDetails() throws InterruptedException {

		homeService.clickOnAccountsTab();
		accountService.clickOnCreateAccount().insertAccountNameWebsiteEmailPhoneNumberAndBillingAddress(
				appData.get(0).getAccountName(), appData.get(0).getWebsite(), appData.get(0).getAccountEmail(),
				appData.get(0).getPhoneNumber(), appData.get(0).getBillingAddressStreet(),
				appData.get(0).getBillingAddressCity(), appData.get(0).getBillingAddressState(),
				appData.get(0).getBillingAddressPostalCode(), appData.get(0).getBillingAddressCountry(),
				appData.get(0).getShippingAddressStreet(), appData.get(0).getShippingAddressCity(),
				appData.get(0).getShippingAddressState(), appData.get(0).getShippingAddressPostalCode(),
				appData.get(0).getShippingAddressCountry());
		accountService.saveTheAccount();
		accountService.getBillingAdressFromWebPage();

	accountValidators.validateAccountName(accountService);
		accountValidators.validateBillingAddress(accountService);
		elogger.pass("Test case is Passed");

	}
	

	
//	@Test(description = "It creates account with Account Name, Website, Email and Phone", priority=1)
//	public void createAccountWithNameWebsiteEmailAndPhoneNumber() throws InterruptedException {
//
//	homeService.clickOnAccountsTab();
//	accountService.clickOnCreateAccount().insertAccountNameWebsiteEmailAndPhoneNumber(
//			appData.get(0).getInpLastName(), appData.get(0).getWebsite(), appData.get(0).getAccountEmail(),
//			appData.get(0).getPhoneNumber());
//			accountService.saveTheAccount();
//			elogger.pass("Test created with Email and Phone No is Passed");
//	}
}