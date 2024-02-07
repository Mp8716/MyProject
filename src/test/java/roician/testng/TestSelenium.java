package roician.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSelenium {
	WebDriver driver;
	SoftAssert obj;

	@BeforeSuite
	public void driverSetUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	}

	/*
	 * @BeforeTest public void initialSetUp() { driver = new ChromeDriver(); }
	 */

	@BeforeMethod
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		obj = new SoftAssert();
	}

	
	@Test(priority = 1, groups = "Title")
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		obj.assertEquals(title, "Yahoo");
	}

	@Test(priority = 2, groups = "Verification", dependsOnMethods = {"getTitle"})
	public void gmailDisplay() {
		Boolean a = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(a);
	}

	@AfterMethod
	public void closebrowser() {
		driver.close();
	}

}
