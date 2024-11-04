package org.sample;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPojo extends BaseClass {
	public PaymentPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement con;
	
	@FindBy(xpath="//input[@name='cardnumber']")
	private WebElement ccn;
	
	@FindBy(xpath="//input[@id='exp']")
	private WebElement exp;
	
	@FindBy(xpath="//input[@id='cvv']")
	private WebElement cvv;
	
	@FindBy(xpath="//input[@id='ccPostal']")
	private WebElement bill;
	
	@FindBy(xpath="//button[@data-tid='checkout-button']")
	private WebElement pay;

	public WebElement getCon() {
		return con;
	}

	public WebElement getCcn() {
		return ccn;
	}

	public WebElement getExp() {
		return exp;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBill() {
		return bill;
	}

	public WebElement getPay() {
		return pay;
	}

	
	

}
