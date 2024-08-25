package sauceLabs.tests.cart;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/sauceLabs/tests/cart"},
        glue = {"sauceLabs"},
        plugin = {"pretty","html:Report/cucumber-reports/report.html"},
        monochrome = true)

public class CartRunner extends AbstractTestNGCucumberTests {
}