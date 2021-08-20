package com.crm.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountsService;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
import com.crm.util.BaseListener;
import com.crm.validators.AccountValidators;

public class CreateCrmAccount extends BaseListener{

	LoginService loginService = null;
	HomeService homeService = null;
	AccountsService accountService = null;
	AccountValidators accountValidators = null;

	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;

	@BeforeClass
	public void init() {
		loginService = new LoginService();
		homeService = new HomeService();
		accountService = new AccountsService();
		accountValidators = new AccountValidators();

		crmLoginData = CrmTestData.getTestData();
		appData = crmLoginData.getcrmlogindata();

		InitializeViews.init();
		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication(appData.get(0).getUsername(), appData.get(0).getPassword());
		test = extent.createTest("Functional Test Cases");
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
		
	homeService.clickOnAccountsTab();
	accountValidators.validateAccountName(accountService);
		
	
	//	accountValidators.validateBillingAddress(accountService);

	}
	

	
//	@Test(description = "It creates account with Account Name, Website, Email and Phone", priority=1)
//	public void createAccountWithNameWebsiteEmailAndPhoneNumber() throws InterruptedException {

//	homeService.clickOnAccountsTab();
//	accountService.clickOnCreateAccount().insertAccountNameWebsiteEmailAndPhoneNumber(
//			appData.get(0).getWebsite(), appData.get(0).getAccountEmail(),
//			appData.get(0).getPhoneNumber());
//			accountService.saveTheAccount();
			//elogger.pass("Test created with Email and Phone No is Passed");
	//}
}