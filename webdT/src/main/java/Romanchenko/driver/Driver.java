package Romanchenko.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static final String WEBDRIVER_FIREDRIVER = "webdriver.gecko.driver";
    private static final String WEBDRIVER_FIREDRIVER_PATH = "C:\\geckodriver\\geckodriver.exe";
    private static WebDriver driver;

    private Driver(){}

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty(WEBDRIVER_FIREDRIVER, WEBDRIVER_FIREDRIVER_PATH);
            driver=new FirefoxDriver();
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }
}
