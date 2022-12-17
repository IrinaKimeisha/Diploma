package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DashboardPage extends BasePage {
    private final static String pagePath = "/index.php?/dashboard";

    //локаторы
    private SelenideElement pageIdentifier = $x("//div[contains(@class, 'content-header-title') and contains(text(), 'All Projects')]");
    private SelenideElement addProjectButton = $("#sidebar-projects-add");

    //атомарные методы
    public SelenideElement getPageIdentifier() {
        return pageIdentifier;
    }

    public SelenideElement getAddProjectButton() {
        return addProjectButton;
    }

}