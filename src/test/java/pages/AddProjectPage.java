package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AddProjectPage extends BasePage {

    // локаторы
    private SelenideElement pageIdentifier = $x("//div[contains(text(),'Add Project')]");
    private SelenideElement nameInputLocator = $("input.form-control#name");
    private SelenideElement announcementInputLocator = $("textarea#announcement");
    private SelenideElement announcementCheckBoxLocator = $("input#show_announcement");
    private SelenideElement singleSuiteModeRadioButtonLocator = $("input#suite_mode_single");
    private SelenideElement baselineSuiteModeRadioButtonLocator = $("input#suite_mode_single_baseline");
    private SelenideElement multiSuiteModeRadioButtonLocator = $("input#suite_mode_multi");
    private SelenideElement projectCompletedCheckBoxButtonLocator = $("is_completed");
    private SelenideElement addProjectButtonLocator = $("#accept");

    // атомарные методы
    @Override
    protected SelenideElement getPageIdentifier() {
        return pageIdentifier;
    }

    public SelenideElement getNameInputLocator() {
        return nameInputLocator;
    }

    public SelenideElement getAnnouncementInputLocator() {
        return announcementInputLocator;
    }

    public SelenideElement getAnnouncementCheckBoxLocator() {
        return announcementCheckBoxLocator;
    }

    public SelenideElement getSingleSuiteModeRadioButtonLocator() {
        return singleSuiteModeRadioButtonLocator;
    }

    public SelenideElement getBaselineSuiteModeRadioButtonLocator() {
        return baselineSuiteModeRadioButtonLocator;
    }

    public SelenideElement getMultiSuiteModeRadioButtonLocator() {
        return multiSuiteModeRadioButtonLocator;
    }

    public SelenideElement getProjectCompletedCheckBoxButtonLocator() {
        return projectCompletedCheckBoxButtonLocator;
    }

    public SelenideElement getAddProjectButtonLocator() {
        return addProjectButtonLocator;
    }
}