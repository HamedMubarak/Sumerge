package sauceLabs.tests.cart;

import base.Base;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CartStepDefs extends Base {

    @Then("cart should be empty")
    public void cartShouldBeEmpty() {
        try{
            Assert.assertFalse(browser.home.getCartBadgeCount().isDisplayed());
        }catch (Exception e){}
    }

    @When("click on cart icon")
    public void clickOnCartIcon() {
        browser.home.clickOnCartIcon();
    }


    @Then("cart page should be opened")
    public void cartPageShouldBeOpened() {
        Assert.assertEquals(webDriverHandler.getWebDriver().getCurrentUrl(),configTestData.getProperty("sauceLabsCartUrl"));
        Assert.assertTrue(browser.cart.getCheckoutButton().isDisplayed());
    }

    @When("click on remove button of product with {string} in cart page")
    public void removeButtonOfProductWithInCartPage(String productName){
        for (WebElement name : browser.cart.getAllProductsNames()) {
            if (name.getText().contains("Bike Light")) {
                Assert.assertEquals(name.getText(), configTestData.getProperty(productName));
                for(WebElement removeButton: browser.cart.getAllRemoveButtons()){
                    if(removeButton.getAttribute("id").contains("bike")){
                        removeButton.click();
                        break;
                    }
                }
                break;
            }
            if (name.getText().contains("Bolt")) {
                Assert.assertEquals(name.getText(), configTestData.getProperty(productName));
                for(WebElement removeButton: browser.cart.getAllRemoveButtons()){
                    if(removeButton.getAttribute("id").contains("bolt")){
                        removeButton.click();
                        break;
                    }
                }
                break;
            }
            if (name.getText().contains("One")) {
                Assert.assertEquals(name.getText(), configTestData.getProperty(productName));
                for(WebElement removeButton: browser.cart.getAllRemoveButtons()){
                    if(removeButton.getAttribute("id").contains("one")){
                        removeButton.click();
                        break;
                    }
                }
                break;
            }
            if (name.getText().contains("Test")) {
                Assert.assertEquals(name.getText(), configTestData.getProperty(productName));
                for(WebElement removeButton: browser.cart.getAllRemoveButtons()){
                    if(removeButton.getAttribute("id").contains("test")){
                        removeButton.click();
                        break;
                    }
                }
                break;
            }
            if (name.getText().contains("Backpack")) {
                Assert.assertEquals(name.getText(), configTestData.getProperty(productName));
                for(WebElement removeButton: browser.cart.getAllRemoveButtons()){
                    if(removeButton.getAttribute("id").contains("backpack")){
                        removeButton.click();
                        break;
                    }
                }
                break;
            }
            if (name.getText().contains("Fleece")) {
                Assert.assertEquals(name.getText(), configTestData.getProperty(productName));
                for(WebElement removeButton: browser.cart.getAllRemoveButtons()){
                    if(removeButton.getAttribute("id").contains("fleece")){
                        removeButton.click();
                        break;
                    }
                }
                break;
            }
        }
    }

    @Then("products with {string} in cart page should be displayed")
    public void productsWithInCartPageShouldBeDisplayed(String productName) {
        for (WebElement name : browser.cart.getAllProductsNames()) {
            if (name.getText().contains("Bike Light")) {
                Assert.assertEquals(name.getText(), configTestData.getProperty(productName));
            }
            if (name.getText().contains("Bolt")) {
                Assert.assertEquals(name.getText(), configTestData.getProperty(productName));
            }
            if (name.getText().contains("One")) {
                Assert.assertEquals(name.getText(), configTestData.getProperty(productName));
            }
            if (name.getText().contains("Test")) {
                Assert.assertEquals(name.getText(), configTestData.getProperty(productName));
            }
            if (name.getText().contains("Backpack")) {
                Assert.assertEquals(name.getText(), configTestData.getProperty(productName));
            }
            if (name.getText().contains("Fleece")) {
                Assert.assertEquals(name.getText(), configTestData.getProperty(productName));
            }
        }
    }

    @Then("cart badge count should be increased for each click on add to cart button of any product in product page")
    public void cartBadgeCountShouldBeIncreasedForEachClickOnAddToCartButtonOfAnyProductInProductPage() {
        int cartBadgeCount = 0;
        for (WebElement e : browser.home.getAllAddToCartButtons()) {
            Assert.assertTrue(e.isDisplayed());
            e.click();
            cartBadgeCount++;
            Assert.assertEquals(String.valueOf(cartBadgeCount), browser.home.getCartBadgeCount().getText());
        }
    }

    @Then("remove button of all added to cart products should be displayed in product page")
    public void removeButtonOfAllAddedToCartProductsShouldBeDisplayedInProductPage() {
        for(WebElement e: browser.home.getAllRemoveButtons()){
            Assert.assertTrue(e.isDisplayed());
        }
    }

    @Then("cart badge count should be decreased for each click on remove button of any product in product page")
    public void cartBadgeCountShouldBeDecreasedForEachClickOnRemoveButtonOfAnyProductInProductPage() {
        int productSize = browser.home.getAllRemoveButtons().size();
        int cartBadgeCount = productSize;
        Assert.assertEquals(cartBadgeCount,browser.home.getAllRemoveButtons().size());
        for (WebElement e : browser.home.getAllRemoveButtons()) {
            Assert.assertTrue(e.isDisplayed());
            e.click();
            cartBadgeCount--;
            if( cartBadgeCount != 0){
                Assert.assertEquals(String.valueOf(cartBadgeCount), browser.home.getCartBadgeCount().getText());
            }
            else {
                cartShouldBeEmpty();
            }
        }
    }
}
