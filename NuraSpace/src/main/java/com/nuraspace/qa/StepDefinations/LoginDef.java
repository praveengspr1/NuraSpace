
package com.nuraspace.qa.StepDefinations;

import org.junit.Assert;

import com.nuraspace.qa.libglobal.BaseClass;
import com.nuraspace.qa.pages.LoginPage;
import com.nuraspace.qa.pages.UserAccountPage;
import com.nuraspace.qa.webdriver_manager.DriverManager;

import io.cucumber.java.en.*;

public class LoginDef extends BaseClass{

	@Given("User lanuch the login url")
	public void user_lanuch_the_login_url() {
		DriverManager.getDriver().get(prop.getProperty("url"));
	}
	@When("User enters the valid email address {string} in Email field")
	public void user_enters_the_valid_email_address_in_email_field(String email) {
		LoginPage.getLoginPage().entersEmailAddress(email);
	}
	@When("clicks on Next button")
	public void clicks_on_next_button() {
		LoginPage.getLoginPage().clicksOnNextButton();
	}
	@When("User enters the valid password in Password field")
	public void user_enters_the_valid_password_in_password_field() {
		LoginPage.getLoginPage().entersPassword(prop.getProperty("validPassword"));
	}
	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		LoginPage.getLoginPage().clicksOnLoginButton();
	}
	@Then("User should get navigate to Floor plan page")
	public void user_should_get_navigate_to_floor_plan_page() {
		Assert.assertTrue(UserAccountPage.getUserAccountPage().displayedCurrentUserAccount());
	}

}
