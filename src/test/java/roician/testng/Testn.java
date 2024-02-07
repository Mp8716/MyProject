package roician.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testn {
	WebDriver driver;
	ContactusPOM contactPOM;

	@BeforeMethod
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		contactPOM = new ContactusPOM(driver);
		driver.get("https://www.roicians.com/contact-us/");
	}

	@Test(priority = 1)
	public void validcase() throws InterruptedException {
		contactPOM.typefname("Maya");
		contactPOM.typelname("Patel");
		contactPOM.typeemail("Maya@gmail.com");
		contactPOM.typephone("3650000000");
		contactPOM.typemessage("Testing Automation");
		Thread.sleep(5000);
	}

	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
}
