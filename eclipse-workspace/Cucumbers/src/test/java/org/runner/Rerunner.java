package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
    
    @RunWith(Cucumber.class)
	@CucumberOptions(features = "@C:\\Users\\rasek\\eclipse-workspace\\Cucumbers\\Failure\\fb.txt",glue="org.step",dryRun  =false,
	plugin = {"rerun:C:\\Users\\rasek\\eclipse-workspace\\Cucumbers\\Failure\\fb.txt"})
	public class Rerunner {
		
    }


