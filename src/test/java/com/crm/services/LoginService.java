package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import com.crm.config.BrowserDriver;
import com.crm.pages.LoginPageContainer;

public class LoginService {
	
	public static LoginPageContainer loginPageContainer;
	private static Logger Log = Logger.getLogger(LoginService.class);

	//reusable application login method
	public void loginToApplication(String usrname, String pword) {
		loginPageContainer.getTxtfieldUserName().sendKeys(usrname);
		loginPageContainer.getTxtfieldPassword().sendKeys(pword);
		loginPageContainer.getLoginButton().click();
		Log.info("User logged into CRM Application");
	}

	public static void init() {
		loginPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPageContainer.class);
		
	}

	public void loginToApplication() {
		// TODO Auto-generated method stub
		
	}

	
}
