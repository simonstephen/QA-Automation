package com.crm.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPageContainer {


	@FindBy (xpath = "//a[@data-name='create']")
	public WebElement createAccount;
	
	@FindBy (xpath = "//input[@data-name='name']")
	public WebElement txtAccountName;
	
	@FindBy (xpath = "//input[@data-name='website']")
	public WebElement txtWebsite;
	
	@FindBy (xpath = "//input[@autocomplete='espo-emailAddress']")
	public WebElement txtEmail;
	
	@FindBy (xpath = "//select[@data-property-type='type']")
	public WebElement PhoneNumber;
	
	@FindBy (xpath = "//option[@value='Mobile']")
	public WebElement PhoneProperty;
	
	@FindBy (xpath = "//input[@autocomplete='espo-phoneNumber']")
	public WebElement txtPhoneNumber;
	
	@FindBy (xpath = "//textarea[@data-name='billingAddressStreet']")
	public WebElement BillingAdressStreet;
	
	@FindBy (xpath = "//input[@data-name='billingAddressCity']")
	public WebElement BillingAddressCity;
	
	@FindBy (xpath = "//input[@data-name='billingAddressState']")
	public WebElement BillingAddressState;
	
	@FindBy (xpath = "//input[@data-name='billingAddressPostalCode']")
	public WebElement BillingAddressPostalCode;
	
	@FindBy (xpath = "//input[@data-name='billingAddressCountry']")
	public WebElement BillingAddressCountry;
	

	@FindBy (xpath = "//button[@class='btn btn-default btn-sm']")
	public WebElement ClickCopyButton;
	
	@FindBy (xpath = "//button[@data-action='save']")
	public WebElement SavetheAccount;
	
	@FindBy (xpath = "//td[@data-name='name']")
	public WebElement CreatedAccountName;
	
	@FindBy (xpath = "//a[@title='Simon Stephen']")
	public WebElement ClickOnLink;
	
	@FindBy (xpath = "//div[@class= 'field' and @data-name='billingAddress']")
	public WebElement getBillingAddress;

	public WebElement getCreateAccount() {
		return createAccount;
	}

	public void setCreateAccount(WebElement createAccount) {
		this.createAccount = createAccount;
	}

	public WebElement getTxtAccountName() {
		return txtAccountName;
	}

	public void setTxtAccountName(WebElement txtAccountName) {
		this.txtAccountName = txtAccountName;
	}

	public WebElement getTxtWebsite() {
		return txtWebsite;
	}

	public void setTxtWebsite(WebElement txtWebsite) {
		this.txtWebsite = txtWebsite;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(WebElement txtEmail) {
		this.txtEmail = txtEmail;
	}


	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(WebElement phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public WebElement getPhoneProperty() {
		return PhoneProperty;
	}

	public void setPhoneProperty(WebElement phoneProperty) {
		PhoneProperty = phoneProperty;
	}

	public WebElement getTxtPhoneNumber() {
		return txtPhoneNumber;
	}

	public void setTxtPhoneNumber(WebElement txtPhoneNumber) {
		this.txtPhoneNumber = txtPhoneNumber;
	}

	public WebElement getBillingAdressStreet() {
		return BillingAdressStreet;
	}

	public void setBillingAdressStreet(WebElement billingAdressStreet) {
		BillingAdressStreet = billingAdressStreet;
	}

	public WebElement getBillingAddressCity() {
		return BillingAddressCity;
	}

	public void setBillingAddressCity(WebElement billingAddressCity) {
		BillingAddressCity = billingAddressCity;
	}

	public WebElement getBillingAddressState() {
		return BillingAddressState;
	}

	public void setBillingAddressState(WebElement billingAddressState) {
		BillingAddressState = billingAddressState;
	}

	public WebElement getBillingAddressPostalCode() {
		return BillingAddressPostalCode;
	}

	public void setBillingAddressPostalCode(WebElement billingAddressPostalCode) {
		BillingAddressPostalCode = billingAddressPostalCode;
	}

	public WebElement getBillingAddressCountry() {
		return BillingAddressCountry;
	}

	public void setBillingAddressCountry(WebElement billingAddressCountry) {
		BillingAddressCountry = billingAddressCountry;
	}


	public WebElement getClickCopyButton() {
		return ClickCopyButton;
	}

	public void setClickCopyButton(WebElement clickCopyButton) {
		ClickCopyButton = clickCopyButton;
	}

	public WebElement getSavetheAccount() {
		return SavetheAccount;
	}

	public void setSavetheAccount(WebElement savetheAccount) {
		SavetheAccount = savetheAccount;
	}
	
	
	public WebElement getCreatedAccountName() {
		System.out.println("Account Name as been Validated");
		return CreatedAccountName;
	}

	public void setCreatedAccountName(WebElement getCreatedAccountName) {
		this.CreatedAccountName = getCreatedAccountName;
	}



	public WebElement getClickOnLink() {
		return ClickOnLink;
	}

	public void setClickOnLink(WebElement clickOnLink) {
		ClickOnLink = clickOnLink;
	}

	public WebElement getGetBillingAddress() {
		System.out.println("Billing Address as been Validated");
		return getBillingAddress;
	}

	public void setGetBillingAddress(WebElement getBillingAddress) {
		this.getBillingAddress = getBillingAddress;
	}


}