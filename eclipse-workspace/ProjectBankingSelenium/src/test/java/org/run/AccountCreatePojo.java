package org.run;

import org.help.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreatePojo extends BaseClass {
	public AccountCreatePojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement fname;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lname;
	
	@FindBy(xpath="//input[@id='address1']")
	private WebElement addr;
	
	@FindBy(xpath="//input[@id='address2']")
	private WebElement addr1;
	
	@FindBy(xpath="//input[@id='zip_code']")
	private WebElement zip;
	
	@FindBy(xpath="//input[@id='mobile_phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@id='confirm-mobile-phone']")
	private WebElement cphone;
	
	@FindBy(xpath="//input[@id='email_address']")
    private WebElement email;
	
	@FindBy(xpath="//input[@id='confirm_email_address']")
	private WebElement cemail;
	
	@FindBy(xpath="//input[@id='ssn']")
	private WebElement ssn;
	
	@FindBy(xpath="//input[@id='dob']")
	private WebElement dob;
	
	@FindBy(xpath="//input[@id='checkboxW9term']")
	private WebElement box1;
	
	@FindBy(xpath="//input[@id='checkboxAgree']")
    private WebElement box2;
	
	@FindBy(xpath="//input[@id='checkboxConsent']")
	private WebElement box3;
	
	@FindBy(xpath="//span[@id='recaptcha-anchor']")
	private WebElement captcha;
	
	@FindBy(xpath="//button[text()='Open My Account!']")
	private WebElement open;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddr() {
		return addr;
	}

	public WebElement getAddr1() {
		return addr1;
	}

	public WebElement getZip() {
		return zip;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getCphone() {
		return cphone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCemail() {
		return cemail;
	}

	public WebElement getSsn() {
		return ssn;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getBox1() {
		return box1;
	}

	public WebElement getBox2() {
		return box2;
	}

	public WebElement getBox3() {
		return box3;
	}

	public WebElement getCaptcha() {
		return captcha;
	}

	public WebElement getOpen() {
		return open;
	}
	
	
}
