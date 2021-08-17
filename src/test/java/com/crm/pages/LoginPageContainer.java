package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageContainer {

	@FindBy(xpath = "//input[@id='field-userName']")
	public WebElement txtfieldUserName;
	
	@FindBy(xpath = "//input[@id='field-password']")
	public WebElement txtfieldPassword;
	
	@FindBy(xpath = "//button[@id='btn-login']")
	public WebElement loginButton;

	public WebElement getTxtfieldUserName() {
		return txtfieldUserName;
	}

	public void setTxtfieldUserName(WebElement txtfieldUserName) {
		this.txtfieldUserName = txtfieldUserName;
	}

	public WebElement getTxtfieldPassword() {
		return txtfieldPassword;
	}

	public void setTxtfieldPassword(WebElement txtfieldPassword) {
		this.txtfieldPassword = txtfieldPassword;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	
}
