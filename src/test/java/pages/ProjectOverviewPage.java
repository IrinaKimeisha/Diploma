package pages;

import baseEntities.BaseTest;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ProjectOverviewPage extends BaseTest {

    //https://aqa21022.testrail.io/index.php?/projects/overview/2
    private SelenideElement pageIdentifier = $(".chart-line");
    private String tabLocator = "//li/a[. = 'Replace']";
   private SelenideElement returnToDashboardButtonLocator = $("#navigation-dashboard");

    public SelenideElement getTabByName(String tabName) {
        return $x(tabLocator.replace("Replace", tabName));
    }
    public SelenideElement getReturnToDashboardButtonLocator() {
        return returnToDashboardButtonLocator;
    }

}
