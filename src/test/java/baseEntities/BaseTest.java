package baseEntities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import configuration.ReadProperties;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.*;
import pages.AddProjectPage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.ProjectOverviewPage;
import steps.*;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {

    protected LoginStep loginStep;
    protected DashboardStep dashboardStep;
    protected AddProjectStep addProjectStep;
    protected ProjectOverviewStep projectOverviewStep;
    protected TestSuitesStep testSuitesStep;

    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected AddProjectPage addProjectPage;
    protected ProjectOverviewPage projectOverviewPage;


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
        dashboardStep = new DashboardStep();
        addProjectStep = new AddProjectStep();
        projectOverviewStep = new ProjectOverviewStep();
        testSuitesStep = new TestSuitesStep();

        dashboardPage = new DashboardPage();
        loginPage = new LoginPage();
    }


    //сделать logOut добавить сюда
    @AfterClass
    public void tearDown() {
        closeWebDriver();
    }
}
