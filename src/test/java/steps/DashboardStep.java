package steps;

import baseEntities.BaseStep;
import pages.AddProjectPage;
import pages.ProjectOverviewPage;

public class DashboardStep extends BaseStep {
    public AddProjectPage successAddProject() {
        addProject();
        return addProjectPage;
    }

    public ProjectOverviewPage openProject(String projectName) {
        dashboardPage.getOpenProjectByNameLocator(projectName).click();
        return new ProjectOverviewPage();
    }

    private void addProject() {
        dashboardPage.getAddProjectButton().click();
    }
}