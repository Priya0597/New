package org.helping;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="email")
private WebElement username;

@FindBy(id="pass")
private WebElement pwd;

@FindBy(name="login")
private WebElement log;

public WebElement getUsername() {
	return username;
}

public WebElement getPwd() {
	return pwd;
}

public WebElement getLog() {
	return log;
}

}
