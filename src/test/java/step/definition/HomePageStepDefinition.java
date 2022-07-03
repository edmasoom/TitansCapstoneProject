package step.definition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.WebDriverUtility;

public class HomePageStepDefinition extends Base {
	
	HomePageObject home = new HomePageObject(); 
	
	//Scenario: User verify currency values change
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		Assert.assertTrue(home.userIsInRetailWebSite());
		logger.info(home.userIsInRetailWebSite() + "is present");
	    
	}
	@When("User click on Currency")
	public void user_click_on_currency() {
	home.userClickCurrency();
	logger.info("User click on Currency Button");
	 WebDriverUtility.hardWait();
	}
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
	home.userClickOnEuroCurrency();
	logger.info("User click on Euro Currency");
	WebDriverUtility.hardWait(); 
	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
	Assert.assertTrue(home.userSeeCurrencyChanged());
	logger.info(home.userSeeCurrencyChanged() + " Euro is present");
	WebDriverUtility.takeScreenShot();
	WebDriverUtility.hardWait();
	}

//Scenario: User empty Shopping cart message displays 
	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		home.userClickShoppingCart();
		logger.info("User Click on Shopping Cart Button");
	   
	}
	@Then("{string} message should display")
	public void message_should_display(String expectedMessage) {
	Assert.assertEquals(expectedMessage, home.userSeeEmpytCartMessage()); 
	logger.info(expectedMessage + "matches" + home.userSeeEmpytCartMessage() );
	    
	}

	
	
	
	
	
	
	
	

}
