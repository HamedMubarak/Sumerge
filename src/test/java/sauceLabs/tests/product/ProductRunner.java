package sauceLabs.tests.product;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/sauceLabs/product"},
        glue = {"sauceLabs"},
        plugin = {"pretty","html:Report/cucumber-reports/report.html"},
        monochrome = true)
public class ProductRunner extends AbstractTestNGCucumberTests {
}