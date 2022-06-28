package step.definition;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.core.Logger;
import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.WebDriverUtility;

public class RetailStepDefinition extends Base {
	
	RetailPageObject retail = new RetailPageObject(); 
	
	
	
	// Background Scenario 
	@Given("User is on Retail Website")
	public void user_is_on_retail_website() {
		retail.userIsOnWebsite(); 
		logger.info("User is on retail website");
	 
	}
	
	@Given("User click on MyAccount")
	public void user_click_on_my_account() {   
		retail.userclickOnAccount();
		logger.info ("User click on myAccount button"); 
		
	}
	
	@When("User click on Login")
	public void user_click_on_login() {
		retail.userClickOnAccountLogin();
		logger.info("User click on longin button");
	
	}
	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String userName, String password) {
		retail.userProvideEmailAndPassword(userName, password);
		logger.info("user enter email" + userName + "user enter password " + password);
	   WebDriverUtility.takeScreenShot();
	}
	@When("User click on Login button")
	public void user_click_on_login_button() {
		retail.userClickLoginButton();
		logger.info("User click on longin button");

	}
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Assert.assertTrue(retail.userMyAccountDash());
		logger.info("User is on my Account page");	
		
	//Second: Register as an Affiliate user with Cheque Payment Method
	}
	@When("User click on {string} link")
	public void user_click_on_link(String string) {
		retail.userClickOnMyAffiliateAccountReg();
		logger.info("User clicks on Register for an affiliate accoount");
	  
	}
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information
	(DataTable dataTable) {
		List<Map<String, String>> information = dataTable.asMaps(String.class,String.class);
		retail.userProvideCompanyName(information.get(0).get("company"));
		retail.userProvideWebsite(information.get(0).get("website"));
		retail.userProvideTaxID(information.get(0).get("taxID"));
		retail.userClickPaymentMethod(information.get(0).get("paymentMethod"));
		retail.userProvidePayeename(information.get(0).get("payeeName"));
		WebDriverUtility.takeScreenShot();
	
	}
	@When("User check on About us check box")
	public void user_chekc_on_about_us_check_box() {
		retail.userClickAboutUsButton();
		logger.info("User click on about us button");
	  
	}
	@When("User click on Continue button")
	public void user_click_on_continue_button() {
	retail.userClickContinueButton();
	logger.info("User click on continue button");
	}
	
	@Then("User should see a success message")
	public void user_should_see_a_success_message_retail() {
	  Assert.assertTrue(retail.userSeeSuccessMessage());
	  logger.info("The result is " + retail.userSeeSuccessMessage());
	  WebDriverUtility.takeScreenShot();
	  
	}
	
	//Scenario: Edit your affiliate information from Cheque payment
	
	@When("User click on 'Edit your affiliate information'link")
	public void user_click_on_edit_your_affiliate_information_link() {
		retail.userClickEditAffiliateAccount();
		logger.info("User click on Edit Affiliate Information link");
	 hardWait();
	}
	@When("User click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retail.userClickOnBankTransfer();
		logger.info("User click on Bank Transfer button");
	 
	}
	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> userInfo = dataTable.asMaps(String.class, String.class); 
		retail.userProvideBankName(userInfo.get(0).get("bankName"));
		retail.userProvideBranchNumber(userInfo.get(0).get("abaNumber"));
		retail.userProvideSwift(userInfo.get(0).get("swiftCode"));
		retail.userProvideAccountName(userInfo.get(0).get("accountName"));
		retail.userProvideAccountNumber(userInfo.get(0).get("accountNumber"));
		WebDriverUtility.takeScreenShot();
		
		hardWait();
	}
	
	
	
	//Scenario: Edit your account Information 
	
	@When("User clic on {string} link")
	public void user_clic_on_link(String string) {
		retail.userClickOnEditAccount();
	 
	}
	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> userDetails = dataTable.asMaps(String.class, String.class); 
		retail.userProvideFirstName(userDetails.get(0).get("firstName"));
		retail.userProvideLastName(userDetails.get(0).get("lastName"));
		retail.userProvideEmail(userDetails.get(0).get("email"));
		retail.userProvideTelephone(userDetails.get(0).get("telephone"));
		
		hardWait();
	   
	}
	
	@Then("User should see a message retail {string}")
	public void user_should_see_a_message_retail(String expectedMessage) {
		Assert.assertTrue(expectedMessage,retail.userSeeSuccessMessage()); 
		
		WebDriverUtility.takeScreenShot();
		logger.info("actual message" + retail.userSeeSuccessMessage() + " " + "equals" + expectedMessage);
		hardWait();
	}
	/*
	 * 	@Then("user should see a success message  {string}")
	public void user_should_see_a_success_message(String expectedMessage) {
		Assert.assertEquals(expectedMessage, methods.successMessageText());
		//Assert.assertEquals needs to be Assert.assertTrue 
		logger.info("actual Message" + methods.successMessageText() + " " + "equals" +  expectedMessage );
	 */

	
	
	public static void hardWait() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

}
