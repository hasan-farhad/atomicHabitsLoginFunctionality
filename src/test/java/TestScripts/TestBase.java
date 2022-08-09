package TestScripts;

import org.testng.annotations.Test;

import PageActions.HomePageActions;
import PageActions.SearchResultsPageActions;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class TestBase {
	WebDriver driver;
	public HomePageActions homePage() {
		
		return new HomePageActions(driver);
	}
	
	public SearchResultsPageActions searchResultsPage() {
		return new SearchResultsPageActions(driver);
	}
	
	//framework is a combination of classes, functions, and methods. it refers to the reusable common functions in a class file. meaning, when you create a script for an application and you have a function to submit an application for example, to reduce the workload, you create the function in one location and use it again and again. For example, the test is saying to check the client profile. In order to check it, you need to log into the application, even if you're not testing the login functionality but since you need to first login and then test the client profile. In a framework you have common functions, like a utility class that has some functions, in the database class there are some functions, etc.
	// we follow the page object model, it is a keyword driven framework, we create keyword functions for the pages to use it in the test. 
 
  @BeforeClass
  public void beforeClass(String browserName) {
	  
//	  if (browserName == "Chrome") {
//		  
//		  WebDriverManager.chromedriver().setup();
//		  driver = new ChromeDriver();
//		
//	}
//	  if (browserName == "Edge") {
//		  WebDriverManager.edgedriver().setup();
//		  driver = new EdgeDriver();
//		
//	}
//	  if (browserName == "Firefox") {
//		  WebDriverManager.firefoxdriver().setup();
//		  driver = new FirefoxDriver();
//		
//	}
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\eclipse-workspace\\ups_2022\\src\\test\\resources\\drivers\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.barnesandnoble.com/");
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("Test Case has completed execution");
	  driver.quit();
  }

}
