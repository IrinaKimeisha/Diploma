package baseEntities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import configuration.ReadProperties;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.*;
import pages.*;
import steps.*;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public abstract class BaseTest {

    protected LoginStep loginStep;
    protected NavigationStep navigationStep;
    protected DashboardStep dashboardStep;
    protected AddProjectStep addProjectStep;

    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;


    @BeforeSuite
    public void setUp() {

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.browser = ReadProperties.browserName();
        Configuration.baseUrl = ReadProperties.getUrl();
        Configuration.timeout = 8000;
    }

    @BeforeClass
    public void all() {
        loginStep = new LoginStep();
        navigationStep = new NavigationStep();
        dashboardStep = new DashboardStep();
        addProjectStep = new AddProjectStep();

        dashboardPage = new DashboardPage();
        loginPage = new LoginPage();
    }

    @AfterClass
    public void tearDown() {
        closeWebDriver();
    }
}
