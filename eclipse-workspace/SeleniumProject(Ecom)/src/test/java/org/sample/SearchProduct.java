package org.sample;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct extends BaseClass {
	public SearchProduct() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Bags']")
	private WebElement bag;
	
	@FindBy(xpath="//a[text()='Large Zip Top Tote']")
	private WebElement tote;
	
	@FindBy(xpath="//img[@alt='Coral Floral']")
	private WebElement color;
	
	@FindBy(xpath="//div[@id='product-do-not-personalize']")
	private WebElement person;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	private WebElement cart;
	
	@FindBy(xpath="//a[text()='Shoes']")
	private WebElement shoe;
	
	@FindBy(xpath="//a[text()='All Sandals']")
	private WebElement sandal;
	
	@FindBy(xpath="//a[text()='Monogrammed Flip Flops']")
	private WebElement flip;
	
	@FindBy(xpath="//span[text()='7']")
	private WebElement size;
	
	public WebElement getBag() {
		return bag;
	}

	public WebElement getTote() {
		return tote;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getPerson() {
		return person;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getShoe() {
		return shoe;
	}

	public WebElement getSandal() {
		return sandal;
	}

	public WebElement getFlip() {
		return flip;
	}

	public WebElement getSize() {
		return size;
	}

	

	
}
