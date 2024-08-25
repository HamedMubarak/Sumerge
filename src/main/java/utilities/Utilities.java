package utilities;

import org.openqa.selenium.*;

import static base.Base.webDriverHandler;

public class Utilities {


    public void scrollTo(WebElement webElement) {
        JavascriptExecutor js = (JavascriptExecutor) webDriverHandler.getWebDriver();
        js.executeScript("arguments[0].scrollIntoView();", webElement);
    }

}
