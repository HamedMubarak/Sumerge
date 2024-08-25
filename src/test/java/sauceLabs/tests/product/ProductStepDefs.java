package sauceLabs.tests.product;

import base.Base;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ProductStepDefs extends Base {

    @Then("products size in home page should be equal six")
    public void allProductSizeInHomePageShouldBeEqualSix() {
        Assert.assertTrue(browser.home.getAllProducts().size() == 6);
    }

    @Then("all products images in home page should be displayed correctly")
    public void allProductsImagesInHomePageShouldBeDisplayedCorrectly() {
        for (WebElement e : browser.home.getAllProductsImages()) {
            if (e.getAttribute("alt").contains("Bike Light")) {
                Assert.assertEquals(e.getAttribute("src"), configTestData.getProperty("bikeLightImageSourceItem0"));
            } else if (e.getAttribute("alt").contains("Bolt")) {
                Assert.assertEquals(e.getAttribute("src"), configTestData.getProperty("boltShirtImageSourceItem1"));
            } else if (e.getAttribute("alt").contains("One")) {
                Assert.assertEquals(e.getAttribute("src"), configTestData.getProperty("oneSizeImageSourceItem2"));
            } else if (e.getAttribute("alt").contains("Test")) {
                Assert.assertEquals(e.getAttribute("src"), configTestData.getProperty("testImageSourceItem3"));
            } else if (e.getAttribute("alt").contains("Backpack")) {
                Assert.assertEquals(e.getAttribute("src"), configTestData.getProperty("backpackImageSourceItem4"));
            } else if (e.getAttribute("alt").contains("Jacket")) {
                Assert.assertEquals(e.getAttribute("src"), configTestData.getProperty("fleeceJacketImageSourceItem5"));
            } else {
                System.out.println("Product image source not found");
            }
        }
    }

    @Then("all products names in home page should be displayed correctly")
    public void allProductsNamesInHomePageShouldBeDisplayedCorrectly() {
        for (WebElement name : browser.home.getAllProductsNames()) {
            if (name.getText().contains("Bike Light")) {
                Assert.assertEquals(name.getText(), configTestData.getProperty("bikeLightNameItem0"));
            } else if (name.getText().contains("Bolt")) {
                Assert.assertEquals(name.getText(), configTestData.getProperty("boltShirtNameItem1"));
            } else if (name.getText().contains("One")) {
                Assert.assertEquals(name.getText(), configTestData.getProperty("oneSizeNameItem2"));
            } else if (name.getText().contains("Test")) {
                Assert.assertEquals(name.getText(), configTestData.getProperty("testNameItem3"));
            } else if (name.getText().contains("Backpack")) {
                Assert.assertEquals(name.getText(), configTestData.getProperty("backpackNameItem4"));
            } else if (name.getText().contains("Fleece")) {
                Assert.assertEquals(name.getText(), configTestData.getProperty("fleeceJacketNameItem5"));
            } else {
                System.out.println("Product name not found");
            }
        }
    }

    @Then("all products description in home page should be displayed correctly")
    public void allProductsDescriptionInHomePageShouldBeDisplayedCorrectly() {
        for (WebElement desc : browser.home.getAllProductsDescriptions()) {
            if (desc.getText().contains("bike")) {
                Assert.assertEquals(desc.getText(), configTestData.getProperty("bikeLightDescriptionItem0"));
            } else if (desc.getText().contains("bolt")) {
                Assert.assertEquals(desc.getText(), configTestData.getProperty("boltShirtDescriptionItem1"));
            } else if (desc.getText().contains("onesie")) {
                Assert.assertEquals(desc.getText(), configTestData.getProperty("oneSizeDescriptionItem2"));
            } else if (desc.getText().contains("tests")) {
                Assert.assertEquals(desc.getText(), configTestData.getProperty("testDescriptionItem3"));
            } else if (desc.getText().contains("Pack")) {
                Assert.assertEquals(desc.getText(), configTestData.getProperty("backpackDescriptionItem4"));
            } else if (desc.getText().contains("fleece")) {
                Assert.assertEquals(desc.getText(), configTestData.getProperty("fleeceJacketDescriptionItem5"));
            } else {
                System.out.println("Product description not found");
            }
        }
    }

    @When("click on product with name {string} in home page")
    public void clickOnProductWithNameInHomePage(String name) {
        for (WebElement e : browser.home.getAllProductsNames()) {
            if (e.getText().equals(configTestData.getProperty(name))) {
                e.click();
                break;
            }
        }
    }

    @Then("products details with {string} {string} {string} should be displayed successfully in product page")
    public void productsDetailsWithShouldBeDisplayedSuccessfullyInProductPage(String name, String desc, String price) {
        Assert.assertEquals(browser.product.getProductName().getText(), configTestData.getProperty(name));
        Assert.assertEquals(browser.product.getProductDescription().getText(),configTestData.getProperty(desc));
        Assert.assertEquals(browser.product.getProductPrice().getText(),configTestData.getProperty(price));
    }

    @When("click on back to products button in product page")
    public void clickOnBackToProductsButtonInProductPage() {
        browser.product.clickOnBackToProductsButton();
    }

    @Then("add to cart button in product page should be displayed")
    public void addToCartButtonInProductPageShouldBeDisplayed() {
        Assert.assertTrue(browser.product.getProductAddToCartButton().isDisplayed());
    }

    @When("click on add to cart button in product page")
    public void clickOnAddToCartButtonInProductPage() {
        browser.product.clickOnProductAddToCartButton();
    }

    @Then("remove button in product page should be displayed")
    public void removeButtonInProductPageShouldBeDisplayed() {
        Assert.assertTrue(browser.product.getProductRemoveButton().isDisplayed());
    }

}