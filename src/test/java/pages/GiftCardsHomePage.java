package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.Step;

public class GiftCardsHomePage {

	 @FindBy(xpath = "//img[@alt='Gift card by delivery types heading']")
	    WebElement giftCardImg;
	 
	 @FindBy(xpath = "//img[@alt='Birthday Gift Cards']")
	    WebElement birthdayGiftCardLink;
	 
	 public boolean isPageLoaded() {
		 return giftCardImg.isDisplayed();
	 }
	 
	 public void clickBirthdayGiftCards() {
		 birthdayGiftCardLink.click();
	 }
}
