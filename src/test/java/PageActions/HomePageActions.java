package PageActions;

import org.openqa.selenium.WebDriver;

import Page_Model.HomePageModel;

public class HomePageActions extends ActionBase{

	HomePageModel hpModel;
	public HomePageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	hpModel= new HomePageModel(driver);
	}





	public void searchBarInput(String item) {
		
		hpModel.searchBar().sendKeys(item);
	}

	public void clickOnSubmitButton() {
		hpModel.searchBarSubmitButton().click();
	}
	
}
