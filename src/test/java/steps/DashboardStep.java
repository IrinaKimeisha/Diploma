package steps;

import pages.AddProjectPage;
import pages.DashboardPage;

public class DashboardStep {
    DashboardPage dashboardPage;
    AddProjectPage addProjectPage;

    public DashboardStep() {
        dashboardPage = new DashboardPage();
    }

    private void addProject() {
        dashboardPage.getAddProjectButton().click();
    }

    public AddProjectPage successAddProject() {
        addProject();
        return addProjectPage;
    }
}
