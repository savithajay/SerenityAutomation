package steps;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import pages.GiftCardsHomePage;

public class GiftCardSteps {

	GiftCardsHomePage giftCardsHomePage;
	
	@Step
	public void selectGiftCardLink() {
		if(giftCardsHomePage.isPageLoaded()) {
			giftCardsHomePage.clickBirthdayGiftCards();
			giftCardsHomePage.clickCandlesGiftCards();
		}
	}
	
	@Step 
	public void addBirthdayGiftCardToCart() {
		giftCardsHomePage.addGiftCardToCart();
	}
	
	@Step
	public void validateErrorMessage() {
		Assert.assertTrue("Expected error message for missing email address is not displayed", giftCardsHomePage.verifyAlertMessage());
	}
}
