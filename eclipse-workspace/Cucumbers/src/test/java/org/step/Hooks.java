package org.step;

import java.io.IOException;

import org.helping.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void bef() {
		
		openChrome();
		implicitWait(3000);
		
	}
	
	
}
