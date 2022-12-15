package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TestSuitesPage extends BasePage {
    // локаторы
    private SelenideElement pageIdentifier = $x("//div[contains(text(),'Test Suites & Cases')]");
    private SelenideElement addTestSuiteButtonLocator = $x("//a[@id='navigation-suites-add']");
    private String openTestSuiteByNameLocator = "//a[text()='Replace']";

    // атомарные методы
    @Override
    protected SelenideElement getPageIdentifier() {
        return pageIdentifier;
    }

    public SelenideElement getAddTestSuiteButtonLocator() {
        return addTestSuiteButtonLocator;
    }

    public SelenideElement getOpenTestSuiteByNameLocator(String testSuiteName) {
        return $x(openTestSuiteByNameLocator.replace("Replace", testSuiteName));
    }
}