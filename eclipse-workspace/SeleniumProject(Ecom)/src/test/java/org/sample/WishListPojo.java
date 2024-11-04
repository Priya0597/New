package org.sample;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPojo extends BaseClass {
	public WishListPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement srch;
	
	@FindBy(xpath="//div[text()=' Monogrammed Kids Shacket ']")
    private WebElement select;
	
	@FindBy(xpath="//a[@id='product-action-wishlist-add']")
	private WebElement wish;

	public WebElement getSrch() {
		return srch;
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getWish() {
		return wish;
	}
	
	

}
