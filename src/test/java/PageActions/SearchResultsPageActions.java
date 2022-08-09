package PageActions;

import org.openqa.selenium.WebDriver;

import Page_Model.SearchResultsPageModel;

public class SearchResultsPageActions extends ActionBase{

	SearchResultsPageModel srchResultspgMdl;
	public SearchResultsPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	srchResultspgMdl= new SearchResultsPageModel(driver);
	}
	
	

	public void searchResultClickAction() {
		srchResultspgMdl.atomitcHabitsBookResult().click();
	}

}
