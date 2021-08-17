package com.crm.config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

		private static WebDriver driver;
		
		public static WebDriver getBrowser(String browserType) {
			switch(browserType) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "G:\\Softwares\\drivers\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.setAcceptInsecureCerts(true);
				driver = new ChromeDriver();
				break;
				
			case "firefox":
				System.setProperty("webdriver.chrome.driver", "G:\\Softwares\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
				
			case "edge":
				System.setProperty("webdriver.chrome.driver", "G:\\Softwares\\drivers\\msedgedriver.exe");
				driver = new EdgeDriver();
				break;
			}
		
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			
			return driver;
			
		}
		
}
