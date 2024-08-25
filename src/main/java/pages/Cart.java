package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Cart extends Base {

    private final By checkoutButton = By.id("checkout");
    private final By allRemoveButtons = By.cssSelector("button[id*=remove-]");
    private final By allProductsNames = By.cssSelector("div[class='inventory_item_name']");

    public WebElement getCheckoutButton() {return webDriverHandler.getWebDriver().findElement(checkoutButton);}
    public List<WebElement> getAllRemoveButtons() {return webDriverHandler.getWebDriver().findElements(allRemoveButtons);}
    public List<WebElement> getAllProductsNames() {return webDriverHandler.getWebDriver().findElements(allProductsNames);}


}
