package br.com.challengegetnet.support;

import org.openqa.selenium.JavascriptExecutor;
import br.com.challengegetnet.support.DriverFactory;
import static br.com.challengegetnet.support.DriverFactory.getDriver;

public class Utils {

    public void scrollDown(){

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        // This  will scroll down the page by  1000 pixel vertical
        js.executeScript("window.scrollBy(0,1000)");
    }
}
