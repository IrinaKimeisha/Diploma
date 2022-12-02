package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DashboardPage {
    private final static String pagePath = "index.php?/dashboard";

    // Блок описания селекторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//div[contains(text(), 'TestRail QA')]");
    private final By addProjectButton = By.className("sidebar-projects-add");


    // Блок инициализации страницы
    public void openPageByUrl() {
        open(pagePath);
    }
    // Блок атомарных методов
    public SelenideElement getHeaderTitleLabel() {
        return $(headerTitleLabelLocator);
    }
    public boolean isHeaderTitleLabelDisplayed() {
        return getHeaderTitleLabel().isDisplayed();
    }
    public SelenideElement getAddProjectButton() {
        return $(addProjectButton).shouldBe(Condition.visible);
    }

}