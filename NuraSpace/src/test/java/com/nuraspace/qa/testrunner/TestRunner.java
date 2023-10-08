package com.nuraspace.qa.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\com\\nuraspace\\qa\\Features\\",
glue= {"com.nuraspace.qa.StepDefinations","com.nuraspace.qa.hooks"},
dryRun=!true, 
monochrome=true,
plugin= {"pretty","html:target/cucumber-reports.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)


public class TestRunner {


}
