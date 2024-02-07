package roician.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");    
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.roicians.com/contact-us/");
		
		ContactusPOM contactPOM = new ContactusPOM(driver);
		contactPOM.typefname("Maya");
		contactPOM.typelname("Patel");
		contactPOM.typeemail("Maya@gmail.com");
		contactPOM.typephone("3650000000");
		contactPOM.typemessage("Testing Automation");

	}

}
