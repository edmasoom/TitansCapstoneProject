package step.definition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import core.Base;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;
import utilities.WebDriverUtility;

public class LaptopNoteBooksStepDefinition extends Base{ 
	// Scenario: Add and Remove a Mac book from Cart 

	LaptopNoteBooksPageObject laptop = new LaptopNoteBooksPageObject(); 
	
//Scenario: Add and Remove a Mac book from Cart 

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



//Scenario: Product Comparison 

@When("User click on product comparison icon on Mac {string}")
public void user_click_on_product_comparison_icon_on_mac(String macBookIcon) throws InterruptedException {
laptop.userClickMacBookComparison();
logger.info("User click Mac Book Comparison button");
Thread.sleep(2000);

}

@When("User click on product comparison icon on MacAir {string}")
public void user_click_on_product_comparison_icon_on_mac_air(String string) throws InterruptedException {
   laptop.userClickMacBookAirComparison();
   logger.info("User click on MacAir comparison button");
   Thread.sleep(2000);

}

@Then("User should see a message MacAir {string}")
public void user_should_see_a_message_mac_air(String macAirIcon) throws InterruptedException {
Assert.assertEquals(macAirIcon, laptop.userSeeSucessMessageConfirmation()); 
logger.info(macAirIcon +"Matches" + laptop.userSeeSucessMessageConfirmation());
Thread.sleep(2000);
 
}

@Then("User click on Product comparison link")
public void user_click_on_product_comparison_link() throws InterruptedException {
	laptop.userClickComparsion();
	logger.info("User click on comparison button");
	Thread.sleep(2000);
  
}

@Then("User should see Product Comparison Chart")
public void user_should_see_product_comparison_chart() throws InterruptedException {
	laptop.userSeeComparisonChart();
	logger.info("Comparison chart is displayed");
	Thread.sleep(2000);
    
}

	//Adding an item to Wish list 

@When("User click on heart icon to add {string} laptop to wish list")
public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list(String sony)  {
laptop.userAddSonyToWishList();
logger.info("User add the sony VAIO to wish list" );

}
@Then("User should get a message sony {string}")
public void user_should_get_a_message_sony(String string) {
	Assert.assertEquals(string, laptop.userSeeSonySuccessMessage());
	logger.info(string + "matches" + laptop.userSeeSonySuccessMessage());
WebDriverUtility.hardWait();
WebDriverUtility.takeScreenShot();
}
	
//Scenario: Validate the price of MacBook Pro is 2000  	

@When("User click on {string} item")
public void user_click_on_item(String string) {
	laptop.userClickMacPro();
	logger.info("User click on MacBook Pro");
	WebDriverUtility.hardWait();
  
}
@Then("User should see  {string} price tag is present on UI.")
public void user_should_see_price_tag_is_present_on_ui(String price) {
	Assert.assertEquals(price, laptop.userSeeTagPrice());
	logger.info(price + "it mataches " + laptop.userSeeTagPrice());
	WebDriverUtility.hardWait();
	WebDriverUtility.takeScreenShot();
   
}
	
	
	
	
}