package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Home extends Base {

    private final By cartIcon = By.cssSelector("a[class='shopping_cart_link']");
    private final By cartBadgeCount = By.cssSelector("span[class='shopping_cart_badge']");
    private final By sideBarBurgerIcon = By.id("react-burger-menu-btn");
    private final By logoutButton = By.id("logout_sidebar_link");
    private final By productActiveSortOption = By.cssSelector("span[class='active_option']");
    private final By productSortOptions = By.cssSelector("select[class='product_sort_container']");
    private final By allProducts = By.cssSelector("div[class='inventory_item']");
    private final By allProductsImages = By.cssSelector("img[class='inventory_item_img']");
    private final By allProductsNames = By.cssSelector("div[class='inventory_item_name ']");
    private final By allProductsDescriptions = By.cssSelector("div[class='inventory_item_desc']");
    private final By allProductsPrices = By.cssSelector("div[class='inventory_item_price']");
    private final By allRemoveButtons = By.cssSelector("button[id*=remove-]");
    private final By allAddToCartButtons = By.cssSelector("button[id*=add-to-cart-]");

    public WebElement getCartIcon() {return webDriverHandler.getWebDriver().findElement(cartIcon);}
    public WebElement getCartBadgeCount() {return webDriverHandler.getWebDriver().findElement(cartBadgeCount);}
    public WebElement getLogoutButton() {return webDriverHandler.getWebDriver().findElement(logoutButton);}
    public WebElement getProductActiveSortOption() {return webDriverHandler.getWebDriver().findElement(productActiveSortOption);}
    public WebElement getProductSortOptions() {return webDriverHandler.getWebDriver().findElement(productSortOptions);}
    public List<WebElement> getAllProducts() {return webDriverHandler.getWebDriver().findElements(allProducts);}
    public List<WebElement> getAllProductsImages() {return webDriverHandler.getWebDriver().findElements(allProductsImages);}
    public List<WebElement> getAllProductsNames() {return webDriverHandler.getWebDriver().findElements(allProductsNames);}
    public List<WebElement> getAllProductsDescriptions() {return webDriverHandler.getWebDriver().findElements(allProductsDescriptions);}
    public List<WebElement> getAllProductsPrices() {return webDriverHandler.getWebDriver().findElements(allProductsPrices);}
    public List<WebElement> getAllAddToCartButtons() {return webDriverHandler.getWebDriver().findElements(allAddToCartButtons);}
    public List<WebElement> getAllRemoveButtons() {return webDriverHandler.getWebDriver().findElements(allRemoveButtons);}

    public void clickOnSideBarBurgerIcon() {webDriverHandler.getWebDriver().findElement(sideBarBurgerIcon).click();}
    public void clickOnLogoutButton() {webDriverHandler.getWebDriver().findElement(logoutButton).click();}
    public void clickOnProductSortOptions() {webDriverHandler.getWebDriver().findElement(productSortOptions).click();}
    public void clickOnCartIcon() {webDriverHandler.getWebDriver().findElement(cartIcon).click();}

}
