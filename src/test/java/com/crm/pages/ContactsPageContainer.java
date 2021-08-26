package com.crm.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPageContainer {


	@FindBy (xpath = "//a[@data-name='create']")
	public WebElement CreateContact;
	
	@FindBy (xpath = "//select[@data-name='salutationName']")
	public WebElement SelectSalutation;
	
	@FindBy (xpath = "//option[@value='Mr.']")
	public WebElement Value;
	
	@FindBy (xpath = "//input[@data-name='firstName']")
	public WebElement FirstName;
	
	@FindBy (xpath = "//input[@data-name='lastName']")
	public WebElement LastName;
	
	@FindBy (xpath = "//span[@class='fas fa-angle-up']")
	public WebElement AccountSelection;
	
	@FindBy (linkText = ("Simon Stephen"))
	public WebElement Selection;
	
	@FindBy (xpath = "//input[@data-column='role']")
	public WebElement Role;
	
	@FindBy (xpath = "//input[@autocomplete='espo-emailAddress']")
	public WebElement Email;
	
	@FindBy (xpath = "//input[@autocomplete='espo-phoneNumber']")
	public WebElement PhoneNumber;
	
	@FindBy (xpath = "//textarea[@data-name='addressStreet']")
	public WebElement AddressStreet;
	
	@FindBy (xpath= "//input[@data-name='addressCity']")
	public WebElement AddressCity;
	
	@FindBy (xpath = "//input[@data-name='addressState']")
	public WebElement AddressState;
	
	@FindBy (xpath = "//input[@data-name='addressPostalCode']")
	public WebElement AddressPostalCode;
	
	@FindBy (xpath = "//input[@data-name='addressCountry']")
	public WebElement AddressCountry;
	
	@FindBy (xpath = "//button[@data-action='save']")
	public WebElement Save;
	
	@FindBy (xpath = "//td[@data-name='name']")
	public WebElement ContactName;
	
	@FindBy (xpath = "//span[@class='fas fa-id-badge']")
	public WebElement ClickOnContacts;
	
	@FindBy (xpath = "//a[@data-action='create']")
	public WebElement ClickOnCreateContacts;
	
	@FindBy (xpath = "//button[@data-action='edit']")
	public WebElement Edit;
	
	@FindBy (xpath = "//button[@data-toggle='dropdown']")
	public WebElement SelectDropDown;
	
	@FindBy (xpath = "//a[@data-action='delete']")
	public WebElement Delete;
	
	@FindBy (xpath = "//button[@data-name='confirm']")
	public WebElement Confirm;


	public WebElement getCreateContact() {
		return CreateContact;
	}

	public void setCreateContact(WebElement createContact) {
		CreateContact = createContact;
	}

	public WebElement getSelectSalutation() {
		return SelectSalutation;
	}

	public void setSelectSalutation(WebElement selectSalutation) {
		SelectSalutation = selectSalutation;
	}

	public WebElement getValue() {
		return Value;
	}

	public void setValue(WebElement value) {
		Value = value;
	}


	public WebElement getFirstName() {
		return FirstName;
	}

	public void setFirstName(WebElement FirstName) {
		this.FirstName = FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public void setTxtLastName(WebElement LastName) {
		this.LastName = LastName;
	}

	public WebElement getAccountSelection() {
		return AccountSelection;
	}

	public void setAccountSelection(WebElement accountSelection) {
		AccountSelection = accountSelection;
	}

	public WebElement getSelection() {
		return Selection;
	}

	public void setSelection(WebElement selection) {
		Selection = selection;
	}

	public WebElement getRole() {
		return Role;
	}

	public void setRole(WebElement role) {
		Role = role;
	}

	public WebElement getEmail() {
		return Email;
	}

	public void setEmail(WebElement email) {
		Email = email;
	}

	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(WebElement phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public WebElement getAddressStreet() {
		return AddressStreet;
	}

	public void setAddressStreet(WebElement addressStreet) {
		AddressStreet = addressStreet;
	}

	public WebElement getAddressCity() {
		return AddressCity;
	}

	public void setAddressCity(WebElement addressCity) {
		AddressCity = addressCity;
	}

	public WebElement getAddressState() {
		return AddressState;
	}

	public void setAddressState(WebElement addressState) {
		AddressState = addressState;
	}

	public WebElement getAddressPostalCode() {
		return AddressPostalCode;
	}

	public void setAddressPostalCode(WebElement addressPostalCode) {
		AddressPostalCode = addressPostalCode;
	}

	public WebElement getAddressCountry() {
		return AddressCountry;
	}

	public void setAddressCountry(WebElement addressCountry) {
		AddressCountry = addressCountry;
	}

	public WebElement getSave() {
		return Save;
	}

	public void setSave(WebElement save) {
		Save = save;
	}

	public WebElement getClickOnContacts() {
		return ClickOnContacts;
	}

	public void setClickOnContacts(WebElement clickOnContacts) {
		ClickOnContacts = clickOnContacts;
	}

	public WebElement getClickOnCreateContacts() {
		return ClickOnCreateContacts;
	}

	public void setClickOnCreateContacts(WebElement clickOnCreateContacts) {
		ClickOnCreateContacts = clickOnCreateContacts;
	}

	public WebElement getContactName() {
		System.out.println("The Contact Name as Be Validated");
		return ContactName;
	}

	public void setContactName(WebElement contactName) {
		ContactName = contactName;
	}

	public WebElement getEdit() {
		return Edit;
	}

	public void setEdit(WebElement edit) {
		Edit = edit;
	}

	public WebElement getSelectDropDown() {
		return SelectDropDown;
	}

	public void setSelectDropDown(WebElement selectDropDown) {
		SelectDropDown = selectDropDown;
	}

	public WebElement getDelete() {
		return Delete;
	}

	public void setDelete(WebElement delete) {
		Delete = delete;
	}

	public WebElement getConfirm() {
		return Confirm;
	}

	public void setConfirm(WebElement confirm) {
		Confirm = confirm;
	}

	


}

