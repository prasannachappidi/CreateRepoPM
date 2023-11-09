package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".\\Features\\",
		glue = "stepDef"
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
