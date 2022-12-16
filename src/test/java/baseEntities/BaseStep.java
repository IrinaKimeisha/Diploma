package baseEntities;


import pages.*;

public class BaseStep {
    //ничего не менять
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected AddProjectPage addProjectPage;
    protected ProjectOverviewPage projectOverviewPage;

    public BaseStep() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        addProjectPage = new AddProjectPage();
        projectOverviewPage = new ProjectOverviewPage();
    }
}
