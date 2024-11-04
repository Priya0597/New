package org.run;

import org.help.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivateCard extends BaseClass {
	public ActivateCard() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='card_number']")
	private WebElement card;
	
	@FindBy(xpath="//input[@id='expiry_date']")
	private WebElement date;
	
	@FindBy(xpath="//input[@id='cvv']")
	private WebElement cvv;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement next;
	
	@FindBy(xpath="//span[@id='recaptcha-anchor']")
	private WebElement recpatcha;

	public WebElement getCard() {
		return card;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getRecpatcha() {
		return recpatcha;
	}

}
