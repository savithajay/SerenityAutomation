package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

@DefaultUrl("https://www.amazon.com")
public class HomePage extends PageObject {

	 @FindBy(xpath = "//a[@class='nav-logo-link']")
	    WebElement logoLink;
	 
	 public boolean verifyHomePage() {
		 return logoLink.isDisplayed();
	 }
}
