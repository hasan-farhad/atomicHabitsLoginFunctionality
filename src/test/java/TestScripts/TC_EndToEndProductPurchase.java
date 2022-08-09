package TestScripts;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageActions.HomePageActions;
import Page_Model.HomePageModel;

public class TC_EndToEndProductPurchase extends TestBase {
	
	WebDriverWait wait;

	@Test
	public void productPurchase() throws InterruptedException {
		
		//1. Search up product in the searchbar

		homePage().searchBarInput("Atomic Habits");
		
		//2. hit the submit button

		homePage().clickOnSubmitButton();
		
		System.out.println("2. Submit button clicked");
		
		//3. choose an item to open up product page
		
		searchResultsPage().searchResultClickAction();
		System.out.println("3. Product page has opened");
		
		
		//4. click on add to shopping cart
		//Thread.sleep(5000);
		WebElement addToShoppingCartButton=	driver.findElement(By.xpath("//*[@id=\"skuSelection\"]/div[1]/form/input[5]"));
		
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("arguments[0].click();", addToShoppingCartButton);
		
	System.out.println("4. Added to shopping cart");
	
	
	//5. Validate Added to Shopping Cart Text
	//Thread.sleep(4000);
	
	
//	 WebElement shoppgingCartButton = driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]"));
//	 
//	JavascriptExecutor executor3 = (JavascriptExecutor) driver;
//	executor3.executeScript("arguments[0].click();", shoppgingCartButton);
//	
	System.out.println("5.) Successfully viewed Shopping Cart");

//6. Proceed to Checkout
//	Thread.sleep(4000);
//	WebElement proceedToCheckoutButton = driver.findElement(By.xpath("//*[@id=\"checkoutForm\"]/a"));
//	JavascriptExecutor executor4 = (JavascriptExecutor) driver;
//	executor4.executeScript("arguments[0].click;", proceedToCheckoutButton);
//	
//	System.out.println("6. Proceed to Checkout Button has been clicked");
	
	}

}
