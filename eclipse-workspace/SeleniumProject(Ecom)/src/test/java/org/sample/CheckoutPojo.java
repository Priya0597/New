package org.sample;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPojo extends BaseClass {
	public CheckoutPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@data-tid='instant-bolt-checkout-button']")
	private WebElement check;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@id='shippingFirstName']")
	private WebElement fname;
	
	@FindBy(xpath="//input[@id='shippingLastName']")
	private WebElement lname;
	
	@FindBy(xpath="//input[@id='shippingAddressLine1']")
	private WebElement addr1;
	
	@FindBy(xpath="//input[@name='addressLine2']")
	private WebElement addr2;
	
	@FindBy(xpath="//select[@id='shippingCountry']")
	private WebElement country;
	
	@FindBy(xpath="//input[@id='shippingZip']")
	private WebElement zip;
	
	@FindBy(xpath="//input[@id='shippingCity']")
	private WebElement city;
	
	@FindBy(xpath="//select[@id='shippingState']")
	private WebElement state;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement cont;

	public WebElement getCheck() {
		return check;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddr1() {
		return addr1;
	}

	public WebElement getAddr2() {
		return addr2;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getZip() {
		return zip;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCont() {
		return cont;
	}

	
	
	
	

}
