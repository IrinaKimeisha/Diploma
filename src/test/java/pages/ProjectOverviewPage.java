package pages;

import baseEntities.BaseTest;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ProjectOverviewPage extends BaseTest {

    //https://aqa21022.testrail.io/index.php?/projects/overview/2
    // метод переопределить !!
    private SelenideElement pageIdentifier = $(".chart-line");
    private String tabLocator = "//li/a[. = 'Replace']";
    private SelenideElement testSuitesAndCasesButtonLocator = $x("//a[@id='navigation-suites']");
    private SelenideElement milestonesButtonLocator = $x("//a[@id='navigation-milestones']");
    private SelenideElement messageLocator = $x("//div[contains(text(),'Successfully added the new test suite.')]");
    private SelenideElement returnToDashboardButtonLocator = $("#navigation-dashboard");

    //@Override
    protected SelenideElement getPageIdentifier() {
        return pageIdentifier;
    }

    public SelenideElement getTabByName(String tabName) {
        return $x(tabLocator.replace("Replace", tabName));
    }

    public SelenideElement getTestSuitesAndCasesButtonLocator() {
        return testSuitesAndCasesButtonLocator;
    }

    public SelenideElement getMilestonesButtonLocator() {
        return milestonesButtonLocator;
    }

    public SelenideElement getMessageLocator() {
        return messageLocator;
    }

    public SelenideElement getReturnToDashboardButtonLocator() {
        return returnToDashboardButtonLocator;
    }

}
