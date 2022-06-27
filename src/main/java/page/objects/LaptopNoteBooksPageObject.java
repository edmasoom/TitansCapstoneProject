package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base {
	
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver , this);
		// is a selenium class and will initliaze the values
		
		// Scenario: Add and Remove a Mac book from Cart 

	}
	
	@FindBy(xpath = "//a[text() ='Laptops & Notebooks']")
	private WebElement userClickLaptopAndNoteBook; 
	
	@FindBy(xpath = "//a[text() = 'Show All Laptops & Notebooks']")
	private WebElement userclickOnAllLaptop; 
	
	@FindBy(xpath = "//a[text() = 'MacBook']")
	private WebElement userClickOnMacBook; 
	
	@FindBy(xpath = "cart-total")
	private WebElement userSeeCartTotal; 
	
	@FindBy(xpath = "cart-total")
	private WebElement userClickCartOption; 
	
	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement userClickRemove; 
	
	@FindBy(id= "cart-total")
	private WebElement userSee0Items; 
	
	
	public void userClickLaptopAndNoteBookButton() {
		userClickLaptopAndNoteBook.click();
	}
	
	public void userClickOnShowAll() {
		userclickOnAllLaptop.click();
	}
	
	public void userClickOnMacBookButton() {
		userClickOnMacBook.click();
	}
	
	public String userSeeTotalAndQuantity() {
	// check this part with Ustad 
	return	userSeeCartTotal.getText(); 
	}
	
	public void userClickCarOptionButton() {
		userClickCartOption.click();
		
	}
	public void userClickRemoveButton() {
		userClickRemove.click();
	}
	public boolean  userSeeZeroItemsMessage() {
		return userSee0Items.getText().contains("0 item(s)"); 
		
	}
	
	//Scenario: Product Comparison 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
