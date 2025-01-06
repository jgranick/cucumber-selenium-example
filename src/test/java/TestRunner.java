package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "features",
    glue = "steps",
    plugin = { "pretty", "html:/report/test-results.html", "json:/report/test-results.json" }
)
public class TestRunner {}
