package step.definition;

import org.junit.Assert;

import core.Base;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;

public class LaptopNoteBooksStepDefinition extends Base{ 
	// Scenario: Add and Remove a Mac book from Cart 

	LaptopNoteBooksPageObject laptop = new LaptopNoteBooksPageObject(); 
	
	
	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
	laptop.userClickLaptopAndNoteBookButton();
	logger.info("User click on Laptop and NoteBook button");
	}
	
	@When("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
	laptop.userClickOnShowAll();
	logger.info("User click on show all Laptop");
	}
	
	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
	laptop.userClickOnMacBookButton();
	logger.info("User click on MacBook");
	}
	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String message) {
	Assert.assertEquals(message, laptop.userSeeTotalAndQuantity()); 
	
	// check this with school instructor 
	
	}
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
	laptop.userClickCarOptionButton();
	logger.info("User click on cart option button");
	  
	}
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
	laptop.userClickRemoveButton();
	logger.info("User click on remove item button");
	}
	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show_item_s(String message) {
	Assert.assertEquals(message, laptop.userSeeZeroItemsMessage());
	
	//check this with class instructor too.
	}

	//Scenario: Product Comparison 


	@When("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String string) {
	   
	}
	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
	  
	}
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
	   
	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
	    
	}


	//Scenario: Adding an item to Wish list  
	
	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {

	}

	
	// Scenario: Validate the price of MacBook Pro is 2000  
	
	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
	   
	}
	@Then("User should see  ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
	   
	}

}
