package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class LaptopNoteBooksPageObject extends Base {
	
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver , this);
		// is a selenium class and will initliaze the values
		
		// Scenario: Add and Remove a Mac book from Cart 
	}
		
	@FindBy(xpath ="//a[text() ='Laptops & Notebooks']")
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
		WebDriverUtility.moveToElement(userClickShowAll);
	}
	
	public void userClickMacBook() {
		userClickMacBook.click();
	}
	
	public String userSeeSucessMessage() {
		
		String actualMessage = "Success: You have added " +userSeeSuccessMessage.getText()+ " to your shopping cart!";
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
	
	public String  userSeeEmptyCart() {
		return userSeeEmptyCart.getText(); 
	}
	
	
	
	
	
	
		


	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

