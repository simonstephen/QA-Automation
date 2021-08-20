package com.crm.services;

//import org.apache.log4j.Logger;

import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pages.AccountsPageContainer;

public class AccountsService {

	public static AccountsPageContainer accountsPageContainer;
	//private static Logger Log = Logger.getLogger(AccountsService.class);

	public AccountsService clickOnCreateAccount() {
		accountsPageContainer.getCreateAccount().click();
		return this;
	}

	public AccountsService insertAccountNameWebsiteEmailPhoneNumberAndBillingAddress(String accountName, String website, String accountEmail,
			String phoneNumber, String billingAddressStreet, String billingAddressCity, String billingAddressState,
			String billingAddressPostalCode, String billingAddressCountry, String shippingAddressStreet, String shippingAddressCity, String shippingAddressState,
			String shippingAddressPostalCode, String shippingAddressCountry) {
		accountsPageContainer.getTxtAccountName().sendKeys(accountName);
		accountsPageContainer.getTxtWebsite().sendKeys(website);
		accountsPageContainer.getTxtEmail().sendKeys(accountEmail);
		accountsPageContainer.getPhoneNumber().click();
		accountsPageContainer.getPhoneProperty().click();
		accountsPageContainer.getTxtPhoneNumber().sendKeys(phoneNumber);
		accountsPageContainer.getBillingAdressStreet().sendKeys(billingAddressStreet);
		accountsPageContainer.getBillingAddressCity().sendKeys(billingAddressCity);
		accountsPageContainer.getBillingAddressState().sendKeys(billingAddressState);
		accountsPageContainer.getBillingAddressPostalCode().sendKeys(billingAddressPostalCode);
		accountsPageContainer.getBillingAddressCountry().sendKeys(billingAddressCountry);
	 accountsPageContainer.getClickCopyButton().click();

//		accountsPageContainer.getShippingAdressStreet().sendKeys(shippingAddressStreet);
//		accountsPageContainer.getShippingAddressCity().sendKeys(shippingAddressCity);
//		accountsPageContainer.getShippingAddressState().sendKeys(shippingAddressState);
//		accountsPageContainer.getShippingAddressPostalCode().sendKeys(shippingAddressPostalCode);
//		accountsPageContainer.getShippingAddressCountry().sendKeys(shippingAddressCountry);
//		//accountsPageContainer.getClickCopyButton().click();

	return this;	
}
		public AccountsService saveTheAccount() throws InterruptedException{
			accountsPageContainer.getSavetheAccount().click();	
		Thread.sleep(14000);
		//Log.info("Account created successfully with Billing And Shipping Address");

		return this;
	}

//	public AccountsService insertAccountNameandEmail(String email, String string) {
//		accountsPageContainer.getTxtAccountName().sendKeys(CommonUtil.generateRandomName());
//		accountsPageContainer.getTxtEmail().sendKeys(email);
//		accountsPageContainer.getSaveButton().click();
//		try {
//			Thread.sleep(6000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		Log.info("Account created successfully");
//		return this;
//	}
		



	public String getCreatedAccountName() {
		String aname = accountsPageContainer.getCreatedAccountName().getText();
		System.out.println("Account Name: "+aname);
		//accountsPageContainer.getCreatedAccountName().click();
		return aname;

	}
	
	public String ClickOnLink() {
	accountsPageContainer.getClickOnLink().click();
	return toString();

}

	public String getBillingAdressFromWebPage() {
		
		String str = accountsPageContainer.getGetBillingAddress().getText();
		System.out.println(str);
		return str;
	}
	
	

	public AccountsService insertAccountNameWebsiteEmailAndPhoneNumber(String website, String accountEmail,
			String phoneNumber) {
		accountsPageContainer.getTxtAccountName().sendKeys("Stephen");
		accountsPageContainer.getTxtWebsite().sendKeys(website);
		accountsPageContainer.getTxtEmail().sendKeys(accountEmail);
		accountsPageContainer.getPhoneProperty().click();
		accountsPageContainer.getPhoneNumber().click();
		accountsPageContainer.getTxtPhoneNumber().sendKeys(phoneNumber);
		accountsPageContainer.getSavetheAccount().click();
		return this;
	}
	
	public static void init() {
		accountsPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AccountsPageContainer.class);

	}

}
