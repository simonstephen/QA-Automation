package com.crm.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.ContactsService;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
import com.crm.validators.ContactValidators;

public class CreateContact1 {

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
		loginService.loginToApplication(appData.get(0).getUsername(), appData.get(0).getPassword());
	}

	@Test(description = "It Creates the Contact with Invalid Phone Number", priority = 0)
	public void CreateContact() throws InterruptedException {

		homeService.clickOnContactsTab();
		contactsService.clickOnCreateContact().insertContactDetailsWithInvalidPhoneNumber(
				appData.get(0).getSalut(), appData.get(0).getInpFirstName(), appData.get(0).getInpLastName(),
				appData.get(0).getAccountSelection(), appData.get(0).getInpEmail(), appData.get(0).getInpRole(),
				appData.get(0).getInpPhoneNumber(), appData.get(0).getInpAddressStreet(),
				appData.get(0).getInpAddressCity(), appData.get(0).getInpAddressState(),
				appData.get(0).getInpAddressPostalCode(), appData.get(0).getInpAddressCountry());
		contactValidators.validateContactName(contactsService);
		Thread.sleep(6000);
		
	}

	@Test(description = "It Creates the Contact without Billing Address", priority = 1)
	public void InsertContactDetailWithoutBillingAddress() {

		homeService.clickOnContactsTab();
		contactsService.clickOnCreateContact().insertContactDetailsWithoutBillingAddress(appData.get(0).getSalut(),
				appData.get(0).getInFirstName(), appData.get(0).getInLastName(), appData.get(0).getAccountSelection(),
				appData.get(0).getInEmail(), appData.get(0).getInrole(), appData.get(0).getInPhoneNumber());

		// contactValidators.validateContactName(contactsService);
	}
}