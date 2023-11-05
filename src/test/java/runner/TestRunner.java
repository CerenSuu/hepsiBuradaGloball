package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@LTest",
        features = "src/test/resources/features/loginPage.feature",
        glue = {"stepDefs", "hooks"},
        plugin = {"pretty",
                "json:target/report/cucumber.json",
                //"html:target/report/cucumber-html-report.html",
                //"usage:target/report/cucumber-usage.json",
                // "testng:target/report/cucumber-results.xml"},
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "rerun:Failed/failedSenarios.txt"},

        monochrome = true,
        publish = true,
        dryRun = false)

public class TestRunner extends AbstractTestNGCucumberTests {

}
