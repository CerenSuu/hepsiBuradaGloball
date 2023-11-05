package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        tags = "@LoginTest",
        features = "src/test/resources/features/loginPage.feature",
        glue = {"stepDefs", "hooks"},
        plugin = {"pretty",
                "json:target/ceren/cucumber.json",
                "html:target/ceren/cucumber-html-report.html"},
        monochrome = true,
        publish = true,
        dryRun = false)


public class ParallelTestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }

}
