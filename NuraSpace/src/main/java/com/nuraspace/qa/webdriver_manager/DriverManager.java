package com.nuraspace.qa.webdriver_manager;

import java.util.concurrent.TimeUnit;

import javax.rmi.CORBA.Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.nuraspace.qa.libglobal.BaseClass;
import com.nuraspace.qa.utilities.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager extends BaseClass {

	private static WebDriver driver=null;

	public static void initializeBrowserAndLandApplication(String browser) {

		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firfox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new  SafariDriver();
		}
		else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
	}


	public static WebDriver getDriver() {
		return driver;
	}

}
