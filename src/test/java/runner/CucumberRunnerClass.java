package runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        //features = "src\\test\\resources\\features\\ScenarioOutline.feature",
        //features = "src\\test\\resources\\features\\AutomationHomePage.feature",
        //features = "src\\test\\resources\\features\\CreatePage.feature",
        features = "src\\test\\resources\\features\\UserResgistration_New.feature",
        glue={"com.stepdefinitions"},
        plugin = {"pretty", "html:target\\cucumber-reports"},
        tags = {"@smoketest"},
        monochrome =true

)

public class CucumberRunnerClass extends AbstractTestNGCucumberTests {

        @Before
        public static void before(Scenario scenario ){
                System.out.println("Before hook" +scenario);
        }
        @After
        public static void after(Scenario scenario ){
                System.out.println("After hook" +scenario);
        }
}
