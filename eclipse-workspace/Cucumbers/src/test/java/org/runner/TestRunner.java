package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src\\test\\resources\\Feature",glue="org.step",dryRun  =false,
	plugin = {"json:Reports\\Json\\fb.json"})
	public class TestRunner {
		@AfterClass
		public static void report() {
			JvmReport.generateJvm("C:\\Users\\rasek\\eclipse-workspace\\Cucumbers\\Reports\\Json\\fb.json");
			
			

	}
		

}
