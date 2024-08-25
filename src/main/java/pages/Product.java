package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Product extends Base {

    private final By backToProductsButton = By.id("back-to-products");
    private final By productImage = By.cssSelector("img[class='inventory_details_img']");
    private final By productName = By.cssSelector("div[class='inventory_details_name large_size']");
    private final By productDescription = By.cssSelector("div[class='inventory_details_desc large_size']");
    private final By productPrice = By.cssSelector("div[class='inventory_details_price']");
    private final By productAddToCartButton = By.id("add-to-cart");
    private final By productRemoveButton = By.id("remove");

    public WebElement getProductImage() {return webDriverHandler.getWebDriver().findElement(productImage);}
    public WebElement getProductName() {return webDriverHandler.getWebDriver().findElement(productName);}
    public WebElement getProductDescription() {return webDriverHandler.getWebDriver().findElement(productDescription);}
    public WebElement getProductPrice() {return webDriverHandler.getWebDriver().findElement(productPrice);}
    public WebElement getProductAddToCartButton() {return webDriverHandler.getWebDriver().findElement(productAddToCartButton);}
    public WebElement getProductRemoveButton() {return webDriverHandler.getWebDriver().findElement(productRemoveButton);}

    public void clickOnBackToProductsButton() {webDriverHandler.getWebDriver().findElement(backToProductsButton).click();}
    public void clickOnProductAddToCartButton() {webDriverHandler.getWebDriver().findElement(productAddToCartButton).click();}


}
