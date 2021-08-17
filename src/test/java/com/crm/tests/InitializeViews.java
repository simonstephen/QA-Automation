package com.crm.tests;

import org.openqa.selenium.WebDriver;

import com.crm.config.BrowserDriver;
import com.crm.services.AccountsService;
import com.crm.services.ContactsService;
import com.crm.services.HomeService;
import com.crm.services.LoginService;

public class InitializeViews {
	protected static WebDriver wd = null;
	
	public static void init() {
		wd = BrowserDriver.getCurrentDriver();
		LoginService.init();
		HomeService.init();
		AccountsService.init();
		ContactsService.init();
	}
}

