package udigo.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import udigo.util.Configuration;


import java.util.concurrent.TimeUnit;

public class Driver {
    public static WebDriver driver = null;
    private static WebDriverWait wait;
    private static Configuration configuration = Configuration.get();  //DEFAULT IS NO RESET ~ NOT RE-INSTALL APP


    public static WebDriver getDriver() {
        return driver;
    }


    public static void setUpDriver() {
        try {
            if (driver == null) {
                String Firefoxdriverpath = System.getProperty("user.dir") + "/src/main/resources/driver/geckodriver";
                System.setProperty("webdriver.gecko.driver", Firefoxdriverpath);
                driver = new FirefoxDriver();
                wait = new WebDriverWait(driver, Integer.valueOf(configuration.getTestProperty("implicit.wait")));
                driver.manage().timeouts().implicitlyWait(Long.parseLong(configuration.getTestProperty("implicit.wait")), TimeUnit.SECONDS)
                        .pageLoadTimeout(Long.parseLong(configuration.getTestProperty("page.load.wait")), TimeUnit.SECONDS);


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void closeDriver() {

        try {
            if (driver != null) {
                driver.close();
                driver = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WebDriverWait getWait() {
        return wait;
    }




}
