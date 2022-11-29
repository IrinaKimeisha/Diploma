package baseEntities;

import org.openqa.selenium.WebDriver;
import services.WaitsService;

public class BasePage {
    protected WebDriver driver;
    protected WaitsService waitsService;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        waitsService = new WaitsService(driver);
    }
}
