package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class GiftCardsHomePage extends PageObject {

	 @FindBy(xpath = "//img[@alt='Gift card by delivery types heading']")
	    WebElement giftCardImg;
	 
	 @FindBy(xpath = "//img[@alt='Birthday Gift Cards']")
	    WebElement birthdayGiftCardLink;
	 
	 @FindBy(xpath = "//img[@alt='Candles - Teal - egift card link image']")
	    WebElement candlesGiftCardLink;
	 
	 @FindBy(id = "gc-buy-box-atc")
	 	WebElement addToCartBtn;
	 
	 @FindBy(id = "gc-mini-picker-amount-1")
	 	WebElement dollarAmount;
	 
	 @FindBy(xpath = "//div[@class='a-alert-content' and contains(.,'Please enter an email address')] ")
	 	WebElement errorAlertForEmailAddress;
	
	 
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
