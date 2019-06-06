package pages;

import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BookDisplayPage extends PageObject {

	@FindBy(id = "productTitle")
	 WebElementFacade productTitle;
	
	@FindBy(id = "add-to-cart-button")
	WebElementFacade addToCartBtn;
	
	@FindBy(xpath = "//h1[contains(.,'Added to Cart')]")
	WebElementFacade addedToCartMessage;
	
	public boolean isProductTitleDisplayed() {
		return productTitle.isDisplayed();
	}
	
	public void clickOnAddToCart() {
		if(isProductTitleDisplayed()) {
			addToCartBtn.click();
		}
	}
	
	public void verifyAddedToCartMessage() {
		Assert.assertTrue("Added to cart message was not displayed", addedToCartMessage.isDisplayed());
	}
	
}
