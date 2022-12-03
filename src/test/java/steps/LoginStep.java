package steps;

import configuration.ReadProperties;
import io.qameta.allure.Step;
import pages.DashboardPage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class LoginStep {
    LoginPage loginPage;

    public LoginStep() {
        loginPage = new LoginPage();
    }

    public void login(String email, String psw) {
        open(ReadProperties.getUrl());
        loginPage.setEmail(email);
        loginPage.setPsw(psw);
        loginPage.clickLoginButton();
    }

    @Step
    public DashboardPage loginSuccessful(String email, String psw) {
        login(email, psw);

        return page(DashboardPage.class);
    }

    @Step
    public LoginPage loginIncorrect(String wrongEmail, String wrongPsw) {
        login(wrongEmail, wrongPsw);

        return loginPage;
    }


}
