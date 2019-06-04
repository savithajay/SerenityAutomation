package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.GiftCardSteps;

public class GiftCardStepDefs {
	
	@Steps
	GiftCardSteps giftCardSteps;

	@When("^The user adds a gift card$")
	public void the_user_adds_a_gift_card() {
	    giftCardSteps.selectGiftCardLink();
	}
	
	@Then("^Error message is diaplyed for missing email address$")
	public void error_message_is_diaplyed_for_missing_email_address() {
		giftCardSteps.addBirthdayGiftCardToCart();
		giftCardSteps.validateErrorMessage();
	}
	
}
