package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DashboardPage extends BasePage {
    private final static String pagePath = "/index.php?/dashboard";

    //локаторы
    private SelenideElement pageIdentifier = $x("//div[contains(@class, 'content-header-title') and contains(text(), 'All Projects')]");
    private SelenideElement addProjectButton = $("#sidebar-projects-add");

    //для удаления сущности
    private SelenideElement administrationButtonLocator = $("#navigation-admin");
    private SelenideElement deleteButtonLocator = $(By.className("icon-small-delete"));
    private SelenideElement projectButtonLocator = $("#navigation-sub-projects");
    private SelenideElement popUpMessageLocator = $x("//a[@class='link-tooltip']");
    private SelenideElement confirmDeleteProjectCheckBoxLocator = $x("//div/div/div/div/div/label/input");
    private SelenideElement confirmDeleteProjectButtonLocator = $x("//div/div/div/a[contains(text(), 'OK')]");
    private SelenideElement addTestSuiteButtonLocator = $x("//div[contains(@class, 'table summary summary-auto')]/div[1]//a[1][contains(text(), 'test suite')]");

    private SelenideElement iconHeaderMail = $(".icon-header-mail");
    private SelenideElement textIconHeaderMail = $(".top-social-link.link-tooltip:last-child");

    //атомарные методы
    public SelenideElement getPageIdentifier() {
        return pageIdentifier;
    }

    public SelenideElement getAddProjectButton() {
        return addProjectButton;
    }

    public SelenideElement getAdministrationButton() {
        return $(administrationButtonLocator);
    }

    public SelenideElement getDeleteButton() {
        return $(deleteButtonLocator);
    }

    public SelenideElement getProjectButton() {
        return $(projectButtonLocator);
    }

    public SelenideElement getConfirmDeleteProjectCheckBox() {
        return $(confirmDeleteProjectCheckBoxLocator);
    }

    public SelenideElement getConfirmDeleteProjectButton() {
        return $(confirmDeleteProjectButtonLocator);
    }

    public SelenideElement getAddTestSuiteButton() {
        return $(addTestSuiteButtonLocator);
    }

    public SelenideElement getPopUpMessage() {
        return $(popUpMessageLocator);
    }


    public void clickAdministrationButton() {
        getAdministrationButton().click();
    }

    public void clickDeleteButton() {
        getDeleteButton().click();
    }

    public void clickProjectButton() {
        getProjectButton().click();
    }

    public void confirmDeleteProjectCheckBox() {
        getConfirmDeleteProjectCheckBox().click();
    }

    public void clickConfirmDeleteProjectButton() {
        getConfirmDeleteProjectButton().click();
    }



    public SelenideElement getIconHeaderMail() {
        return iconHeaderMail;
    }

    public SelenideElement getTextIconHeaderMail() {
        return textIconHeaderMail;
    }
}