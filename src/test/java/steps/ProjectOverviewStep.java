package steps;

import baseEntities.BaseStep;
import pages.TestSuitesPage;

public class ProjectOverviewStep extends BaseStep {

    //ничего не менять
    public TestSuitesPage selectTestSuite() {
        testSuite();
        return testSuitesPage;
    }

    public void testSuite() {
        projectOverviewPage.getTestSuitesAndCasesButtonLocator().click();
    }
}