package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class ExampleSteps {
    WebDriver driver;

    @Given("I open Google")
    public void iOpenGoogle() throws Exception {
        URL seleniumHub = new URL("http://selenium-hub:4444/wd/hub");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new RemoteWebDriver(seleniumHub, options);
        driver.get("https://www.google.com");
    }

    @Then("the title should be {string}")
    public void theTitleShouldBe(String expectedTitle) {
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
        driver.quit();
    }
}
