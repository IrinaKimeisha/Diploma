package tests.ui;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;


public class AddProjectTest extends BaseTest {

    @Test(description = "Add project")
    public void addProjectTest() {
        loginStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());
        dashboardStep.successAddProject();
        addProjectStep.createProject("one more test UI", "Test Announcement", false,
                        "suite_mode_multi", false)
                .getTabByName("test")
                .isDisplayed();
        navigationStep.navigateToDashboardFromProjectOverviewPage();
    }

    @Test
    public void dialogWindowTest() {
        loginStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());

        dashboardStep.dialogWindow();
    }

    //переделать
    @Test(description = "Delete Project Test")
    public void deleteProjectTest() {
        loginStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());

        dashboardStep.dialogWindow();
        dashboardStep.deleteProject();
    }
}