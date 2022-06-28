package page.objects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopPageObject extends Base {
	
	public DesktopPageObject(){
		PageFactory.initElements(driver, this);
		
	}
	//First Scenario - User verify desktop items 
	
	@FindBy(xpath = "//a[text()= 'Desktops']")
	private WebElement userClickDesktop; 
	
	@FindBy(xpath = "//a[text()= 'Show All Desktops']")
	private WebElement userClickAllDesktop; 
	// we need to store the elements of img of items 
	@FindBy(tagName = "img")
	private List<WebElement> allItems; // driver.FindElements 
	
	
	
	
	public void userClickDesktopsButton() {
		WebDriverUtility.moveToElement(userClickDesktop);
	}
	
	public void userClickOnAllDesktopsList() {
		userClickAllDesktop.click();
	}
	
	public List<WebElement>  userSeeAllDesktopItems() {
	List<WebElement> items = allItems; 	
	return items; 
		
		
	}
	//Second Scenario User add items to Cart 
	
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement userClickOnHPLPAddToCart; 
	
	@FindBy(id="input-quantity")
	private WebElement userSelect1Quantity; 
	
	@FindBy(xpath= "//button[text() = 'Add to Cart']")
	private WebElement userClickOnAddToCart; 
	
	@FindBy(xpath = "(//a[text()='HP LP3065'])[3]")
	private WebElement userSeeSuceessMessage; 
	
	public void userClickonHPLPAddToCart() {
		userClickOnHPLPAddToCart.click();
	}
	
	public void userSelectOneQuantity(String quantity) {
		userSelect1Quantity.clear();
		userSelect1Quantity.sendKeys(quantity);
	}
		
	public void userClickAddToCart() {
		userClickOnAddToCart.click();
	}
	
	public String userSeeSuccessMessage() {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", userSeeSuceessMessage); 
		String actulResult = "Success: you have added " +userSeeSuceessMessage.getText()+" to your Shopping cart!"; 
	
		return actulResult; 
		
	}
	
	//Third : 	Scenario: User add Canon EOS 5D from Desktops tab to the cart
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[1]")
	private WebElement userClickOnCanonEOS; 
	
	@FindBy(id= "input-option226")
	private WebElement userClickOnSelectOption; 
	
	@FindBy(id= "input-quantity")
	private WebElement userClick1; 
	
	@FindBy(id= "button-cart")
	private WebElement userClickAddToCart; 
	
	@FindBy(xpath = "(//a[text()= 'Canon EOS 5D Camera'])[3]")
	private WebElement userSeeCacnon5DAddedMessage; 
	/*
	 *     public void verifytext() {
        if (pageText.getText().equalsIgnoreCase("U S Dollar-Indian Rupee - USDINR")) {
            System.out.println("Page Header is as expected");
        } else
            System.out.println("Page Header is NOT as expected");
    }
	 */
	
	public void userClickCanonEOS() {
		userClickOnCanonEOS.click(); 
	}
	
	public void userSelectRedColor() {	
		Select color = new Select(userClickOnSelectOption); 
		color.selectByVisibleText("Red"); 
	}
	
	public void userClick1(String quantity) {
		userClick1.clear();
		userClick1.sendKeys(quantity);
	}
	
	public void userAddToCart() {
		userClickAddToCart.click();
	}
	
	public String  userSuccessAddedMessage() {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", userSeeCacnon5DAddedMessage); 
		String actulResult = "Success: You have added " +userSeeCacnon5DAddedMessage.getText()+" to your shopping cart!"; 
		
		return actulResult; 
		
//		if(userSeeCacnon5DAddedMessage.getText().equalsIgnoreCase
//				("Success: You have added Canon EOS 5D to your shopping cart!"));
//		success = userSeeCacnon5DAddedMessage.getText(); 
//		System.out.println(userSeeCacnon5DAddedMessage.getText());
	}
	
	//User add a review to Canon EOS 5D item in Desktops tab 
	
	@FindBy(xpath = "//a[text() = 'Canon EOS 5D Camera']")
	private WebElement userClickOnCanonEOSCanon;
	
	@FindBy(xpath = "//a[text() = 'Write a review']")
	private WebElement userClickOnWriteReview;
	
	@FindBy(id = "input-name")
	private WebElement userTypeName; 
	
	@FindBy(id = "input-review")
	private WebElement userTypeReview; 
	
	@FindBy(xpath ="//input[@type='radio']")
	private List<WebElement> userClickRating; 
	
	@FindBy(id = "button-review")
	private WebElement userClickContinue; 
	
	@FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement UserSeeThirdSuccessMessage; 
	
	
	public void userClickOnCanonCamera() {
		userClickOnCanonEOSCanon.click();
	}
	
	public void userClickReview() {
		userClickOnWriteReview.click(); 
	}
	
	public void userProvideName(String name) {
		userTypeName.sendKeys(name);
	}
	
	public void userWriteReview(String review) {
		userTypeReview.sendKeys(review); 
	}
	
//	public void userClickRating(String rating) {
//		if(rating.equalsIgnoreCase("good"));
//		userClickRating.click();
//	}
	
	public void userSelectRating(String ratingValue) {
		List<WebElement> rating = userClickRating; 
		for(WebElement element: rating) {
			if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())); 
			element.click();
			break; 
		}
	}
	
	public void userClickContinue() {
		userClickContinue.click();
	}
	
	public String userSeeSuccessMessageReview() {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", UserSeeThirdSuccessMessage); 
		return UserSeeThirdSuccessMessage.getText(); 
	}
	
	
	
	
	

	
	
	
	
	
	

}
