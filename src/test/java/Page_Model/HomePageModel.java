package Page_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageModel extends ModelBase {

	public HomePageModel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	protected WebElement searchyBar;
	protected WebElement searchBarSbmtBtn;

	public WebElement searchBar() {
		return searchyBar = driver
				.findElement(By.xpath("//*[@id=\'rhf_header_element\']/nav/div/div[3]/form/div/div[2]/div/input[1]"));
	}

	public WebElement searchBarSubmitButton() {
		return searchBarSbmtBtn = driver
				.findElement(By.xpath("//*[@id=\'rhf_header_element\']/nav/div/div[3]/form/div/span/button"));

	}

}
