package pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GiftCardsHomePage extends PageObject {

	 @FindBy(xpath = "//img[@alt='Gift card by delivery types heading']")
	 WebElementFacade giftCardImg;
	 
	 @FindBy(xpath = "//img[@alt='Birthday Gift Cards']")
	 WebElementFacade birthdayGiftCardLink;
	 
	 @FindBy(xpath = "//img[@alt='Candles - Teal - egift card link image']")
	 WebElementFacade candlesGiftCardLink;
	 
	 @FindBy(id = "gc-buy-box-atc")
	 WebElementFacade addToCartBtn;
	 
	 @FindBy(id = "gc-mini-picker-amount-1")
	 WebElementFacade dollarAmount;
	 
	 @FindBy(xpath = "//div[@class='a-alert-content' and contains(.,'Please enter an email address')] ")
	 WebElementFacade errorAlertForEmailAddress;
	
	 
	 public boolean isPageLoaded() {
		 return giftCardImg.isDisplayed();
	 }
	 
	 public void clickBirthdayGiftCards() {
		 System.out.println("comng here");
		 birthdayGiftCardLink.click();
	 }
	 
	 public void clickCandlesGiftCards() {
		 candlesGiftCardLink.click();
	 }
	 
	 public void addGiftCardToCart() {
		 dollarAmount.click();
		 addToCartBtn.click();
	 }
	 
	 public boolean verifyAlertMessage() {
		 return errorAlertForEmailAddress.isDisplayed();
	 }
}
