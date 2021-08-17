package com.crm.validators;

import java.util.List;


import org.testng.Assert;

import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountsService;

public class AccountValidators {
	

	CrmLoginData crmLoginData = CrmTestData.getTestData();
	List<LoginData> appData = crmLoginData.getcrmlogindata();

	public void validateAccountName(AccountsService accountsService) {

		String insertedAccountName = appData.get(0).getAccountName();
		String accountName = accountsService.getCreatedAccountName();
		Assert.assertEquals(accountName, insertedAccountName);

	}

	public void validateBillingAddress(AccountsService accountsService) {

		String xmlStreet = appData.get(0).getBillingAddressStreet();
		String xmlCity = appData.get(0).getBillingAddressCity();
		String xmlState = appData.get(0).getBillingAddressState();
		String xmlPostalCode = appData.get(0).getBillingAddressPostalCode();
		String xmlCountry = appData.get(0).getBillingAddressCountry();

		String billingAddress = accountsService.getBillingAdressFromWebPage();

		String line[] = billingAddress.split("\\r?\\n");
		String[] lineIn = line[1].split(" ");
		String removeComm = lineIn[0].replace(",", "");

		Assert.assertEquals(xmlStreet, line[0]);
		Assert.assertEquals(xmlCity, removeComm);
		Assert.assertEquals(xmlState, lineIn[1]);
		Assert.assertEquals(xmlPostalCode, lineIn[2]);
		Assert.assertEquals(xmlCountry, line[2]);

	}

//	public void validateShippingAddressCountry(String shippingAddressCountry) {
//
//		String insertedBillingAddressCountry = "United States";
//		String shippingAddressCountry = accountsService.getCreatedShippingAdressCountry();
//		Assert.assertEquals(shippingAddressCountry, insertedshippingAddressCountry);
//	}

}
