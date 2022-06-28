package step.definition;

import org.junit.Assert;

import core.Base;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;
import utilities.WebDriverUtility;

public class LaptopNoteBooksStepDefinition extends Base{ 
	// Scenario: Add and Remove a Mac book from Cart 

	LaptopNoteBooksPageObject laptop = new LaptopNoteBooksPageObject(); 
	


@When("User click on Laptop & NoteBook tab")
public void user_click_on_laptop_note_book_tab() {
	laptop.userClickLaptopAndDesktopTab();
	logger.info("User clicks on All Desktop and Laptop button");

}
@When("User click on Show all Laptop & NoteBook option")
public void user_click_on_show_all_laptop_note_book_option() {
	laptop.userClickShowAllButton();
	logger.info("User click on show all the options");

}
@When("User click on MacBook  item")
public void user_click_on_mac_book_item() {
	laptop.userClickMacBook();
	logger.info("User Click on add MacBook");
WebDriverUtility.hardWait();
}
@Then("User should see a message Mac {string}")
public void user_should_see_a_message_mac(String expectedMessage) {
	Assert.assertEquals(expectedMessage, laptop.userSeeSucessMessage());
	logger.info(expectedMessage + " matches " + laptop.userSeeSucessMessage());
	
	WebDriverUtility.hardWait();
}
@Then("User should see {string} showed to the cart")
public void user_should_see_showed_to_the_cart(String cartValue) {
	System.out.println(laptop.userSeeCartValue() + "From print");
	Assert.assertEquals(cartValue, laptop.userSeeCartValue());
	logger.info(cartValue + " Equals to" + laptop.userSeeCartValue());
	
	
	
  
}
@Then("User click on cart option")
public void user_click_on_cart_option() {
laptop.userClickCartOption();    
logger.info("User click on cart option");
WebDriverUtility.hardWait();
}
@Then("user click on red X button to remove the item from cart")
public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
laptop.userClickRemove();
logger.info("User remove the added items");
WebDriverUtility.hardWait();
}
@Then("item should be removed and cart should show {string}")
public void item_should_be_removed_and_cart_should_show(String cartValue) {
	Assert.assertEquals(cartValue, laptop.userSeeEmptyCart());
	logger.info(cartValue + " Matches " + laptop.userSeeEmptyCart());
	WebDriverUtility.hardWait();
	
}






	
	
	
	
	
	
	
}