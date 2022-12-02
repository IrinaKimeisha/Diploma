package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage{

    // Описание селекторов
    private final By emailInputLocator = By.id("name");
    private final By pswInputLocator = By.id("password");
    private final By loginButtonLocator = By.id("button_primary");
    private final By errorTextLocator = By.className("error-text");
    private final By pageIdentifier = By.className("logo-loginpage");
    private final By loginPageMessage =By.className("loginPageMessage");

    //блок атомарных методов
    public SelenideElement getEmailInput() {
        return $(emailInputLocator).shouldBe(Condition.visible);
    }

    public SelenideElement getPswInput() {
        return $(pswInputLocator).shouldBe(Condition.visible);
    }

    public SelenideElement getLoginButton() {
        return $(loginButtonLocator).shouldBe(Condition.visible);
    }

    public WebElement getErrorText() {
        return $(errorTextLocator);
    }

    public SelenideElement getPageIdentifier() {
        return $(pageIdentifier).shouldBe(Condition.visible);
    }

    public SelenideElement getLoginPageMessage() {
        return $(loginPageMessage).shouldBe(Condition.visible);
    }

    public void setEmail(String value) {
        getEmailInput().setValue(value);
    }

    public void setPsw(String value) {
        getPswInput().setValue(value);
    }

    public void clickLoginButton() {
        getLoginButton().click();
    }



}
