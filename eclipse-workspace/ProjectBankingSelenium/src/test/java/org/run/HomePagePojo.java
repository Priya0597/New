package org.run;

import org.help.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePojo extends BaseClass{
	public HomePagePojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='button-e07501e667']")
	private WebElement accnt;
	
	@FindBy(xpath="//a[@aria-label='Activate your card']")
	private WebElement active;
	
	@FindBy(xpath="//a[@aria-label='Log in']")
	private WebElement login;
	
	@FindBy(xpath="//span[text()='Benefits']")
	private WebElement benefit;
	
	@FindBy(xpath="//span[text()='Products']")
	private WebElement prod;

	public WebElement getAccnt() {
		return accnt;
	}

	public WebElement getActive() {
		return active;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getBenefit() {
		return benefit;
	}

	public WebElement getProd() {
		return prod;
	}
	
	
	

}
