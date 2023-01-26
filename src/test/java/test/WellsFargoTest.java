package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WellsFargoTest extends BaseTest{
	
	@Test	
	@Parameters({"browser"})
	public void loginTest(String browser) {
		WebDriver driver = getDriver(browser);
		driver.manage().window().maximize();
		driver.get("https://www.wellsfargo.com/");
		
	}

}
