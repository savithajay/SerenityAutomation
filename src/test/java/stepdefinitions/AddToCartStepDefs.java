package stepdefinitions;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.AddToCartSteps;

public class AddToCartStepDefs {

	@Steps
	AddToCartSteps addToCartSteps;
	
	@Then("^The user verifies that item is added$")
	public void addToCartAndValidate() {
		addToCartSteps.addItemToCart();
	}
	

}
