package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "features",
    glue = "steps",
    plugin = { "pretty", "html:/reports/Cucumber.html", "json:/reports/Cucumber.json" }
)
public class TestRunner {}
