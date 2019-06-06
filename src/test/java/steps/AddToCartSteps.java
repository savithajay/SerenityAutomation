package steps;

import net.thucydides.core.annotations.Step;
import pages.BookDisplayPage;

public class AddToCartSteps {

	BookDisplayPage bookDisplayPage;
	
	@Step
	public void addItemToCart() {
		bookDisplayPage.clickOnAddToCart();
		bookDisplayPage.verifyAddedToCartMessage();
	}
}
