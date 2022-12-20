package steps;

import baseEntities.BaseStep;
import configuration.ReadProperties;
import pages.DashboardPage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class LoginStep extends BaseStep {
    public void login(String username, String psw) {

        open(ReadProperties.getUrl());
        loginPage.setEmail(username);
        loginPage.setPsw(psw);
        loginPage.clickLoginButton();
    }

    public DashboardPage loginSuccessful(String username, String psw) {

        login(username, psw);

        return dashboardPage;
    }

    public LoginPage loginIncorrect(String wrongUsername, String wrongPsw) {

        login(wrongUsername, wrongPsw);

        return loginPage;
    }

    public void emptyLogin(String psw) {

        open(ReadProperties.getUrl());
        loginPage.setPsw(psw);
        loginPage.clickLoginButton();
    }
}
