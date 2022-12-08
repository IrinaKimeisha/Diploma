package tests.ui;

import baseEntities.BaseTest;
import com.codeborne.selenide.Condition;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test(description = "Successful log in")
    public void successLoginTest() {
        loginStep.loginSuccessful(ReadProperties.username(), ReadProperties.password())
                .getPageIdentifier()
                .shouldBe(Condition.exist);
    }

    @Test(description = "log in with wrong username")
    public void incorrectUsernameTest() {
        Assert.assertEquals(
                loginStep.loginIncorrect("sdsd", ReadProperties.password())
                        .getErrorText().getText()
                , "Email/Login or Password is incorrect. Please try again.");
    }

    @Test(description = "log in with wrong password")
    public void incorrectPswTest() {
        Assert.assertEquals(
                loginStep.loginIncorrect(ReadProperties.username(), "password")
                        .getErrorText().getText()
                , "Email/Login or Password is incorrect. Please try again.");
    }
}
