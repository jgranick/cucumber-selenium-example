package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "features",
    glue = "steps",
    plugin = {
        "pretty",
        "html:/reports/cucumber-report.html",
        "message:/reports/cucumber-report.ndjson",
        "json:/reports/cucumber-report.json"
    }
)
public class TestRunner {}
