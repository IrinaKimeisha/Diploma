package services;

import configuration.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BrowsersService {
    private WebDriver driver = null;

    public BrowsersService() {
        switch (ReadProperties.browserName().toLowerCase()) {
            case "chrome":
                DriverManagerType driverManagerType = DriverManagerType.CHROME;
                WebDriverManager.getInstance(driverManagerType).setup();

                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setHeadless(ReadProperties.isHeadless());
                chromeOptions.addArguments("--disable-gpu");
                chromeOptions.addArguments("--ignore-certificate-errors");
                chromeOptions.addArguments("--silent");

                driver = new ChromeDriver(chromeOptions);

                break;
            case "firefox":
                driverManagerType = DriverManagerType.FIREFOX;
                WebDriverManager.getInstance(driverManagerType).setup();

                driver = new FirefoxDriver();
                break;
            case "safari":
                driverManagerType = DriverManagerType.SAFARI;
                WebDriverManager.getInstance(driverManagerType).setup();

                driver = new SafariDriver();
                break;
            default:
                System.out.println("Browser " + ReadProperties.browserName() + " is not supported.");
                break;
        }
    }

    public WebDriver getDriver() {
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));


        return driver;
    }
}