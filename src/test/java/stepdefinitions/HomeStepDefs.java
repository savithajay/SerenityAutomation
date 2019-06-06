package stepdefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.HomePageSteps;

public class HomeStepDefs {
	
	@Steps
	HomePageSteps homePageSteps;

	@Given("^The user is on Amazon home page and navigates to giftcard$")
	public void the_user_is_on_Amazon_home_page_and_navigates_to_giftcard() {
		homePageSteps.openHomePage();
    	homePageSteps.gotoGiftCardsPage();
	}

	@When("^The user searches for a item$")
	public void the_user_searches_for_a_item() {
		homePageSteps.searchThis("educated by tara westover");
	}
	
	@Then("^user adds the selected item to cart$")
	public void user_adds_the_selected_item_to_cart() {
		homePageSteps.selectItem();
	}
	
	@Given("^The user is on Amazon home page$")
	public void the_user_is_on_Amazon_home_page() {
		homePageSteps.openHomePage();
	}
	
}
