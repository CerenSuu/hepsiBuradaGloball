package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@AddProductTest",
        features = "src/test/resources/features/addProduct.feature",
        glue = {"org.login.stepdefs","hooks"},
        plugin = {"pretty",
                "json:target/report/cucumber.json",
                "html:target/report/cucumber-html-report.html",
                "usage:target/report/cucumber-usage.json",
                "testng:target/report/cucumber-results.xml",
                 "rerun:Failed/failedSenarios.txt"},
        monochrome = true,
        publish = true,
        dryRun = false)

public class TestRunner2 extends AbstractTestNGCucumberTests {

}
