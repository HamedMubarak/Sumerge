package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Base {

    private final By userName = By.id("user-name");
    private final By password = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By loginErrorMessage = By.xpath("//div[@class='error-message-container error']/h3");
    private final By loginErrorButton = By.cssSelector("button[class='error-button']");

    public WebElement getUserName() {
        return webDriverHandler.getWebDriver().findElement(userName);
    }
    public WebElement getPassword() {
        return webDriverHandler.getWebDriver().findElement(password);
    }
    public WebElement getLoginButton() {
        return webDriverHandler.getWebDriver().findElement(loginButton);
    }
    public WebElement getLoginErrorMessage() {
        return webDriverHandler.getWebDriver().findElement(loginErrorMessage);
    }
    public WebElement getLoginErrorButton() {
        return webDriverHandler.getWebDriver().findElement(loginErrorButton);
    }

    public void clickOnLoginButton() {
        webDriverHandler.getWebDriver().findElement(loginButton).click();
    }
    public void clickOnLoginErrorButton() {
        webDriverHandler.getWebDriver().findElement(loginErrorButton).click();
    }

}
