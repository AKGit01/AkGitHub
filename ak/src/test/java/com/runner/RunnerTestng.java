package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
  features = {"src/test/resources/features"},
  glue = {"com.BDD.stepdef", "hooks"},
  tags = "@smoketest",  // Specify the tag here
  plugin = {"pretty", "html:target/cucumber-reports.html"},
  monochrome = true
)
public class RunnerTestng extends AbstractTestNGCucumberTests {
  // This class will run Cucumber tests using TestNG.
}
