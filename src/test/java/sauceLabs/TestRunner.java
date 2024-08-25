package sauceLabs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/sauceLabs"},
        glue = {"sauceLabs"},
        plugin = {"pretty","html:Report/cucumber-reports/report.html"},
        monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {
}
