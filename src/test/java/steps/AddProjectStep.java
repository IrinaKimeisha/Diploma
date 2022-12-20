package steps;

import baseEntities.BaseStep;
import pages.ProjectOverviewPage;

public class AddProjectStep extends BaseStep {

    public void fillProject(String projectName, String announcement, boolean announcementCheckBoxButton,
                            String suiteMode, boolean projectCompletedCheckBoxButton) {
        addProjectPage.getNameInputLocator().sendKeys(projectName);
        addProjectPage.getAnnouncementInputLocator().sendKeys(announcement);
        if (announcementCheckBoxButton) {
            addProjectPage.getAnnouncementCheckBoxLocator().click();
        }
        switch (suiteMode) {
            case ("suite_mode_single"):
                addProjectPage.getSingleSuiteModeRadioButtonLocator().click();
                break;
            case ("suite_mode_single_baseline"):
                addProjectPage.getBaselineSuiteModeRadioButtonLocator().click();
                break;
            case ("suite_mode_multi"):
                addProjectPage.getMultiSuiteModeRadioButtonLocator().click();
                break;
        }
        if (projectCompletedCheckBoxButton) {
            addProjectPage.getProjectCompletedCheckBoxButtonLocator().click();
        }
        addProjectPage.getAddProjectButtonLocator().click();
    }

    public ProjectOverviewPage createProject(String projectName, String announcement, boolean announcementCheckBoxButton,
                                             String suiteMode, boolean projectCompletedCheckBoxButton) {
        fillProject(projectName, announcement, announcementCheckBoxButton,
                suiteMode, projectCompletedCheckBoxButton);
        return new ProjectOverviewPage();
    }

}
