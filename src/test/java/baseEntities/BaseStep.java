package baseEntities;


import pages.AddProjectPage;
import pages.DashboardPage;
import pages.LoginPage;

public class BaseStep {
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected AddProjectPage addProjectPage;

    public BaseStep() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        addProjectPage = new AddProjectPage();
    }
}
