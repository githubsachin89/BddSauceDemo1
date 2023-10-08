package StepDefinations;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.YourCart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class YourCartStepDef extends BaseClass{
	
	YourCart yourC;
	@Given("User is on SauceDemo YourCart page")
	public void user_is_on_sauce_demo_your_cart_page() {
		String actualUrl=driver.getCurrentUrl();
	    Assert.assertEquals(actualUrl,"https://www.saucedemo.com/cart.html");
	}

	@Then("user remove {int} product from cart")
	public void user_remove_product_from_cart(Integer int1) {
	    yourC=new YourCart();
	    yourC.yourCartfunctinality();
	}

	@Then("user enter on checkout button")
	public void user_enter_on_checkout_button() {
	    yourC.yourCartfunctinality();
	}

}
