package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pages.HomePageContainer;

public class HomeService {

	public static HomePageContainer homePageContainer;
	private static Logger Log = Logger.getLogger(HomeService.class);
	
	public void clickOnAccountsTab() {
	homePageContainer.getHomePageAccountsTab().click();
	Log.info("Accounts page opened");
 }
	
	public void clickOnContactsTab() {
		homePageContainer.getHomePageContactsTab().click();
		Log.info("Create account page is opened successful");
	}
	
	public static void init() {
		homePageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), HomePageContainer.class);
	}
		
}
