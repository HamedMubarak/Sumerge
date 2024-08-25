package sauceLabs.tests.login;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/sauceLabs/tests/login"},
        glue = {"sauceLabs"},
        plugin = {"pretty","html:Report/cucumber-reports/report.html"},
        monochrome = true)

public class LoginRunner extends AbstractTestNGCucumberTests {
}
