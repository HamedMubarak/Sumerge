package sauceLabs.tests;

import base.Base;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CommonStepDefs extends Base {

    @Given("login page should be opened")
    public void loginPageShouldBeOpened() {
        Assert.assertEquals(webDriverHandler.getWebDriver().getCurrentUrl(),configTestData.getProperty("sauceLabsLoginUrl"));
        Assert.assertTrue(browser.login.getLoginButton().isDisplayed());
    }

    @Then("logged in successfully")
    public void loggedInSuccessfully() {
        Assert.assertEquals(webDriverHandler.getWebDriver().getCurrentUrl(),configTestData.getProperty("sauceLabsHomeUrl"));
        Assert.assertTrue(browser.home.getCartIcon().isDisplayed());
    }

    @When("logout from sauce labs website")
    public void logoutFromSauceLabsWebsite() {
        browser.home.clickOnSideBarBurgerIcon();
        utilities.scrollTo(browser.home.getLogoutButton());
        browser.home.clickOnLogoutButton();
    }

    @Then("logout out successfully")
    public void logoutOutSuccessfully() {
        Assert.assertEquals(webDriverHandler.getWebDriver().getCurrentUrl(),configTestData.getProperty("sauceLabsLoginUrl"));
        Assert.assertTrue(browser.login.getLoginButton().isDisplayed());
    }

    @Then("home page should be opened")
    public void homePageShouldBeOpened() {
        Assert.assertEquals(webDriverHandler.getWebDriver().getCurrentUrl(),configTestData.getProperty("sauceLabsHomeUrl"));
        Assert.assertTrue(browser.home.getCartIcon().isDisplayed());
    }

    @Then("active sorting should be with {string}")
    public void activeSortingShouldBeWith(String sortOption) {
        Assert.assertEquals(browser.home.getProductActiveSortOption().getText(),configTestData.getProperty(sortOption));
    }

    @When("select sort products by price {string}")
    public void selectSortProductsByPrice(String sortOption) {
        Select sort = new Select(browser.home.getProductSortOptions());
        sort.selectByVisibleText(configTestData.getProperty(sortOption));
    }

    @Then("products should be sorted with prices {string} successfully")
    public void productsShouldBeSortedWithPricesSuccessfully(String sortOption) {
        double productPrice = 0;
        double lowestProductPrice = 0;
        double highestProductPrice = 0;
        String firstProductFlag = "1";
        switch (configTestData.getProperty(sortOption)){
            case "Price (low to high)":
                for(int i =0; i < browser.home.getAllProductsPrices().size(); i++) {
                    if(firstProductFlag.equals("1")){
                        productPrice = Double.parseDouble(browser.home.getAllProductsPrices().get(i).getText().replaceAll("[$]",""));
                        lowestProductPrice = productPrice;
                        firstProductFlag = "0";
                    }
                    else {
                        productPrice = Double.parseDouble(browser.home.getAllProductsPrices().get(i).getText().replaceAll("[$]",""));
                    }
                    Assert.assertTrue(lowestProductPrice <= productPrice);
                }
                break;
            case "Price (high to low)":
                for(int i =0; i < browser.home.getAllProductsPrices().size(); i++) {
                    if(firstProductFlag.equals("1")){
                        productPrice = Double.parseDouble(browser.home.getAllProductsPrices().get(i).getText().replaceAll("[$]",""));
                        highestProductPrice= productPrice;
                        firstProductFlag = "0";
                    }
                    else {
                        productPrice = Double.parseDouble(browser.home.getAllProductsPrices().get(i).getText().replaceAll("[$]",""));
                    }
                    Assert.assertTrue(highestProductPrice >= productPrice);
                }
                break;
            default:
                System.out.println("Products are sorted alphabetically");
                break;
        }
    }

}
