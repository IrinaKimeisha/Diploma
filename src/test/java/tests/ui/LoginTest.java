package tests.ui;

import baseEntities.BaseTest;
import com.codeborne.selenide.Condition;
import configuration.ReadProperties;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;

@Epic("UI TESTING")
@Feature("Log In Tests")
public class LoginTest extends BaseTest {
    @Test(description = "Successful log in")
    @Description("Successful log in")
    public void successLoginTest() {
        loginStep.loginSuccessful(ReadProperties.username(), ReadProperties.password())
                .getPageIdentifier()
                .shouldBe(Condition.exist);
    }

    @Test(description = "log in with wrong username")
    @Description("Incorrect Log In with wrong username")
    public void incorrectUsernameTest() {
        Assert.assertEquals(
                loginStep.loginIncorrect("sdsd", ReadProperties.password())
                        .getErrorText().getText()
                , "Email/Login or Password is incorrect. Please try again.");
    }

    @Test(description = "log in with wrong password")
    @Description("Incorrect Log In with wrong password")
    public void incorrectPswTest() {
        Assert.assertEquals(
                loginStep.loginIncorrect(ReadProperties.username(), "password")
                        .getErrorText().getText()
                , "Email/Login or Password is incorrect. Please try again.");
    }

    @Test(description = "Empty UserName Test")
    @Description("Empty UserName Test")
    public void emptyUsernameTest() {
        loginStep.emptyLogin(ReadProperties.password());
        loginPage.getLoginPageMessage().shouldHave(text("Email/Login is required."));
    }

}
