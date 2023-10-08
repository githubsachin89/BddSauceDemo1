package StepDefinations;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.SwagLabsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabsStepdef extends BaseClass{
	SwagLabsPage slPage;
	
	@Given("user is on SauceDemo SwagLabs Page")
	public void user_is_on_sauce_demo_swag_labs_page() {
	    String actualUrl=driver.getCurrentUrl();
	    Assert.assertEquals(actualUrl,"https://www.saucedemo.com/inventory.html");
	}

	@When("User add {int} products in cart")
	public void user_add_products_in_cart(Integer int1) {
		slPage= new SwagLabsPage();
		slPage.swagLabsAddCartFuctinality();
		
	}
	
	@Then("User click on cart button")
	public void user_click_on_cart_button() throws Exception {
		slPage.swagLabsCartFuntinality();
	}


}
