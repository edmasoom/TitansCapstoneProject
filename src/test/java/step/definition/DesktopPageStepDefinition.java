package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPageObject;
import utilities.WebDriverUtility;

public class DesktopPageStepDefinition extends Base {
	
	DesktopPageObject desktop = new DesktopPageObject(); 
	
	//First Scenario - User verify desktop items 
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktop.userClickDesktopsButton();
		logger.info("User click on Desktop tab");
	
	}
	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktop.userClickOnAllDesktopsList();
		logger.info("User click on all desktop items list" );
		WebDriverUtility.hardWait();
	
	}
	
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
	List<WebElement> desktopItems = desktop.userSeeAllDesktopItems(); 
	for(WebElement element:desktopItems ) { 
		Assert.assertTrue(element.isDisplayed());
		logger.info(element.getAttribute("title") + " is present");
		WebDriverUtility.takeScreenShot();
	}
		
		/*
	 * First we need to store element in a list 
	 * and iterate through the list 
	 * assertion to validate the presence each element index
	 * 	
	 */
		
		
	}
		
	//Second Scenario User add items to Cart 
		@When("User click ADD TO CART option on HP LP3065 item")
		public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktop.userClickonHPLPAddToCart();
		logger.info("User click on add to cart button");
		
		  
		}
		@When("User select quantity {string}")
		public void user_select_quantity(String quantity) {
			desktop.userSelectOneQuantity(quantity);
			logger.info("User click one" + quantity);
	
		}
		@When("User click add to Cart button")
		public void user_click_add_to_cart_button() {
			desktop.userClickAddToCart();
			logger.info("User click on add to cart button");
		  
		}
		
		@Then("User should see a message HP {string}")
		public void user_should_see_a_message_HP (String ExpectedsuccessMessage) {
			//System.out.println(desktop.userSeeSuccessMessage() + "This is from print");
			Assert.assertEquals(ExpectedsuccessMessage, desktop.userSeeSuccessMessage());
			logger.info(ExpectedsuccessMessage + " Matches " + desktop.userSeeSuccessMessage());
			WebDriverUtility.takeScreenShot();
		}	
	// or we can write 
//		public boolean isSuccessMessagePresent() {
//			return true; 
//		}
//		    
		
	//Third : 	Scenario: User add Canon EOS 5D from Desktops tab to the cart
		
		@Given("User click  ADD TO CART option on Canon EOS 5Ditem")
		public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
			desktop.userClickCanonEOS();
			logger.info("User click on Canon EOS5D");
		   
		}
		@Given("User select color from dropdown Red")
		public void user_select_color_from_dropdown_red_and_user_select_quantity() {
			desktop.userSelectRedColor();
			logger.info("User click on red color");
		 
		}
		
		@When("User select quantity {int}")
		public void user_select_quantity(Integer int1) {
		
		}
		@Then("User should see a message Canon {string}")
		public void user_should_see_a_message_canon (String actualMessage) {
			System.out.println(desktop.userSuccessAddedMessage() + "Test Print");
			Assert.assertEquals(actualMessage, desktop.userSuccessAddedMessage());
			logger.info("Actual message" + actualMessage + " " + "expected" + desktop
					.userSuccessAddedMessage());
		}
	
	
	//Forth: Scenario: User add a review to Canon EOS 5D item inDesktops tab
	
		@Given("User click on Canon EOS 5D item")
		public void user_click_on_canon_eos_5d_item() {
			desktop.userClickOnCanonCamera();
			logger.info("User click on Canon EOS 5d Camera");
		  
		}
		@Given("User click on write a review link")
		public void user_click_on_write_a_review_link() {
			desktop.userClickReview();
			logger.info("User click on review button");
		 WebDriverUtility.hardWait();
		}
		@Given("user fill the review information with below information")
		public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);  
		desktop.userProvideName(info.get(0).get("yourname"));
		desktop.userWriteReview(info.get(0).get("yourReview"));
		desktop.userSelectRating(info.get(0).get("Rating")); 
		WebDriverUtility.takeScreenShot();
	}
		@Given("User click on Continue Button")
		public void user_click_on_continue_button() {
		  desktop.userClickContinue();
		  logger.info("User click on continue button");
		  }
		
		@Then("User should see a message with {string}")
		public void user_should_see_a_message_with(String string) {
		Assert.assertEquals(string, desktop.userSeeSuccessMessageReview());
		logger.info("Expected message" + string + " " + "Actual Message" +
		desktop.userSeeSuccessMessageReview());
		WebDriverUtility.takeScreenShot();
		
			
			
		}




}	
		
	 
	

