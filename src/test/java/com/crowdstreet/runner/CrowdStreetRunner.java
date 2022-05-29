package com.crowdstreet.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"html:target/report/cucumber.html", "json:target/cucumber.json"},
		features = { ".//Features/CrowdStreet.feature"},
		glue = { "com.crowdstreet.stepdef" },
		monochrome =true
		)

public class CrowdStreetRunner extends AbstractTestNGCucumberTests {

}
