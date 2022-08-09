package TestScripts;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplicableLoginTest {
	
	
WebDriver driver;
WebDriverWait wait;


@Test
public void m1() {
	
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.barnesandnoble.com/");
	WebElement signinButton =driver.findElement(By.xpath("//*[@id=\"rhf_header_element\"]/nav/div/div[2]/ul[2]/li[1]/div/dd/a[1]"));
	JavascriptExecutor jse;
	jse = (JavascriptExecutor) driver;
	jse.executeScript("arguments[0].click();", signinButton);
	
	//hit x button on the accept cookies message
	driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
	
	
	
//	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	//WebElement emailField= wait.until(ExpectedConditions.visibilityOf(emailTxtBox));
	
	driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[17]/div/iframe")));
	
	WebElement emailTxtBox = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	
	emailTxtBox.sendKeys("hasan_farhad@outlook.com");
	
	WebElement password = driver.findElement(By.id("password"));
	
	password.sendKeys("ABC123!?");		
		
	WebElement signinSubmitButton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[4]/div/div/button"));
	signinSubmitButton.click();

		//performActions(driver);
		
	driver.quit();
		}



public static void performActions(WebDriver driver) {
	
	try {
		WebElement signinSubmitButton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[4]/div/div/button"));
		signinSubmitButton.click();

		
	} catch (StaleElementReferenceException e) {

	performActions(driver);
	}
	}
}


