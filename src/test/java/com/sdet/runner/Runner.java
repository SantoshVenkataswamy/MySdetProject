package com.sdet.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		dryRun=false,
		strict=true,
		monochrome=false,
		features= {"src/test/resources/"},
		glue = {"com.sdet.steps"},
		plugin= {
				"html:target/site/cucumber-html",
				"json:target/cucumber1.json"},
		tags= {"@CreatePortFolio"}
		)
public class Runner {

}
