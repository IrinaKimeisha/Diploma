package steps;

import baseEntities.BaseStep;
import pages.AddProjectPage;

public class DashboardStep extends BaseStep {
    public AddProjectPage successAddProject() {
        addProject();
        return addProjectPage;
    }


    private void addProject() {
        dashboardPage.getAddProjectButton().click();
    }

    public void deleteProject(){
        dashboardPage.clickAdministrationButton();
        dashboardPage.clickProjectButton();
        dashboardPage.clickDeleteButton();
        dashboardPage.clickConfirmDeleteProjectButton();
        dashboardPage.confirmDeleteProjectCheckBox();
    }
}