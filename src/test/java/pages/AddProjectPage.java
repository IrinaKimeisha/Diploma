package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class AddProjectPage {
    // Блок описания селекторов для элементов

    private final By pageIdentifier = By.xpath("//div[contains(text(), 'Add Project')]");
    private final By nameInputLocator = By.id("name");
    private final By announcementInputLocator = By.id("announcement");
    private final By announcementCheckBoxLocator = By.id("show_announcement");
    private final By singleModeRadioButtonLocator = By.id("suite_mode_single");
    private final By baseLineModeRadioButtonLocator = By.id("suite_mode_single_baseline");
    private final By multiModeRadioButtonLocator = By.id("suite_mode_multi");
    private final By addProjectButtonLocator = By.id("accept");
    private final By cancelAddingButtonLocator = By.id("admin-integration-form-cancel");

    public WebElement getPageIdentifier() {
        return $(pageIdentifier);
    }

    public SelenideElement getNameInputLocator() {
        return $(nameInputLocator).shouldBe(Condition.visible);
    }

    public SelenideElement getAnnouncementInputLocator() {
        return $(announcementInputLocator).shouldBe(Condition.visible);
    }

    public SelenideElement getAnnouncementCheckBoxLocator() {
        return $(announcementCheckBoxLocator);
    }

    public SelenideElement getSingleModeRadioButtonLocator() {
        return $(singleModeRadioButtonLocator);
    }

    public SelenideElement getBaseLineModeRadioButtonLocator() {
        return $(baseLineModeRadioButtonLocator);
    }

    public SelenideElement getMultiModeRadioButtonLocator() {
        return $(multiModeRadioButtonLocator);
    }

    public SelenideElement getAddProjectButtonLocator() {
        return $(addProjectButtonLocator);
    }

    public SelenideElement getCancelAddingButtonLocator() {
        return $(cancelAddingButtonLocator);
    }

    public void setName(String value) {
        getNameInputLocator().setValue(value);
    }

    public void setAnnouncement(String value) {
        getAnnouncementInputLocator().setValue(value);
    }

    public void clickAddProjectButton() {
        getAddProjectButtonLocator().click();
    }

    public void clickCancelAddProjectButton() {
        getCancelAddingButtonLocator().click();
    }

}
