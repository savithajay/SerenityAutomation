package stepdefinitions;


import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import steps.HomePageSteps;

public class HomeStepDefs {
	
	@Steps
	HomePageSteps homePageSteps;

	@Given("^The user is on Amazon home page$")
	public void the_user_is_on_Amazon_home_page() {
		homePageSteps.openHomePage();
    	homePageSteps.gotoGiftCardsPage();
	}


	
}
