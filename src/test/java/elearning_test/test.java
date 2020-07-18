package elearning_test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature_files", glue= "elearning_stepdefinition",tags="@createcourse_excel",
format=
{"pretty",
"html:target/cucumber-reports/cucumber-pretty",
"json:target/cucumber-reports/CucumberTestReport.json"})

public class test
{
	
}
