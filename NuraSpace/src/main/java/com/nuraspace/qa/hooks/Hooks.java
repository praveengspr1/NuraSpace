package com.nuraspace.qa.hooks;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.nuraspace.qa.libglobal.BaseClass;
import com.nuraspace.qa.pages.LoginPage;
import com.nuraspace.qa.pages.UserAccountPage;
import com.nuraspace.qa.webdriver_manager.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass{

	@Before
	public void beforeScenario() {
		try {
			DriverManager.initializeBrowserAndLandApplication(prop.getProperty("browser"));


			//Initilize the WebElements
			PageFactory.initElements(DriverManager.getDriver(), LoginPage.getLoginPage());
			PageFactory.initElements(DriverManager.getDriver(), UserAccountPage.getUserAccountPage());

		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	@After(order=1)
	public void takeScreenShotOnFailure(Scenario scenario) {
		if(scenario.isFailed()) {
			byte[] takesScreenShot = takesScreenShot();
			scenario.attach(takesScreenShot, "image/png", scenario.getName());
		}

		File file = new File(System.getProperty("user.dir")+"\\test-output\\ExternalHtml\\external.html");
		try {
			Desktop.getDesktop().browse(file.toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



	@After(order=0)
	public void afterScenario() {

		DriverManager.getDriver().manage().deleteAllCookies();
		DriverManager.getDriver().close();
	}
}

