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
}