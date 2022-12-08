package steps;

import baseEntities.BaseStep;
import pages.ProjectOverviewPage;

public class AddProjectStep extends BaseStep {
    public void fillProject(String projectName, String announcement, boolean announcementCheckBoxButton,
                            String suiteMode) {
        addProjectPage.getNameInputLocator().sendKeys(projectName);
        addProjectPage.getAnnouncementInputLocator().sendKeys(announcement);
        if (announcementCheckBoxButton) {
            addProjectPage.getAnnouncementCheckBoxLocator().click();
        }
        switch (suiteMode) {
            case ("suite_mode_single"):
                addProjectPage.getSingleModeRadioButtonLocator().click();
                break;
            case ("suite_mode_single_baseline"):
                addProjectPage.getBaseLineModeRadioButtonLocator().click();
                break;
            case ("suite_mode_multi"):
                addProjectPage.getMultiModeRadioButtonLocator().click();
                break;
        }
        addProjectPage.getAddProjectButtonLocator().click();
    }

    public ProjectOverviewPage createProject(String projectName, String announcement,
                                             boolean announcementCheckBoxButton, String suiteMode) {
        fillProject(projectName, announcement, announcementCheckBoxButton, suiteMode);
        return new ProjectOverviewPage();
    }
}
