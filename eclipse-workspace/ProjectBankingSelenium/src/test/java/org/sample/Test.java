package org.sample;

import java.io.IOException;

import org.help.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.run.AccountCreatePojo;
import org.run.ActivateCard;
import org.run.HomePagePojo;

public class Test extends BaseClass{
	public static void main(String[] args) throws InterruptedException, IOException {
		openChrome();
		launchUrl("https://www.greendot.com/");
		windowMaxi();
		implicitWait(8000);
		HomePagePojo hp=new HomePagePojo();
		clickElement(hp.getAccnt());
		AccountCreatePojo ac=new AccountCreatePojo();
		Thread.sleep(2000);
		togetWindowhandles(1);
		passKeys(ac.getFname(), "Marcelina");
		passKeys(ac.getLname(), "Gaylord");
		passKeys(ac.getAddr(), "4363 Pearlie Landing Jacksonville FL");
		passKeys(ac.getAddr1(), "F12");
		passKeys(ac.getZip(), "32207");
		passKeys(ac.getPhone(), "712-990-7481");
		passKeys(ac.getCphone(), "712-990-7481");
		passKeys(ac.getEmail(), "ylockman@gmail.com");
		passKeys(ac.getCemail(), "ylockman@gmail.com");
		passKeys(ac.getSsn(), "513-14-8105");
		passKeys(ac.getDob(), "03/21/1998");
		buttonClick(ac.getBox1());
		buttonClick(ac.getBox2());
		buttonClick(ac.getBox3());
		toClickElement(ac.getOpen(),3, 2000);
		toGetScreenshotAs("C:\\Users\\rasek\\eclipse-workspace\\ProjectBankingSelenium\\Screenshot\\createAccount.png");
		
//		ActivateCard at=new ActivateCard();
//		buttonClick(hp.getActive());
//		togetWindowhandles(1);
//		passKeys(at.getCard(), "4757-6729-3437-8533");
//		passKeys(at.getDate(), "03/27");
//		passKeys(at.getCvv(), "504");
//		toClickElement(at.getNext(), 2, 1000);
		
		
		
		
	}
	

}
