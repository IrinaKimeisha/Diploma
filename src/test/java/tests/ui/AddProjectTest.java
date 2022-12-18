package tests.ui;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

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
        loginStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());

        dashboardStep.deleteProject();
    }
}