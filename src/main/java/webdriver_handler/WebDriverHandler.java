package webdriver_handler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverHandler {

    public static WebDriver webDriver;

    public WebDriverHandler(){
        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
    }

    public WebDriver getWebDriver() {return webDriver;}
    public void navigateToUrl (String link) {webDriver.get(link);}
    public void resetCache() {webDriver.manage().deleteAllCookies();}
    public void quitDriver() {webDriver.quit();}

}
