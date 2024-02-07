package roician.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactusPOM {
	WebDriver driver;
	@FindBy(id="text-77525447616") WebElement fname;
	@FindBy(id="text-95374915097") WebElement lname;
	@FindBy(id="text-27022866830") WebElement email;
	@FindBy(id="field-tIgxvmTMez6ibt1") WebElement phone;
	@FindBy(id="field-kJfKGbPLNi5yFI7") WebElement message;
	

	public ContactusPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void typefname(String firstName) {
		fname.sendKeys(firstName);
	}
	
	public void typelname(String lastName) {
		lname.sendKeys(lastName);
	}
	
	public void typeemail(String typeemail) {
		email.sendKeys(typeemail);
	}
	
	public void typephone(String typephone) {
		phone.sendKeys(typephone);
	}
	
	public void typemessage(String typemessage) {
		message.sendKeys(typemessage);
		
	}
	
}
