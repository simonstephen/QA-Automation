package com.crm.services;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import com.crm.config.BrowserDriver;
import com.crm.pages.ContactsPageContainer;

public class ContactsService {
	
	public static ContactsPageContainer contactsPageContainer;

	public ContactsService clickOnCreateContact() {
		contactsPageContainer.getCreateContact().click();
		return this;
	}


	public ContactsService insertContactDetails(String firstName, String lastName, String role, String email,
			String phoneNumber, String addressStreet, String addressCity, String addressState, String addressPostalCode,
			String addressCountry) {

		contactsPageContainer.getSelectSalutation().click();
		contactsPageContainer.getValue().click();
		contactsPageContainer.getFirstName().sendKeys(firstName);
		contactsPageContainer.getLastName().sendKeys(lastName);
		contactsPageContainer.getAccountSelection().click();
		contactsPageContainer.getSelection().click();
		contactsPageContainer.getRole().sendKeys(role);
		contactsPageContainer.getEmail().sendKeys(email);
		contactsPageContainer.getPhoneNumber().sendKeys(phoneNumber);
		contactsPageContainer.getAddressStreet().sendKeys(addressStreet);
		contactsPageContainer.getAddressCity().sendKeys(addressCity);
		contactsPageContainer.getAddressState().sendKeys(addressState);
		contactsPageContainer.getAddressPostalCode().sendKeys(addressPostalCode);
		contactsPageContainer.getAddressCountry().sendKeys(addressCountry);
		contactsPageContainer.getSave().click();
		return this;
	}

	public ContactsService insertContactDetailsWithInvalidPhoneNumber(String infirstName, String inlastName, String inrole,
			String inemail, String inphoneNumber, String inaddressStreet, String inaddressCity, String inaddressState,
			String inaddressPostalCode, String inaddressCountry) throws InterruptedException {

		contactsPageContainer.getClickOnContacts().click();
		contactsPageContainer.getClickOnCreateContacts().click();
		contactsPageContainer.getSelectSalutation().click();
		contactsPageContainer.getValue().click();
		contactsPageContainer.getFirstName().sendKeys(infirstName);
		contactsPageContainer.getLastName().sendKeys(inlastName);
		contactsPageContainer.getAccountSelection().click();
		contactsPageContainer.getSelection().click();
		contactsPageContainer.getRole().sendKeys(inrole);
		contactsPageContainer.getEmail().sendKeys(inemail);
		contactsPageContainer.getPhoneNumber().sendKeys(inphoneNumber);
		contactsPageContainer.getAddressStreet().sendKeys(inaddressStreet);
		contactsPageContainer.getAddressCity().sendKeys(inaddressCity);
		contactsPageContainer.getAddressState().sendKeys(inaddressState);
		contactsPageContainer.getAddressPostalCode().sendKeys(inaddressPostalCode);
		contactsPageContainer.getAddressCountry().sendKeys(inaddressCountry);
		contactsPageContainer.getSave().click();
		
		Thread.sleep(12000);

		return this;
	}

	
	
	public ContactsService insertContactDetailsWithoutBillingAddress(String inpfirstName, String inplastName,
		String inpemail, String inpphoneNumber) {
		
		contactsPageContainer.getClickOnContacts().click();
		contactsPageContainer.getClickOnCreateContacts().click();
		contactsPageContainer.getSelectSalutation().click();
		contactsPageContainer.getValue().click();
		contactsPageContainer.getFirstName().sendKeys(inpfirstName);
		contactsPageContainer.getLastName().sendKeys(inplastName);
		contactsPageContainer.getAccountSelection().click();
		contactsPageContainer.getSelection().click();
		//contactsPageContainer.getRole().sendKeys(inprole);
		contactsPageContainer.getEmail().sendKeys(inpemail);
		contactsPageContainer.getPhoneNumber().sendKeys(inpphoneNumber);
		contactsPageContainer.getSave().click();
		
		return this;

	}

	public ContactsService editContactDetails() {
		contactsPageContainer.getEdit().click();
		contactsPageContainer.getSelectSalutation().click();
		contactsPageContainer.getValue().click();
		contactsPageContainer.getFirstName().sendKeys(Keys.CONTROL, "a");
		contactsPageContainer.getFirstName().sendKeys(Keys.CONTROL, "x");
		contactsPageContainer.getFirstName().sendKeys("P");
		contactsPageContainer.getLastName().sendKeys(Keys.CONTROL, "a");
		contactsPageContainer.getLastName().sendKeys(Keys.CONTROL, "x");
		contactsPageContainer.getLastName().sendKeys("Simon Stephen");
		contactsPageContainer.getSave().click();
		return this;
	}

	public ContactsService DeleteContactDetails() {
		BrowserDriver.selectDropDownItem(contactsPageContainer.getSelectDropDown(), "Remove");
		contactsPageContainer.getSelectDropDown().click();
		contactsPageContainer.getDelete().click();
		contactsPageContainer.getConfirm().click();
		return this;
	}

	public static void init() {
		contactsPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), ContactsPageContainer.class);

	}

	public ContactsService getContactName() {
		contactsPageContainer.getContactName().click();
		return this;
		}


	}
