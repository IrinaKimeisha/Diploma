package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TestSuiteOverviewPage extends BasePage {
    // локаторы
    //ничего не менять
    private SelenideElement pageIdentifier = $x("//a[@id='navigation-suites-sectionscases']");
    private SelenideElement editButtonLocator = $x("//a[contains(@class,'content-header-button')]/span[@class='button-text' and text()='Edit']");
    private SelenideElement updateMessageLocator = $x("//div[contains(text(),'Successfully updated the test suite.')]");
    private SelenideElement deleteMessageLocator = $x("//div[contains(text(),'Successfully deleted the test suite.')]");
    private SelenideElement returnToDashboardButtonLocator = $x("//a[@id='navigation-dashboard-top']");

    // атомарные методы
    @Override
    protected SelenideElement getPageIdentifier() {
        return pageIdentifier;
    }

    public SelenideElement getEditButtonLocator() {
        return editButtonLocator;
    }

    public SelenideElement getUpdateMessageLocator() {
        return updateMessageLocator;
    }

    public SelenideElement getDeleteMessageLocator() {
        return deleteMessageLocator;
    }

    public SelenideElement getReturnToDashboardButtonLocator() {
        return returnToDashboardButtonLocator;
    }
}