package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = {"src/test/resources/features"},
  glue = {"com.BDD.stepdef"},
 // glue = {"com.BDD.stepdef", "hooks"},
 // tags = "@smoketest",  // Specify the tag here
  plugin = {"pretty", "html:target/cucumber-reports.html"},
  monochrome = true
)
public class Runnerjunit {
  // This class will run Cucumber tests using JUnit.
}
