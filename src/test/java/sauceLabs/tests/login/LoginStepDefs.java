package sauceLabs.tests.login;

import base.Base;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginStepDefs extends Base {

    @When("enter {string} and {string} in login page")
    public void enterAndInLoginPage(String userName, String password) {
        browser.login.getUserName().clear();
        browser.login.getUserName().sendKeys(configTestData.getProperty(userName));
        browser.login.getPassword().clear();
        browser.login.getPassword().sendKeys(configTestData.getProperty(password));
    }

    @When("click on login button in login page")
    public void clickOnLoginButtonInLoginPage() {
        browser.login.clickOnLoginButton();
    }

    @Then("invalid login attempts appropriate error messages {string} should be displayed")
    public void invalidLoginAttemptsAppropriateErrorMessagesShouldBeDisplayed(String errorMessage) {
        Assert.assertEquals(browser.login.getLoginErrorMessage().getText(),configTestData.getProperty(errorMessage));
    }

    @When("click on error button")
    public void clickOnErrorButton() {
        browser.login.clickOnLoginErrorButton();
    }

    @Then("invalid login attempts error messages should not be displayed")
    public void invalidLoginAttemptsErrorMessagesShouldNotBeDisplayed() {
        try{
            Assert.assertFalse(browser.login.getLoginErrorMessage().isDisplayed());
        } catch(Exception e){}
    }

}
