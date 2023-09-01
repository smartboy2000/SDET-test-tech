package steps.webApps;

import forms.LoginTests;
import io.cucumber.java.en.Given;

import static com.autong.base.TestBase.getDriver;

public class LoginSteps {

    LoginTests loginTests;

    @Given("user is redirected to login url")
    public void openUrl() {
        loginTests = new LoginTests(getDriver());
        loginTests.openUrl();
    }
}
