package StepDefinations;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef extends BaseClass {
	LoginPage lPage;

	@Given("User is on SauceDemo Login Page")
	public void user_is_on_sauce_demo_login_page() {
	    Initialization();
	}

	@When("User Enter Username and Password")
	public void user_enter_username_and_password() {
		lPage=new LoginPage();
		lPage.loginPageSendKeysFunctinality("standard_user", "secret_sauce");
		
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {
	    lPage.loginPageClickFunctinality();
	}
}
