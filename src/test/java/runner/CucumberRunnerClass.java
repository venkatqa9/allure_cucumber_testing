package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src\\test\\resources\\features\\UserRegistration.feature",
        glue={"com.stepdefinitions"},
        monochrome =true



)

public class CucumberRunnerClass extends AbstractTestNGCucumberTests {
}
