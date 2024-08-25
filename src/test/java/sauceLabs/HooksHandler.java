package sauceLabs;

import base.Base;
import browser.Browser;
import io.cucumber.java.*;
import utilities.ConfigProperties;
import utilities.Utilities;
import webdriver_handler.WebDriverHandler;

import java.io.IOException;

public class HooksHandler extends Base {

    @Before
    public static void setUpSauceLabsWebsite() throws IOException {
        configTestData = new ConfigProperties("src/main/java/resources/testData.properties");
        webDriverHandler = new WebDriverHandler();
        webDriverHandler.navigateToUrl(configTestData.getProperty("sauceLabsLoginUrl"));
        browser = new Browser();
        utilities = new Utilities();
    }

    @After
    public static void tearDownSauceLabsWebsite() {
        webDriverHandler.resetCache();
        webDriverHandler.quitDriver();
    }

}
