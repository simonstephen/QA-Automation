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
import com.crm.validators.ContactValidators;

public class CreateContact {

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

	@Test(description = "It Creates the Contact", priority = 0)
	public void insertContactDetails() {

		homeService.clickOnContactsTab();
		contactsService.clickOnCreateContact().insertContactDetails(appData.get(0).getSalut(), appData.get(0).getFirstName(),
				appData.get(0).getLastName(), appData.get(0).getAccountSelection(), appData.get(0).getRole(),
				appData.get(0).getEmail(), appData.get(0).getPhoneNumber(), appData.get(0).getAddressStreet(),
				appData.get(0).getAddressCity(), appData.get(0).getAddressState(),
				appData.get(0).getAddressPostalCode(), appData.get(0).getAddressCountry());
		contactValidators.validateContactName(contactsService);
	}

//	@Test(description = "It Edits the Contact", priority = 1)
//	public void editContactDetails() {
//
//		contactsService.editContactDetails(appData.get(0).getSalutation(), appData.get(0).getFirstName(),
//				appData.get(0).getLastName(), appData.get(0).getAccountSelection(), appData.get(0).getRole(),
//				appData.get(0).getEmail(), appData.get(0).getPhoneNumber(), appData.get(0).getAddressStreet(),
//				appData.get(0).getAddressCity(), appData.get(0).getAddressState(),
//				appData.get(0).getAddressPostalCode(), appData.get(0).getAddressCountry());

	//}

//	@Test(description = "It Deletes the Contact", priority = 2)
//	public void DeleteContactDetails() {
//		contactsService.DeleteContactDetails();
//	}
}