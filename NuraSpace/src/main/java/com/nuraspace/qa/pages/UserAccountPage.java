package com.nuraspace.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nuraspace.qa.libglobal.BaseClass;
import com.nuraspace.qa.webdriver_manager.DriverManager;

public class UserAccountPage extends BaseClass {

	public static UserAccountPage userAccountPage;

	private UserAccountPage() {
	}

	public static UserAccountPage getUserAccountPage() {
		return (userAccountPage ==null) ? userAccountPage= new UserAccountPage():userAccountPage;
	}

	@FindBy(xpath="//button[@aria-label='Account of current user']")
	private WebElement currentUserAccount;

	public boolean displayedCurrentUserAccount() {
		return	elementIsDisplayed(currentUserAccount);
	}

}
