package org.sample;

import org.helping.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPojo extends BaseClass {
	public SignUpPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement accnt;
	
	@FindBy(xpath="//input[@placeholder='First name']")
	private WebElement fname;
	
	@FindBy(xpath="//div[text()='First name']")
	private WebElement lname;
	
	@FindBy(name="reg_email__")
	private WebElement mnumb;
	
	@FindBy(id="password_step_input")
	private WebElement npwd;
	
	@FindBy(id="day")
	private WebElement date;
	
	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(id="year")
	private WebElement year;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement sex;

	public WebElement getAccnt() {
		return accnt;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getMnumb() {
		return mnumb;
	}

	public WebElement getNpwd() {
		return npwd;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getSex() {
		return sex;
	}
	

}
