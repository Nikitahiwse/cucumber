package Test_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\Users\\X240\\eclipse-workspace\\Bdd_simple\\src\\main\\java\\Features\\home_women.feature",
glue= {"Step_definations"},
format={"pretty","html:test-output"},
dryRun=false,
strict=true,
tags= {"@login, @cateoryTest"})


public class Test_runner {

}
