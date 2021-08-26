package com.crm.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.crm.services.HomeService;
import com.crm.services.ContactsService;
import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.LoginService;
import com.crm.util.BaseListener;
import com.crm.validators.ContactValidators;

public class CreateContact1 extends BaseListener {

	LoginService loginService = null;
	HomeService homeService = null;
	ContactsService contactsService = null;
	ContactValidators contactValidators = null;

	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;

	@BeforeClass

	public void init() {
		loginService = new LoginService();
		homeService = new HomeService();
		contactsService = new ContactsService();
		contactValidators = new ContactValidators();

		crmLoginData = CrmTestData.getTestData();
		appData = crmLoginData.getcrmlogindata();
		InitializeViews.init();
		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		//loginService.loginToApplication(appData.get(0).getUsername(), appData.get(0).getPassword());
		test = extent.createTest("Functional Test Cases");
	}
	
	@Test(description = "It Creates the Contact with Invalid Phone Number", priority = 0)
	public void CreateContact() throws InterruptedException {

		homeService.clickOnContactsTab();
		contactsService.clickOnCreateContact().insertContactDetailsWithInvalidPhoneNumber(appData.get(0).getInfirstName(), appData.get(0).getInlastName(), appData.get(0).getInrole(),
				appData.get(0).getInemail(),appData.get(0).getInphoneNumber(), appData.get(0).getInaddressStreet(), appData.get(0).getInaddressCity(), appData.get(0).getInaddressState(),
				appData.get(0).getInaddressPostalCode(), appData.get(0).getInaddressCountry());
		//contactValidators.validateContactName(contactsService);
		
	}

	@Test(description = "It Creates the Contact without Billing Address", priority = 1)
	public void InsertContactDetailWithoutBillingAddress() {

		homeService.clickOnContactsTab();
		contactsService.clickOnCreateContact().insertContactDetailsWithoutBillingAddress(appData.get(0).getInpfirstName(), appData.get(0).getInplastName(),
				appData.get(0).getInpemail(), appData.get(0).getInpphoneNumber());

		// contactValidators.validateContactName(contactsService);
	}
}