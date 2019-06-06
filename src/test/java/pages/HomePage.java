package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.amazon.com")
public class HomePage extends PageObject {

	 @FindBy(xpath = "//a[@class='nav-logo-link']")
	 WebElementFacade logoLink;
	 	 
	 @FindBy(xpath = "//a[contains(., 'Gift Cards')]")
	 WebElementFacade giftCardsLink;
	 
	 @FindBy(id = "twotabsearchtextbox")
	 WebElementFacade searchBox;
	 
	 @FindBy(xpath = "//input[@type='submit']")
	 WebElementFacade searchItem;

	 public boolean verifyHomePage() {
		 return logoLink.isDisplayed();
	 }
	 
	 public void selectGiftCardsLink() {
		 if(verifyHomePage()) {
			 giftCardsLink.click();
		 }
	 }
	 
	 public void searchSomething(String searchStr) {
		 if(verifyHomePage()) {
			 searchBox.sendKeys(searchStr);
			 searchItem.click();
		 }
	 }
	 
	 public void selectAnItem() {
		 WebElementFacade item = find(By.xpath("//img[@alt='Educated: A Memoir']"));
		 item.click();
	 }
}
