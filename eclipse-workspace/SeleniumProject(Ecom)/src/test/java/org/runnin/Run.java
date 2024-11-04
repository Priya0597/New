package org.runnin;

import java.awt.AWTException;

import org.helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.sample.AccountPojo;
import org.sample.CheckoutPojo;
import org.sample.PaymentPojo;
import org.sample.SearchProduct;
import org.sample.SignUpPojo;
import org.sample.WishListPojo;

public class Run extends BaseClass{
	public static void main(String[] args) throws InterruptedException, AWTException {
		openChrome();
		launchUrl("https://marleylilly.com/");
		windowMaxi();
		implicitWait(8000);
		
		SignUpPojo s=new SignUpPojo();
		buttonClick(s.getAccnt());
		passValue(s.getEaddrs(), "crazypria5197@gmail.com");
		passValue(s.getPsd(), "Dharshith@3012");
		buttonClick(s.getLogin());
		Thread.sleep(1000);
		
		WishListPojo w=new WishListPojo();
        passKeys(w.getSrch(),"kids up shacket");
        buttonClick(w.getSelect());
        buttonClick(w.getWish());
        goBack();
        goBack();
        
       
        SearchProduct sr=new SearchProduct();
        moveElement(sr.getBag());
        clickElement(sr.getTote());
        clickElement(sr.getColor());
        buttonClick(sr.getPerson());
        buttonClick(sr.getCart());
        moveElement(sr.getShoe());
        clickElement(sr.getShoe());
        buttonClick(sr.getSandal());
        clickElement(sr.getFlip());
        buttonClick(sr.getSize());
        buttonClick(sr.getPerson());
        buttonClick(sr.getCart());
        
        CheckoutPojo c=new CheckoutPojo();
        clickElement(c.getCheck());
        WebElement frames = driver.findElement(By.xpath("//iframe[@id='bolt-checkout-frame']"));
        driver.switchTo().frame(frames);
        passKeys(c.getEmail(), "pdietrich@gmail.com");
        passKeys(c.getPhone(), "(907) 572-7827");
        passKeys(c.getFname(), "Ayana");
        passKeys(c.getLname(), "Frami");
        valueSelect(c.getCountry(),"US");
        passKeys(c.getAddr1(), "14569 Eastern Ave");
        Thread.sleep(1000);
        c.getAddr1().sendKeys(Keys.ARROW_DOWN);
        c.getAddr1().sendKeys(Keys.ENTER);
        for (int i = 0; i < 2; i++) {
        	c.getZip().sendKeys(Keys.TAB);
        	}
        clickElement(c.getCont());
        Thread.sleep(3000);
        clickElement(c.getCont());
        
	    PaymentPojo p=new PaymentPojo();
        passKeys(p.getCcn(), "374375013983923");
        passKeys(p.getExp(), "06/26");
        passKeys(p.getCvv(), "6179");
        passKeys(p.getBill(), "43912");
        buttonClick(p.getPay());
	}

	
	

}
