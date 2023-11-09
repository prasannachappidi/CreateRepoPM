package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(
		features = ".\\Features\\",
		glue = "stepDef"
		)

public class TestRunner {

}
