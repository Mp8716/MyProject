package roician.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSeleniumParameterized {
	WebDriver driver;

	@BeforeSuite
	public void driverSetUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	}

	@BeforeMethod
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@DataProvider(name = "getdata")
	public Object[][] search() {

		return new Object[][] { { "Roicians" }, { "Roician Automation testing" }, { "RoicianQA" } };
	}

	@Test(dataProvider = "getdata")
	public void display(String keyword) {
		driver.findElement(By.cssSelector(".gLFyf")).sendKeys(keyword);
	}
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}

}
