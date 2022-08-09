package Page_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPageModel extends ModelBase{

	public SearchResultsPageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	protected WebElement atomicHabitsBookResult;
	
	
	public WebElement atomitcHabitsBookResult() {
		return atomicHabitsBookResult = driver.findElement(By.xpath("driver.findElement(By.xpath(\"//*[@id=\\'gridView\\']/div/div[1]/div[1]/div[1]/div/a\")).click();"));
	}

}
