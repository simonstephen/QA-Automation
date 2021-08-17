package com.crm.config;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.Select;

public class BrowserDriver {

	private static WebDriver bDriver;

	public static WebDriver getCurrentDriver(String browserType) {
		if (bDriver == null) {
			try {
				bDriver = BrowserFactory.getBrowser(browserType);
			} catch (UnreachableBrowserException ucb) {
				System.out.println("Check the driver file");
				ucb.printStackTrace();
			}
		}
		return bDriver;
	}

	public static WebDriver getCurrentDriver() {
		return getCurrentDriver(PropertyLoader.getBrowser());
	}

	public static void selectDropDownItem(WebElement element, String item) {
		Select select = new Select(element);
		select.selectByVisibleText(item);

	}

	public static void takeScreenShot() {
		try {
			String newFileNamePath;
			File directory = new File(".");

			DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ssaa");
			Date date = new Date();
			newFileNamePath = directory.getCanonicalPath() + "\\ScreenShots\\" + dateFormat.format(date) + "_" + ".jpg";

			@SuppressWarnings("unused")
			File file = new File(newFileNamePath);
			File srcFile = ((TakesScreenshot) getCurrentDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File(newFileNamePath));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Check the file");
		}

	}

//	public static void waitForPageElement(WebElement buttoncopybilling, int i) {
//		// TODO Auto-generated method stub
//		
//	}

}