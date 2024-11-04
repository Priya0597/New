package org.sample;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPojo extends BaseClass {
	public SignUpPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Account']")
	private WebElement accnt;
	
	@FindBy(xpath="(//input[@id='email'])[1]")
	private WebElement eaddrs;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement psd;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement login;

	public WebElement getAccnt() {
		return accnt;
	}

	public WebElement getEaddrs() {
		return eaddrs;
	}

	public WebElement getPsd() {
		return psd;
	}

	public WebElement getLogin() {
		return login;
	}


}
