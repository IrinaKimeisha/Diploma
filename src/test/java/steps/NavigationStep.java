package steps;

import baseEntities.BaseStep;
import pages.DashboardPage;

public class NavigationStep extends BaseStep {
    public DashboardPage navigateToDashboardFromProjectOverviewPage() {
        projectOverviewPage.getReturnToDashboardButtonLocator().click();
        return dashboardPage;
    }
}