package baseEntities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import configuration.ReadProperties;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AddProjectPage;
import pages.DashboardPage;
import pages.LoginPage;
import steps.AddProjectStep;
import steps.DashboardStep;
import steps.LoginStep;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {

    protected LoginStep loginStep;
    protected DashboardStep dashboardStep;
    protected AddProjectStep addProjectStep;

    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected AddProjectPage addProjectPage;


    @BeforeMethod
    public void setUp() {

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.browser = ReadProperties.browserName();
        Configuration.baseUrl = ReadProperties.getUrl();
        Configuration.timeout = 8000;
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
