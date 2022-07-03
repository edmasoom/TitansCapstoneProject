package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base{
	
	public HomePageObject () {
		PageFactory.initElements(driver, this);
		
		
	}
	
	//Scenario: User verify currency values change
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement userInRetailVerification; 
	
	@FindBy(xpath="//span[text()='Currency']")
	private WebElement currency; 
	
	@FindBy(xpath ="//button[text()='€ Euro']")
	private WebElement euroCurrency;
	
	@FindBy(xpath ="//strong[text()='€']")
	private WebElement euro; 
	
	
	public boolean userIsInRetailWebSite() {
		userInRetailVerification.getText(); 
		if(userInRetailVerification.isDisplayed())
			return true;
		else 
			return false; 
		
	}
	
	public void userClickCurrency() {
		currency.click();
	}
	
	public void userClickOnEuroCurrency() {
		euroCurrency.click();
	}
	
	public boolean userSeeCurrencyChanged() {
		if(euro.isDisplayed())
			return true; 
		else 
			return false; 
	}
	
	//Scenario: User empty Shopping cart message displa
	
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingCart; 
	
	@FindBy(xpath = "(//p[text()='Your shopping cart is empty!'])[2]")
	private WebElement cartEmptyMessage; 
	
	
	public void userClickShoppingCart() {
		shoppingCart.click(); 
		
	}
	
	public String userSeeEmpytCartMessage() {
	String actualMessage = 	cartEmptyMessage.getText(); 
	return actualMessage; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
