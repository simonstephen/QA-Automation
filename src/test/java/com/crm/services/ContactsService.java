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

	public ContactsService insertContactDetails(String salut, String firstName, String LastName, String accountSelection,
			String role, String email, String phoneNumber, String addressStreet, String addressCity,
			String addressState, String addressPostalCode, String addressCountry) {

		contactsPageContainer.getSelectSalutation().click();
		contactsPageContainer.getValue().click();
		contactsPageContainer.getFirstName().sendKeys(firstName);
		contactsPageContainer.getLastName().sendKeys(LastName);
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

	public ContactsService insertContactDetailsWithInvalidPhoneNumber(String salutation, String inpfirstName, String inplastName,
			String inpaccountSelection, String inprole, String inpemail, String inpphoneNumber, String inpaddressStreet,
			String inpaddressCity, String inpaddressState, String inpaddressPostalCode,
			String inpaddressCountry) {

		contactsPageContainer.getClickOnContacts().click();
		contactsPageContainer.getClickOnCreateContacts().click();
		contactsPageContainer.getSelectSalutation().click();
		contactsPageContainer.getValue().click();
		contactsPageContainer.getFirstName().sendKeys(inpfirstName);
		contactsPageContainer.getLastName().sendKeys(inplastName);
		contactsPageContainer.getAccountSelection().click();
		contactsPageContainer.getSelection().click();
		contactsPageContainer.getRole().sendKeys(inprole);
		contactsPageContainer.getEmail().sendKeys(inpemail);
		contactsPageContainer.getPhoneNumber().sendKeys(inpphoneNumber);
		contactsPageContainer.getAddressStreet().sendKeys(inpaddressStreet);
		contactsPageContainer.getAddressCity().sendKeys(inpaddressCity);
		contactsPageContainer.getAddressState().sendKeys(inpaddressState);
		contactsPageContainer.getAddressPostalCode().sendKeys(inpaddressPostalCode);
		contactsPageContainer.getAddressCountry().sendKeys(inpaddressCountry);
		contactsPageContainer.getSave().click();
		return this;
	}

	public ContactsService insertContactDetailsWithoutBillingAddress(String salutation, String inFirstName, String inLastName,
			String accountSelection, String inEmail, String inRole, String PhoneNumber) {

		contactsPageContainer.getClickOnContacts().click();
		contactsPageContainer.getClickOnCreateContacts().click();
		contactsPageContainer.getSelectSalutation().click();
		contactsPageContainer.getValue().click();
		contactsPageContainer.getFirstName().sendKeys(inFirstName);
		contactsPageContainer.getLastName().sendKeys(inLastName);
		contactsPageContainer.getAccountSelection().click();
		contactsPageContainer.getSelection().click();
		contactsPageContainer.getRole().sendKeys(inRole);
		contactsPageContainer.getEmail().sendKeys(inEmail);
		contactsPageContainer.getPhoneNumber().sendKeys(PhoneNumber);
		contactsPageContainer.getSave().click();
		return this;

	}

	public ContactsService editContactDetails(String salutation, String firstName, String lastName, String accountSelection,
			String role, String email, String phoneNumber, String addressStreet, String addressCity,
			String addressState, String addressPostalCode, String addressCountry) {
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
