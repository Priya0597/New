package org.helping;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPojo extends BaseClass {
	public ForgotPojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="identify_email")
	private WebElement email;
	
	@FindBy(id="did_submit")
	private WebElement search;

	

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSearch() {
		return search;
	}
	

	
	

}

