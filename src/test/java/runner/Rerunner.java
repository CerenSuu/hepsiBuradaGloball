package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Rerun",
        features = "@Failed/failedSenarios.txt",
        glue = {"org.login.stepdefs","hooks"},
        plugin = {"pretty",
                "json:target/report/cucumber.json",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "rerun:Failed/failedSenarios.txt"},

        monochrome = true,
        publish = true,
        dryRun = false)

public class Rerunner extends AbstractTestNGCucumberTests {

}
