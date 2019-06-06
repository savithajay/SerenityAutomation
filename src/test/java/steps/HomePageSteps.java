package steps;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class HomePageSteps {

	 	HomePage homePage;

	    @Step
	    public void openHomePage(){
	        homePage.open();
	        Assert.assertTrue("Home page is not loaded", homePage.verifyHomePage());
	    }
	    
	    @Step
	    public void gotoGiftCardsPage() {
	    	homePage.selectGiftCardsLink();
	    }

	    @Step
	    public void searchThis(String searchStr) {
	    	homePage.searchSomething(searchStr);
	    }
	    
	    @Step
	    public void selectItem() {
	    	homePage.selectAnItem();
	    }
	    
}
