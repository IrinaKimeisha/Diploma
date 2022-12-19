package tests.ui;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.actions;

@Epic("UI TESTING")
@Feature("Project Tests")
public class AddProjectTest extends BaseTest {

    @Test(description = "Add project")
    @Description("Adding Project Test")
    public void addProjectTest() {
        loginStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());
        dashboardStep.successAddProject();
        addProjectStep.createProject("one more test UI", "Test Announcement", false,
                        "suite_mode_multi", false)
                .getTabByName("test")
                .isDisplayed();
        navigationStep.navigateToDashboardFromProjectOverviewPage();
    }

    @Test(description = "Delete Project Test")
    @Description("Deleting Project Test")
    public void deleteProjectTest() {
        loginStep.login(ReadProperties.username(), ReadProperties.password());

        dashboardStep.deleteProject();
    }

    @Test(description = "Check pop-up message Test")
    @Description("Check pop-up message Test")
    public void popUpTextTest() {
        loginStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());

        actions()
                .moveToElement(dashboardPage.getIconHeaderMail())
                .pause(5000)
                .build()
                .perform();
        Assert.assertTrue(dashboardPage.getTextIconHeaderMail().isDisplayed());
    }
}