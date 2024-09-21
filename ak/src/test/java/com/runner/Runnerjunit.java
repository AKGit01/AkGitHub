package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) //used to run the Cucumber test using JUnit
//This annotation allows you to specify Cucumber-specific options like the path to feature files,
//step definition locations, reporting options, and more
@CucumberOptions(
  features = {"src/test/resources/features"},
  glue = {"com.BDD.stepdef"},
 // glue = {"com.BDD.stepdef", "hooks"},
 // tags = "@smoketest",  // Specify the tag here
  plugin = {"pretty", "html:target/cucumber-reports.html"}, //Generate Cucumber reports using plugins 
  															//like Cucumber Reports Plugin.
  monochrome = true
)
public class Runnerjunit {
  // This class will run Cucumber tests using JUnit.
}
