package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class LaptopNoteBooksPageObject extends Base {

	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
		// is a selenium class and will initliaze the values

		// Scenario: Add and Remove a Mac book from Cart
	}

	@FindBy(xpath = "//a[text() ='Laptops & Notebooks']")
	private WebElement userClickLaptops;

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement userClickShowAll;

	@FindBy(xpath = "//a[text() ='MacBook']")
	private WebElement userClickMacBook;

	@FindBy(xpath = "//a[text() ='MacBook']")
	private WebElement userSeeSuccessMessage;

	@FindBy(id = "cart-total")
	private WebElement userSeeCartValue;

	@FindBy(id = "cart-total")
	private WebElement userClickCartOption;

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement userClickRemove;

	@FindBy(id = "cart-total")
	private WebElement userSeeEmptyCart;

	public void userClickLaptopAndDesktopTab() {
		WebDriverUtility.moveToElement(userClickLaptops);
	}

	public void userClickShowAllButton() {
		userClickShowAll.click();
	}

	public void userClickMacBook() {
		userClickMacBook.click();
	}

	public String userSeeSucessMessage() {

		String actualMessage = "Success: You have added " + userSeeSuccessMessage.getText() + " to your shopping cart!";
		return actualMessage;
	}

	public void userClickCartOption() {
		userClickCartOption.click();
	}

	public String userSeeCartValue() {
		return userSeeCartValue.getText();
	}

	public void userClickRemove() {
		userClickRemove.click();
	}

	public String userSeeEmptyCart() {
		return userSeeEmptyCart.getText();
	}

	// Scenario: Product Comparison

	@FindBy(xpath = "//img[@title ='MacBook']")
	private WebElement macBookIcon;

	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[2]")
	private WebElement comparisonButtonMacBook;

	@FindBy(xpath = "//img[@title ='MacBook Air']")
	private WebElement macBookAirIcon;

	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[3]")
	private WebElement comparisonButtonMacAir;

	@FindBy(xpath = "(//a[text()='MacBook Air'])[1]")
	private WebElement successMessage;

	@FindBy(xpath = "//a[text() ='product comparison']")
	private WebElement compareButton;

	@FindBy(xpath = "//table[@class='table table-bordered']")
	private WebElement comparisonChart;

	public void userClickMacBookComparison() {
		comparisonButtonMacBook.click();
	}

	public void userClickMacBookAirComparison() {
		comparisonButtonMacAir.click();
	}

	public String userSeeSucessMessageConfirmation() {

		String actualMessage = "Success: You have added " + successMessage.getText() + " to your product comparison!";
		return actualMessage;
	}

	public void userClickComparsion() {
		compareButton.click();
	}

	public void userSeeComparisonChart() {
		comparisonChart.isDisplayed();
	}
	
	//Adding an item to Wish list 
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement sonyWishlist; 
	
	@FindBy(xpath ="(//a[text()='Sony VAIO'])[1]")
	private WebElement sonySuccessMessage; 
	
	public void userAddSonyToWishList() {
	sonyWishlist.click();
	}
	
	public String userSeeSonySuccessMessage() {
		String message =  "You must login or create an account to save " +sonySuccessMessage.getText()+ " to your wish list!"; 
		return message; 
	}
	
	
	//Scenario: Validate the price of MacBook Pro is 2000 
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement addMacBookPro; 
	
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement priceTag; 
	
	public void userClickMacPro() {
	addMacBookPro.click();
	}
	
	public String  userSeeTagPrice() {
	return priceTag.getText(); 
	}
	
	
	

}
