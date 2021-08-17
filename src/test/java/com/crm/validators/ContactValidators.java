package com.crm.validators;
import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.ContactsService;
import com.crm.tests.InitializeViews;

import java.util.List;

import org.testng.Assert;


public class ContactValidators {
	AccountValidators accountValidators = null;

	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;
	
	public void init() {
	accountValidators = new AccountValidators();

	crmLoginData = CrmTestData.getTestData();
	appData = crmLoginData.getcrmlogindata();
	InitializeViews.init();
	BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
	}
	
	public void validateContactName(ContactsService contactsService) {
	String insertedContactName = appData.get(0).getFirstName();
		
		ContactsService contactName = contactsService.getContactName();
	
		Assert.assertEquals(contactName, insertedContactName);
		
	}

}
