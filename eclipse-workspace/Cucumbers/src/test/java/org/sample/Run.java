package org.sample;

import org.helping.BaseClass;

public class Run extends BaseClass
{
	public static void main(String[] args) throws InterruptedException {
		openChrome();
		launchUrl("https://www.facebook.com/");
		SignUpPojo s=new SignUpPojo();
		Thread.sleep(3000);
		clickElement(s.getAccnt());
		passKeys(s.getFname(), "Raja");
	}

}
