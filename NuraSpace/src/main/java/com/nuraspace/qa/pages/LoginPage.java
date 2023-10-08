package com.nuraspace.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nuraspace.qa.libglobal.BaseClass;
import com.nuraspace.qa.webdriver_manager.DriverManager;

public class LoginPage extends BaseClass{
	public static LoginPage loginPage;

	private LoginPage() {

	}

	public static LoginPage getLoginPage() {
		return (loginPage ==null) ? loginPage= new LoginPage():loginPage;
	}

	@FindBy(xpath="//input[@name='email']")
	private WebElement email_field;

	@FindBy(id="notistack-snackbar")
	private WebElement emailWaringMessage;


	@FindBy(xpath="//button[@type='button']")
	private WebElement next_btn;

	@FindBy(xpath="//input[@name='password']")
	private WebElement password_field;


	@FindBy(xpath="//button[@type='button']")
	private WebElement login_btn;


	public void entersEmailAddress(String email) {
		sendByTextValue(email_field, email);
	}

	public void entersPassword(String password) {
		sendByTextValue(password_field, password);
	}

	public void clicksOnNextButton() {
		clicksOnWebElement(next_btn);
	}
	public void clicksOnLoginButton() {
		clicksOnNextButton();
	}



}
