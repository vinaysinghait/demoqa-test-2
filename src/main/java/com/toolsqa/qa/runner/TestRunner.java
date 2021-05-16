package com.toolsqa.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;    //  Include these classes or else it will through 
                                         //error and three POM dependencies in next screenshot
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions
(
	

		features = "src/main/java/com/toolsqa/qa/features/toolsqa.feature", glue = "com.toolsqa.qa.stepdefinitions",
		
		//plugin= {"html:target/cucumber-html-report"},
		dryRun=false
		
		
)


public class TestRunner 
{

}
