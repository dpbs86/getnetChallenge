package br.com.challengegetnet.support;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static WebDriver driver;
    private static ChromeOptions options;

    public DriverFactory () {}
    @Before
    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        }
        return driver;
    }
    @After
    public static void killDriver(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }


}

