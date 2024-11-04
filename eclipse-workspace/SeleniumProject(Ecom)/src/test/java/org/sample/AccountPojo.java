package org.sample;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPojo extends BaseClass {
	public AccountPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Account']")
	private WebElement accnt;
	
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(xpath="//input[@class='mailcheck']")
	private WebElement em;
	
	@FindBy(xpath=("//label[text()='Password']//ancestor::div[@class='form-row']//child::div[@class='form-field password']//child::input[@name='password']"))
	private WebElement pwsd;
	
	@FindBy(name="password_confirm")
	private WebElement pwdcfm;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement sub;
	
	
	public WebElement getAccnt() {
		return accnt;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getEm() {
		return em;
	}

	public WebElement getPwsd() {
		return pwsd;
	}

	public WebElement getPwdcfm() {
		return pwdcfm;
	}

	public WebElement getSub() {
		return sub;
	}

	

}
