package page.objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageObject extends Base {

	public RetailPageObject() {

		PageFactory.initElements(driver, this);

	}
	
	// First Scenario: Register as an Affiliate user with Cheque Payment Method
	
	@FindBy(xpath ="//a[text() = 'TEST ENVIRONMENT']")
	private WebElement retailWebsite;

	@FindBy(xpath = "//a[@title = 'My Account']")
	private WebElement myAccount;

	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	private WebElement accountLogin;

	@FindBy(xpath= "//input[@name =  'email']")
	private WebElement emailAddress;

	@FindBy(xpath = "//input[@name =  'password']")
	private WebElement password;

	@FindBy(xpath = "//input[@value= 'Login']")
	private WebElement login;

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountDash;
	
	public boolean userIsOnWebsite() {
		if(retailWebsite.isDisplayed())
			return true; 
		else return false; 
		
	}

	public void userclickOnAccount() {
		myAccount.click();
	}
	
	public void userClickOnAccountLogin() {
		accountLogin.click();
	}
	
	public void userProvideEmailAndPassword(String email, String pass) {
		emailAddress.sendKeys(email);
		password.sendKeys(pass);
	}
	
	
	public void userClickLoginButton() {
		login.click();
	}
	
	public boolean userMyAccountDash() {
		if(myAccountDash.isDisplayed())
				return true;
		else
		return false; 
	}
	//Second: Register as an Affiliate user with Cheque Payment Method

	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement affiliateAccountReg;

	@FindBy(id = "input-company")
	private WebElement companyName;

	@FindBy(id = "input-website")
	private WebElement webSiteName;

	@FindBy(id = "input-tax")
	private WebElement TaxID;

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement chequeButton;
	
	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement paypalButton;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankButton;

	@FindBy(id = "input-cheque")
	private WebElement payeeName;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement abouUsCheck;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;

	@FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	
	public void userClickOnMyAffiliateAccountReg() {
		affiliateAccountReg.click();
	}
	public void userProvideCompanyName(String company) {
		companyName.sendKeys(company);
		
	}
	public void userProvideWebsite(String Website) {
		webSiteName.sendKeys(Website); 
	}
	
	public void userProvideTaxID(String taxID) {
		TaxID.sendKeys(taxID);
	}
	public void userClickPaymentMethod(String paymentType) {
		if (paymentType.trim().equalsIgnoreCase("cheque"))
		chequeButton.click();
	}
	
	public void userProvidePayeename(String payee) {
		payeeName.sendKeys(payee);
	
	}
	
	public void userClickAboutUsButton() {
		abouUsCheck.click();
		
	}
	public void userClickContinueButton() {
		continueButton.click();
		
	}
	public boolean  userSeeSuccessMessage() { 
		if(successMessage.isDisplayed())
			return true;
		else
			return false; 
	
		
	}
	
	//Second: Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
	
	@FindBy(xpath="//a[text() = 'Edit your affiliate information']")
	private WebElement editAffiliatInfo; 
	
	@FindBy(xpath = "(//input[@type = 'radio'])[3]")
	private WebElement bankTransfer; 
	
	@FindBy(id="input-bank-name")
	private WebElement bankName; 
	
	@FindBy(id= "input-bank-branch-number")
	private WebElement branchNumber; 
	
	@FindBy(id= "input-bank-swift-code")
	private WebElement swiftCode; 
	
	@FindBy(id= "input-bank-account-name")
	private WebElement accountName; 
	
	@FindBy(id = "input-bank-account-number")
	private WebElement accountNumber; 
	
	@FindBy(xpath= "//input[@value= 'Continue']")
	private WebElement clickContinue; 
	
	@FindBy(xpath= "//*[contains(text(),'Success')]")
	private WebElement secondSuccessMessage; 
	
	
	public void userClickEditAffiliateAccount() {
		editAffiliatInfo.click();
	}
	
	public void userClickOnBankTransfer() {
		bankTransfer.click();
		
	}
	
	public void userProvideBankName(String bankNameValue) {
		bankName.clear();
		bankName.sendKeys(bankNameValue);
	}
	
	public void userProvideBranchNumber(String branchNumberValue) { 
		branchNumber.clear();
	    branchNumber.sendKeys(branchNumberValue);
	} 
	
	public void userProvideSwift(String swiftValue) {
		swiftCode.clear();
		swiftCode.sendKeys(swiftValue);
	}
	
	
	public void userProvideAccountName(String accoutValue) {
		accountName.clear();
		accountName.sendKeys(accoutValue);
	}
	
	public void userProvideAccountNumber(String accountNumberValue) {
		accountNumber.clear();
		accountNumber.sendKeys(accountNumberValue);
	}
	
	public void userClickOnContinue() {
		clickContinue.click();
	}
	
	
	
	public boolean userSeeSecondSuccessMessage() {
		return secondSuccessMessage.isDisplayed(); 
		
	}
	// Third: Scenario: Edit your account Information 
	@FindBy(xpath = "//a[contains(text(), 'Edit your account ')]")
	private WebElement userEditAccount; 
	
	@FindBy(id =  "input-firstname" )
	private WebElement firstName; 
	
	@FindBy(id = "input-lastname")
	private WebElement lastName; 
	
	@FindBy(id= "input-email")
	private WebElement email; 
	
	@FindBy(id = "input-telephone" )
	private WebElement telephone; 
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton1; 
	
	@FindBy(xpath = "//div[text() = ' Success: Your account has been successfully updated.']" )
	private WebElement actualMessage; 
	
	
	public void userClickOnEditAccount() {
		userEditAccount.click();
	}
	public void userProvideFirstName(String fName) {
		firstName.clear();
		firstName.sendKeys(fName); 
	}
	
	public void userProvideLastName(String lName) {
		lastName.clear();
		lastName.sendKeys(lName);
	}
	
	public void userProvideEmail(String email1) {
		email.clear();
		email.sendKeys(email1); 
	}
	
	public void userProvideTelephone(String phoneNumber) {
		telephone.clear();
		telephone.sendKeys(phoneNumber);
		
	}
	public void userClickOnContinueButton() {
		continueButton1.click();
	}

	public String userSeeSuccessMessage1() {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", actualMessage); 
		//String actualText = WebDriverUtility.getText(successMessage2); 
		return actualMessage.getText(); 
		
		
		/*
		 * 	public String actualSuccessMessage() {
		
		String actualText = WebDriverUtility.getText(sucessMessage);
		return actualText;
		//return sucessMessage.getText();
		 */
		
	}

	
	
	

}
